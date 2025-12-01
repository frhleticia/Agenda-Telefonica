package POO.AgendaTelefonica;

public class Main {
    public static void main(String[] args) {
    Contato irmao = new Contato("Edu", "(22)99988-8777");
    Contato irma = new Contato("Mônica", "(51)98765-4321");
    Contato leticia = new Contato("Letícia", "(51)99333-1993");

    Agenda agendaDaLe = new Agenda(leticia);

    agendaDaLe.adicionarContato(irmao);
    agendaDaLe.mostrarAgenda();

    agendaDaLe.adicionarContato(irma);
    agendaDaLe.mostrarAgenda();

    agendaDaLe.removerContato(irmao);
    agendaDaLe.mostrarAgenda();
   }
}
