package ua.khpi.oop.mitin04;
import java.util.ArrayList;
import java.util.Scanner;
 

public class UtilityClass {
	
	  static ArrayList<String> text = new ArrayList<String>();
	  static String S;
	  static int num;
	  static String SS[]; 
	  static int k;
	  int a=1;

	    public static void   In()
	    {
	       Scanner s = new Scanner(System.in);
	              S=s.nextLine();
	              //SS= S.split("\\s+"); 
	              SS = UtilityClass.Split(S);
	    }
	    private static String[] Split(String incomingText) {
	        String[] strArr1 = new String[16];
	        String Text = incomingText.trim().concat(" ");

	        int count = 0;
	        int a = 0;
	        int j = 0;
	        
	        for(int i = 0; i < Text.length(); i++) {
	          if(Text.charAt(i) != ' ') {
	            count++;
	          }
	            else {
	              char[] str = new char[count];
	              for(j = 0, i -= count; j < count; j++, i++) {
	                str[j] = Text.charAt(i);
	              }
	            strArr1[a] = String.valueOf(str);
	            str = null;
	            count = 0;
	            a++;
	            }
	          }
	        
	        String[] strArr2 = new String[a];
	        for(int i = 0; i < a; i++) {
	            strArr2[i] = strArr1[i];
	        }
	      return strArr2;
	      }
	    public static void Vveden_Dann()
	    {
	      System.out.print(S);
	      System.out.print("\n");
	    }
	    public static void Math()
	    {
	        for(int i=0;i<SS.length;i++) 
            {
                //for(int j =i+1;j<SS.length;j++) 
                //{
               	 
                    if(solve(SS[i])) 
                   {
                       //System.out.println(SS[i]);
                        num++;
               	 
                    //}
                }
            }
	    
	       
	     
	    
	       if(num==0) {
	                 //System.out.println("����� ���� �� �������");
	             }
	     
	    }
	    public static void Result()
	    {
	        for(int i=0;i<SS.length;i++) 
	             {
	                 //for(int j =i+1;j<SS.length;j++) 
	                 //{
	                	 
	                     if(solve(SS[i])) 
	                    {
	                        System.out.println(SS[i]);
	                         num++;
	                	 
	                     //}
	                 }
	             }
	    
	       if(num==0) {
	                 System.out.println("����� ���� �� �������");
	                 }
	     
	       
	    	}
	   
	      static boolean solve(String S) 
	         {
	             StringBuilder SS = new StringBuilder(S);
	             SS=SS.reverse();
	             return S.equals(SS.toString());
	    	 // int n = S.length();
	    	 // for (int i = 0; i < (n/2); ++i) {
	    	    // if (S.charAt(i) != S.charAt(n - i - 1)) {
	    	        // return false;
	    	     //}
	    	 // }

	    	 //return true;
	         }

	    public static void Output()
	    {
	          System.out.print("������� ��� ����� ���������\n");
	    
	    }
	    public static void End()
	    {
	            System.out.print("��� ���������\n");

	    }
		
}
