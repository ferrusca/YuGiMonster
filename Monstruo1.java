
/*Se recomiendan los sig valores:
    hpBase : 15 - 25
    ataqueBase: 10 - 20 (establecer valores más altos que defensaBase)
    defensaBase: 10 - 20
    velocidadbase: 10 - 20*/
//ataque (de clase Monstruo) = nivel*ataqueBase (constante de la clase del monstruo especifico)
public class Monstruo1 extends Agua {
    int ataqueBase = 20;
    int defensaBase = 14;
    int velocidadBase = 10;
    int hpBase = 25;
    public Monstruo1 (String apodo, int nivel){
        this.apodo=apodo;
        this.nivel=nivel;
        this.ataque=nivel*ataqueBase;
        this.defensa=nivel*defensaBase;
        this.velocidad=nivel*velocidadBase;
        this.hp=nivel*hpBase;
    }
    
}
