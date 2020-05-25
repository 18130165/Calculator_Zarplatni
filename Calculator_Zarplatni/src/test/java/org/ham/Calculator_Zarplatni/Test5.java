package org.ham.Calculator_Zarplatni;

import static org.junit.Assert.*;


public class Test5 {
	@org.junit.Test
	
	public void test5(){
		ButtonEventListener prw = new ButtonEventListener();
		CalculGUI RTV = new CalculGUI(); //создание объекта класса CalculGUI
		CalculGUI.input1.setText("14"); //задаем значение первого поля 
		CalculGUI.input2.setText("15000"); //задаем значение второго поля 
		CalculGUI.input3.setText("5000"); //задаем значение третьего поля 
		CalculGUI.input4.setText("7"); //задаем значение четвертого поля 
		RTV.button.doClick(); //нажимаем кнопку "Выполнить расчет"
		String result = CalculGUI.input5.getText(); 
		
		assertEquals("18000.0",result); // сравнение полученного результата и ожидаемого значения
	}
}
