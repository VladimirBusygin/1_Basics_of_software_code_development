import java.math.BigInteger;
//4 задание Циклы (1.Basic of software code development)
public class basic_3_4 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i<=200;i++){
            BigInteger temp = BigInteger.valueOf(i);
            result = temp.multiply(temp.multiply(result));
        }
        System.out.println("Произведение квадратов наутральных чисел от 1 до 200 : " + result);
    }
}
