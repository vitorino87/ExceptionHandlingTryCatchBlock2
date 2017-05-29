/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingtrycatchblock2;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionHandlingTryCatchBlock2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a=args.length;
            System.out.println("a= "+a);
            int c[]={1};
            c[10]=100;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: "+e);
        }
        System.out.println("After try/catch blocks");
    }
    
}
