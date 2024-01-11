package br.com.ada.pooii.exercicio1;

public class Bicicleta implements Veiculo {

    private String modelo;
    private int velocidade;

    public Bicicleta(String modelo, int velocidade) {

        this.modelo = modelo;
        this.velocidade = velocidade;
    }

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


    @Override
    public void acelerar(int velocidade) {
        velocidade += 5;
        System.out.printf("Aumentando a velocidade para %d km/h. %n", velocidade);

    }

    @Override
    public void frear() {

        System.out.println("Pedalando mais devagar.");

    }
}
