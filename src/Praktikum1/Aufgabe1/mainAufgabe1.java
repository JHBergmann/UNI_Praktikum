package Praktikum1.Aufgabe1;

public class mainAufgabe1 {
    public static void main(String[] args) {
        float k1 = 100.0F;
        float k2 = 75.0F;

        float c = (k1 * k1) + (k2 * k2);
        float d = (float) Math.sqrt(c);

        float h = (float) Math.hypot(k1, k2);

        System.out.println(h);
        System.out.println(d);
    }
}
