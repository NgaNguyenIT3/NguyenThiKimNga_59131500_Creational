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
public class HoaDonHeader {
    String mahoadon, ngayban, tenkhachhang;

    protected HoaDonHeader(Builder builder) {
        this.mahoadon = builder.mahoadon;
        this.tenkhachhang = builder.tenkhachhang; 
        this.ngayban = builder.ngayban;
    }

    @Override
    public String toString() {
        return "Thông tin hóa đơn\n{Mã hóa đơn: " + mahoadon + 
               "\n Ngày bán:" + ngayban + 
               "\n Tên khách hàng:" + tenkhachhang + "}";
    }
 
    public static class Builder{

        String mahoadon, ngayban, tenkhachhang;
        
        public Builder() {
            
        }
        public Builder addMaHoaDon(String mahoadon)
        {
            this.mahoadon = mahoadon;
            return this;
        }
        public Builder addNgayBan(String ngayban)
        {
            this.ngayban = ngayban;
            return this;
        }
        public Builder addTenKhachHang(String tenkhachhang)
        {
            this.tenkhachhang = tenkhachhang;
            return this;
        }
        
        public HoaDonHeader Build()
        {
            return new HoaDonHeader(this);
        }  
    }
}
