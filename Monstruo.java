
public abstract class Monstruo {

    protected String apodo;
    protected int nivel;
    protected double hp;
    protected double ataque;
    protected double defensa;
    protected int velocidad;
    protected String edo;
    
    /* public Monstruo(String apodo, int nivel){
        this.apodo=apodo;
        this.nivel=nivel;
    }*/
    public void setAtaque(double ataque){
        this.ataque = ataque;
    }
    public double getAtaque(){
        return this.ataque;
    }
    public void setDefensa(double defensa){
        this.defensa = defensa;
    }
    public double getDefensa(){
        return this.defensa;
    }
    public void setVelocidad(int velocidad ){
        this.velocidad = velocidad;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public void recibirDaño(){}
    public void recibirHp(){}
    public void recibirAtaque(){}
    public void recibirDefensa(){}
    public void multElemental(){};
    public void ataque1(){};
}
