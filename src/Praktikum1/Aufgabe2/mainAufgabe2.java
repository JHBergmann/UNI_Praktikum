package Praktikum1.Aufgabe2;

public class mainAufgabe2 {

    public static double cx(double ax, double ay, double bx, double by) {
        return bx + ay - by;
    }

    public static double cy(double ax, double ay, double bx, double by) {
        return by + bx - ax;
    }

    public static double dx(double ax, double ay, double bx, double by) {
        return ax + ay - by;
    }

    public static double dy(double ax, double ay, double bx, double by) {
        return ay + bx - ax;
    }

    public static double mx(double ax, double ay, double bx, double by) {
        return ax + (bx - ax) / 2.0 + (ay - by) / 2.0;
    }

    public static double my(double ax, double ay, double bx, double by) {
        return ay + 0.5 * (by - ay) + 0.5 * (bx - ax);
    }
}
