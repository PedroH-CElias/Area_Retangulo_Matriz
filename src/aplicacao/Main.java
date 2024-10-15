package aplicacao;

import funcoes.Funcoes;

public class Main {

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        int[][] matriz = new int[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };

        int[][] matrizComElementosZerados = funcoes.zerarElementos(matriz);
        int quantidadeDeUns = funcoes.verificaQuantidadeDeUm(matrizComElementosZerados);
        System.out.println("Maior área: " + quantidadeDeUns);
    }

}