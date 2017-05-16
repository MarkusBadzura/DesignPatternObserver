package designpatternobserver;

/**
 * Beispiel des Beobachtermusters
 * @author Markus Badzura
 */
public class Client {
 
	public static void main(String[] args) {
 
		// Erzeugung der Subjekte
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();
                KonkretesSubjekt konkretesSubjekt1 = new KonkretesSubjekt();
 
		// Erzeugung des Beobachters. Dabei wird
		// das jeweilige Subjekt übergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = 
                        new KonkreterBeobachter(konkretesSubjekt);
                KonkreterBeobachter konkreterBeobachter1 = 
                        new KonkreterBeobachter(konkretesSubjekt1);
                KonkreterBeobachter1 konkreterBeobachter2 = 
                        new KonkreterBeobachter1(konkretesSubjekt);
 
		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter, welche das jeweilige Subjekt
                // beobachten
		konkretesSubjekt.setStatus(1);
                konkretesSubjekt1.setStatus(3);
	}
}
