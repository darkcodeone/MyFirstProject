import oper.div;
import oper.mul;
import oper.sum;
import oper.min;


import java.util.NoSuchElementException;

public class arabicOperation{
    public static int calculation(int number, char operation , int number2) throws ArithmeticException, NoSuchElementException{
        if (number > 10 | number < 1 | number2 > 10 | number2 < 1)

            throw new ArithmeticException("Числа не соотвествуют условию");

        else {

            return switch (operation) {

                case '/' -> (int) div.calculate(number, number2);
                case '+' -> sum.calculate(number, number2);
                case '-' -> min.calculate(number, number2);
                case '*' -> mul.calculate(number, number2);
                default -> throw new NoSuchElementException("Неверный символ");
            };
        }
    }
}