import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanenr =  new Scanner(System.in);

        int a,b;

        System.out.println("Num 1");
        a = scanenr.nextInt();
        System.out.println("Num 2");
        b = scanenr.nextInt();

        Addition.addNumber(a,b);
        Subtraction.subNumber(a,b);
        Multiplication.multNumber(a,b);
        Division.divNumber(a,b);

        }
    }