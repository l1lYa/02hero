import java.util.Scanner;

public class Switcher {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошёл в школу");
                break;
            case 18 :
                System.out.println("Ты почти умер");
                break;
            default:
                System.out.println("Это я не обработал");
        }
    }

}
