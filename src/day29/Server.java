package day29;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws  Exception {


		
		ServerSocket ss=new ServerSocket(8080);
		
		System.out.println("服务器正在接受客户端的请求............");
		

		Socket s= ss.accept();//接受到客户端的插槽
			
		System.out.println(s.getPort()+"有个客户端请求过来了");
			

		//接受客户端的输入信息
		
		InputStream in= s.getInputStream();
		DataInputStream ds=new DataInputStream(in);
		
		OutputStream out=s.getOutputStream();
		DataOutputStream ds2=new DataOutputStream(out);
		
		String info=null;
		while((info=ds.readUTF())!=null) {
			
			
			System.out.println("来自客户端:"+info);
			
			ds2.writeUTF("客户端你好，我已经收到你的消息了");
			
			
		}
		
	
		
		
		

	}

}
