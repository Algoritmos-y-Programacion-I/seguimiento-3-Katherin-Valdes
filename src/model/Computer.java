
    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */
    private String serialNumber;
    private boolean nextWindow;
    private ArrayList<Incident> listaIncidents;

    public Computer(String serialNumber, boolean nextWindow) {

        this.serialNumber = serialNumber;
        this.nextWindow = nextWindow;
        this.listaIncidents = new ArrayList<Incident>();

    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
    public void addIncident(LocalDate dateReport, String description, boolean solution, int solutionHours) {

        Incident nuevoIncident = new Incident(dateReport, description, solution, solutionHours);
        add.listaIncidents(nuevoIncident);

    }

}
