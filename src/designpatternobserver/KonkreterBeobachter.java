package designpatternobserver;

/**
 * Beispiel des Beobachtermusters
 * @author Markus Badzura
 */ 
public class KonkreterBeobachter implements Beobachter {
 
	private KonkretesSubjekt konkretesSubjekt;
 
        /**
         * Anmelden am Subjekt
         * @param konkretesSubjekt 
         */
        @SuppressWarnings("LeakingThisInConstructor")
	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
		this.konkretesSubjekt.addBeobachter(this);
	}
 
        /**
         * Abfrage des des Statuswertes nach Benachrichtigung
         */
	@Override
	public void update() {
		int newState = konkretesSubjekt.getStatus();
		System.out.println("Konkreter Beobachter - State: "+newState);
	} 
}
