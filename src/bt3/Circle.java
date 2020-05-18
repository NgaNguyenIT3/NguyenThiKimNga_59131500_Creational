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
public class Circle extends Shape{

    public Circle() {
        setBrush("Sử dụng nét đậm để vẽ hình tròn");
        setPaper("Khổ giấy: A4");
        setFrame("Kích thước: 22cm - 34cm");
    }
    
    @Override
    public String draw() {
        return "Brush: " + getBrush() +
               "\nPaper: " + getPaper() + 
               "\nFrame: " + getFrame() + "\n";
    }    
}
