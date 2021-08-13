package day5;

public class Test9 {

	public static void main(String[] args) {

		int[] array = { 22, 45, 333, 66, 876, 3 };

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		System.out.println("===========");

		int j = 0;
		while (j < array.length) {

			System.out.println(array[j++]);
		}

		System.out.println("===========");

		for (int i = 0; i < 5; i++) {

			if (i == 2) {

				// continue;
				break;

			}

			System.out.println(i);

		}

		System.out.println("===========");

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k <= i; k++) {

				System.out.print("*");

			}
			System.out.println();

		}

		System.out.println("===========");

		String[] array2 = { "zhangsan", "lisi", "wangwu", "zhaoliu" };

		for (int i = 0; i < array2.length; i++) {
			String s = array2[i];
			System.out.println(s);

		}
		System.out.println("===========");

		for (String s : array2) {
			System.out.println(s);
		}

		System.out.println("===========");

		String[][] array3 = { { "1", "张三" ,"男"}, { "2", "李四","男","22" }, { "3", "王五" }, { "4", "赵六" } };
	
		
		for(int i=0;i<array3.length;i++) {
			
			for(int k=0;k<array3[i].length;k++) {
				
				System.out.print(array3[i][k]+"\t");
				
			}
			
			System.out.println("");
			
			
		}
	
	
	}

}
