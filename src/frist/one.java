package frist;

public class one implements Comparable<one> {
    private String nome;
    private double preço;

    public one(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public int compareTo(one outro) {
        return Double.compare(this.preço, outro.getPreço());
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preço;
    }
}
