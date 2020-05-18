/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author nga
 */
//BT Builder Pattern
public class CTHD {
    String sanpham, chietkhau;
    int soluong;
    double dongia;

    private CTHD(Builder builder) {
         this.sanpham = builder.sanpham;
         this.soluong = builder.soluong;
         this.dongia = builder.dongia;
         this.chietkhau = builder.chietkhau;
    }

    @Override
    public String toString() {
        return "Chi tiết hóa đơn\n{Sản phẩm: " + sanpham + 
               "\n Số Lượng: " + soluong +
               "\n Đơn giá: " + dongia + 
               "\n Chiết khấu:" + chietkhau + "}\n";
    }
 
    public static class Builder {
        String sanpham, chietkhau;
        int soluong;
        double dongia;
       
        public Builder() {
        
        }
        public Builder addSanPham(String sanpham) {
            this.sanpham = sanpham;
            return this;
        }
        public Builder addSoLuong(int soluong) {
            this.soluong = soluong;
            return this;
        }
        public Builder addDonGia(double dongia) {
            this.dongia = dongia;
            return this;
        }
        public Builder addChietKhau(String chietkhau) {
            this.chietkhau = chietkhau;
            return this;
        }
        public CTHD Build() {
            return new CTHD(this);
        }
    }
}
