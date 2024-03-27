package org.example;

public class Main {
    public static void main(String[] args) {
        PhepTInh tinh = new PhepTInh(10,5);
        System.out.println("Các phép tính: ");
        System.out.println(tinh.getA() + " + " + tinh.getB() + " = " + tinh.TinhCong());
        System.out.println(tinh.getA() + " - " + tinh.getB() + " = " + tinh.TinhTru());
        System.out.println(tinh.getA() + " * " + tinh.getB() + " = " + tinh.TinhNhan());
        System.out.println(tinh.getA() + " / " + tinh.getB() + " = " + tinh.TinhChia());
        System.out.printf("Branch Preventive to do something!");
        System.out.printf("Hello and welcome To My New Branch!");
        System.out.println("Bảng cửu chương 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5*i));
        }
    }
}
