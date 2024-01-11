package br.com.ada.pooii.exercicio1;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("BMW", 0);
        Bicicleta bicicleta = new Bicicleta("Caloi", 0);
        Moto moto = new Moto("Honda", 0);

        carro.ligar();
        carro.acelerar(10);
        carro.frear();
        carro.desligar();

        System.out.println();

        moto.ligar();
        moto.acelerar(10);
        moto.frear();
        moto.desligar();

        System.out.println();

        bicicleta.acelerar(10);
        bicicleta.frear();

    }
}
