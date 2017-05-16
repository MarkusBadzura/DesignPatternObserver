package designpatternobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Beispiel des Beobachtermusters
 * @author Markus Badzura
 */
public class KonkretesSubjekt implements Subjekt {
        // Liste für angemeldete Beobachter 
	List<Beobachter> beobachterList = new ArrayList<>();
        //Status-Variable
	int status = 0;
 
        /**
         * Beobachter zur Liste hinzufügen
         * @param beobachter 
         */
	@Override
	public void addBeobachter(Beobachter beobachter) {
		this.beobachterList.add(beobachter);
	}
        
        /**
         * Beobachter aus Liste entfernen
         * @param beobachter 
         */
	@Override
	public void removeBeobachter(Beobachter beobachter) {
		this.beobachterList.remove(beobachter);
	}
 
        /**
         * Alle Beobachter des konkretenSubjektes benachrichtigen
         */
	@Override
	public void benachrichtigeBeobachter() {
            beobachterList.forEach((beobachter) -> {beobachter.update();
            });
	}
 
        /**
         * Rückgabe Statuswert
         * @return status
         */
	public int getStatus() {
		return status;
	}
        
        /**
         * Statuswert setzen
         * @param status 
         */
	public void setStatus(int status) {
		this.status = status;
		this.benachrichtigeBeobachter();
	}
}
