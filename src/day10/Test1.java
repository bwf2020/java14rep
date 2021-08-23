package day10;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test1 {

	public static void main(String[] args) {


		
		Color red=Color.RED;
		
		System.out.println(red);
		
		Color green=Color.GREEN;
		
		System.out.println(green);
		
		if(Color.RED==red) {
			
			System.out.println("红色");
		}
		
		switch (red) {
		case RED:
			System.out.println("红色2");
			break;

		default:
			break;
		}
		
		System.out.println("=============");
		
		Color2 c2=Color2.RED;

		System.out.println(c2);
		
		Color2 c3=Color2.GREEN;

		System.out.println(c3);
		
		Color2 c4=Color2.BLUE;

		System.out.println(c4);
		
		Color2 c5=Color2.BLACK;
		
		System.out.println(c5);
		
		Color2 c6=Color2.YELLOW;
		
		System.out.println(c6);
		
		
		System.out.println("============");
		
		System.out.println(""==null);
		
		System.out.println("==============");
		
		Color2 red2=Color2.RED;
		
		System.out.println(red2);
		System.out.println(red2.name());
		System.out.println(red2.values());
		for (Color2 c : red2.values()) {
			
			System.out.println(c.name());
		}
		
		System.out.println(Color2.values());
		
		for (Color2 c :  Color2.values()) {
			System.out.println(c.name());
		}
		
		
		System.out.println(Color2.valueOf("RED"));
		
		System.out.println(red2.ordinal());
		
		Color2 yellow2=Color2.YELLOW;
		System.out.println(yellow2.ordinal()==4);
		
		
		System.out.println(red2.getDesc());
		
		
		System.out.println("===========");
		
		Test1 t=new Test1();
		t.show1("rde");
		t.show1("gren");
		t.show1("bleu");
		
		System.out.println("===========");
		
		t.show1(IColor.RED);
		t.show1(IColor.GREEN);
		t.show1("其他颜色");
		
		System.out.println("===========");
		Color r=Color.RED;
		t.show2(r);
		
		System.out.println("===========");
		Sex sex=Sex.MAN;
		t.show3(sex);
		

	}
	
	
	public void show1(String color) {
		
		System.out.println("颜色为:"+color);
		
		
		
	}
	
	public void show2(Color color) {
		
		System.out.println("颜色为2:"+color);
		
		
		
	}
	
	public void show3(Sex sex) {
		
		System.out.println("性别为:"+sex.getDesc());
		
		
		
	}

}
