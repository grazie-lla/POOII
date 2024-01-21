package br.com.ada.pooii.exercicio4;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        minhaStack.push("Maria");
        minhaStack.push("Paula");
        minhaStack.push("Erica");

        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.peek();
        System.out.println(nome);



    }
}
