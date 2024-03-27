package org.example;

public class PhepTInh {
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    private int a, b;
    public PhepTInh (int a, int b){
        this.a = a;
        this.b = b;
    }
    public int TinhCong(){
        return a + b;
    }
    public int TinhTru(){
        return a - b;
    }
    public int TinhNhan(){
        return a * b;
    }
    public int TinhChia(){
        return a / b;
    }
}
