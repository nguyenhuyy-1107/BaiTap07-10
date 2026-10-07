package Bai1;

public abstract class Employee {
    private String ten;
    private int tuoi;

    public Employee(String ten,int tuoi){
        this.ten = ten;
        this.tuoi  = tuoi;
    }
    public abstract double luong();

    public String getTen(){return ten;}
    public int getTuoi(){return tuoi;}
}
