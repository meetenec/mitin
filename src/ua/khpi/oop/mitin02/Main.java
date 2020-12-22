package ua.khpi.oop.mitin02;
//import java.util.Scanner;
import java.util.Random;
public class Main {

	

		static int var = 2;

		public static void main(String[] args) {
		    //Scanner scanner = new Scanner(System.in);
		    //int n = scanner.nextInt();
			printTable();
		    
		    for (int i=0;i<10;i++) {
		    	Generate();
		    	
		    	
		    	
		    }
		    
		    
		}
		private static void Generate() {
			int min = 1;
		    int max = 100;
		    int diff = max - min;
		    Random a = new Random();
		    int n = a.nextInt(diff + 1);
		    n += min;
		    checkIsItASimpleNumber(n);
		}
		private static void checkIsItASimpleNumber(int n) {
			int temp;
			boolean res=true;
		    if (n > 1) {
		    	for (int i=2; i<=n/2; i++) {
		            temp = n % i;
		     if (temp == 0) {
		        res = false;
		        break;
		     }
		  }
		    	if(res) {
		    		printTableRes(n,res);
		    		
		    	 } else {
		    		 printTableRes(n,res);
		    		 }
		    }
		    		
		  }
		           
		    		
		    
		
		
		
		private static void printTable() {
			System.out.println("----------------------------------------");
			System.out.println("|  number | simple   | not a simple  |");
			System.out.println("----------------------------------------");
		}
		private static void printTableRes(int n,boolean res) {
			boolean res2;
			if(res==false) {
				res2 = true;
			}else  { res2=false;}
			
			System.out.print("|    "+n+"   ");
			System.out.print("| "+res+"     |");
			System.out.println("\t "+res2+"          |");
			System.out.println("----------------------------------------");
			
			
		}
		    
}
		    	
		    
		

		    
		
		
		   
		
	


