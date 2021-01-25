package Praktikum2;

public class Quersumme {

    public static void main(String[] args) {
        System.out.println(quersumme(177));
    }

    public static int quersumme(int zahl) {
        if (zahl < 0)
        {
            return -1;
        }

        if (zahl < 10) {
            return zahl;
        }

        else {
            return zahl % 10 + quersumme((zahl - (zahl % 10)) / 10);
        }
    }
}
