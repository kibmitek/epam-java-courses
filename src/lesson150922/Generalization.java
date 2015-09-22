package lesson150922;

import java.awt.Color;

public class Generalization {
//обобщение - нарушается принцип подстановки - родителя и наследника меняем местами чтобы была специализация а не обобщение
//не всегда можно менять исходный код
	
	static class Window{ // monochrome
		
	}
	
	static class ColoredWindow extends Window{
		Color color;
	}
}
