/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baocao;

import java.util.Date;

/**
 *
 * @author phankhang
 */
public class ThucPham {
        private String ten;
        private double gia;
        private Date ngaySanXuat;

        public ThucPham(String ten, double gia, Date ngaySanXuat) {
            this.ten = ten;
            this.gia = gia;
            this.ngaySanXuat = ngaySanXuat;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public double getGia() {
            return gia;
        }

        public void setGia(double gia) {
            this.gia = gia;
        }

        public Date getNgaySanXuat() {
            return ngaySanXuat;
        }

        public void setNgaySanXuat(Date ngaySanXuat) {
            this.ngaySanXuat = ngaySanXuat;
        }
        // các phương thức khác của lớp ThucPham
}


