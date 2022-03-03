package Day_x;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int originalNumber, remainder, result = 0;
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
        originalNumber = number;
        int l=String.valueOf(number).length();
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, l);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

	}

}

