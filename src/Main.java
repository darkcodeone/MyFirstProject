


import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import static java.lang.Integer.parseInt;


public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String n = scn.next();
        char operation = scn.next().charAt(0);
        String n2 = scn.next();
        try {

            int parsedn1 = parseInt(n);
            int parsedn2 = parseInt(n2);

            System.out.println(arabicOperation.calculation(parsedn1, operation, parsedn2));
        } catch (NumberFormatException e ){

            if ( (n.equals("I") | n.equals("II") | n.equals("III") | n.equals("IV") | n.equals("V") | n.equals("VI") | n.equals("VII") | n.equals("VIII") | n.equals("IX") | n.equals("X") )
                    & (n2.equals("I") | n2.equals("II") | n2.equals("III") | n2.equals("IV") | n2.equals("V") | n2.equals("VI") | n2.equals("VII") | n2.equals("VIII") | n2.equals("IX") | n2.equals("X") ) ) {
                System.out.println(Rome.calculate(n, operation,n2));

            } else{
                throw new Exception("Неверное значение чисел!");
            }
        }
    }
}