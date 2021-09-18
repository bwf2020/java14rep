package day30;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	
	
	
	
	
	static ServerSocket ss=null;
	

	public static void main(String[] args)  {
	
		List<Socket> list=new ArrayList<Socket>();
		
		
		try {
			ss = new ServerSocket(8090);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("服务器在端口号8090监听客户端的连接");
		
		
		while(true) {
			
			Socket s=null;
			try {
				
			 s= ss.accept();
			 list.add(s);

			}catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread t=new Thread(new ServerThread(s,list));
			
			t.start();
			
			System.out.println("继续等待下一个客户端......");
			
		
		}
		
		
		
		

	}

}
