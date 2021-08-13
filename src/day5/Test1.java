package day5;



import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("请输入商品名称");
		
		String name1=sc.nextLine();
		
		System.out.println("请输入单价");
		
		String price1=sc.nextLine();
		
		System.out.println("请输入数量");
		
		String num1=sc.nextLine();
		
		//统计第一件商品的小计
		float xiaoji1=Float.parseFloat(price1)*Integer.parseInt(num1);
		
		
		System.out.println("请输入商品名称");
		
		String name2=sc.nextLine();
		
		System.out.println("请输入单价");
		
		String price2=sc.nextLine();
		
		System.out.println("请输入数量");
		
		String num2=sc.nextLine();
		
		//统计第二件商品的小计
		float xiaoji2=Float.parseFloat(price2)*Integer.parseInt(num2);
		
		
		
		
		
		//输出消费清单
		
		float allPrice=xiaoji1+xiaoji2;
		
		System.out.println("请输入折扣");
		
		String zhekou=sc.nextLine();
		
		float relAllPrice=allPrice*Integer.parseInt(zhekou)/10;
		
		System.out.println("请付款");
		
		String money=sc.nextLine();
		
		float lastMoney=Float.parseFloat(money)-relAllPrice;
		
		
		System.out.println("******消费清单******");
		
		System.out.println("商品名称\t单价\t数量\t小计");
		
		System.out.print(name1);
		System.out.print('\t');
		
		System.out.print(price1);
		System.out.print('\t');
		
		System.out.print(num1);
		System.out.print('\t');
		
		System.out.println(xiaoji1);
		
		System.out.print(name2);
		System.out.print('\t');
		
		System.out.print(price2);
		System.out.print('\t');
		
		System.out.print(num2);
		System.out.print('\t');
		
		System.out.println(xiaoji2);
		
		
		System.out.println("付款："+money);
		System.out.println("原价："+allPrice);
		System.out.println("实际付款："+relAllPrice);
		
		System.out.println("找零："+lastMoney);
		
		System.out.println("======欢迎下次再来======");
		
		
	}

}

