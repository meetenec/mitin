package ua.khpi.oop.mitin06;

import var25.helper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
 
import ua.khpi.oop.mitin04.UtilityClass;
public class Main { 
	  
	public static void main(String[] args ) throws IOException, ClassNotFoundException {
//		Container container = new Container("Hi user.","This lab aims to show how I can deal with the container development problem.","All this is needed so that I can keep strings with palindromes safe and sound."); 
		Container container = new Container();
		 
		 String command = "";
		 String str = "";
		do
		{	
	 
			
			System.out.println("доступные команды\r\n" + 
					"1 -  заполнение контейнера данными          - \r\n" + 
					"2 -  вывод содержания контейнера            - \r\n" + 
					"3 -  добавление нового элемента в контейнер - \r\n" + 
					"4 -  удаление элемента с контейнера         - \r\n" +
					"5 -  поиск элемента                         - \r\n" +
					"6 -  поиск полиндромов в контейнере         - \r\n" +
					"7 -  сортировка контейнера                  - \r\n" +
					"8 -  сравненние контейнеров                 - \r\n" +
					"9 -  сериализация                           - \r\n" +
					"10 -  десереализация                        - \r\n" +
					"11 -  задание другого студента              - \r\n" +
					"0 -  завершение программы(удаление контейнера автоматическое) - \r\n" + 
					"");
			System.out.println("Введите команду: ");
			Scanner scan = new Scanner(System.in);
			command = scan.nextLine();  
			switch (command) {
			case "1": {
				container = Create_container();
				break;
			}
			case "2": {
				if(container.size()!=0)
				{
					System.out.println("Вывод содержимого на экран");
					System.out.println(container.toString());
				}
				else {
					System.out.println("Вы еще не создали контейнер");
				}
				break;
			}
			case "3": {
				if(container.size()!=0)
				{
					System.out.println("Введите новую строку");
					str = scan.nextLine();
					container.add(str);
				}
				else {
					System.out.println("Вы еще не создали контейнер");
				}

				break;
			}
			case "4": {
				if(container.size()!=0)
				{
					System.out.println("Введите строку,которую нужно удалить");
					str = scan.nextLine();
					System.out.println("Результат удаления элемента - " + container.remove(str));
				}
				break;
			}
			case "5": {
				if(container.size()!=0) 
				{
					System.out.println("Введите строку,которую нужно проверить");
					str = scan.nextLine();
					System.out.println("Результат поиска элемента в контейнере" + container.contains(str));
				}
				else {
					System.out.println("Вы еще не создали контейнер");
				}
				break;
			}
			case "6": {
				if(container.size()!=0)
				{
					Task t = new Task();
					t.task(container);
				} 
				else {
					System.out.println("Вы еще не создали контейнер");
				}
				break;
			}
			case "7": {
				if(container.size()!=0)
				{
					container.Sort();		
				}

				else {
					System.out.println("Вы еще не создали контейнер");
				}
				break;
			}
			case "8": {
				if(container.size()!=0)
				{
					Container new_cont = Create_container();
					container.containsAll(new_cont);
				}
				else {
					System.out.println("Вы еще не создали контейнер");
				}

				break;
			}
			case "9": {
				
				FileOutputStream fs = new FileOutputStream("Serial.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(container);
				os.close();
				System.out.println("Serialization successful");
				
				break;
			}
			case "10": {
				
				FileInputStream fis = new FileInputStream("Serial.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Container var = (Container) ois.readObject();
				container = var;
				ois.close();
				
				
				break;
			}
			case "11": {
				 
				// helper.countVowelsAndConsonants(container.toString());
				break;
			}
			case "0": { 
				System.out.println("конец программы");	
				container.clear();
				break;
			}
			default:
				System.out.println("Вы ошиблись командой");
				break;
			}
			
		}while(!(command.equals("0"))); 
	}
	
	
	public static Container Create_container()
	{
		Scanner scan = new Scanner(System.in);
		String enter_data = "";
		System.out.println("введите количество элементов в контейнере");
		enter_data = scan.nextLine();
		int size = Integer. parseInt(enter_data);
		System.out.println("введите элементы - ");
		String [] arr = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print(i+1 + " элемент - " );
			enter_data = scan.nextLine();
			arr[i] = enter_data;
		}
		Container cont = new Container(arr);
		return cont;
	}
} 



