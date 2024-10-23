package Objetos;

class ProdutoAlimenticio extends Produto { //herança com privados data de validade e informações nutricionais
    private String dataValidade;
    private String informacoesNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    //validade
    public String getDataValidade() {
        return dataValidade;
    }

    public String getInformacoesNutricionais() {
        return informacoesNutricionais;
    }
}