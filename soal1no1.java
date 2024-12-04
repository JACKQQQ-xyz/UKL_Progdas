import java.util.Scanner;

public class soal1no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int diskon = 0;

        System.out.print("Masukkan total belanja : Rp.");
        int belanja = scanner.nextInt();

        System.out.print("Apakah Mempunyai Member? yes/no");
        String member = scanner.next();

        switch (member) {
            case "yes":
                if (belanja >= 100000 && belanja <= 200000) {
                    diskon = belanja * 10 / 100;
                    total = belanja - diskon;
                    System.out.println("Anda Mendapatkan Diskon Sebesar 10%, Total Belanja Yang Harus Dibayar Anda Sebesar : Rp." + total);
                } else if (belanja > 200000) {
                    diskon = belanja * 20 / 100;
                    total = belanja - diskon;
                    System.out.println("Anda Mendapatkan Diskon Sebesar 20%, Total Belanja Yang Harus Dibayar Anda Sebesar : Rp." + total);
                } else {
                    System.out.println("Total Belanja Yang Harus Dibayar Anda Sebesar : Rp." + belanja);
                }
                break;
            case "no":
                System.out.println("Total Belanja Yang Harus Dibayar Anda Sebesar : Rp." + belanja);
                break;
            default:
                System.out.println("Input Tidak Valid");
                break;
        }
    }
}
