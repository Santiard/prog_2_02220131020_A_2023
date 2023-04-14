/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

import java.util.*;

/**
 *
 * @author ARDILA
 */
public class Supermecado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empleado = new ArrayList<>();
        ArrayList<customer> cliente = new ArrayList<>();

        ArrayList<Producto> producto = new ArrayList<>();
System.out.println("--Menu--");

        int option = 0;

        do {
            System.out.println("1.Personas(Empleado o cliente) \n2.Producto \n3 Salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    
                        AddPerson(sc,empleado,cliente);
                        break;

                case 2:
                   
                        AddProduct(sc, producto);
                        break;
                    
               
                    
                case 3:
                    listar(empleado,cliente,producto);
            }
        } while (option <= 6);
    }
    

    public static void AddPerson(Scanner sc, ArrayList<Employee> empleado, ArrayList<customer> cliente) {
        System.out.println("---PERSONAS--- \n");
        int option = 0;
        do {
            System.out.println("1.Empleado \n2.Cliente \n3.salir");
            option = sc.nextInt();
            try {

            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opción válida");
                continue;
            }

            switch (option) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = sc.next();

                    System.out.println("Ingrese el area en que trabaja el empleado");
                    String AreaEmpleado = sc.next();

                    System.out.println("Ingrese el sueldo establecido para el empleado");
                    double SalarioEmpleado = sc.nextDouble();

                    System.out.println("Ingrese el Dni del empleado");
                    int idEmpleado = sc.nextInt();

                    empleado.add(new Employee(SalarioEmpleado, AreaEmpleado, nombreEmpleado, idEmpleado));
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del cliente");
                    String nombreCliente = sc.next();

                    System.out.println("Ingrese el telefono del cliente");
                    String telefonoCliente = sc.next();

                    System.out.println("Ingrese el correo cliente");
                    String correoCliente = sc.next();

                    System.out.println("Ingrese el Dni del cliente");
                    int IdCliente = sc.nextInt();

                    cliente.add(new customer(telefonoCliente, correoCliente, nombreCliente, IdCliente));

                }
            }
        } while (option <= 2);
    }

    public static void AddProduct(Scanner sc, ArrayList<Producto> producto) {
        System.out.println("Ingrese el id del producto:");
        int id = sc.nextInt();

        System.out.println("Ingrese el nombre del producto: ");
        String products = sc.next();

        System.out.println("Ingrese el precio de los productos: ");
        double precio = sc.nextDouble();

        System.out.println("Ingrese el tipo de producto(Limpieza,carnes, etc...): ");
        String tipe_product = sc.next();
        
        producto.add(new Producto(id,products,precio,tipe_product));
    }
    
    public static void listar( ArrayList<Employee> empleado,  ArrayList<customer> cliente,  ArrayList<Producto> producto){
    System.out.println("-------------------");
    System.out.println("LISTA DE EMPLEADOS");
    System.out.println(empleado.toString());
    System.out.println("-------------------");
    System.out.println("LISTA DE CLIENTES");
    System.out.println(cliente.toString());
    System.out.println("-------------------");
    System.out.println("LISTA DE PRODUCTOS");
    System.out.println(producto.toString());
    
    }
}
