package br.com.ada.pooii.exercicio4;

public  interface  Stack<E> {
	void  push(E elemento);
	E pop();
	E peek();
	boolean  isEmpty();
}