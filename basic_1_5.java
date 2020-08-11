// 5 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в секундах T = ");
        int T = in.nextInt();
        int HH = T /3600;
        int MM = (T - HH*3600)/60;
        int SS = (T - HH*3600 - MM*60);
        System.out.print(HH + "ч" + MM + "мин" + SS + "с.");
    }
}
