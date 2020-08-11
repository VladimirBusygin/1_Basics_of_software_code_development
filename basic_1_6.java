// 6 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // фигуру на картинке можно разбить на квадрат и прямоугольник и проверить принадлежит точка к данным областям
        //квадрат -  -2<=x<=2  0<=y<=4
        //прямоугольник -  -4<=x<=4  -3<=y<=0
        System.out.println("Введите координаты точки : ");
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();

        if(x>=-2 & x<= 2 & y>=0 & y<=4){
            System.out.println("true");
        }else{
            if(x>=-4 & x<=4 & y>=-3 & y<=0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
