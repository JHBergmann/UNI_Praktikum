package Praktikum1.Aufgabe2;

import com.unibw.SimpleGraphicPanel;

import java.awt.*;

public class Blume {
    public static void main(String[] args) {
        boolean ergebnis = maleBlume(Color.BLUE,300.0,250.0,350.0,150.0);
        System.out.println(ergebnis);
    }
    public static boolean maleRaute(double ex, double ey, double fx, double fy){
        return SimpleGraphicPanel.drawQuadrilateral(Color.darkGray, true,
                ex,
                ey,
                mainAufgabe2.gx(ex, ey, fx, fy),
                mainAufgabe2.gy(ex, ey, fx, fy),
                fx,
                fy,
                mainAufgabe2.hx(ex, ey, fx, fy),
                mainAufgabe2.hy(ex, ey, fx, fy)
        );
    }

    public static boolean maleBlume(Color c, double ax, double ay, double bx, double by) {
        return maleRaute(ax, ay,
                mainAufgabe2.mx(ax, ay, bx, by), mainAufgabe2.my(ax, ay, bx, by))
                | maleRaute(bx, by, mainAufgabe2.mx(ax, ay, bx, by), mainAufgabe2.my(ax, ay, bx, by))
                | maleRaute(mainAufgabe2.cx(ax, ay, bx, by), mainAufgabe2.cy(ax, ay, bx, by), mainAufgabe2.mx(ax, ay, bx, by), mainAufgabe2.my(ax, ay, bx, by))
                | maleRaute(mainAufgabe2.dx(ax, ay, bx, by), mainAufgabe2.dy(ax, ay, bx, by), mainAufgabe2.mx(ax, ay, bx, by), mainAufgabe2.my(ax, ay, bx, by));
    }


}
