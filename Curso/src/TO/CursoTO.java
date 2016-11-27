package TO;

import java.math.BigDecimal;
import java.util.Calendar;

public class CursoTO {
	private int idCurso;
    private String nome;
    private String detalhe;


    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhe() {
        return this.detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getFoto() {
        return "curso_" + Integer.toString(idCurso);
    }
}
