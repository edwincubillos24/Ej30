/*
Utilizando arreglos (vectores o matrices) realizar una agenda telefónica la 
cual permita almacenar: nombre, teléfono fijo, teléfono celular y fecha de nacimiento. 
La agenda debe desplegar un menú que permita:
1. Agregar Contacto, 
2  Buscar Contacto 
3. Ver contactos, 
4  Eliminar Contactos, //nac = dd-mm-yyyy
5. Salir. 
Todos los datos deben estar validados para que no se entren datos erróneos,
por ejemplo números de teléfono con letras y nombres con números.
 */
package ej30;

import java.util.Scanner;

public class Ej30 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int contador = 0;
        String[] nombre = new String[15];
        String[] telefono = new String[15];
        String[] celular = new String[15];
        String[] nacim = new String[15];
        String name;
        int opcion;
        boolean encontrado = false;

        do {
            System.out.println("AGENDA\n"
                    + "1. Agregar Contacto\n"
                    + "2. Buscar Contacto\n"
                    + "3. Ver Contactos\n"
                    + "4. Eliminar Contacto\n"
                    + "5. Salir\n"
                    + "Digite una opcion");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1: //Agregar
                    System.out.println("Digite nombre: ");
                    nombre[contador] = lector.next();
                    System.out.println("Digite telefono: ");
                    telefono[contador] = lector.next();
                    System.out.println("Digite celular: ");
                    celular[contador] = lector.next();
                    System.out.println("Digite fecha de nacimiento: ");
                    nacim[contador] = lector.next();
                    contador++;
                    System.out.println("\nContacto Agregado Exitosamente!\n");
                    break;
                case 2: //Buscar
                    System.out.println("\nDigite nombre a buscar: ");
                    name = lector.next();
                    for (int i = 0; i < contador; i++) {
                        if (nombre[i].equals(name)) {
                            System.out.println("Nombre: " + nombre[i]);
                            System.out.println("Telefono: " + telefono[i]);
                            System.out.println("Celular: " + celular[i]);
                            System.out.println("Fecha de nacimiento: " + nacim[i] + "\n");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nContacto no encontrado\n");
                        encontrado = false;
                    }
                    break;
                case 3: //Ver
                    for (int i = 0; i < contador; i++) {
                        System.out.println("\nContacto " + i + "\n");
                        System.out.println("Nombre: " + nombre[i]);
                        System.out.println("Telefono: " + telefono[i]);
                        System.out.println("Celular: " + celular[i]);
                        System.out.println("Fecha de nacimiento: " + nacim[i] + "\n");
                    }
                    break;
                case 4: //Eliminar
                    System.out.println("\nDigite nombre a buscar: ");
                    name = lector.next();
                    for (int i = 0; i < contador; i++) {
                        if (nombre[i].equals(name)) {
                            for (int j=i; j<contador;j++){
                                nombre[j] = nombre [j+1];
                                telefono[j] = telefono [j+1];
                                celular[j] = celular [j+1];
                                nacim[j] = nacim [j+1];
                            }
                            contador--;
                            encontrado=true;
                        }                        
                    }
                    if (encontrado){
                       System.out.println("\nContato eliminado");
                       encontrado=false;
                    } else {
                         System.out.println("\nContato no encontrado");                        
                    }
                    break;
                case 5: //Salir
                    System.out.println("\nHasta luego\n");
                    break;
                default:
                    System.out.println("\nERROR: Opcion invalida\n");
                    break;
            }
        } while (opcion != 5);
    }
}
