package br.com.ada.pooii.exercicio5;

public class CPFService {
    public boolean isValidCPF(boolean valido) {
        return valido;
        // Faz o calculo para verificar se o CPF é valido
        // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
    }
}
