package lucas.projetos.modelos;

public class Book {
    private String tituloLivro;
    private int quantidadePaginas;
    private String autor;

    public String getTituloLivro() {
        return tituloLivro;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public Book(String tituloLivro, String autor, int quantidadePaginas) {
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro: " + getTituloLivro() + " |" + " Autor: " + getAutor() + " |" + " Páginas: " + getQuantidadePaginas();
    }
}
