package Bt3;

class Order {
    private String tenKhachHang;
    private double soTien;
    private PaymentMethod phuongThucThanhToan;

    public Order(String tenKhachHang, double soTien, PaymentMethod phuongThucThanhToan) {
        this.tenKhachHang = tenKhachHang;
        this.soTien = soTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public void checkout() {
        String soTienFormatted = String.format("%,.0f", soTien).replace(',', '.');
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("Thanh toan " + soTienFormatted + " " + phuongThucThanhToan.getMoTaThanhToan() + ".");
        System.out.println();
    }
}