/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
abstract public class StaticBlockRun {
    final static int a=200;
    
     static{
         System.out.println("Static block");
     }
     
    abstract void hello();
    public static void main(String args[])
    {
        
        System.out.println("Main");
        
    }
    
}
