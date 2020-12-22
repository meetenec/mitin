
package ua.khpi.oop.mitin01;

public class Main {

    public static void main(String[] args)
	{
		
		int record_book  = 0x5240; //зачетная книжка 21056 в 16-системе
		long number_telephone = 380992702224L; //в 10-системе
		int two_last_num = 0b11000; //в 2-системе
		int four_last_num = 04260; //в 8-системе
		int result = ((15 - 1) % 26) + 1; // равно 15 
		char letter = 'O';// 15 буква в английском алфавите 
		
		count_odd_and_even(record_book);
		count_odd_and_even(number_telephone);
		count_odd_and_even(two_last_num);
		count_odd_and_even(four_last_num);
		count_odd_and_even(result); 
		
		count_ones_in_binary(record_book);
		count_ones_in_binary(number_telephone);
		count_ones_in_binary(two_last_num);
		count_ones_in_binary(four_last_num);
		count_ones_in_binary(result);
	}
	/*Method that counts number of even and odd numbers*/
	public static void count_odd_and_even(long num) {
		int even = 0;
		int odd = 0;
		System.out.println("Number for count - " + num);
		while (num > 0) {
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num/10;
		}
		System.out.println("Amount of even numbers - " + even + ", odd numbers - " + odd);
	}
	/*Method that counts number of ones in binary number*/
	public static void count_ones_in_binary(long num) {
	        long  bit;   
	        int count = 0;
	        System.out.println("Number = "+num);
	        System.out.print("Number in binary - ");
	        while(num !=0 ) {  
	        	bit = num%2;  
	            System.out.print(bit);
	            if(bit==1)
	            	count++;
	            num = num/2;  
	        }  
	        System.out.println();
	        System.out.println("Count ones in binary = "+count);
	}
}

