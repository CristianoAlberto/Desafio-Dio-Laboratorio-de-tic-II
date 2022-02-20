package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int carga_horaria;

    @Override
    public double calcularxp() {
        return XP_PADRAO*carga_horaria;
    }

    public Curso() {
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", carga_horaria=" + carga_horaria +
                '}';
    }
}
