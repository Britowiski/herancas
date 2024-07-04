public class LivrosDaBiblioteca extends Livro {
    public static void main(String Args[]){
        Livro livro1 = new Livro("Uma noite fria", "Fernando Fernandes", 2023, 90);
        livro1.exibirInformacoes();
        System.out.println("\n");

        Livro antonioBandeiras = new Livro("Brasil como nunca visto", "Antonio Bandeiras", 1984, 450);
        antonioBandeiras.exibirInformacoes();

        System.out.println("\n");

        Livro monteiroLobado = new Livro("O caba do Nordeste", "Monteiro Lobato", 1965, 110);
        monteiroLobado.exibirInformacoes();

        System.out.println("\n");

        Livro linusTorvalds = new Livro("Linux essencial", "Linus Torvalds", 1995, 500);
        linusTorvalds.exibirInformacoes();
    }
}


