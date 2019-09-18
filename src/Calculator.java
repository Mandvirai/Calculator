import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1. for add,2. for subtract,3. for multiply,4. for divide");
        int a = s.nextInt();

        System.out.println("Enter two numbers for performing the operation");
        int b = s.nextInt();
        int c = s.nextInt();
        switch(a) {
            case 1: System.out.println(b + c);
                break;
            case 2: System.out.println(b - c);
                break;
            case 3: System.out.println(b * c);
                break;
            case 4: System.out.println(b / c);
                break;
            default: System.out.println("invalid input");
        }

    }
}



