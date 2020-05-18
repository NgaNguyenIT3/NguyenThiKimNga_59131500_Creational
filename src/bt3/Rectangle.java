/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author nga
 */
//BT Factory Method Singleton
public class Rectangle extends Shape{

    public Rectangle() {
        setBrush("Sử dụng nét đậm để vẽ hình chữ nhật");
        setPaper("Khổ giấy: letter");
        setFrame("Kích thước: 20cm - 30cm");
    }
    
    @Override
    public String draw() {
        return "Brush: " + getBrush() +
               "\nPaper: " + getPaper() + 
               "\nFrame: " + getFrame() + "\n";
    }
}
