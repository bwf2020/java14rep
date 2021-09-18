package day30;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server2 implements Runnable {

	DatagramSocket ds = null;

	int length = 1024;

	byte[] buf = new byte[length];

	public static void main(String[] args) throws Exception {

	

		Server2 t = new Server2();
		t.ds = new DatagramSocket(8080);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		while (true) {

			try {
				DatagramPacket dp = new DatagramPacket(buf, length);

				System.out.println("正在接受客户端的数据");

				ds.receive(dp);

				System.out.println(new String(dp.getData()) + "来自：" + dp.getPort());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
