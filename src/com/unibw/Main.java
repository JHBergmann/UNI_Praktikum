package com.unibw;

import java.awt.*;
import java.util.Scanner;
import com.unibw.SimpleGraphicPanel;

public class Main {


    public static void main(String[] args) {
        /**** Window
        JFrame window = new JFrame();
        window.setSize(640,480);
        window.setTitle("UNIBW Praktikum Aufgabe 1");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        ****/

        /* Hypothenusen Rechner */ /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Kathete 1:");
        double k1 = sc.nextDouble();
        System.out.println("Kathete 2:");
        double k2 = sc.nextDouble();
        System.out.println("Hypothenuse");
        System.out.println(HYPOTH(k1,k2));
        */
        SimpleGraphicPanel.drawCircle(SimpleGraphicPanel.getRandomColor(),true, 100,10, 100);
        SimpleGraphicPanel.drawTriangle(Color.GREEN,true,100,0,200,0,150,100);
        Gleitzahl.floater();
        int i = mult2(4, 4);
        System.out.println(i);
    }

    public static int mult2(int x, int y) {
        return x*y;
    }

    public static double HYPOTH(double k1, double k2) {
        double HYPO = Math.hypot(k1,k2);
        return HYPO;
    }



}
