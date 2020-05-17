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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader hoadonheader = new HoaDonHeader.Builder()
                .addMaHoaDon("HD01")
                .addNgayBan("20/05/2020")
                .addTenKhachHang("Nguyễn Lê Hoàng My")
                .Build();
        
         CTHD cthd =  new CTHD.Builder()
                .addSanPham("Đồng hồ thông minh")
                .addSoLuong(2)
                .addDonGia(5000000)
                .addChietKhau("2%")
                .Build();
      
        HoaDon hd = new HoaDon.Builder()
                .AddHoaDonHeader(hoadonheader)
                .AddCTHD(cthd)
                .Build(); 
        System.out.println(hd.toString());
    }    
}
