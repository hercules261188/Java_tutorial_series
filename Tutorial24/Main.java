package com.vishwajeet;

public class Main {

    public static void main(String[] args) {
	    Bike bk1 = new Bike();
        Bike bk2 = new Bike();

        bk1.brand = "Hero";
        bk1.model = "Splender";

        bk2.brand = "Honda";
        bk2.model = "Splender";

        System.out.println(bk1.brand);
        System.out.println(bk2.brand);
    }
}
