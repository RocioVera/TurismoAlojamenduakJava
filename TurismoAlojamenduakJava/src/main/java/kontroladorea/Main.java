package kontroladorea;

import ikuspegia.P1;

public class Main {

	public static void main(String[] args) {
		//*****
		MenuKontroladorea menuKontroladorea = new MenuKontroladorea();
		P1 p1 = new P1();
		//*****
		menuKontroladorea.nireP1(p1);
		p1.nireMenukontroladorea(menuKontroladorea);
		
		//RUN
		p1.setVisible(true);
		
		
		
	}
	
	


}
