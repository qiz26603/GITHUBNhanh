package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Branch Preventive to do something!");
        PhepTInh tinh = new PhepTInh(10,5);
        System.out.println("Các phép tính: ");
        System.out.println(tinh.getA() + " + " + tinh.getB() + " = " + tinh.TinhCong());
        System.out.println(tinh.getA() + " - " + tinh.getB() + " = " + tinh.TinhTru());
        System.out.println(tinh.getA() + " * " + tinh.getB() + " = " + tinh.TinhNhan());
        System.out.println(tinh.getA() + " / " + tinh.getB() + " = " + tinh.TinhChia());
        }
    }
}
