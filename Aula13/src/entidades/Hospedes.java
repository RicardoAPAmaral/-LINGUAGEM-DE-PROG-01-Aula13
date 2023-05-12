package entidades;

import java.util.ArrayList;

public class Hospedes extends Usuario{

    ArrayList<String> favoritas = new ArrayList();


    public Hospedes(String nome, String email, int telefone) {
        super(nome, email, telefone);
    }

    public void adiconarFavorita(String propriedade_favorita){
        favoritas.add(propriedade_favorita);
        System.out.println(propriedade_favorita+"adicionada aos favoritos");

    }

    public ArrayList<String> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<String> favoritas) {
        this.favoritas = favoritas;
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
