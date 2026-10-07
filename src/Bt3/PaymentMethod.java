package Bt3;


public abstract class PaymentMethod {
    private String loaiThanhToan;
    private String tenPhuongThuc;

    public PaymentMethod(String loaiThanhToan, String tenPhuongThuc) {
        this.loaiThanhToan = loaiThanhToan;
        this.tenPhuongThuc = tenPhuongThuc;
    }

    public String getLoaiThanhToan() {
        return loaiThanhToan;
    }

    public String getTenPhuongThuc() {
        return tenPhuongThuc;
    }
    public abstract String getMoTaThanhToan();
}