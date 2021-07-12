public class Brake_Continue {
    public static void main (String [] args){
        int i = 0;
        while (true){
            i++;
            System.out.println(i);
            if (i==15){
                break;
            }
        }
        System.out.println("Вы вышли из цикла первого цикла");
        for (int j=0; j<=15; j++){
            if (j%2!=0){
                continue;
            } else if (j!=0){
                System.out.println("Это чётное число - " + j);
            }
        }

    }
}
