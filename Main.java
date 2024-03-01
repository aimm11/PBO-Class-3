public class Main {
    public static void main(String[] args) {
        // Looping deret angka: 2 4 6 8 10 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(10);

        // Looping deret angka: 9 6 3 0 -3 -6
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Looping untuk perkalian dengan output yang diminta
        for (int i = 6; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Looping deret angka: 1 3 6 10 15 21 28 36
        int n = 1;
        for (int i = 1; i <= 8; i++) {
            System.out.print(n + " ");
            n += i + 1;
        }
    }
}
