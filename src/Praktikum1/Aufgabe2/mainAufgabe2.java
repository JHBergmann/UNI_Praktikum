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

    public static double t(double ex, double ey, double fx, double fy) {
        return Math.hypot(fy - ey, fx - ex);           // function definition of t
    }

    public static double s(double ex, double ey, double fx, double fy) {
        return t(ex, ey, fx, fy) / Math.sqrt(3.0);    // function application of t
    }

    // Klassenmethoden schreiben
    // Rückgabewert          // Eingabewerte
    public static double gx(double ex, double ey, double fx, double fy) {
        return ex + 0.5 * (fx - ex)
                + (s(ex, ey, fx, fy) / (2.0 * t(ex, ey, fx, fy))) * (fy - ey);
    }

    public static double gy(double ex, double ey, double fx, double fy) {
        return ey + 0.5 * (fy - ey)
                + (s(ex, ey, fx, fy) / (2.0 * t(ex, ey, fx, fy))) * (ex - fx);
    }

    public static double hx(double ex, double ey, double fx, double fy) {
        return ex + 0.5 * (fx - ex)
                - (s(ex, ey, fx, fy) / (2.0 * t(ex, ey, fx, fy))) * (fy - ey);
    }

    public static double hy(double ex, double ey, double fx, double fy) {
        return ey + 0.5 * (fy - ey)
                - (s(ex, ey, fx, fy) / (2.0 * t(ex, ey, fx, fy))) * (ex - fx);
    }

}
