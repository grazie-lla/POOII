package br.com.ada.pooii.exercicio5;

public class SMSService extends User {
    public void sendSMS(String message) {
        // Envia um SMS para o usuário
        // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
    }
}
