package avaliacao;

import java.util.ArrayList;

public class questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("jeremias");
		list.add("é");
		list.add("o");
		list.add("cara");
		
		String tudo = frase(list);
		System.out.println(tudo);
		
		
		
	}
	public static String frase(ArrayList<String> list) {
		String tudo="";
		int x = list.size();
		String tudo1="";
		for(int i =0 ; i<=x-1;i++) {
			tudo1 += list.get(i);
		}
		return tudo1;
	}
	
}
