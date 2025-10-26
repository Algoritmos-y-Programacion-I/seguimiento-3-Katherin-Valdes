package model;
import java.time.LocalDate;

public class SchoolController {

    
    private String name;
    private int hourSpentSuport;
    private int floor = 5;
    private int col = 10;
    private Computer[][] matrizComputadores = new Computer[floor][col];


    public SchoolController() {
        
        matrizComputadores = new Computer[floor][col];

    }

    
    public boolean searchPiso(int floor){
        if (floor < 0 || floor > matrizComputadores.length){
            return false;
        }
        return true;
    }
    
    public Computer searchSerialNumber(String serialNumber){

        

        for(int i = 0; i < matrizComputadores.length; i++){
            for(int j = 0; j < matrizComputadores[0].length; j++){
                
                Computer computer = matrizComputadores[i][j];

                if ( computer != null ){
                    if (computer.getSerialNumber().equalsIgnoreCase(serialNumber)){
                        return computer;
                    
                    }
                }
            }
                
        }

        return null;
    }

    public void agregarComputador(int floor, String serialNumber) {

        int eleccionPiso = floor - 1;
        boolean searchPiso = searchPiso(floor);
        Computer verficar = searchSerialNumber(serialNumber);

        if ( verificar != null){

            System.out.println("Este numero de serie ya ha sido registrado, cada uno debe ser unico ongreselo nuevamente");

        }else{


            if ( searchPiso != true ){
                System.out.println("El piso no existe");
            }else{
                for (int j = 0; j < matrizComputadores[0].length; j++){
                    if ( matrizComputadores[eleccionPiso][j] == null){

                        matrizComputadores[eleccionPiso][j] = new Computer(serialNumber);

                        System.out.println("Registrado");
                        break;
                    }
                }
            }

            for(int i = 0; i < matrizComputadores.length; i++){
                for(int j = 0; j < matrizComputadores[0].length; j++){
                    if(matrizComputadores[i][j] != null){
                        System.out.print("| " + matrizComputadores[i][j].getSerialNumber()+ " ");
                    }else{
                        System.out.print("| vacio");
                    }
                    
                }
                System.out.println("|");
            }
        }

        

    }

    public void agregarIncidenteEnComputador(String serialNumber, LocalDate dateReport, String description, boolean solution, int solutionHours) {

        System.out.println("Buscando" + serialNumber);
        Computer search = searchSerialNumber(serialNumber);

        if (search != null){

            if ( solution == false){
                search.addIncident(dateReport, description);
            }else{
                search.addIncident(dateReport, description, solution, solutionHours);
            }

        }else{
            System.out.println("Computador no encontrado");
        }

        

    }

    public void getComputerList() {

        int maxIncidents = 0;
        Computer computermax = null;

        for(int i = 0; i < matrizComputadores.length; i++){
            for(int j = 0; j < matrizComputadores[0].length; j++){

                Computer actual = matrizComputadores[i][j];
                if (actual != null){
                    int cantidad = actual.getListaIncidents().size();
                    if ( cantidad > maxIncidents){
                    maxIncidents = cantidad;
                    computermax = actual;
                    }
                }
            }
        }

        if ( computermax != null){
            System.out.println("El computador con mas incidentes es:" + computermax.getSerialNumber());
            System.out.println("Con " + maxIncidents+ " incidentes");
            
        }

        

    }
}