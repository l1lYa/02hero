import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = scan.nextLine();
        System.out.println("Введи свой возраст");
        String age = scan.nextLine();
        int n = age.length();
        char last = age.charAt(n - 1);
        String s = "лет";
        if(last == '1'){
            s = " год";
        }else if(last == '2' || last == '3' || last == '4' ){
            s = " года";
        }else{
            System.out.println(" лет");
        }
        System.out.println("Тебя зовут "+name+" и тебе "+age+s);

    }
}
