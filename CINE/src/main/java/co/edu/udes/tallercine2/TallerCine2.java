/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.udes.tallercine2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARDIL
 */
public class TallerCine2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Sala> salas = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Confectionery> confectionerys = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
        System.out.println("-------------------");
        System.out.println("CINEMARK");
        System.out.println("-------------------");
            int menu = mostrarMenu(entrada);
            switch (menu) {

                case 1:
                    if (movies.size() == 0) {
                        System.out.println("ANTES DE AGREGAR UNA SALA SE DEBE TENER PELICULAS DISPONIBLES PARA ASIGNAR A LA SALA");
                        break;
                    } else {
                        agregarSala(entrada, salas, movies);
                        break;
                    }
                case 2:
                    if (salas.size() == 0) {
                        System.out.println("PARA AGREGAR UN TICKER PRIMERO DEBE EXISTIR UNA SALA A LA CUAL ASIGNARLO");
                        break;
                    } else {
                        agregaTicket(entrada, tickets, salas);
                        break;
                    }
                case 3:
                    agregaPelicula(entrada, movies);
                    break;
                case 4:
                    if (salas.size() == 0) {
                        System.out.println("NO PUEDES AGREGAR UN EMPLEADO SIN ANTES TENER EL ESTABLECIMIENTO LISTO");
                        break;
                    } else {
                        agregaEmployee(entrada, employees, salas);
                        break;
                    }
                case 5:
                    if (confectionerys.size() == 0 || salas.size() == 0) {

                        System.out.println("NO PUEDES AGREGAR UN CLIENTE SIN ANTES TENER PRODUCTOS PARA VENDER Y PELICULAS PARA MOSTRAR");
                        break;
                    } else {
                        agregaCustomer(entrada, customers, salas);
                        break;
                    }
                case 6:
                    if (employees.size() == 0) {
                        System.out.println("NO PUEDES AGREGAR CONFITERIA SIN EMPLEADOS QUE LAS VENDAN");
                        break;
                    } else {

                        agregarConfectionery(entrada, confectionerys, employees);
                        break;

                    }
                case 7:
                    System.out.println(salas.toString());
                    System.out.println(tickets.toString());
                    System.out.println(movies.toString());
                    System.out.println(employees.toString());
                    System.out.println(customers.toString());
                    System.out.println(confectionerys.toString());
            }

        }
    }

    public static int mostrarMenu(Scanner entrada) {

        System.out.println("Seleccione una opcion menú:");
        System.out.println("1. Salas");
        System.out.println("2. Tickets");
        System.out.println("3. Peliculas");
        System.out.println("4. Empleado");
        System.out.println("5. Cliente");
        System.out.println("6. Confiteria");
        System.out.println("7. Mostrar");
        System.out.println("8. Salir");
        System.out.println("-------------------");
        return entrada.nextInt();
    }

    public static void agregarSala(Scanner entrada, ArrayList<Sala> salas, ArrayList<Movie> movies) {
        System.out.println("-------------------");
        System.out.println("Ingrese la capacidad total de la sala: ");
        int capacity = entrada.nextInt();
        System.out.println("Asigne un numero a la sala: ");
        int number_hall = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer del scanner
        for (Sala sala : salas) {
            if (sala.getNumber_hall() == number_hall) {
                System.out.println("El número de sala ya existe. Ingrese otro número de sala.");
                return;
            }
        }
        System.out.println("-------------------");
        System.out.println("PELICULAS DISPONIBLES");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + " " + movies.get(i).getName());
            System.out.println("-------------------");
        }
        System.out.println("Ingrese el numero de la pelicula deseada: ");
        int selectMovie = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer del scanner

        String movieUser;
        movieUser = movies.get(selectMovie - 1).getName();

        salas.add(new Sala(capacity, number_hall, movieUser));
    }

    public static  ArrayList<Movie> agregaPelicula(Scanner entrada, ArrayList<Movie> movies) {
        System.out.println("--------------------------------");
        System.out.println("Ingrese el título de la película:");
        String name = entrada.next();
        entrada.nextLine();
        System.out.println("Ingrese la hora de proyecccion en formato HH:mm");
        String duration = entrada.next();

        LocalTime localTime;
        try {
            localTime = LocalTime.parse(duration);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de hora incorrecto. Ingrese la hora en formato HH:mm.");
            return movies; // Retornar el arreglo sin agregar la nueva película
        }

        System.out.println("Ingrese la fecha de lanzamiento:");
        String release_Date = entrada.next();

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(release_Date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha incorrecto. Ingrese la fecha en formato DD/MM/AAAA.");
            return movies; // Retornar el arreglo sin agregar la nueva película
        }

        System.out.println("Ingrese la fecha hasta que estará disponible:");
        String available_dates = entrada.next();

        LocalDate localDate2;
        try {
            localDate2 = LocalDate.parse(available_dates, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha incorrecto. Ingrese la fecha en formato DD/MM/AAAA.");
            return movies; // Retornar el arreglo sin agregar la nueva película
        }
        
        System.out.println("Ingrese la duracion de la pelicula en formato HH:mm");
        String projection_time =entrada.next();

        movies.add(new Movie(name, duration, release_Date, available_dates,projection_time));

        return movies;
    }

     public static void agregaTicket(Scanner entrada, ArrayList<Ticket> tickets, ArrayList<Sala> sala) {
         System.out.println("--------------------------------");
    System.out.println("Seleccione la sala correspondiente: ");
for (int i = 0; i < sala.size(); i++) {
    System.out.println((i + 1) + ". Sala " + sala.get(i).getNumber_hall() + ": " + sala.get(i).getMovie());
}

int selectedHall = entrada.nextInt();
entrada.nextLine();

Sala selectedSala = sala.get(selectedHall - 1);
String selectedMovie = selectedSala.getMovie();

System.out.println("Seleccione el asiento (letra y número): ");
String seat = entrada.nextLine();

double ticketPrice = 0.0;
boolean validPrice = false;
while (!validPrice) {
    System.out.println("Ingrese el precio del boleto: ");
    try {
        ticketPrice = Double.parseDouble(entrada.nextLine());
        validPrice = true;
    } catch (NumberFormatException e) {
        System.out.println("Por favor, ingrese un número válido.");
    }
}

if (selectedSala.getTickets().size() >= selectedSala.getCapacity()) {
    System.out.println("LA SALA ALCANZO SU CAPACIDAD MAXIMA,INTENTA EN OTRA SALA.");
}

Ticket newTicket = new Ticket(selectedMovie,ticketPrice,seat,selectedHall);
selectedSala.getTickets().add(newTicket);
tickets.add(newTicket);

}

    public static ArrayList<Employee> agregaEmployee(Scanner entrada, ArrayList<Employee> employees, ArrayList<Sala> salas) {
        System.out.println("--------------------------------");
        System.out.println("REGISTRO DE EMPLEADO");
        System.out.println("Ingrese el nombre del empleado: ");
        String name = entrada.next();

        System.out.println("Ingrese el dni del empleado: ");
        String id = entrada.next();

        System.out.println("Ingrese el salario del empleado: ");
        double salary = entrada.nextDouble();

        System.out.println("Ingrese el area de trabajo del empleado (caja, confiteria, limpieza, gerente): ");
        String works_area = entrada.next();

        employees.add(new Employee(name, id, salary, works_area));

        return employees;
    }

    public static ArrayList<Customer> agregaCustomer(Scanner entrada, ArrayList<Customer> customers, ArrayList<Sala> salas) {
        System.out.println("--------------------------------");
        System.out.println("REGISTRO DE CLIENTE");
        System.out.println("Ingrese el nombre del cliente: ");
        String name = entrada.next();

        System.out.println("Ingrese el codigo del cliente: ");
        String id = entrada.next();

        System.out.println("Ingrese el numero del cliente: ");
        String cell_number = entrada.next();

        customers.add(new Customer(name, id, cell_number));

        return customers;
    }

    public static ArrayList<Confectionery> agregarConfectionery(Scanner entrada, ArrayList<Confectionery> confectionerys, ArrayList<Employee> employees) {
        System.out.println("--------------------------------");
        System.out.println("REGISTRO DE PRODCUTO DE CONFITERIA");
        System.out.println("Agregar productos a la confiteria:");

        System.out.println("Que productos va a ingresar: ");
        String products = entrada.next();

        System.out.println("Que precios van a tener los productos: ");
        double price = entrada.nextDouble();
        entrada.nextLine();

        confectionerys.add(new Confectionery(price, products));
        return confectionerys;

    }
}
