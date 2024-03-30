import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Pointer {
    int x;
    int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Bagli_Sirala {
    static Pointer[] d = new Pointer[50];
    static int sayac;

    public void sirala() {
        siralaR(d);
    }

    public static void siralaR(Pointer[] d) {
        System.out.println("Siralanmis dizi: ");
        for (int i = 0; i < sayac - 1; i++) {
            for (int j = 0; j < sayac - i - 1; j++) {
                if (d[j].x > d[j + 1].x) {
                    Pointer temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < sayac; k++) {
            System.out.println("x: " + d[k].x + " y: " + d[k].y);
        }
    }

    public static void main(String[] args) throws IOException {
        Bagli_Sirala b = new Bagli_Sirala();
        String a;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dosya adini giriniz: ");
        String name = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        while ((a = bufferedReader.readLine()) != null) {
            d[i] = new Pointer(Integer.parseInt(a), i);
            i++;
            sayac++;
        }
        System.out.println("Siralanmamis dizi: ");
        for (int j = 0; j < sayac; j++) {
            System.out.println("x: " + d[j].x + " y: " + d[j].y);
        }
        System.out.println();
        b.sirala();
    }
}
