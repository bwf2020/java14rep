package day29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Test2 {

	public static void main(String[] args) throws Exception {


		InetAddress local=InetAddress.getLocalHost(); 
		
		System.out.println(local);
		
		System.out.println(local.getCanonicalHostName());
		System.out.println(local.getHostAddress());
		System.out.println(local.isReachable(100));
		
		
		local=InetAddress.getByName("baidu.com");
		
		System.out.println(local);
		System.out.println(local.isReachable(100));
		
		System.out.println("====================");
		
		
		String path="https://www.taobao.com/";
		URL url=new URL(path);
		
		System.out.println(url);
		
		System.out.println(url.getAuthority());
		
		System.out.println(url.getContent());
		
		System.out.println(url.getDefaultPort());
		
		System.out.println(url.getFile());
		
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
		
		System.out.println(url.getProtocol());
		
		System.out.println(url.openConnection());
		
		URLConnection conn=url.openConnection();
		
		InputStream in= conn.getInputStream();
		
		System.out.println(in.available());
		
		Reader reader=new InputStreamReader(in);
		
		BufferedReader br=new BufferedReader(reader);
		
		File file=new File("C:\\myfiles\\baidu.html");
		Writer out=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(out);
		
		String line=null;
		
		while((line=br.readLine())!=null) {
			
			
			bw.write(line);
			bw.flush();
			
		}
		
		
		
		System.out.println("结束");
		
		
		
		
	}

}
