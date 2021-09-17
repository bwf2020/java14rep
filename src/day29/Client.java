package day29;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class Client {

	public static void main(String[] args) throws Exception {


		
		Socket s=new Socket("localhost", 8080);
		System.out.println("客户端发送请求到服务器");
		
		//给服务器传递数据
		OutputStream out=s.getOutputStream();
		DataOutputStream ds=new DataOutputStream(out);
		
		InputStream in=s.getInputStream();
		DataInputStream ds2=new DataInputStream(in);
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("请输入信息:");
			ds.writeUTF(sc.nextLine());
			
			//获取服务器传递过来的数据
			String serverInfo=ds2.readUTF();
			System.out.println(serverInfo);
			
			
		}
		
		
		
		

	}

}
