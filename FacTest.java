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
public class FacTest {
    public A create(int type){
        
        if(type==1){
        return new B();
       
        }
       if(type==2){
       return new C ();
       }
        return null;
    }

 
    
}
