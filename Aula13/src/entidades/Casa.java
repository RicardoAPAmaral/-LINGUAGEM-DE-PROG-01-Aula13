package entidades;

public class Casa extends Propriedades{

    private boolean garagem;

    public Casa(String endereco, int numero_de_quartos, double preco, boolean garagem) {
        super(endereco, numero_de_quartos, preco);
        this.garagem = garagem;
    }

    public boolean isGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public int getNumero_de_quartos() {
        return super.getNumero_de_quartos();
    }

    @Override
    public void setNumero_de_quartos(int numero_de_quartos) {
        super.setNumero_de_quartos(numero_de_quartos);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }
}
