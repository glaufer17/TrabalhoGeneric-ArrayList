package principal;

import cadastro.CadastrarPessoa;

public class Main {

    public static void main(String[] args) {
        
        CadastrarPessoa.criarPessoa(1,"joao",21);
        CadastrarPessoa.criarPessoa(2,"mateus",19);
        CadastrarPessoa.criarPessoa(3,"Kaique",18);
        
        System.out.println(CadastrarPessoa.lerPessoa(1));
        System.out.println(CadastrarPessoa.lerPessoa(2));
        System.out.println(CadastrarPessoa.lerPessoa(3));
        
        CadastrarPessoa.atualizarPessoa(1, "Joaozinho", 31);
        
        System.out.println(CadastrarPessoa.lerPessoa(1));
        
        CadastrarPessoa.excluirPessoa(1);
        
        System.out.println(CadastrarPessoa.lerPessoa(1));
    }
    
}
