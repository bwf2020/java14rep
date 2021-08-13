package day5;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		
		
		
		int[] array1=new int[5];
		
		System.out.println(array1);
		
		float[] array2=new float[2];
		
		System.out.println(array2);
		
		
		//赋值
		System.out.println(array1[0]);
		System.out.println(array1[4]);
		
		System.out.println(array2[0]);
		
		//System.out.println(array1[5]);
		
		array1[0]=100;
		array1[4]=200;
		
		array2[0]=300;
		
		
		System.out.println(array1[0]);
		System.out.println(array1[4]);
		
		System.out.println(array2[0]);
		
		array1[1]=(int) 100.12;
		System.out.println(array1[1]);
		
		System.out.println("===========");
		
		int[] array3=new int[] {100,200,3,55};
		
		System.out.println(array3[0]);
		System.out.println(array3[3]);
		
		
		//简写
		int[] array4= {2,54,32};
		System.out.println(array4[0]);
		
		System.out.println(array4[2]);
		
		System.out.println("====================");
		
		
		int[][] array5=new int[3][2];
		
		
		System.out.println(array5);
		
		System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		
		System.out.println(array5[0][0]);
		System.out.println(array5[0][1]);
		
		array5[0][0]=1;
		array5[0][1]=2;
		
		array5[1][0]=3;
		array5[1][1]=4;
		
		array5[2][0]=5;
		array5[2][1]=6;
		
		
		System.out.println(array5[1][1]);
		
		System.out.println("============");
		
		int[][] array6=new int[3][];
		
		System.out.println(array6[0]);
		
		array6[0]=new int[2];
		
		System.out.println(array6[0][0]);
		System.out.println(array6[0][1]);
		//System.out.println(array6[0][2]);
		
		
		array6[1]=new int[3];
		System.out.println(array6[1][0]);
		System.out.println(array6[1][1]);
		System.out.println(array6[1][2]);
		//System.out.println(array6[1][3]);
		
		array6[2]=new int[] {100};
		System.out.println(array6[2][0]);
		//System.out.println(array6[2][1]);
		
		
		System.out.println("=============");
		
		
		int[][] array7= {{1,2},{3,4,5},{7}};
		
		System.out.println(array7[1][1]);
		
		
		int[][][] array8= {{{1},{2,3}},{{4,5},{6},{7,8}},{{9,10}}};
		
		System.out.println(array8[1][1]);
		System.out.println(array8[1][1][0]);
		
		System.out.println(array8.length);
		System.out.println(array8[0].length);
		System.out.println(array8[0][1].length);
		
		System.out.println("===========");
		
		int[] array9=new int[3];
		
		array9[0]=1;
		array9[1]=2;
		array9[2]=3;
		
		System.out.println(array9);
		
		array9=new int[6];
		array9[3]=4;
		
		System.out.println(array9);
		System.out.println(array9[0]);
		
	}
	

}
