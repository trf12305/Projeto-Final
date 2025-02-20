package VIEW;

class txtNomeLivro {

    
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    public Livro(int id, String titulo, String autor, String genero, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return titulo + " - Autor: " + autor + " - Gênero: " + genero + " - Disponível: " + disponivel;
    }
}    
}
