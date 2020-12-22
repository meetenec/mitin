package ua.khpi.oop.mitin04;
import java.util.Scanner;
import java.util.Iterator;
import ua.khpi.oop.mitin04.UtilityClass;
import ua.khpi.oop.mitin04.Debug;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		  while(true)
          {
			 
			   
              System.out.print("1.Введите данные\n2.Посмотреть введенные данные\n3.Вычисление\n4.Результат\n"
                  + "5.Определение режима роботы программы\n6.Завершить рабоут программы\n");
              Scanner in=new Scanner(System.in);
                int p=in.nextInt();
            switch(p)
            {
              case 1:
              {
                    UtilityClass.Output();
                    UtilityClass.In();
                    break;
              }
              case 2:
              {
                 UtilityClass.Vveden_Dann();
                 break;
              }
              case 3:
              {
                UtilityClass.Math();;
                break;
              }
              case 4:
              {
                UtilityClass.End();
                UtilityClass.Result();
                break;
              }
              case 5:
              {
                System.out.print("Введите либо -h либо -d. -h-означает помощь(Выведутся данные о студенте и о задании)."
                    + "-d-Означает помощь в проверке работо способности программы\n");
                Scanner r= new Scanner(System.in);
                String F;
                F=r.nextLine();
               String D="-h";
               String E="-d";
               if(F.equals(D))
               {
                 System.out.print("Работу выполнил студент группы Кит 119-Д, Митин Никита.Индивидульное задание "
                     + "№15:Ввести текст. В тексте найти все слова-палиндромы,(одниково читаются в обоих направлениях - слева направо и справа налево. Например: \"noon\", \"civic\", \"radar\", \"level\", \"rotor\", \"refer\").");
                 break;
               }
               if(F.equals(E))
               {
                 Debug.Output();
                 Debug.In();
                 Debug.End();
                 Debug.Result();
                 break;
               }
               else 
               {
                 System.out.print("Вы неправильно ввели команду\n");
                 break;
               }
              }
              case 6:
              {
                System.exit(0);
              }
            }
          }
          
    }

	}


