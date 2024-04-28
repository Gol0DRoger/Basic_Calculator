import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Which Operation to perfom : + , - , * , /");
    Scanner sd = new Scanner(System.in);
    char opr = sd.next().charAt(0);
    if(opr == '+'){
        int c = a + b;
        System.out.println(c);
    }
    else if(opr == '*'){
        int c = a*b;
        System.out.println(c);
    }
    else if(opr == '-'){
        int c = a - b;
        System.out.println(c);
    }
    else if(opr == '/'){
        int c = a/b;
        System.out.println(c);
    }
}
}