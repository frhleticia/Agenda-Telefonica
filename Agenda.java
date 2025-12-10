package POO.AgendaTelefonica;
import java.util.ArrayList;

public class Agenda {
    private Contato contato;
    private ArrayList<Contato> agenda = new ArrayList<>();

    public Agenda(Contato contato){
        this.contato = contato;
    }

    public void mostrarAgenda(){
        System.out.println("˗ˋˏ°•୨ Agenda de "+this.contato.getNome()+" ୧•°ˎˊ˗");
        System.out.println("Meu número: " + this.contato.getNumero());
        for (Contato contato : agenda){
            System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getNumero());
        }
        System.out.println("\n");
    }
    public void adicionarContato(Contato contato){
        agenda.add(contato);
    }

    public void removerContato(Contato contato){
        agenda.remove(contato);
    }
}
