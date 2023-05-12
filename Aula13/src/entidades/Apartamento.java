package entidades;

public class Apartamento extends Propriedades {

        private  int suites;

        public Apartamento(String endereco, int numero_de_quartos, double preco, int suites) {
        super(endereco, numero_de_quartos, preco);
        this.suites = suites;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public Apartamento(String endereco, int numero_de_quartos, double preco) {
        super(endereco, numero_de_quartos, preco);
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
