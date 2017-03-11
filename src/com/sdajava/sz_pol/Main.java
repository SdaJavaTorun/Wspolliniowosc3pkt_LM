package com.sdajava.sz_pol;


import java.util.Scanner;

public class Main {

    public int p1_X;
    public int p1_Y;
    public int p2_X;
    public int p2_Y;
    public int p3_X;
    public int p3_Y;

    public Main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wspolrzedne X pkt 1");
        this.p1_X = in.nextInt();
        System.out.println("Podaj wspolrzedne Y pkt 1");
        this.p1_Y = in.nextInt();
        System.out.println("Podaj wspolrzedne X pkt 2");
        this.p2_X = in.nextInt();
        System.out.println("Podaj wspolrzedne Y pkt 2");
        this.p2_Y = in.nextInt();
        System.out.println("Podaj wspolrzedne X pkt 3");
        this.p3_X = in.nextInt();
        System.out.println("Podaj wspolrzedne Y pkt 3");
        this.p3_Y = in.nextInt();
    }

    public void wyznacznik() {
        int det;

        det = this.p1_X * this.p2_Y + this.p2_X * this.p3_Y + this.p3_X * this.p1_Y
                - this.p2_Y * this.p3_X - this.p3_Y * this.p1_X - this.p2_Y * this.p2_X;

        if (det > 0) {
            System.out.println("Punkt C znajduje sie po lewej stronie wektora AB");
        }
        if (det == 0) {
            System.out.println("Punkty sa wspolliniowe!!!");
        }
        if (det < 0) {
            System.out.println("Punkt C znajduje sie po prawej stronie wektora AB");
        }
    }

    public static void main(String[] args) {
        Main punkty = new Main();
        punkty.wyznacznik();
    }
}