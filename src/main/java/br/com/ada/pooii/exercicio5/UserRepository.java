package br.com.ada.pooii.exercicio5;

public class UserRepository {
    public void saveUser() {
        // Salva o usuário no banco de dados
        // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
    }
}
