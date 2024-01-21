package br.com.ada.pooii.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends ObjetoComId<U>, U> {
    private final List<T> elementos  = new ArrayList<>();


    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            T objeto = this.elementos.get(indice);
            return objeto;
        }
        return null;
    }

    public int indice(U id) {
        for (int i = 0; i < this.elementos.size(); i++) {

            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);

            if (isIgual) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < this.elementos.size(); i++) {
            T elementoContido = this.elementos.get(i);
            if (elemento.equals(elementoContido)) {
                return true;
            }
        }
        return false;
    }
}
