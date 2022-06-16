package br.com.lojinha.pojo;

import br.com.lojinha.Enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> iteisInclusos;

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        // Construtor serve para defenir comandos que serao iniciados durante a instaciacao
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if(novoValor > 0) {
            this.valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }
//    public void setTamanho(String novoTamanho) {
//        if(novoTamanho.equalsIgnoreCase("Pequeno") || novoTamanho.equalsIgnoreCase("Médio") || novoTamanho.equalsIgnoreCase("Grande")) {
//            this.tamanho = novoTamanho;
//        }else {
//            throw new IllegalArgumentException("Tamanho pode ser Pequeno, Médio ou Grande");
//        }
//    }

    public List<ItemIncluso> getIteisInclusos() {
        return this.iteisInclusos;
    }

    public void setIteisInclusos(List<ItemIncluso> novoIteisInclusos) {
        this.iteisInclusos = novoIteisInclusos;
    }
}
