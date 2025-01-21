public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicado;
    private int nPaginas;
    private boolean dispo;

    public Livro(String titulo, String autor, int anoPublicado, int nPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.nPaginas = nPaginas;
        this.dispo = true;
    }

    public String getTitulo(){
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

    public int getAnoPublicado() {
        return anoPublicado;
    }
    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public int getnPaginas() {
        return nPaginas;
    }
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public boolean isDispo() {
        return dispo;
    }
    public void setDispo(boolean dispo){
        this.dispo = dispo;
    }

    public void emprestar() {
        this.dispo = false;
    }

    public void devolver() {
        this.dispo = true;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicado);
        System.out.println("Numero de Paginas: " + this.nPaginas);
        System.out.println("Disponivel: " + this.dispo);
    }

}
