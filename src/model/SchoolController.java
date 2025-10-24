package model;

public class SchoolController {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */

    private String name;
    private int hourSpentSuport;
    private int floor = 5;
    private int col = 10;
    private String[][] matrizComputadores = new String[floor][col];


    public SchoolController(String name) {
        this.name = name;

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los
     * requerimientos.
     * Para cada metodo:
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos.
     */
    public void agregarComputador(int floor, String serialNumber) {

        if ( floor < 0 || floor >= matrizComputadores.length ){
            System.out.println("El piso no existe");
        }else{
            for (int i = 0; < matrizComputadores[floor].length; i++){
                if ( matrizComputadores[floor][i] != null){

                    matrizComputadores[floor][i] = serialNumber;
                }
            }
        }


        

    }

    public void agregarIncidenteEnComputador() {

    }

    public void getComputerList() {

    }

}

