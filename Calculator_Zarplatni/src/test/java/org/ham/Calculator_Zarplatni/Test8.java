package org.ham.Calculator_Zarplatni;

import static org.junit.Assert.*;


public class Test8 {
	@org.junit.Test
	
	public void test8(){
		ButtonEventListener prw = new ButtonEventListener();
		CalculGUI RTV = new CalculGUI(); //создание объекта класса CalculGUI
		CalculGUI.input1.setText("6"); //задаем значение первого поля 
		CalculGUI.input2.setText("21000"); //задаем значение второго поля 
		CalculGUI.input3.setText("2400"); //задаем значение третьего поля 
		CalculGUI.input4.setText("12"); //задаем значение четвертого поля 
		RTV.button.doClick(); //нажимаем кнопку "Выполнить расчет"
		String result = CalculGUI.input5.getText(); 
		
		assertEquals("12900.0",result); // сравнение полученного результата и ожидаемого значения
	}
}
