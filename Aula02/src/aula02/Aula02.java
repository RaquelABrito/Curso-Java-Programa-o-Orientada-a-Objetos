
package aula02;

/**
 *
 * @author Raquel
 */
public class Aula02 {

    
    public static void main(String[] args) {    
        Caneta c1 = new Caneta("NIC","AMARELA",0.4f);
        c1.status();
       
        System.out.println("Tenho uma caneta " + c1.getModelo());
    }
    
}
