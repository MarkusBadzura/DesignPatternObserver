package designpatternobserver;

/**
 * Beispiel des Beobachtermusters
 * @author Markus Badzura
 */
public class KonkreterBeobachter1 implements Beobachter {
 
	private KonkretesSubjekt konkretesSubjekt;
        
        /**
         * Anmelden am Subjekt
         * @param konkretesSubjekt 
         */
        @SuppressWarnings("LeakingThisInConstructor")
	public KonkreterBeobachter1(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
 
		// Durchführung der Registrierung beim übergebenen Subjekt
		this.konkretesSubjekt.addBeobachter(this);
	}
 
        /**
         * Abfrage des des Statuswertes nach Benachrichtigung
         */        
	@Override
	public void update() {
		int newState = konkretesSubjekt.getStatus();
		System.out.println("KonkreterBeobachter1" + " - State: "+newState);
	} 
}