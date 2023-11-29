/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author MY LAPTOP
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FacTest f =new FacTest();
        A a1 = f.create(1);
        A a2 = f.create(2);
        
        a1.m1();
        a2.m1();
    }
    
}
