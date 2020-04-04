package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gerador {
	private String[] caracteresEspeciais = {"!","@","#","$","%","&","*","(",")","-","+","=",",",".",";",":","{","}","[","]","/","\\","?","|"};
	private String[] letrasMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	private String[] letrasMaiusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private String[] algarismos = {"0","1","2","3","4","5","6","7","8","9"};
	
	public String geradorDeSenhas(int quantCaracteres,boolean caracEspe, boolean minusculas, boolean maiusculas, boolean algarismo) {
		String senha = "";
		List<String> mapaCaracteres = new ArrayList<String>();
			if(caracEspe) {
				for (int i = 0; i<caracteresEspeciais.length;i++) {
					mapaCaracteres.add(caracteresEspeciais[i]);
				}
			}
			if(minusculas) {
				for (int i = 0; i<letrasMinusculas.length;i++) {
					mapaCaracteres.add(letrasMinusculas[i]);
				}
			}
			if(maiusculas) {
				for (int i = 0; i<letrasMaiusculas.length;i++) {
					mapaCaracteres.add(letrasMaiusculas[i]);
				}
			}
			if(algarismo) {
				for (int i = 0; i<algarismos.length;i++) {
					mapaCaracteres.add(algarismos[i]);
				}
			}
			
			for (int i = 0; i<quantCaracteres;i++) {
				Random r = new Random();
				int n = r.nextInt(mapaCaracteres.size()-1);
				senha = senha + mapaCaracteres.get(n);
			}
			
		
		return senha;
		
		
	}
}
