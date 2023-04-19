package br.com.lojinha;

import br.com.lojinha.Enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto ("Nestle", Tamanho.MEDIO);

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);

        List<ItemIncluso> iteisInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        iteisInclusos.add(primeiroItemIncluso); // 0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        iteisInclusos.add(segundoItemIncluso); // 1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 2);
        iteisInclusos.add(terceiroItemIncluso); // 2

        meuProduto.setIteisInclusos(iteisInclusos);

        System.out.println(meuProduto.getIteisInclusos().get(1));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        System.out.println("Comesando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getIteisInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram -se os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-99.99);
    }
}
