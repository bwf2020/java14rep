package day10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Test4 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test4 window = new Test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 830, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("单击事件");
		button.setBounds(271, 244, 210, 74);
		
		/*MyAction myAction=new MyAction(this);
		button.addActionListener(myAction);*/
		
		//采用匿名内部类
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println("还是单击了我");
				
				System.out.println(textField.getText());
				
			}
		});
		
		
		System.out.println("当前类中："+this);
		
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(210, 89, 361, 110);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

class MyAction implements ActionListener{

	
	 private Test4 t;
	
	 public MyAction(Test4 t) {


		 this.t=t;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {


		System.out.println("单击了我");
		
	
		System.out.println("事件中的："+t);
		
		//System.out.println(t.textField.getText());
		
		
	}
	
	
	
}
