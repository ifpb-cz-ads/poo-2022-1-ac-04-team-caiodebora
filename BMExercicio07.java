import java.util.Scanner;
  
public class BMExercicio07 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = x;

    while (y != 1){
      if (y % 2 == 0){
        y = y / 2;
      } else {
        y = (3 * y) + 1;
      }

      System.out.println(y);
      x = y;
    }
  }  
}