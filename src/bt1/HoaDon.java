/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author nga
 */
//BT Builder Pattern
public class HoaDon {
    HoaDonHeader hoadonheader;
    ArrayList<CTHD>ListChiTietHoaDon;

    protected HoaDon(Builder builder) {
        this.ListChiTietHoaDon = builder.ListChiTietHoaDon;
        this.hoadonheader = builder.hoadonheader;
    }

    @Override
    public String toString() {
        return ListChiTietHoaDon + "\n" + hoadonheader;
    }
    
    public static class Builder {
        HoaDonHeader hoadonheader;
        ArrayList<CTHD>ListChiTietHoaDon;
        
        public Builder() {
            ListChiTietHoaDon = new ArrayList<>();
        }
        public Builder AddHoaDonHeader(HoaDonHeader hoadonheader) {
            this.hoadonheader = hoadonheader;
            return this;
        }
        public Builder AddCTHD(CTHD cthd) {
            this.ListChiTietHoaDon.add(cthd);
            return this;
        }
        public HoaDon Build() {
            return new HoaDon(this);
        }
    } 
}
