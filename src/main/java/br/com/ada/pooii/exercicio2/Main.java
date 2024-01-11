package br.com.ada.pooii.exercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        Retangulo retangulo = new Retangulo(4, 7);
        Triangulo triangulo = new Triangulo(5,9);

        System.out.println(circulo.calcularArea());
        System.out.println(retangulo.calcularArea());
        System.out.println(triangulo.calcularArea());

    }
}
