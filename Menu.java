import java.net.Socket;
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
        Stack<Repuesto> listaRepuestos = new Stack<>();

        System.out.println("Bienvenido a la tienda");
        System.out.println("Ingrese la opcion que desea hacer:" +
                "/n1.Ingresar repuesto" +
                "/n2.Buscar repuesto" +
                "/n3.Modificar repuesto" +
                "/n4.Eliminar repuesto" +
                "/n5.Vender repuesto");

        while (!sc.hasNextInt()) {
            System.out.println("Ingrese una opcion valida");
            sc.next();
        }
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                metodos.ingresarRepuesto(listaRepuestos);
                break;
            case 2:
                metodos.buscarRepuestos(listaRepuestos);
                break;
            case 3:
                metodos.modificarRepuestos(listaRepuestos);
                break;
            case 4:
                metodos.eliminarRepuestos(listaRepuestos);
                break;
            case 5:
                metodos.venderRepuestos(listaRepuestos);
                break;
            case 6:
                metodos.venderRepuestos(listaRepuestos);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

}
