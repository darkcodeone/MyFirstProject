

public class Roman {
    public static String convert(int number) {
        StringBuilder romanNum = new StringBuilder();
        if (number <= 0 ){
            throw new RuntimeException("Возникло исключение");
        }
        while (number > 0) {
            while (number >= 10) {
                romanNum.append("X");
                number -= 10;
            }
            while (number >= 9) {
                romanNum.append("IX");
                number -= 9;
            }
            while (number >= 5) {
                romanNum.append("V");
                number -= 5;
            }
            while (number >= 4) {
                romanNum.append("IV");
                number -= 4;
            }
            while (number >= 1) {
                romanNum.append("I");
                number -= 1;
            }

        }
        return romanNum.toString();
    }

    public static int parse(String number) {
        int lengthOfNumber = number.length();
        int[] value = new int[lengthOfNumber];
        for (int i = lengthOfNumber; i > 0; i -= 1) {
            if (number.charAt(i - 1) == ('I'))
                value[i - 1] = 1;
            else if (number.charAt(i - 1) == ('V'))
                value[i - 1] = 5;
            else if (number.charAt(i - 1) == ('X'))
                value[i - 1] = 10;
            else
                return -1;
        }

        int total = value[lengthOfNumber - 1];
        for (int i = lengthOfNumber; i > 1; i -= 1) {
            if (value[i - 1] <= value[i - 2]) {
                total += value[i - 2];
            }
            if (value[i - 1] > value[i - 2]){
                total -= value[i - 2];
            }
        }
        return total;
    }
}
