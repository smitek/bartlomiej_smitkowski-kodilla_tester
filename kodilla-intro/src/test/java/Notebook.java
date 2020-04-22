public class Notebook {
    int weight;
    int price;
    int year;
    boolean weightb;

    public Notebook(int weight, int price, int year, boolean weightb) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.weightb = true;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("The device is light");
        } else if (this.weight > 500 && this.price < 1000) {
            System.out.println("The device is not very heavy.");
        } else {
            System.out.println("The device is heavy.");
        }
    }

    public void chceckAll() {
        if (this.weightb == true && this.year > 2010) {
            System.out.println("Good new technollogy.");
        } else if (this.weightb = false && this.year < 2000) {
            System.out.println("Good old armored machine.");
        } else {
            System.out.println("Good for work.");
        }
    }
}