package day7;

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
	
	
	
	
	
	public static void main(String[] args) {

		String[] names = new String[3];

		float[] prices = new float[3];

		int[] nums = new int[3];

		float[] xjs = new float[3];

		Scanner sc = new Scanner(System.in);

		int index = 0;

		while (true) {

			// 对数组进行判断扩容
			if (names[names.length - 1] != null) {

				// 说明已经满了，需要扩容 大小是以前的2倍或者1.5倍
				String[] namesEx = new String[names.length * 2];
				for (int i = 0; i < names.length; i++) {

					namesEx[i] = names[i];

				}

				names = namesEx;

				float[] pricesEx = new float[prices.length * 2];
				for (int i = 0; i < prices.length; i++) {

					pricesEx[i] = prices[i];

				}

				prices = pricesEx;

				int[] numsEx = new int[nums.length * 2];
				for (int i = 0; i < nums.length; i++) {

					numsEx[i] = nums[i];

				}

				nums = numsEx;

				float[] xjsEx = new float[xjs.length * 2];
				for (int i = 0; i < xjs.length; i++) {

					xjsEx[i] = xjs[i];

				}

				xjs = xjsEx;

			}

			System.out.println("请输入商品名称");

			names[index] = sc.nextLine();

			System.out.println("请输入单价");

			prices[index] = Float.parseFloat(sc.nextLine());

			System.out.println("请输入数量");
			nums[index] = Integer.parseInt(sc.nextLine());

			// 计算小计
			xjs[index] = prices[index] * nums[index];

			index++;

			System.out.println("继续购买吗？y/n");

			if (sc.nextLine().equals("n")) {

				break;
			}

		}

		// 统计一下小计和总额
		float allPrice = 0.0F;
		for (float f : xjs) {
			allPrice += f;
		}

		System.out.println("需要支付：" + allPrice);
		
		System.out.println("请输入金额：");
		String money = sc.nextLine();

		while (true) {

			if (Float.parseFloat(money) >= allPrice) {

				break;

			} else {
				System.out.println("金额不够，请再次输入：");
				money = sc.nextLine();
			}

		}

		
		System.out.println("找零:" + (Float.parseFloat(money) - allPrice));

	}
	
	//业务逻辑处理
	//技术部分
	//用户体验
	//性能 不要每次购买都要扩容
	
	
}
