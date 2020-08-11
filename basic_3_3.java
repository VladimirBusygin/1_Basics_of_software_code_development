//3 задание Циклы (1.Basic of software code development)
public class basic_3_3 {
    public static void main(String[] args) {
       int sum = 0;
        for(int i = 1;i<=100;i++){
            sum+= Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых ста натуральных чисел : " + sum);
    }
}
