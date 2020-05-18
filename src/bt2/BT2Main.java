/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author nga
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder strbuilder = new MyStringBuilder.Builder()
                .addString("StringBuilder chuyển thành MyStringBuilder ")
                .addFloat(5.5f)
                .addBool(false)
                .Build();
        
        System.out.println(strbuilder.toString());
    }
    
}
