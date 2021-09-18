package day30;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class ServerThread implements Runnable{

	
	
	
	private Socket socket;//当前客户
	private List<Socket> list;

	public ServerThread(Socket socket,List<Socket> list) {
		this.socket = socket;
		this.list=list;
	}
	
	@Override
	public void run() {
		
		 InputStream in=null;
		 DataInputStream din=null;
		
		 OutputStream out=null;
		 DataOutputStream dout=null;
		
		
		 try {
			in=socket.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 din=new DataInputStream(in);
		
	
		System.out.println("欢迎："+socket.getPort());

		while(true) {
			try {
			String info=din.readUTF();
			System.out.println("来自客户端："+socket.getPort()+info);
			
			out=socket.getOutputStream();
			dout=new DataOutputStream(out);
			
		
			dout.writeUTF("欢迎："+socket.getPort());
			
			for(int i=0;i<list.size();i++){//将当前客户的发言发送给所有人
				Socket s=list.get(i);
				OutputStream o=s.getOutputStream();//服务器端的输出流
				DataOutputStream so=new DataOutputStream(o);
				if(!socket.isClosed())
					so.writeUTF(socket.getPort()+":"+info);
			}
			
			
			}catch (Exception e) {
				System.out.println("退出");
				break;
			}
			
		}		
	
		
	}

}
