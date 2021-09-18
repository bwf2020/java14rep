package day30;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientThread implements Runnable{
	
	private Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {


		//接受服务器的消息
		InputStream in;
		try {
			
			in = socket.getInputStream();
			DataInputStream din=new DataInputStream(in);
			
			while(true)
			System.out.println(din.readUTF());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//客户端的输入流
		
		
	}

}
