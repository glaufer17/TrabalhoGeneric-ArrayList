// Pacote cadastro
package cadastro;

import generic.MinhaLista;
import modelo.Pessoa;


public class CadastrarPessoa {
    private static MinhaLista<Pessoa> listaPessoas = new MinhaLista<>();;

    /*// Construtor
    public CadastrarPessoa() {
        listaPessoas = new MinhaLista<>();
    }*/

    // Método para criar uma nova pessoa
    public static void criarPessoa(int id, String nome, int idade) {
        
        Pessoa pessoa = new Pessoa(id, nome, idade);
        listaPessoas.add(pessoa);
    }

    // Método para ler informações de uma pessoa por ID
    public static String lerPessoa(int id) {
        Pessoa pessoa = listaPessoas.pesquisar(id); 
        if (pessoa == null) {
            return "Pessoa nao encontrada.";
        }
         pessoa.exibirInformacoes();
        return "\n";
        
    }

    // Método para atualizar informações de uma pessoa por ID
    public static void atualizarPessoa(int id, String novoNome, int novaIdade) {
        Pessoa pessoa = listaPessoas.pesquisar(id);
            if (pessoa != null) {
                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);
            }
    }

    // Método para excluir uma pessoa por ID
    public static void excluirPessoa(int id) {
        Pessoa pessoa = listaPessoas.pesquisar(id);
            if (pessoa != null) {
                listaPessoas.remove(pessoa);
            }
        }
}
