package screen;

import controller.MenuController;
import utils.Sc;

public class Menu {
    MenuController menuController;

    public Menu() {
        this.menuController = new MenuController();
    }

    public void start() {
        // função onde printará o menu principal
        int escolha;
        do {
            System.out.println("[==Controle de Clientes e Produtos==]");
            System.out.println("[1]    Cadastro de novo cliente     ]");
            System.out.println("[2]       Busca por cliente         ]");
            System.out.println("[3]    Cadastro de novo produto     ]");
            System.out.println("[4]       Busca por produto         ]");
            System.out.println("[5]      Cadastro de venda          ]");
            System.out.println("[6]   Mostrar produtos em estoque   ]");
            System.out.println("[7]              Sair               ]");
            System.out.println("[===================================]");
            System.out.println("Oque você deseja escolher: ");
            escolha = Sc.nextInt();
            switch (escolha) {
                case 1:
                    menuController.cadastroNovoCliente();
                    break;
                case 2:
                    menuController.buscarNovoCliente();
                    break;
                case 3:
                    menuController.cadastroNovoProduto();
                    break;
                case 4:
                    menuController.buscarNovoProduto();
                    break;
                case 5:
                    menuController.cadastroDeVenda();
                    break;
                case 6:
                    menuController.estoqueProdutos();
                    break;
                case 7:
                    menuController.exit();
                    break;
                default:
            }
        } while (escolha != 7);
    }
}
