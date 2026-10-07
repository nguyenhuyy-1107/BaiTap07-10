package Bai1;

public class OfficeEmployee extends Employee{
    private int ngayLam;
    public double luongNgay = 100.0;

    public OfficeEmployee(String ten, int tuoi, int ngayLam){
        super(ten,tuoi);
        this.ngayLam = ngayLam;
    }

    @Override
    public double luong(){
        return ngayLam * luongNgay;
    }
}
