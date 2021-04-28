
package aula02;

/**
 *
 * @author Raquel
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    
    //construtor
    public Caneta(String m, String c, float p){ // Este é o metodo construtor
        this.modelo =m;
        this.cor = c;
        this.ponta = p; 
        //this.carga = ca;
        this.tampar();
        this.rabiscar();
        this.destampar();
        this.pintar();
    }
    
    void status(){
        System.out.println("--_______________________--");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta:"+ this.getPonta());
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("--_______________________--");
        
    }
    
    //Gets e sets
    public String getModelo(){
       return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }  
    public void setPonta(float p){
        this.ponta = p;
    }
    
  
    
   //funções
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, caneta esta tampada!");
        }else{
            System.out.println("Rabiscando");
        }
    }
    public void pintar(){
        if(this.tampada == true){
            System.out.println("Erro, caneta esta tampada!");
        }else{
            System.out.println("Pintando");
        }
    }
    
   public  void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
