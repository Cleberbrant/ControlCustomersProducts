//Pacotes usados/importações de entidades
package application;

import entities.Product;
import entities.User;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        // set do scanner/arraylist criada
        Scanner sc = new Scanner(System.in);
        List<User> usuarios = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        usuarios.add(new User("Cleber", "Santa Maria - Norte", "61111111"));
        usuarios.add(new User("Wesley", "Santa Maria - Sul", "612222222"));
        usuarios.add(new User("Marina Nery", "Aguas Claras", "613333333"));
        usuarios.add(new User("Enzo Ferrari", "Lago Sul", "614444444"));
        usuarios.add(new User("Vini", "Guara", "615555555"));
        usuarios.add(new User("Gabriel Fallen", "São Paulo", "61666666"));
        usuarios.add(new User("Linconl lau", "São Paulo", "617777777"));
        usuarios.add(new User("Fabiana", "Finlandia", "618888888"));
        usuarios.add(new User("Galdino", "Aguas Claras", "619999999"));
        usuarios.add(new User("Bidu", "Lago Sul", "610000000"));

        products.add(new Product("Mouse", "Mouse Gamer Razer", 400.00, 30.00, 4));
        products.add(new Product("Teclado", "Teclado Gamer Razer", 1000.00, 35.00, 6));
        products.add(new Product("Headset", "Headset Gamer Razer", 650.00, 25.00, 5));
        products.add(new Product("Mousepad", "Mousepad Gamer Razer", 125.00, 17.00, 2));
        products.add(new Product("Webcam", "Webcam logitech C920", 350.00, 22.00, 10));
        products.add(new Product("Gabinete", "Gabinete CoolerMaster", 300.00, 54.00, 12));
        products.add(new Product("Monitor", "Monitor benq", 1800.00, 60.00, 7));
        products.add(new Product("Camera", "Sony Action Cam", 2000.00, 40.00, 19));
        products.add(new Product("Celular", "Iphone 12 Pro Max", 6700.00, 32.00, 9));
        products.add(new Product("Cadeira", "Cadeira Gamer DxRacer", 1800.00, 38.00, 13));
        // printa o menu puxando o metodo
        int escolha = 1;
        while (escolha != 7) {
            // switch para funções do menu
            menu();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1: // cadastro do cliente
                    System.out.println("Quantos clientes você deseja cadastrar: ");
                    int qntClients = sc.nextInt();
                    // limpa buffer, usado em outros casos no codigo tambem
                    sc.nextLine();
                    // for para percorrer a quantidade de vezes que a pessoa quer cadastras os
                    // clientes dentro da lista
                    for (int i = 1; i <= qntClients; i++) {
                        System.out.println("Qual é o seu nome: ");
                        String name = sc.nextLine();

                        System.out.println("Qual é o seu endereço: ");
                        String adress = sc.nextLine();

                        System.out.println("Qual é o seu telefone: ");
                        String telephone = sc.nextLine();

                        // aloca a entrada do usuário em cada um dos atributos da classe User
                        usuarios.add(new User(name, adress, telephone));
                    }
                    break;

                case 2: // busca de cliente e ou alteração de dados cadastrados
                    sc.nextLine();
                    // boolean para verficar se foi encontrado ou não o user
                    boolean search = false;
                    System.out.println("Insira o seu nome para ser pesquisado: ");
                    String name = sc.nextLine();
                    // foreach para percorrer a lista dos usuários e comparar o nome que foi
                    // inserido com o da lista.
                    for (User usuario : usuarios) {
                        String nameUsuario = usuario.getName();
                        // if do comparador, quando ele compara se for true ele entra dentro do if e
                        // printa as informações do cliente.
                        if (name.equals(nameUsuario)) {
                            System.out.println("Nome encontrado!");
                            // puxa as informações da lista usuario que foi criada lá em cima, printando ao
                            // usuário.
                            System.out.println("Nome: " + usuario.getName() + "\n" + "Endereço: " + usuario.getAdress()
                                    + "\n" + "Telefone: " + usuario.getTelephone());
                            // logica para alterar algum dado de algum cliente caso o user queira.
                            System.out.println("Você deseja alterar algum dado do cliente: [1]Sim / [2]Não");
                            int op = sc.nextInt();
                            // Se o usuário digitar 2 ele volta ao menu principal.
                            if (op == 2) {
                                System.out.println("Voltando ao menu principal!");
                            }
                            while (op == 1) {
                                System.out.println(
                                        "Oque você deseja alterar: [1]Nome / [2]Endereço / [3]Telefone / [4]Sair");
                                int opalterar = sc.nextInt();
                                // switch para alteração dos dados
                                switch (opalterar) {
                                    case 1:
                                        System.out.println("Qual nome você deseja colocar: ");
                                        sc.nextLine();
                                        // recebe a string que vai ser alocada por cima de outra
                                        String nameAuterado = sc.nextLine();
                                        // puxa a informação, essa informação depende do setATRIBUTO, onde a var dentro
                                        // dos () vai ser alocada na list.
                                        usuario.setName(nameAuterado);
                                        System.out.println("Sucesso! Nome alterado para: " + usuario.getName());
                                        break;
                                    case 2:
                                        System.out.println("Qual endereço você deseja colocar: ");
                                        sc.nextLine();
                                        String adressAuterado = sc.nextLine();
                                        usuario.setAdress(adressAuterado);
                                        System.out.println("Sucesso! Endereço alterado para: " + usuario.getAdress());
                                        break;
                                    case 3:
                                        System.out.println("Qual telefone você deseja colocar: ");
                                        sc.nextLine();
                                        String telephoneAuterado = sc.nextLine();
                                        usuario.setTelephone(telephoneAuterado);
                                        System.out
                                                .println("Sucesso! Telefone alterado para: " + usuario.getTelephone());
                                        break;
                                    case 4:
                                        // caso o usuário queira sair do menu, o op que é a var do switch contara 1++,
                                        // comparando com == 1, ele irá sair do switch.
                                        op++;
                                        break;
                                }
                            }
                            // boolean da procura alterado para verdadeiro pois foi achado.
                            search = true;
                        }
                    }
                    // se for diferente da procura ele printa que o nome não foi encontrado
                    if (!search) {
                        System.out.println("Nome não encontrado!");
                    }
                    break;
                case 3:
                    // resolver problema do buffer
                    sc.nextLine();
                    // print/scan para saber quantos produtos vai querer cadastrar
                    System.out.println("Quantos produtos você deseja cadastrar: ");
                    int qntProducts = sc.nextInt();
                    sc.nextLine();
                    // for para percorrer toda a arraylist e cadastrar cada uma em seu determinado
                    // lugar na lista.
                    for (int j = 1; j <= qntProducts; j++) {
                        System.out.println("Qual é o nome do produto: ");
                        String nameProduct = sc.nextLine();

                        System.out.println("Qual é a descrição do produto: ");
                        String description = sc.nextLine();

                        System.out.println("Qual é o valor da compra: ");
                        double value = sc.nextInt();

                        System.out.println("Qual é a porcentagem de lucro: ");
                        double percentage = sc.nextInt();

                        System.out.println("Qual é a quantidade em estoque: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        // adiciona todos os elementos inseridos pelo usuário na arraylist.
                        products.add(new Product(nameProduct, description, value, percentage, quantity));
                    }
                    break;
                case 4:
                    sc.nextLine();
                    // boolean para fazer a logica da pesquisa, iniciando com falso pois ainda não
                    // foi achado
                    boolean searchProduct = false;
                    // insert do produto
                    System.out.println("Insira o produto a ser pesquisado: ");
                    String nomeProduct = sc.nextLine();
                    // foreach para percorrer a arraylist products
                    for (Product produto : products) {
                        // a var nameProduct recebe o nome do produto da lista
                        String nameProduct = produto.getNameProduct();
                        // e compara com a que o user inseriu no nome a ser pesquisado, caso seja entra
                        // no if
                        if (nomeProduct.equals(nameProduct)) {
                            System.out.println("Produto encontrado!");
                            // e printara os atributos do produto
                            System.out.println("Nome: " + produto.getNameProduct() + "\n" + "Descrição: "
                                    + produto.getDescription() + "\n" + "Valor: " + produto.getValue() + "\n"
                                    + "Porcentagem de lucro: " + produto.getPercentage() + "\n" + "Quantidade: "
                                    + produto.getQuantity());
                            // pergunta se quer fazer alguma alteração
                            System.out.println("Você deseja alterar algum dado do produto: [1]Sim / [2]Não");
                            int opProd = sc.nextInt();
                            // se for == 2 volta ao menu
                            if (opProd == 2) {
                                System.out.println("Voltando ao menu principal!");
                            }
                            // caso seja == 1, entra no while
                            while (opProd == 1) {
                                // mini switch para alteração em atributos do produto
                                System.out.println(
                                        "Oque você deseja alterar: [1]Nome / [2]Descrição / [3]Valor / [4]Porcentagem de lucro / [5]Quantidade / [6]Sair");
                                int opAltProd = sc.nextInt();
                                switch (opAltProd) {
                                    case 1:
                                        // pergunta oque vai ser mudado, nesse caso é o nome, porém a logica é a mesma
                                        // para o resto
                                        System.out.println("Qual nome você deseja colocar: ");
                                        sc.nextLine();
                                        // a var recebe
                                        String nomeAltProd = sc.nextLine();
                                        // apos receber oque o usuário digitou, ele seta oque sera mudado dentro da
                                        // arraylist produto,
                                        produto.setNameProduct(nomeAltProd);
                                        System.out.println("Sucesso! Nome alterado para: " + produto.getNameProduct());
                                        break;
                                    case 2:
                                        System.out.println("Qual descrição você deseja colocar: ");
                                        sc.nextLine();
                                        String descAltProd = sc.nextLine();
                                        produto.setDescription(descAltProd);
                                        System.out.println(
                                                "Sucesso! Descrição alterada para: " + produto.getDescription());
                                        break;
                                    case 3:
                                        System.out.println("Qual valor você deseja colocar: ");
                                        Double valorAltProd = sc.nextDouble();
                                        produto.setValue(valorAltProd);
                                        System.out.println("Sucesso! Valor alterado para: " + produto.getValue());
                                        break;
                                    case 4:
                                        System.out.println("Qual porcentagem você deseja colocar: ");
                                        Double percentAltProd = sc.nextDouble();
                                        produto.setPercentage(percentAltProd);
                                        System.out.println(
                                                "Sucesso! Porcentagem alterada para: " + produto.getPercentage());
                                        break;
                                    case 5:
                                        System.out.println("Qual quantidade você deseja colocar: ");
                                        int quantAltProd = sc.nextInt();
                                        produto.setQuantity(quantAltProd);
                                        System.out
                                                .println("Sucesso! Quantidade alterada para: " + produto.getQuantity());
                                        break;
                                    case 6:
                                        // caso conte 1 irá sair do switch
                                        opProd++;
                                        break;
                                }
                            }
                            // ao final de tudo, a pesquisa sai como true pois foi achada.
                            searchProduct = true;
                        }
                    }
                    // caso seja diferente entra no if e printa
                    if (!searchProduct) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 5:
                    boolean searchCli = false;
                    System.out.println("Clientes: ");
                    // foreach para percorrer a lista usuarios
                    for (User cliente : usuarios) {
                        // printa o nome dos clientes cadastrados
                        System.out.println(cliente.getName());
                    }
                    sc.nextLine();
                    // seleção de algum cliente
                    System.out.println("Qual cliente você deseja selecionar: ");
                    String selectClient = sc.nextLine();
                    // foreach para percorrer a arraylist usuarios
                    for (User cliente : usuarios) {
                        // onde a var searchCliente vai receber o nome do cliente
                        String searchClient = cliente.getName();
                        // e vai comparar as 2 para saber se ele realmente existe, caso sim, ele entra
                        // no if
                        if (selectClient.equals(searchClient)) {
                            System.out.println("================================");
                            System.out.println("Cliente selecionado com sucesso!");
                            System.out.println("================================");
                            searchCli = true;
                        }
                    }
                    if (!searchCli) {
                        System.out.println("O cliente não existe!");
                    } else {
                        // cadastro de vendas para clientes, o user escolhe a opção e caso sim,
                        // cadastra, se não volta ao menu
                        System.out.println(
                                "Você deseja cadastrar vendas ao cliente " + selectClient + ": [1]Sim / [2]Não");
                        int opCliente = sc.nextInt();
                        // se a opção for igual a 1, entra dentro do while pra no final ele perguntar
                        // novamente
                        // se o usuário quer cadastrar novamente.
                        while (opCliente == 1) {
                            System.out.println("Produtos: ");
                            // foreach para printar o arraylist do nome dos produtos
                            for (Product produto : products) {
                                System.out.println(produto.getNameProduct());
                            }
                            sc.nextLine();
                            // logica para selecionar o produto
                            System.out.println("Qual produto você deseja selecionar: ");
                            String selectProduct = sc.nextLine();
                            // foreach para percorrer a arraylsit novamente
                            for (Product produto : products) {
                                // variável para receber o nome do produto da arraylist
                                String pesquisaProduct = produto.getNameProduct();
                                // compara o nome inserido pelo user com o da arraylist, caso seja igual ele
                                // entra no if
                                if (selectProduct.equals(pesquisaProduct)) {
                                    System.out.println("================================");
                                    System.out.println("Produto selecionado com sucesso!");
                                    System.out.println("================================");
                                    System.out.println();
                                    // recebe a quantidade de vendar que o user quer cadastrar
                                    System.out.println("Qual a quantidade de vendas do " + selectProduct + ": ");
                                    int vendasProduct = sc.nextInt();
                                    // foreach para percorrer a arraylist dos produtos
                                    // recebe a quantidade de vendas
                                    int subtracao = produto.getQuantity();
                                    // pega a quantidade de vendas atual e subtrai com a que o usuário colocou
                                    int resultado = subtracao - vendasProduct;
                                    // caso a subtração seja maior que 0, ou seja, valor minimo do estoque ele
                                    // printa o resultado
                                    if (resultado >= 0) {
                                        produto.setQuantity(resultado);
                                        // se não ele print erro
                                    } else {
                                        System.out.println("O seu pedido é maior do que o estoque!");
                                    }
                                }
                            }
                            // ao final de tudo, ele repete no while se o user quer cadastrar mais vendas
                            System.out.println("Você deseja cadastrar mais vendas a algum cliente: [1]Sim / [2]Não");
                            opCliente = sc.nextInt();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Produtos: ");
                    // foreach para percorrer a lista products
                    for (Product p : products) {
                        // onde vai printar o nome/quantidade dos produtos cadastrados.
                        System.out.println("Nome: " + p.getNameProduct() + " / Quantidade: " + p.getQuantity());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Digite uma opção válida, dentre ela de 1 a 7.");
                    break;

            }
        }
        sc.close();
    }

    public static void menu() {
        // função onde printará o menu principal
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
    }

}