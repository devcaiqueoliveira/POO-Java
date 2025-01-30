public class Aluno extends Pessoa{
    private int mat;
    private String curso;

    public void cancelarMat() {
        System.out.println("Matricula cancelada");
    }

    public int getMat() {
        return this.mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
