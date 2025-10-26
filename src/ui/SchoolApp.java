package ui;

import java.util.Scanner;
import model.SchoolController;
import java.time.LocalDate;

public class SchoolApp {

    
    private Scanner input;
    private SchoolController controller;

    public static void main(String[] args) {

        SchoolApp ui = new SchoolApp();
        ui.menu();

    }

    // Constructor
    public SchoolApp() {
        input = new Scanner(System.in);
    }

    

    public void menu() {

        controller = new SchoolController();

        System.out.println("Bienvenido a Computaricemos");

        System.out.println("Asi se encuentra distribuido el edificio");

        controller.mostrarDistribucionEdicficio();

        int option = 0;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("--------------------------------------------------------");
            System.out.println("Digite alguna de las siguientes opciones");
            System.out.println("1) Registrar computador");
            System.out.println("2) Registrar incidente en computador");
            System.out.println("3) Consultar el computador con mas incidentes");
            System.out.println("0) Salir del sistema");
            option = input.nextInt();

            switch (option) {
                case 1:
                    registrarComputador();
                    break;
                case 2:
                    registrarIncidenteEnComputador();
                    break;
                case 3:
                    consultarComputadorConMasIncidentes();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos
     */

    public void registrarComputador() {

        System.out.println("Ingrese el piso donde esta el computador a registrar");
        int floor = input.nextInt();
        input.nextLine();
        System.out.println("Ingresa el numero de serie del computador");
        String serialNumber = input.nextLine();

        controller.agregarComputador(floor, serialNumber);

    }

    public void registrarIncidenteEnComputador() {

        String option = " ";

        
        
        do{         

            System.out.println("Ingresa los datos de la fecha en que ocurrio el incidente");
            System.out.println("Ingresa el dia");
            int dia = input.nextInt();
            input.nextLine();
            System.out.println("Ingresa el mes");
            int mes = input.nextInt();
            input.nextLine();
            System.out.println("Ingresa el anio");
            int anio = input.nextInt();
            input.nextLine();

            LocalDate dateReport = LocalDate.of(anio, mes, dia);

            System.out.println("Digita el numero de serie del computador al cual vas a registrar el incidente");
            String serialNumber = input.nextLine();

            System.out.println("Ingresa la descripcion del incidente");
            String description = input.nextLine();

            System.out.println("El problema esta solucionado? (si/no)");
            String decision = input.nextLine().trim().toLowerCase();

            if(decision.equals("si")){

                boolean solution = true;

                System.out.println("¿En cuantas horas se soluciono el problema?");
                int solutionHours = input.nextInt();
                input.nextLine();

                controller.agregarIncidenteEnComputador(serialNumber, dateReport, description, solution, solutionHours);

            }else{

                controller.agregarIncidenteEnComputador(serialNumber, dateReport, description, false, 0);

            }
            System.out.println("¿Deseas agregar mas incidentes ? (si/no)");
            option = input.nextLine();

        } while(option.equals("si"));
       

    }

    public void consultarComputadorConMasIncidentes() {

        controller.getComputerList();

    }

}