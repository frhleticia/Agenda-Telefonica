public class Contato {
    protected String nome;
    protected long numero;

    public Contato(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void mostrarContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.numero);

    }
}