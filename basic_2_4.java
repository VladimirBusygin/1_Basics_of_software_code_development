//4 задание Ветвления (1.Basic of software code development)
import java.util.Scanner;
public class basic_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры отверстия :");
        System.out.print("A = ");
        int A = in.nextInt();
        System.out.print("B = ");
        int B = in.nextInt();
        System.out.println("Введите размеры кирпича :");
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        System.out.print("z = ");
        int z = in.nextInt();

        if(A >= x){
            if(B >= y){
                System.out.println("Кирпич проходит в отверстие !");
            }else{
                if(B >= z){
                    System.out.println("Кирпич проходит в отверстие !");
                }else{
                    System.out.println("Кирпич НЕ проходит в отверстие !");
                }
            }
        }else{
            if(A >= y){
                if(B >= x){
                    System.out.println("Кирпич проходит в отверстие !");
                }else{
                    if(B >= z){
                        System.out.println("Кирпич проходит в отверстие !");
                    }else{
                        System.out.println("Кирпич НЕ проходит в отверстие !");
                    }
                }
            }else{
                if(A >= z){
                    if(B >= x){
                        System.out.println("Кирпич проходит в отверстие !");
                    }else{
                        if(B >= y){
                            System.out.println("Кирпич проходит в отверстие !");
                        }else{
                            System.out.println("Кирпич НЕ проходит в отверстие !");
                        }
                    }
                }else{
                    System.out.println("Кирпич НЕ проходит в отверстие !");
                }
            }
        }

    }
}
