package com.hspedu.annotation_;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {
            @Override
            public double work(double d1, double d2) {
                return d1 + d2;
            }
        }, 100, 200);

        cellphone.testWork(new Calculate() {
            @Override
            public double work(double d1, double d2) {
                return d1 * d2;
            }
        }, 100, 200);

    }

}

interface Calculate {
    double work(double d1, double d2);
}

class Cellphone {
    public void testWork(Calculate calculate, double d1, double d2){
        System.out.println(calculate.work(d1, d2));;
    }
}
