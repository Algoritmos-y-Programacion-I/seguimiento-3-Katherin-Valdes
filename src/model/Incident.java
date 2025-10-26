package model;
import java.time.LocalDate;

public class Incident {

    private LocalDate dateReport;
    private String description;
    private boolean solution;
    private int solutionHours;

    public Incident(LocalDate dateReport, String description, boolean solution, int solutionHours){
        this.dateReport = dateReport;
        this.description = description;
        this.solution = solution;
        this.solutionHours = solutionHours;
        
    }

    public Incident(LocalDate dateReport, String description){
        this.dateReport = dateReport;
        this.description = description;
        this.solution = false;
        this.solutionHours = 0;
        
    }

    public void setDateReport(LocalDate dateReport) {
        this.dateReport = dateReport;
    }

    public LocalDate getDateReport() {
        return dateReport;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setSolution(boolean solution) {
        this.solution = solution;
    }

    public boolean getSolution() {
        return solution;
    }
    public void setSolutionHours(int solutionHours) {
        this.solutionHours = solutionHours;
    }

    public int getSolutionHours() {
        return solutionHours;
    }
    
}
