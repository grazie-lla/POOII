package br.com.ada.pooii.exercicio4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StackImpl<String> minhaStack = new StackImpl<>();

        List<Object> todosOsElementos = new ArrayList<>();

        System.out.println("Adicionando elementos");
        minhaStack.push("lucia");
        minhaStack.push("maria");
        minhaStack.push("erica");
        minhaStack.push("paula");
        minhaStack.imprimirElementos();


        System.out.println("removendo o último elemento");
        String nome = minhaStack.pop();
        System.out.println(nome);

        System.out.println("imprimindo o último elemento");
        nome = minhaStack.peek();
        System.out.println(nome);

        System.out.println("A lista está vazia?");
        boolean empty = minhaStack.isEmpty();
        System.out.println(empty);

        System.out.println("Transferindo objetos");
        minhaStack.transferirObjetos(todosOsElementos);
        System.out.println(todosOsElementos);
    }
}
