package com.hspedu.annotation_;

public class Homework05 {
    public static void main(String[] args) {
        new A01().play();
    }
}

class A01 {

    private String NAME = "A-name";

    public void play(){
        class B {
            private final String NAME = "B-name";

            public void show() {
                System.out.println("B-name=" + NAME);
                System.out.println("A-name=" + A01.this.NAME);
            }
        }

        B b  = new B();
        b.show();
    }

}
