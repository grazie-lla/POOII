package br.com.ada.pooii.exercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackImpl<E> implements Stack<E>, Iterable<E> {
    private final List<E> listaInterna;

    public StackImpl() {
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

    @Override
    public void transferirObjetos(List<? super E> lista) {
        lista.addAll(listaInterna);
    }

    //Adicionado método Interator para imprimir os elementos da pilha no console
    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {
        private int index = listaInterna.size() - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public E next() {
            return listaInterna.get(index--);
        }
    }

    public void imprimirElementos() {
        for (E elemento : this) {
            System.out.println(elemento);
        }
    }
}
