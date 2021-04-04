package Class11;

import java.util.Arrays;

public class Printer {

    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print(50);
        p1.print(5,true);
        p1.addPaper(10);
        p1.addToner(3);
        p1.printerSummary();
    }

    final int maxToner = 100;
    final int maxPaper = 100;
    public int paperInTray = maxPaper;
    public int tonerLevel = maxToner;

    public void print(int singeSidePaper) {
        if (paperInTray < singeSidePaper || tonerLevel < singeSidePaper) {
            System.out.println("Not enough paper or toner");
        } else if (singeSidePaper<=0) {
            System.out.println("Invalid paper value");
        }
        else {
            paperInTray -= singeSidePaper;
            tonerLevel -= singeSidePaper;
        }
    }

    public void print(int doubleSidePaper, boolean doubleSided) {
        if (paperInTray < doubleSidePaper || tonerLevel < doubleSidePaper) {
            System.out.println("Not enough paper or toner");
        } else if (doubleSidePaper <= 0) {
            System.out.println("Invalid paper value");
        } else if (doubleSided == false) {
            System.out.println("Choose single side print type");
        } else if (doubleSidePaper%2!=0){
                paperInTray -= (doubleSidePaper / 2) + 1;
                tonerLevel -= doubleSidePaper;
            }
            else {
                paperInTray -= doubleSidePaper / 2;
                tonerLevel -= doubleSidePaper;
            }
        }

    public void addPaper(int addedPaper){
        if (addedPaper<=0) {
            System.out.println("Invalid paper value");
        } else if (paperInTray+addedPaper>maxPaper){
            System.out.println("You exceed paper tray filling limit");
        } else {
            paperInTray += addedPaper;
        }
    }

    public void addToner(int addedToner) {
        if (addedToner <=0) {
            System.out.println("Invalid toner value");
        } else if (tonerLevel+addedToner>maxToner){
            System.out.println("You exceed toner filling limit");
        }else {
            tonerLevel += addedToner;
        }
    }

    public void printerSummary() {
        System.out.println("\nToner level: " + tonerLevel +
                "\nPaper in the tray: " + paperInTray);
    }
}
