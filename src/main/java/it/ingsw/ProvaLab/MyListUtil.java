package it.ingsw.ProvaLab;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	private Comparator<Integer> c = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
		
			return o2.compareTo(o1);
		}
		
	}; 
	
	public List<Integer> ordina(List<Integer> lista, boolean cresc) {

		List<Integer> l = lista;
		if(cresc) {
			l.sort(null);
		}
		else {
			l.sort(c);
		}
		
		return l;
	}
}
