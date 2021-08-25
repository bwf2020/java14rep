package day12;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test3 {

	public static <T> void main(String[] args) throws Exception {


		String s1="tom";
		String s2="tom";
		
		System.out.println(s1==s2);
		
		String s3=new String("tom");
		
		System.out.println(s1==s3);
		
		String s4=s3.toString();
		
		System.out.println("s1:"+s1);
		System.out.println("s4:"+s4);
		
		System.out.println("s1和s4"+(s1==s4));
		System.out.println(s3==s4);

		
		String s5="t";
		String s6="om";
		
		String s7="t"+"om";//tom
		String s8=s5+s6;
		
		System.out.println(s7);
		System.out.println(s8);
		
		System.out.println(s1==s7);
		System.out.println(s1==s8);
		
		System.out.println("==========");
		
		
		String str="";
		for (int i = 0; i < 10; i++) {
			
			str+=i;
			System.out.print(str+"-");
			System.out.println(str.getClass()+"@"+Integer.toHexString(str.hashCode()));
			
		}
		
		System.out.println("=========");
		
		String str3="123abc中国";
		
		char[] c= str3.toCharArray();
		
		System.out.println(c);
		for (char d : c) {
			System.out.println(d);
		}
		
		System.out.println("=========");
		System.out.println(Charset.defaultCharset());
		
		char[] c2= {'a','b','1','中'};
		
		String str4=new String(c2);
		
		System.out.println(str4);
		
		System.out.println("=========");
		
		String str5="a1中";
		
		byte[] b1= str5.getBytes("utf-8");
		
		System.out.println(b1);
		
		String str6=new String(b1,"utf-8");
		
		System.out.println(str6);
		
		System.out.println("=============");
		String str8=" b wf ";
		System.out.println(str8.hashCode());
		str8=str8.concat("51testing");
		// b wf 51testing
		System.out.println(str8.hashCode());
		
		System.out.println(str8.length());
		
		System.out.println(str8.trim().length());
		
		 str8="bwf";
		 
		 System.out.println(str8.substring(1, 2));
		 
		 System.out.println(str8.substring(1,str8.length()));
		 
		 System.out.println("=============");
		 
		 StringBuffer sb=new StringBuffer();
		 
		 System.out.println(sb.hashCode());
		 
		 sb.append(1);
		 sb.append("bwf");
		 sb.append(true);
		 sb.append(3.14);
		 
		 System.out.println(sb.hashCode());
		 
		 System.out.println(sb);
		 
		 System.out.println(sb.capacity());
		 
		/* for (int i = 0; i < 20; i++) {
			
			 sb.append(i);
			 
		}
		 
		 System.out.println(sb.capacity());*/
		 
		 sb.insert(1, "a");
		 
		 System.out.println(sb);
		 
		 sb.reverse();
		 
		 System.out.println(sb);
		 
		 System.out.println("=====");
		 Date d1=new Date();
		 
		 System.out.println(d1);
		 
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		 
		 System.out.println(sdf.format(d1));
		 
		 sdf.applyPattern("yyyy/MM/dd");
		 System.out.println(sdf.format(d1));
		 
		 String d2="2021-01-02 14:25:30";
		 
		
		 sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		 Date d3= sdf.parse(d2);
		 
		 System.out.println(d3);
		 
		 System.out.println("=====");
		 
		 LocalDateTime ld=LocalDateTime.now();
		 
		 System.out.println(ld);
		 
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
		
		System.out.println(dtf.format(ld));
		
		dtf=dtf.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		TemporalAccessor ta= dtf.parse(d2);
		
		LocalDateTime ld2=LocalDateTime.from(ta);
		
		System.out.println(ld2);
		
		System.out.println("=============");
		
		double num1=10.8;
		
		System.out.println(num1);
		
		DecimalFormat df=new DecimalFormat("00.00");
		
		System.out.println(df.format(num1));
		
		df.applyPattern("#.00");
		
		System.out.println(df.format(num1));
		
		num1=0.5612456;
		df.applyPattern("#.00%");
		
		System.out.println(df.format(num1));
		
		
		System.out.println("=============");
		
		
		Integer[] array= {1,4,2,6,5,8,7,9,3};
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		/*Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		});*/
		System.out.println(Arrays.toString(array));
		
		System.out.println("==========");
		
		int[] array2=new int[10];
		
		System.out.println(Arrays.toString(array2));
		Arrays.fill(array2, 1);
		
		System.out.println(Arrays.toString(array2));
		
		Arrays.fill(array2,2,4,100);
		
		System.out.println(Arrays.toString(array2));

		System.out.println("==========");
		
		int index=Arrays.binarySearch(array, 9);
		System.out.println(index);
		
		
	}

}
