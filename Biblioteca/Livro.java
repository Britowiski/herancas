class Livro extends Biblioteca {
    int numPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
    }

    public Livro(){

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Páginas: " + numPaginas);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public int getAnoPublicacao() {
        return super.getAnoPublicacao();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public void setAnoPublicacao(int anoPublicacao) {
        super.setAnoPublicacao(anoPublicacao);
    }

    @Override
    public void setTitulo() {
        super.setTitulo();
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
