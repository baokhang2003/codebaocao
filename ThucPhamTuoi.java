/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baocao;

import java.util.Date;

/**
 *
 * @author phankhang
 */

public class ThucPhamTuoi extends ThucPham {
    private Date ngayHetHan;

    public ThucPhamTuoi(String ten, double gia, Date ngaySanXuat, Date ngayHetHan) {
        super(ten, gia, ngaySanXuat);
        this.ngayHetHan = ngayHetHan;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public boolean daHetHan() {
        Date now = new Date();
        return now.after(ngayHetHan);
    }

    // các phương thức khác của lớp ThucPhamTuoi
}
