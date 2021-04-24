
package aula02;

/**
 *
 * @author Raquel
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    
    void status(){
        System.out.println("--_______________________--");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta:"+ this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("--_______________________--");
        
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, caneta esta tampada!");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
