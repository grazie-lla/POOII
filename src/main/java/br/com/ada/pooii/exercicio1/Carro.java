package br.com.ada.pooii.exercicio1;

public class Carro implements Motorizado{
    private String modelo;
    private int velocidade;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public void ligar() {

        System.out.println("Carro ligado.");

    }

    @Override
    public void desligar() {

        System.out.println("Carro desligado.");

    }

    @Override
    public void acelerar(int velocidade) {
        velocidade += 10;
        System.out.printf("Aumentando a velocidade para %d km/h. %n", velocidade);

    }

    @Override
    public void frear() {

        System.out.println("Diminuindo a velocidade do carro.");

    }
}
