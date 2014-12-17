package de.mi.vuwmse.spiel;

 
public class GameView {
  
 
    public void ausgangKampf(Ergebnisse kampf) {
        switch(kampf){
        case Sieg:
            System.out.println("Du hast den Kampf gewonnen");
            break;
        case Niederlage:
            System.out.println("Du hast den Kampf verloren");
            break;
        case Unentschieden:
            System.out.println("Du und dein Gegner seid gleich stark");
            break;
        }
    }
    
    public static void zeigeIntro(){
    	System.out.println("Willkommen zu Schere Stein Papier Echse Spock!!!");
        System.out.println("Du kämpfst in diesem rundenbasierten Action-Adventure gegen gemeine Gegner!");
        System.out.println("Bist du bereit für den Kampf? Oder willst du erst die Regeln studieren?");
        System.out.println("0) Regeln");
        System.out.println("1) Ziehe in den Kampf!");
    }
    
    public static void zeigeRegeln(){
    	System.out.println("1. Schere schneidet Papier");
        System.out.println("2. Papier umhüllt Stein");
        System.out.println("3. Stein zerquetscht Echse");
        System.out.println("4. Echse vergiftet Spock");
        System.out.println("5. Spock zerschlägt Schere");
        System.out.println("6. Schere schneidet Echse");
        System.out.println("7. Echse frisst Papier");
        System.out.println("8. Papier entlässt Spock");
        System.out.println("9. Spock vaporisiert Stein");
        System.out.println("10. Stein schleift Schere");
        System.out.println("Alles verstanden? Dann ab in den Kampf!");
    }
    
}