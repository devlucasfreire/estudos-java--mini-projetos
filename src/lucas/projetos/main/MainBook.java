package lucas.projetos.main;
import lucas.projetos.modelos.BookRead;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var primeiroLivro = new BookRead("Um corpo na biblioteca", "Agatha Christie", 192);
        var segundoLivro = new BookRead("Morte no nilo", "Agatha Christie", 250);
        var terceiroLivro = new BookRead("A arte da guerra", "Sun Tzu", 79);
        var quartoLivro = new BookRead("Assassinato no Expresso do Oriente", "Agatha Christie", 199);

        ArrayList<BookRead> listaLivros = new ArrayList<>();
        listaLivros.add(primeiroLivro);
        listaLivros.add(segundoLivro);
        listaLivros.add(terceiroLivro);
        listaLivros.add(quartoLivro);

        // loop para perguntar as páginas de cada livro da lista
        for (BookRead b : listaLivros) {
            System.out.println("Quantas páginas você leu de: " + b.getTituloLivro() + "?");
            int lidas = Integer.parseInt(scanner.nextLine());
            b.setPaginasLidas(lidas);
        }

        // Lógica para achar o livro com mais páginas

        BookRead livroMaisLido = listaLivros.get(0);

        for (BookRead b: listaLivros) {
            if (b.getPaginasLidas() > livroMaisLido.getPaginasLidas()){
                livroMaisLido = b;
            }
        }

        System.out.println("------------ Resultado Final-----------------------");
        System.out.println("O livro mais lido foi: " + livroMaisLido.getTituloLivro());
        System.out.println("Total de páginas lidas dele: " + livroMaisLido.getPaginasLidas());

    }


}


