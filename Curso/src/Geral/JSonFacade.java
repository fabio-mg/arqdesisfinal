package Geral;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import TO.CursoTO;


public class JSonFacade {
	
	
	public static String listToJSon(List<CursoTO> list) {
		JSONArray vetor = new JSONArray();
		
		for (CursoTO to : list) {
			JSONObject object = new JSONObject();
			
			try {
				object.put("id", to.getIdCurso());
				object.put("nome", to.getNome());
				object.put("detalhe", to.getDetalhe());
				vetor.put(object);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return vetor.toString();
	}
}
