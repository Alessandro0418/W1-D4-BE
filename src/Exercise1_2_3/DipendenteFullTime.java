package Exercise1_2_3;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String dipartimento){
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
