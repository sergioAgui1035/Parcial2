import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<Repuesto> ingresarRepuesto(Stack<Repuesto> repuestos) {
        boolean ingresarRepuesto = true;
        while (ingresarRepuesto) {
            Repuesto respuestoNuevo = new Repuesto();
            System.out.println("Ingrese la marca del repuesto");
            respuestoNuevo.setMarca(sc.nextLine());
            System.out.println("Ingrese la referencia del repuesto");
            respuestoNuevo.setReferencia(sc.nextLine());
            System.out.println("Ingrese la cantidad del repuesto");
            respuestoNuevo.setCantidad(sc.nextInt());
            System.out.println("Ingrese el precio del repuesto");
            respuestoNuevo.setPrecio(sc.nextDouble());
            repuestos.push(respuestoNuevo);
            System.out.println("Desea ingresar otro repuesto? 1.Si 2.No");
            if (sc.next().contains("Si")) {
                ingresarRepuesto = true;
            }
        }

        return repuestos;
    }

    public void buscarRepuestos(Stack<Repuesto> repuestos) {
        System.out.println("Ingrese la marca del repuesto que desea buscar");
        String marca = sc.nextLine();
        for (int i = 0; i < repuestos.size(); i++) {
            if (repuestos.get(i).getMarca().equalsIgnoreCase(marca)) {
                System.out.println("El repuesto que estas buscando con marca " + repuestos.get(i).getMarca() +
                        ", tiene referencia: " + repuestos.get(i).getMarca() +
                        ", tiene cantidad: " + repuestos.get(i).getMarca() +
                        ", tiene precio: " + repuestos.get(i).getMarca());
            }
        }
    }

    public Stack<Repuesto> modificarRepuestos(Stack<Repuesto> repuestos) {

        System.out.println("Ingrese la marca del repuesto que desea modificar");
        String marcaBuscar = sc.nextLine();

        System.out.println("Ingrese la opcion que desee" +
                "/n1.Para modificar la marca" +
                "/n2.Para modificar la referencia" +
                "/n3.Para modificar la cantidad " +
                "/n4.Para modificar el precio");

        while (!sc.hasNextInt()) {
            System.out.println("Ingrese una opcion valida /n");
            sc.next();
        }

        int opt = sc.nextInt();

        for (int i = 0; i < repuestos.size(); i++) {
            if (repuestos.get(i).getMarca().equalsIgnoreCase(marcaBuscar)) {
                switch (opt) {
                    case 1:
                        System.out.println("Ingrese la marca nueva");
                        repuestos.get(i).setMarca(sc.next());
                        break;
                    case 2:
                        System.out.println("Ingrese la referencia nueva");
                        repuestos.get(i).setReferencia(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad nueva");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ingrese una cantidad valida /n");
                            sc.next();
                        }
                        repuestos.get(i).setCantidad(sc.nextInt());
                        break;
                    case 4:
                        System.out.println("Ingrese el precio nueva");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Ingrese una cantidad valida /n");
                            sc.next();
                        }
                        repuestos.get(i).setPrecio(sc.nextDouble());
                        break;

                    default:
                        break;
                }
            }
        }

        return repuestos;
    }

    public Stack<Repuesto> eliminarRepuestos(Stack<Repuesto> repuestos) {

        System.out.println("Ingrese la marca del repuesto que desea eliminar /n");
        String marcaBuscar = sc.nextLine();

        for (int i = 0; i < repuestos.size(); i++) {
            if (repuestos.get(i).getMarca().equalsIgnoreCase(marcaBuscar)) {
                System.out.println("El repuesto eliminado es de marca: "+repuestos.get(i).getMarca()+
                "/n, con referencia: "+repuestos.get(i).getReferencia()+
                "/n, con cantidad: "+repuestos.get(i).getCantidad()+
                "/n, con precio: "+repuestos.get(i).getPrecio());
                repuestos.remove(repuestos.get(i));
            }
        }

        return repuestos;
    }

    public Stack<Repuesto> venderRepuestos(Stack<Repuesto> repuestos) {

        System.out.println("Ingrese la marca del repuesto que desea vender /n");
        String marcaBuscar = sc.nextLine();

        for (int i = 0; i < repuestos.size(); i++) {
            if (repuestos.get(i).getMarca().equalsIgnoreCase(marcaBuscar)) {
                if (repuestos.get(i).getCantidad() >0) {
                    repuestos.get(i).setCantidad(repuestos.get(i).getCantidad()-1);
                    System.out.println("Repuesto vendido");
                }else{
                    System.out.println("No hay existencia de esta marca");
                }
                
            }
        }

        return repuestos;
    }
}
