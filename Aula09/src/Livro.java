public class Livro implements Publicacao {
    private Pessoa leitor;
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public String detalhes() {
        return "Leitor: " + leitor.getNome() + "\nIdade: " + leitor.getIdade()
                + "\nSexo: " + leitor.getSexo() + "\nLivro: "
                + this.getTitulo() +  "\nAutor: " + this.getAutor()
                + "\nPaginas: " + this.getTotPaginas() + "\nPagina Atual: "
                + this.getPagAtual() + "\nAberto: " + this.getAberto();
    }

    public Livro (String titulo, Pessoa leitor, String autor, int totPaginas) {
        this.titulo = titulo;
        this.leitor = leitor;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
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

    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avanacarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
