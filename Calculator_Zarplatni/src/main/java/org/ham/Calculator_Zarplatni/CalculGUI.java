package org.ham.Calculator_Zarplatni;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculGUI extends JFrame {
	public JButton button = new JButton("Выполнить расчет"); //объект кнопка
	
	public static JTextField input1 = new JTextField("",4); //объект тектовое поле
	public static JTextField input2 = new JTextField("",4); //объект тектовое поле
	public static JTextField input3 = new JTextField("",4); //объект тектовое поле
	public static JTextField input4 = new JTextField("",4); //объект тектовое поле
	public static JTextField input5 = new JTextField("",4); //объект тектовое поле

	
	private JLabel label1 = new JLabel("Отработанные дни:"); //объект текстовая строка
	private JLabel label2 = new JLabel("Оклад, руб.:"); //объект текстовая строка
	private JLabel label3 = new JLabel("Премия, руб.:"); //объект текстовая строка
	private JLabel label4 = new JLabel("Количество рабочих дней:"); //объект текстовая строка
	private JLabel label5 = new JLabel("ЗАРАБОТНАЯ ПЛАТА:"); //объект текстовая строка
	
	public static boolean check = true;
	
	public CalculGUI() { // конструктор
		super("Калькулятор расчета заработной платы"); //заголовок окна программы
		this.setBounds(100, 100,800, 200); //параметры окна
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container container = this.getContentPane();
		container.setLayout(null);
		input5.disable(); //

		
		//Добавление элементов окна на панель
		input1.setSize(190,50);
		input2.setSize(190,50);
		input3.setSize(190,50);
		input4.setSize(190,50);
		input5.setSize(190,50);
		
		input1.setLocation(200, 5);
		input2.setLocation(590, 5);
		input3.setLocation(200, 60);
		input4.setLocation(590, 60);
		input5.setLocation(200, 110);
		
		label1.setSize(190,50);
		label2.setSize(190,50);
		label3.setSize(190,50);
		label4.setSize(190,50);
		label5.setSize(190,50);
		
		label1.setLocation(10, 5);
		label2.setLocation(400, 5);
		label3.setLocation(10, 60);
		label4.setLocation(400, 60);
		label5.setLocation(10, 110);
		
		button.setSize(190,50);
		button.setLocation(400, 110);
		
		container.add(label1);
		container.add(input1);
		
		container.add(label2);
		container.add(input2);
		
		container.add(label3);
		container.add(input3);
		
		container.add(label4);
		container.add(input4);
		
		container.add(label5);
		container.add(input5);

		
		
		ButtonEventListener action = new ButtonEventListener();
		button.addActionListener(action); //присвоение отработчика кнопке
		container.add(button); // добавление кнопки на панель
		
	}
}
