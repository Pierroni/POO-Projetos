public class Livro {
    private String id, titulo, autor;

    public Livro() {
    }

    public Livro(String id, String titulo, String autor) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setAutor(autor);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor();
    }
}