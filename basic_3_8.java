////8 задание Циклы (1.Basic of software code development)
import java.util.Scanner;
public class basic_3_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа a и b");
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        int tempA = a;
        int tempB = b;
        int sizeA = 0; //количество цифр в числе
        int sizeB = 0;

        while(tempA > 0){
            tempA /=10;
            sizeA++;
        }

        while(tempB > 0){
            tempB/=10;
            sizeB++;
        }
        int numA;
        int numB;
        int temp;
        boolean flag;
        System.out.println("Цифры входящие в первое и второе число :");
       if(sizeA >= sizeB){
           for(int i = 0; i<sizeB;i++){
               numB = b % 10;
               b = (b - numB) / 10;
               temp = a;
               flag = false;
               for(int j = 0; j<sizeA;j++){
                   numA = temp % 10;
                   temp = (temp - numA) / 10;
                   if(numB == numA){
                       flag = true;
                   }
               }
               if(flag != false){
                   System.out.print(numB+" ");
               }
           }
       }else{
           for(int i = 0; i<sizeA;i++){
               numA = a % 10;
               a = (a - numA) / 10;
               temp = b;
               flag = false;
               for(int j = 0; j<sizeB;j++){
                   numB = temp % 10;
                   temp = (temp - numB) / 10;
                   if(numA == numB){
                       flag = true;
                   }
               }
               if(flag != false){
                   System.out.print(numA+" ");
               }
           }
       } ///я полагаю что нужно вывести цифры повторяющиеся в записи как первого так и второго 12334 332 результат -  2 3 3
    }

}
