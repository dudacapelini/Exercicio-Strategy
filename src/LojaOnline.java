
public class LojaOnline {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Vestido", 150.0);
        Produto produto2 = new Produto("Camiseta", 85.0);
        Produto produto3 = new Produto("Tênis", 200.0);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);


        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total do carrinho para Cliente Novo sem desconto: R$ " + carrinho.calcularTotalComDesconto());


        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total do carrinho para Cliente Regular com 10% de desconto: R$ " + carrinho.calcularTotalComDesconto());


        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total do carrinho para Cliente VIP com 20% de desconto: R$ " + carrinho.calcularTotalComDesconto());
    }
}

