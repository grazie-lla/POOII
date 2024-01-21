package br.com.ada.pooii.exercicio5;

public class EmailService {
    public void sendEmail(String message) {
        // Envia um e-mail para o usuário
        // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
    }
}
