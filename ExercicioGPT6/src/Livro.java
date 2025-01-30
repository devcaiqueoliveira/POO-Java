public class Livro {
    private String titulo, autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor:" + this.getAutor());
        System.out.println("Disponivel: " + this.getDisponivel());
    }

}
