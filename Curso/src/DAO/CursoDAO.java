package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Geral.ConnectionFactory;
import TO.CursoTO;

public class CursoDAO {
	
	public List<CursoTO> getAllCursos() throws SQLException {
		
		List<CursoTO> list = new ArrayList<CursoTO>();
		String sqlStr = " SELECT * FROM CURSO ";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
			 PreparedStatement stm = conn.prepareStatement(sqlStr);) {

			try (ResultSet rs = stm.executeQuery();) {
				
				while (rs.next()) {
					CursoTO to = new CursoTO();
					
					to.setIdCurso(rs.getInt("ID"));
					to.setNome(rs.getString("NOME"));
					to.setDetalhe(rs.getString("DETALHE"));
					
					
					list.add(to);
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}				
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		
		return list;
	}
}
