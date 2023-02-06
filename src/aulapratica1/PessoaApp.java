package aulapratica1;

public class PessoaApp {
    public static void main(String[] args) {
        Pesssoa pesssoa1 = new Pesssoa(1,"Enthony");
        Pesssoa pesssoa2 = new Pesssoa(2,"Andrea");

        System.out.println("o nome  do projeto pessoa eh " + pesssoa1.getNome());
        pesssoa1.setNome("Anthony");
        System.out.println("o nome  do projeto pessoa eh " + pesssoa1.getNome());
    }


}
