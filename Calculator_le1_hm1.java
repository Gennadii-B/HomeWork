package calc;
import java.util.Scanner;

// homework lession_1

public class Calculate {
    public static void main(String[] dargs){
        int number_1, number_2, res;
        String a, b, c, d = "Exit";
        boolean ex = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Вы находитесь в калькуляторе (для выхода введите \"Exit\")");
        while(ex) {
            a = sc.next();
            if(a.equals(d)){ ex = false; continue;}
            c = sc.next();
            if(c.equals(d)){  ex = false; continue;}
            b = sc.next();
            if(b.equals(d)){  ex = false; continue;}


            number_1 = Integer.parseInt(a);
            number_2 = Integer.parseInt(b);

            switch (c) {
                case "/":
                    res = number_1 / number_2;
                    System.out.println(res);
                    break;
                case "*":
                    res = number_1 * number_2;
                    System.out.println(res);
                    break;
                case "+":
                    res = number_1 + number_2;
                    System.out.println(res);
                    break;
                case "-":
                    res = number_1 - number_2;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("ошибка операции");
            }
        }

    }
}
