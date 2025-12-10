package POO.AgendaTelefonica;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void mostrarContato(){
        System.out.println("Nome: " + this.getNome() + "\nContato: " + this.getNumero());
    }


}
