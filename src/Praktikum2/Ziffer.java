package Praktikum2;

public class Ziffer {
    public static int zaehleZifferInZahl(int ziffer, int zahl) {
        if (zahl < 0 || ziffer < 0 || ziffer > 9) {
            return -1;
        }
        if (zahl < 10) {
            if (ziffer == zahl) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if (zahl % 10 == ziffer) {
                return 1 + zaehleZifferInZahl(ziffer, zahl / 10);
            }
            else {
                return 0 + zaehleZifferInZahl(ziffer, zahl / 10);
            }
        }


    }
}
