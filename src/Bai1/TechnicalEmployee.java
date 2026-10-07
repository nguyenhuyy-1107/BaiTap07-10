package Bai1;

public class TechnicalEmployee extends Employee{
    private double gioLam;
    private double luongGio;

    public TechnicalEmployee(String ten,int tuoi, double gioLam, double luongGio){
        super(ten,tuoi);
        this.gioLam = gioLam;
        this.luongGio = luongGio;
    }

    @Override
    public double luong(){
        return gioLam * luongGio;
    }
}
