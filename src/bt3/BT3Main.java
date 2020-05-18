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
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapefactory = ShapeFactory.createInstance();
        
        Shape Rectangle = shapefactory.createShape(ShapeType.rectangle);
        Shape Triangle = shapefactory.createShape(ShapeType.triangle);
        Shape Circle = shapefactory.createShape(ShapeType.circle);
        
        System.out.println(Rectangle.draw());
        System.out.println(Triangle.draw());   
        System.out.println(Circle.draw());    
    }   
}
