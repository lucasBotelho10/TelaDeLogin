import java.util.HashMap;
import java.util.Map;

/**
 * @author Lucas Henrique Botelho
 * @version 1.01
 * @since Release 1.0 da aplicação
 * 
 * Uma simples classe para autenticação de usuários, simulando um banco de dados de usuários.
 */
public class LoginScreen {
	
	private Map<String, String> userDatabase; // Banco de dados de usuário simulado(username, password)
	
	/**
	 * Constrói uma nova instância de LoginScreen e inicializa o banco de dados do usuário.
	 * Por exemplo, ele pré-carrega o banco de dados com alguns usuários de amostra.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	 * Tenta autenticar um usuário baseado em seu nome de usuário e senha.
	 * 
	 * @param username O nome de usuário que o usuário tenta fazer o login.
	 * @param password A senha inserida pelo usuário.
	 * @return {@code true} Se a autenticação é feita com sucesso, {@code false} Se a autenticação falhar.
	 */
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autenticação feita com sucesso
			}
		}
		return false; // Autenticação fracassada
	}

	/**
	 * Adiciona um novo usuário ao banco de dados do usuário. Observe que este método não é recomendado para uso em um 
	 * ambiente de produção, pois carece de medidas de segurança adequadas.
	 * 
	 * @param username O nome de usuário do novo usuário.
	 * @param password A senha do novo usuário.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
		
	}

}
