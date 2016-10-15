
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Contrincante1 extends Pocima{
    String nombre;
    ArrayList<Monstruo> desk = new ArrayList<Monstruo>(); //Array para guardar los nombres de los monstruos
    ArrayList<Pocima> pocimas = new ArrayList<Pocima>();
    
    public void Contrincante1(String nombre){
        this.nombre = nombre;  
    }
    
    public void cargarPocimas(){
        //Metemos al array las pocimas de cada contrincante
        pocimas.add(pocimaAtaque); 
        pocimas.add(pocimaAtaque);
        pocimas.add(pocimaDefensa);
        pocimas.add(pocimaDefensa);
        pocimas.add(pocimaVida);
        pocimas.add(pocimaVida);
    }
    
    public void guardarMonstruo(Monstruo nombre){
        desk.add(nombre); 
    }
    public void elegirmonstruo(Monstruo nombre){
        Iterator<Monstruo> iterador = desk.iterator();
        while(iterador.hasNext()){
	Monstruo elemento = iterador.next();
	if(elemento.equals(nombre))
            iterador.remove();	
        }
        System.out.println("Error al tratar de elegir al monstruo");
    }
    public void usarPocima(){
        System.out.println("Selecciona la pocima a utilizar:\n1Pocima de ataque\n2.Pocima de defensa\n3. Pocima de vida");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        if (opcion == 1){
            pocimaAtaque.recibirAtaque();
            pocimas.remove(pocimaAtaque);
        }
    }
    
    public void listarMonstruos(Monstruo usuario){
        /*for(Monstruo i : desk)
            System.out.println(i);*/
    }
}
