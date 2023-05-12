package entidades;

import java.util.ArrayList;

public abstract class Propriedades {
    ArrayList<String> reserva = new ArrayList();
    ArrayList<String> avaliacoes = new ArrayList();


    private String endereco;
    private int numero_de_quartos;
    private double preco;

    public Propriedades(String endereco, int numero_de_quartos, double preco) {
        this.endereco = endereco;
        this.numero_de_quartos = numero_de_quartos;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero_de_quartos() {
        return numero_de_quartos;
    }

    public void setNumero_de_quartos(int numero_de_quartos) {
        this.numero_de_quartos = numero_de_quartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


