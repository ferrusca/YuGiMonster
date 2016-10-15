
/*Se recomiendan los sig valores:
    hpBase : 15 - 25
    ataqueBase: 10 - 20 (establecer valores más altos que defensaBase)
    defensaBase: 10 - 20
    velocidadbase: 10 - 20*/
public class Monstruo2 extends Fuego {
    int ataqueBase = 12;
    int defensaBase = 10;
    int velocidadBase = 19;
    int hpBase = 21;
    public Monstruo2(String apodo, int nivel){
        this.apodo=apodo;
        this.nivel=nivel;
        this.ataque=nivel*ataqueBase;
        this.defensa=nivel*defensaBase;
        this.velocidad=nivel*velocidadBase;
        this.hp=nivel*hpBase;
    }    
}
