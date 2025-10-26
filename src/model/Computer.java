package model;

import java.util.ArrayList;
import java.time.LocalDate;

public class Computer {

    
    
    private String serialNumber;
    private boolean nextWindow;
    private ArrayList<Incident> listaIncidents;

    public Computer(String serialNumber) {

        this.serialNumber = serialNumber;
        this.listaIncidents = new ArrayList<Incident>();

    }

    

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setListaIncidents(ArrayList<Incident> listaIncidents) {
        this.listaIncidents = listaIncidents;
    }

    public ArrayList<Incident> getListaIncidents() {
        return listaIncidents;
    }

    /**
     * Descripcion: agrega un nuevo incidente con todos los elementos a la lista
     * @param LocalDate dateRepor 
     * @param String description
     * @param boolean solution
     * @param int solutionHours
     * @return - 
     */
    
    public void addIncident(LocalDate dateReport, String description, boolean solution, int solutionHours) {

        Incident nuevoIncident = new Incident(dateReport, description, solution, solutionHours);
        listaIncidents.add(nuevoIncident);
        System.out.println("Incidente registrado");

    }

    /**
     * Descripcion: agrega un nuevo incidente con la informacion parcial a la lista
     * @param LocalDate dateRepor 
     * @param String description
     * @return - 
     */

    public void addIncident(LocalDate dateReport, String description) {

        Incident nuevoIncident = new Incident(dateReport, description);
        listaIncidents.add(nuevoIncident);
        System.out.println("Incidente registrado");

    }

    

    


    
}


