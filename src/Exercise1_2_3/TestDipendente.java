package Exercise1_2_3;

public class TestDipendente {
    public static void main(String[] args) {
        // Creazione di diverse istanze di dipendenti
        DipendenteFullTime d1 = new DipendenteFullTime("A123", 2500.00, "produzione");
        DipendentePartTime d2 = new DipendentePartTime("B456", 20.00, "amministrazione", 80); // Stipendio orario e ore lavorate
        Dirigente d3 = new Dirigente("C789", 3500.00, "vendite");

        // Creazione di un array di Dipendente
        Dipendente[] dipendenti = {d1, d2, d3};

        // Calcolo e stampa degli stipendi usando polimorfismo
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola() + ", Stipendio Totale: " + d.calculateSalary());
        }
    }
}
