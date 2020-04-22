public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Marsjanin";
        books[1] = "Slepnac od swiatel";
        books[2] = "Rotmistrz Pilecki";
        books[3] = "Czerwona Jaskolka";
        books[4] = "Mocherfucker";
        // pokazuje pozycję nr ...
//        System.out.println(books[3]);
        // liczy ile jest rekordów
        System.out.println("Moja tablica ma " + books.length + " elementow.");
        // Wyświetlanie elementów tablicy
        for (int i=0; i<books.length; i++) {
            System.out.println(books[i]);
        }
        // odwrotnie
//        for (int i=books.length-1; i>=0; i--) {
//            System.out.println(books[i]);
//        }
    }
}
