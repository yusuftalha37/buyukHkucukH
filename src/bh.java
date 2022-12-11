import java.util.Scanner;
public class bh {
    public static void main(String[] args) {
        System.out.println("Lütfrn Kelime Giriniz :");
        Scanner input = new Scanner(System.in);
        String mesaj;
        mesaj = input.nextLine();
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
    }
}
