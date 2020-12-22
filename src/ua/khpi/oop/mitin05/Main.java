package ua.khpi.oop.mitin05;

import java.util.Iterator;

public class Main { 
	  
	public static void main(String[] args ) {
		Container container = new Container("ѕривет, пользователь."," ÷ель этой лабораторной работы - показать, как € могу справитьс€ с проблемой разработки контейнеров. "," ¬се это необходимо дл€ того, чтобы € мог хранить строки с палиндромами в целости и сохранности."); 
		 Iterator<String> it = container.getIterator() ;
		for (;it.hasNext();) 
			System.out.println(it.next());
		it = container.getIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("”даление первого аналогичного элемента из контейнера и его отображение с помощью метода toString :");
		System.out.println("ѕроверка результатов - " + container.remove("ѕривет, пользователь."));
		System.out.println(container.toString());
		System.out.println("–азмер контейнера - " + container.size());
		System.out.println("—одержит тест со строкой: " + "¬се это нужно дл€ того, чтобы € мог хранить строки с палиндромами в целости и сохранности - " + container.contains("¬се это нужно дл€ того, чтобы € мог сохранить в целости и сохранности строки с палиндромами."));
		System.out.println("ƒобавьте одну строку в мой контейнер");
		container.add("adda wad ss.");
		System.out.println("¬ид : " + container.toString());
		System.out.println("\n—одержит весь текст - " + container.containsAll(new Container("adda wad ss.", "÷ель этой лабораторной работы - показать, как € могу решить проблему разработки контейнеров.","¬се это нужно дл€ того, чтобы € мог сохранить в целости и сохранности строки с палиндромами.")));
		System.out.println("ќчистка контейнера");
		container.clear();
		
		
	} 

}

