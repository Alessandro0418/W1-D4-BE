package Exercise1_2_3;

public class Dirigente extends Dipendente {

    public Dirigente(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        // Lo stipendio di un dirigente è calcolato come stipendio base più un bonus
        return getStipendio() + 1500; // Bonus fisso
    }
}
