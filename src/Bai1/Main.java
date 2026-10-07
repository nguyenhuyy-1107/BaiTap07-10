package Bai1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("A", 25, 22); // 22 ngày * 100 = 2200
        employees[1] = new TechnicalEmployee("B", 28, 160, 15.5); // 160h * 15.5 = 2480
        employees[2] = new OfficeEmployee("C", 30, 20); // 20 ngày * 100 = 2000

        System.out.println("Bang Luong");

        for (Employee emp : employees) {
            System.out.printf("Tên: %-15s | Tuổi: %d | Lương: %.2f\n",
                    emp.getTen(), emp.getTuoi(), emp.luong());
        }
    }
}
