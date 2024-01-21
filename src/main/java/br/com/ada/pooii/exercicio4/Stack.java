package br.com.ada.pooii.exercicio4;

import java.util.List;

public  interface  Stack<E> {
	void  push(E elemento);
	E pop();
	E peek();
	boolean  isEmpty();
	void transferirObjetos(List<? super E> lista);
}