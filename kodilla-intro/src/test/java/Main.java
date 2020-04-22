public class Main {
    public static void main(String[] args) {
        Person pawel = new Person();
        pawel.name = "Paweł";
        pawel.age = 18;
        pawel.isAlive = true;
        pawel.isWorking = true;

        Person mikolaj = new Person();
        mikolaj.name = "Mikołaj";
        mikolaj.age = 100;
        mikolaj.isAlive = false;
        mikolaj.isWorking = false;

        pawel.przedstawSie();
        mikolaj.przedstawSie();
    }

}
