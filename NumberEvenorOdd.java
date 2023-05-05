import java.util.Scanner;

public class NumberEvenorOdd {
    public static void main(String[] args) {
        int a;
        Scanner l = new Scanner(System.in);
        System.out.println("Enter your favourite number : ");
        a = l.nextInt();
        if (a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println(" Number is Odd");
        }
    }
}
