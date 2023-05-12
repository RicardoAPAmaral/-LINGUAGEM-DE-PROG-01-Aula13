package entidades;

import java.util.ArrayList;

public class Proprietarios extends Usuario{


    private int qtde;

    public Proprietarios(String nome, String email, int telefone) {
        super(nome, email, telefone);
    }

    public void npropriedades(int qtde ){
        this.qtde=qtde;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public int getTelefone() {
        return super.getTelefone();
    }

    @Override
    public void setTelefone(int telefone) {
        super.setTelefone(telefone);
    }
}
