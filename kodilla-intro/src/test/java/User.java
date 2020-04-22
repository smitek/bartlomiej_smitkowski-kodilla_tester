public class User {
    public String userName;
    public int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
    public static void main(String[] args) {
        User tomek = new User("Tomek", 31);
        User bartek = new User("Bartek", 18);
        User magda = new User("Magda", 19);
        User szymon = new User("Szymon", 6);
        User karol = new User("Karol", 3);
        User[] users = {tomek, bartek, magda, szymon, karol};

        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + users[i].age;
//            System.out.println(result); //wyświetla sumę age
        }
        int avg = result / users.length;
        System.out.println("średni wiek to " + avg + " lat");

        for (int i = 0; i < users.length; i++)
            if (users[i].age > avg) {
                System.out.println(users[i].userName); // wyśw jakieś dziwne nazwy
           }
    }
}
