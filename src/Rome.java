import oper.div;
import oper.sum;
import oper.mul;
import oper.min;


public class Rome{
    public static String calculate(String number, char operation, String number2) throws Exception {
        int numberInt, number2Int;
        int resultNumbers;


        numberInt = Roman.parse(number);
        number2Int = Roman.parse(number2);

        switch (operation) {

            case '+' -> resultNumbers = sum.calculate(numberInt ,number2Int);
            case '-' -> resultNumbers = min.calculate(numberInt , number2Int);
            case '*' -> resultNumbers = mul.calculate(numberInt , number2Int);
            case '/' -> resultNumbers = (int) div.calculate(numberInt, number2Int);
            default -> throw new Exception("Неверный знак!");

        }
        return Roman.convert(resultNumbers);
    }
}