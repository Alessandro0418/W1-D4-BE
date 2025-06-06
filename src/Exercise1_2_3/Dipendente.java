package Exercise1_2_3;

public abstract class Dipendente {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(String matricola, double stipendio, String dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto per calcolare lo stipendio
    public abstract double calculateSalary();
}
