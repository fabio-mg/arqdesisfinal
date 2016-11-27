package Model;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import DAO.CursoDAO;
import TO.CursoTO;

public class Curso {
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
	
	public List<CursoTO> getAllCursos() {
		List<CursoTO> list = null;
		try {
			list = new CursoDAO().getAllCursos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
