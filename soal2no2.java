import java.util.Scanner;

public class soal2no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print("Masukkkan Jari - Jari Bola : ");
        double r = scanner.nextInt();
        double hasil = luasBola(r);
        double hasil3 = luasLing(r);
        System.out.println("Luas Permukaaan Bola dengan Jari-Jari "+r+" Adalah : "+hasil);
        System.out.println("Luas Lingkaran dengan Jari-Jari"+r+" adalah : "+hasil3);
    }

    static double luasBola(double r){
        double d = r + r;
        double luas = 4 * Math.PI * d;
        return luas;
    }

    static double luasLing(double r){
        double luasL = Math.PI * r * r;
        return luasL;
    }
}
