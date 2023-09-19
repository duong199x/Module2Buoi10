package QuanLySach.model;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
