import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    public static void main(String[] agrs){
        Notebook notebook = new Notebook(600, 1500, 2020, true);
        Notebook oldNotebook = new Notebook(1200, 1000, 2005, true);
        Notebook heavyNotebook = new Notebook(2000, 500, 2015, true);

        displayData(notebook);
        displayData(oldNotebook);
        displayData(heavyNotebook);

        // 1 sposób
//        List<Notebook> notebookList = new ArrayList<>();
//        notebookList.add(notebook);
//        notebookList.add(oldNotebook);
//        notebookList.add(heavyNotebook);
//
//        for (Notebook notebook1 : notebookList) {
//            displayData(notebook1);
//        }
        // sprawdzenie roku przestępnego
        LeapYear leap = new LeapYear(2012, false);
        System.out.println();
        leap.checkLeapYear();
}
public static void displayData(Notebook notebook){
    System.out.println(notebook.weight + " " + notebook.price+" "+notebook.year);
    notebook.checkPrice();
    notebook.checkWeight();
    notebook.chceckAll();
}

}