package br.com.ada.pooii.exercicio3;

public class Main {
    public static void main(String[] args) {
        MinhaLista<Pessoa, Long> listaDeNomes = new MinhaLista<>();

        var jorge = new Pessoa(1, "jorge");
        listaDeNomes.adicionar(jorge);

        var maria = new Pessoa(2, "maria");
        listaDeNomes.adicionar(maria);

        var jess = new Pessoa(3, "jess");
        listaDeNomes.adicionar(jess);

        var joao = new Pessoa(4, "João");

        System.out.println("Elemento na posição 2: " + listaDeNomes.obter(2)); // Saída: Pessoa[id=3, nome="jess]
        System.out.println("A lista contém a pessoa maria? " + listaDeNomes.contem(maria)); // Saída: true
        System.out.println("Qual a posicao do elemento de ID 3? " + listaDeNomes.indice(3L)); // Saída: 2
        System.out.println("A lista contém a pessoa João? " + listaDeNomes.contem(joao)); // Saída: false
    }
}
