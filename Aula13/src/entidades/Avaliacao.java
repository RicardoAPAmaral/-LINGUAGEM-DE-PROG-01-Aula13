package entidades;

public class Avaliacao {

    private String propriedadeAvaliada;
    private String hospedeAvaliador;
    private int nota;
    private String avaliacao;

    public Avaliacao(String propriedadeAvaliada, String hospedeAvaliador, int nota, String avaliacao) {
        this.propriedadeAvaliada = propriedadeAvaliada;
        this.hospedeAvaliador = hospedeAvaliador;
        this.nota = nota;
        this.avaliacao = avaliacao;
    }

    public String getPropriedadeAvaliada() {
        return propriedadeAvaliada;
    }

    public void setPropriedadeAvaliada(String propriedadeAvaliada) {
        this.propriedadeAvaliada = propriedadeAvaliada;
    }

    public String getHospedeAvaliador() {
        return hospedeAvaliador;
    }

    public void setHospedeAvaliador(String hospedeAvaliador) {
        this.hospedeAvaliador = hospedeAvaliador;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}
