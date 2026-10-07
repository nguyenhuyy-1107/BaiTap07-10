package Bt2;

interface EmailSender {
    void guiMail();
}

interface Programmer {
    void lapTrinh();
}

interface Salesperson {
    void banHang();
}

 class OfficeEmployee implements EmailSender{
    @Override
    public void guiMail(){
        System.out.println("Gui mail");
    }
}

class TechnicalEmployee implements EmailSender,Programmer{
    @Override
    public void guiMail(){
        System.out.println("Gui mail");
    }
    public void lapTrinh(){
        System.out.println("Dang lap trinh");
    }
}

class SalesEmployee implements Salesperson,EmailSender{
    @Override
    public void banHang(){
        System.out.println("Ban hang");
    }
    public void guiMail(){
        System.out.println("Gui mail");
    }
}

public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmp = new OfficeEmployee();
        TechnicalEmployee techEmp = new TechnicalEmployee();
        SalesEmployee salesEmp = new SalesEmployee();

        System.out.println("Nv van phong");
        officeEmp.guiMail();

        System.out.println("\nLap trinh vien");
        techEmp.lapTrinh();
        techEmp.guiMail();

        System.out.println("\nSaler");
        salesEmp.banHang();
        salesEmp.guiMail();
    }
}