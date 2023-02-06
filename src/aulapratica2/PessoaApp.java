package aulapratica2;

public class PessoaApp {

    public static void  main(String[] args) {
        ClientePF clientepf1 = new ClientePF("zzzyz ", " bairro: tal ", " 123456890");
        ClientePJ clentepj1 = new ClientePJ("zzzzz", "bairro: tal tal ", " 9346782912");

        System.out.println("cliente pf dados: "+ clientepf1.getNome() + "" + clientepf1.getEndereco());

        System.out.println(clientepf1.toString());
        System.out.println(clentepj1.toString());
    }

}
