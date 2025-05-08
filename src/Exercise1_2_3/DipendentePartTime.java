package Exercise1_2_3;

public class DipendentePartTime extends Dipendente {
    private double oreLavorate;

    public DipendentePartTime(String matricola, double stipendio, String dipartimento, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        // Lo stipendio di un part-time dipende dalle ore lavorate
        return getStipendio() * oreLavorate;
    }
}
