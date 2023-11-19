package ha3;

public class Beispiel3 {

    public static void main(String[] args) {

        int i= 345;

        System.out.println("Трехзначное число: " + i);

        int erste = i / 100;
        int zweite = (i/10) %10;
        int dritte = i % 10;

        System.out.println("Первая цифра: " + erste);
        System.out.println("Вторая цифра: " + zweite);
        System.out.println("Третья цифра: " + dritte);

    }
}
