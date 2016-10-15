import java.util.Scanner;
public class Torneo{
public void usuario(){
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Juego de dos contrincantes\n");
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        Contrincante1 user1 = new Contrincante1();

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
                    //m1.guardarMonstruo();
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

}