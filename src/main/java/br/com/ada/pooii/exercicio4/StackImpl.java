package br.com.ada.pooii.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<E> implements Stack<E> {
    private final List<E> listaInterna;

    public StackImpl(){
        this.listaInterna = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return listaInterna.removeLast();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return listaInterna.getLast();
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }
}
