import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Podwójny rzut kostką!");

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int liczba1 = 0;
    int liczba2 = 0;
    
    while (liczba1 != 6 || liczba2 != 6) {
      liczba1 = rand.nextInt(6) + 1; 
      liczba2 = rand.nextInt(6) + 1; 
      System.out.println("Pierwszy rzut: " + liczba1 + " Drugi rzut: " + liczba2);
    }
    
    System.out.println("Liczby są równe!");
  }
}