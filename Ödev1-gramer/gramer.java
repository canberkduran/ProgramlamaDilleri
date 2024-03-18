import java.util.Scanner;

public class gramer {

    public static void main(String[] args) {
        String[] isim = { "Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki" };
        String[] nesne = {
                "Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
                "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı" };
        String[] yuklem = { "Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("cumleyi giriniz : ");
        String c = scanner.nextLine().trim();
        String[] dizi = c.split("\\s+");
        int i = 0;
        boolean isEqual = isimCheck(isim, dizi, i);

        if (isEqual) {
            i++;
            isEqual = nesneCheck(nesne, dizi, i);
        } else {
            System.out.println("HAYIR");
            System.exit(0);
        }

        if (isEqual) {
            i++;
            isEqual = yuklemCheck(yuklem, dizi, i);
        } else {
            System.out.println("HAYIR");
            System.exit(0);
        }
        if (isEqual) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
            System.exit(0);
        }
    }

    public static boolean isimCheck(String[] isim, String[] dizi, int i) {
        for (String s : isim) {
            if (dizi[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean nesneCheck(String[] nesne, String[] dizi, int i) {
        for (String s : nesne) {
            if (dizi[i].equals(s)) {
                return true;
            }
        }
        return false;

    }

    public static boolean yuklemCheck(String[] yuklem, String[] dizi, int i) {
        for (String s : yuklem) {
            if (dizi[i].equals(s)) {
                return true;
            }
        }
        return false;

    }
}
