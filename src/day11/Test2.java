package day11;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("请输入");

			String a = sc.nextLine();

			try {

				if (a.equals("1")) {

					System.out.println(1 / 0);
				} else if (a.equals("2")) {

					String b = null;
					System.out.println(b.equals("a"));

				} else {

					break;
				}

			}

			catch (NullPointerException e) {
				System.out.println("发生了空对象错误");
			} catch (ArithmeticException e) {
				System.out.println("发生了算术错误");
			} catch (Exception e) {
				System.out.println("发生异常了");
			}finally {
				
				System.out.println("不管正确与否都执行的代码块");
				
			}

		}
		System.out.println("结束");
		sc.close();

	}

}
