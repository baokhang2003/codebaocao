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
public class Test {
    public static void main(String[] args) {
        ThucPhamTuoi banhMi = new ThucPhamTuoi("Banh mi", 20000, new Date(2022, 2, 1), new Date(2022, 2, 10));
        System.out.println("Ten thuc pham: " + banhMi.getTen());
        System.out.println("Gia: " + banhMi.getGia());
        System.out.println("Ngay san xuat: " + banhMi.getNgaySanXuat());
        System.out.println("Ngay het han: " + banhMi.getNgayHetHan());

        if (banhMi.daHetHan()) {
            System.out.println("Thuc pham da het han");
        } else {
            System.out.println("Thuc pham con han su dung");
        }
    }
}

