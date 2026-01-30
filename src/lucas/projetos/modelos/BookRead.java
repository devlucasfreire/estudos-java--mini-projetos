package lucas.projetos.modelos;

public class BookRead extends Book {
    private int paginasLidas;

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public BookRead(String titulo, String autor, int totalPaginas) {
        super(titulo, autor, totalPaginas);
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Lido: " + getPaginasLidas() + " pag.";
    }

}



