public class Test {
    public static void main(String[] args) {
        int a = 0;
        int suma = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                System.out.println("****************");
                a++;
                System.out.println("Ilość występowania: " + a);
                suma = suma + i;
                System.out.println("Wynik sumowanych liczb: " + suma);
            }
        }
    }
}
