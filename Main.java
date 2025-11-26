public class Main {
    public static void main(String[] args) {
    Contato irmao = new Contato("Lucas", 960511773);

    AgendaTelefonica daLeticia = new AgendaTelefonica(irmao);
    daLeticia.mostrarAgenda();
    }
}
