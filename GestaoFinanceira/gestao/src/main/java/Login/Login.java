package Login;

import java.util.Scanner;

import Menus.Menu_Cliente;
import Menus.Menu_Funcionario;
import Menus.Menu_Gerente;

public class Login {

    Scanner leia = new Scanner(System.in);

    private String loginGerente = "admin";
    private String senhaGerente = "admin";
    private String loginFuncionario = "func";
    private String senhaFuncionario = "func";
    private String loginCliente = "cl";
    private String senhaCliente = "cl";
    private String loginDigitado;
    private String senhaDigitada;

    public void LoginGeral() {

        while (loginDigitado != loginGerente || loginDigitado != loginFuncionario || loginDigitado != loginCliente) {
            System.out.println("Login ou senha incorretos, tente novamente");
            System.out.println(" ");

            System.out.println("===============================\nMENU LOGIN\n===============================\n");
            System.out.println("Login: ");
            loginDigitado = leia.nextLine();
            System.out.println("Senha: ");
            senhaDigitada = leia.nextLine();

            if (loginDigitado.equals(loginGerente) && senhaDigitada.equals(senhaGerente)) {
                System.out.println("Seja bem vindo gerente!!");

                Menu_Gerente menuGerente = new Menu_Gerente();
                menuGerente.exibirMenuGerente();

            } else if (loginDigitado.equals(loginFuncionario) && senhaDigitada.equals(senhaFuncionario)) {
                System.out.println("Seja bem vindo funcionário!!");
                Menu_Funcionario menuFuncionario = new Menu_Funcionario();
                menuFuncionario.exibirMenuFuncionario();

            } else if (loginDigitado.equals(loginCliente) && senhaDigitada.equals(senhaCliente)) {
                System.out.println("Seja bem vindo cliente!!");
                Menu_Cliente menuCliente = new Menu_Cliente();
                menuCliente.exibirMenuCliente();

            } else {
                System.out.println("Acesso negado, login ou senha incorretos!");
            }
        }
    }
}
