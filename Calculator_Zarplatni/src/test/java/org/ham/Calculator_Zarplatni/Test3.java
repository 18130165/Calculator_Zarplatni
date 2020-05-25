package org.ham.Calculator_Zarplatni;

import static org.junit.Assert.*;


public class Test3 {
	@org.junit.Test
	
	public void test3(){
		ButtonEventListener prw = new ButtonEventListener();
		CalculGUI RTV = new CalculGUI(); //создание объекта класса CalculGUI
		CalculGUI.input1.setText("13"); //задаем значение первого поля 
		CalculGUI.input2.setText("20000"); //задаем значение второго поля 
		CalculGUI.input3.setText("1000"); //задаем значение третьего поля 
		CalculGUI.input4.setText("26"); //задаем значение четвертого поля 
		RTV.button.doClick(); //нажимаем кнопку "Выполнить расчет"
		String result = CalculGUI.input5.getText(); 
		
		assertEquals("11000.0",result); // сравнение полученного результата и ожидаемого значения
	}
}
