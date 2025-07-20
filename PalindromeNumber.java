import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int reminder, palindrome=0;
        System.out.println("Enter a Number: ");
        int number= scan.nextInt();

         int temp = number;

         while (number>0){
             reminder= number%10;
             palindrome=(palindrome*10)+reminder;
             number=number/10;

         }
         if (temp==palindrome){
             System.out.println("The Number is Palindrome");
         }else System.out.println("Not a Palindrome");
    }
}

