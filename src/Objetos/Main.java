package Objetos;

public class Main {
    public static void main(String[] args) {
        //CRIAÇÃO DE PRODUTOS PARA TESTE
        ProdutoAlimenticio produto1 = new ProdutoAlimenticio("Maçã", 1.00, 1.50, "2023-12-31", "50 cal");
        ProdutoVestuario produto2 = new ProdutoVestuario("Camiseta", 10.00, 25.00, "M", "Azul", "Algodão");

        //MOSTRANDO TESTE DE PRODUTOS
        System.out.println("Produto Alimentício: " + produto1.getNome() + 
                           ", Preço de Custo: " + produto1.getPrecoCusto() +
                           ", Preço de Venda: " + produto1.getPrecoVenda() +
                           ", Lucro: " + produto1.calcularLucro() +
                           ", Data de Validade: " + produto1.getDataValidade() +
                           ", Informações Nutricionais: " + produto1.getInformacoesNutricionais());

        System.out.println("Produto de Vestuário: " + produto2.getNome() + 
                           ", Preço de Custo: " + produto2.getPrecoCusto() +
                           ", Preço de Venda: " + produto2.getPrecoVenda() +
                           ", Lucro: " + produto2.calcularLucro() +
                           ", Tamanho: " + produto2.getTamanho() +
                           ", Cor: " + produto2.getCor() +
                           ", Material: " + produto2.getMaterial());
    }
}