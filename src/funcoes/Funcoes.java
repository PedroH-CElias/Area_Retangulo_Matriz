package funcoes;

import java.util.*;

import java.util.Stack;

public class Funcoes {
    private boolean chamarFuncaoOutraVez = true; // variável para chamar a função por recursividade apenas uma vez

    //funcao para zerar elementos que nao fazem parte de um retangulo
    public int[][] zerarElementos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { //percorre a linha
            for (int j = 0; j < matriz[i].length; j++) { // percorre a coluna
                if (matriz[i][j] == 1) {
                    // linha e coluna 0 OU ultima linha e coluna 0 OU qualquer linha e coluna 0 (PRIMEIRA COLUNA)
                    if (j == 0 && ((i == 0) || (i == matriz.length - 1) || (i != 0 && i != matriz.length - 1))) {
                        // verifica se o número da coluna a frente é 0 OU
                        // verifica se não é a primeira linha E o numero da linha acima é 0 E se o numero da linha abaixo é 0
                        if ((matriz[i][j + 1] == 0) || (i != 0 && matriz[i - 1][j] == 0 && matriz[i + 1][j] == 0)) {
                            matriz[i][j] = 0; // se verdade, vai zerar o elemento
                        }
                    }
                    else if (j != 0) { //qualquer coluna sem ser a primeira
                        //verifica se não é a ultima coluna E se o numero da coluna anterior é 0 E se o número da coluna a frente é 0 OU
                        // verifica se é a ultima coluna E se o numero da coluna anterior é 0 OU
                        // verifica se nao é a primeira linha E se não é a ultima linha E se o numero da linha anterior e posterior é 0
                        if ((j != matriz[i].length - 1 && matriz[i][j - 1] == 0 && matriz[i][j + 1] == 0)
                                || (j == matriz[i].length - 1 && matriz[i][j - 1] == 0)
                                || (i != 0 && i != matriz.length - 1 && matriz[i - 1][j] == 0 && matriz[i + 1][j] == 0)) {
                            matriz[i][j] = 0; // se verdade, vai zerar o elemento
                        }
                    }
                }
            }
        }
        // Condicao para chamar a procedure mais uma vez para fazer a validacao novamente
        if (chamarFuncaoOutraVez) {
            chamarFuncaoOutraVez = false; // passa a variavel para false para nao chamar novamente
            zerarElementos(matriz); //chamada da funcao recursivamente
        }
        return matriz; //retorna a matriz com os elemetos necessarios zerados
    }

    //verifica a quantidade de 1's restantes na matriz para
    public int verificaQuantidadeDeUm(int[][] matriz) {
        int count = 0;
        for (int i = 0; i < matriz.length; i++) { // percorre a linha
            for (int j = 0; j < matriz[i].length; j++) { // percorre a coluna
                if (matriz[i][j] == 1) { // verifica se o elemento = 1
                    count++; // se verdade, soma 1 ao contador
                }
            }
        }
        return count; //retorna a quantidae de 1's presentes na matriz
    }
}
