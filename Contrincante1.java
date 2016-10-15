
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Contrincante1 extends Pocima{
    String nombre;
    ArrayList<Monstruo> desk = new ArrayList<Monstruo>(); //Array para guardar los nombres de los monstruos
    ArrayList<Pocima> pocimas = new ArrayList<Pocima>();
    
    public void usuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Juego de dos contrincantes\n");
        System.out.println("Introduce tu nombre: ");
        this.nombre = teclado.nextLine();
        Contrincante1 user1 = new Contrincante1(nombre);
        int seleccion = 0;
        System.out.println("Selecciona Los monstruos");
        //Todavia falta ponerle nombres especificos a los monsters
        //el NUMERO AL LADO DEL NOMBRE DEL MONSTRUO REPRESENTA EL NIVEL QUE TIENE 
        System.out.println("\n1.Monstruo1 - 91\t\t\t7.Monstruo7 - 45\n2.Monstruo2 - 85\t\t\t8.Monstruo8 - 66\n3.Monstruo3 - 79\n4.Monstruo4 - 70\n"
        +"5.Monstruo5 - 73\n6.Monstruo6-95");
        do{    
            int opcion = teclado.nextInt();
            switch(opcion){
                case 1: 
                    Monstruo1 m1 = new Monstruo1("apodo1",91);
                    desk.add(m1);
                    ++seleccion;
                    break;
                case 2:
                    Monstruo2 m2 = new Monstruo2("nombre2",85);
                    ++seleccion;
                    break;
                case 3:
                    //Faltan los demás
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                default: 
                    System.out.println("Opcion no encontrada");             
            }    
        } while (seleccion < 6);
    }
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
