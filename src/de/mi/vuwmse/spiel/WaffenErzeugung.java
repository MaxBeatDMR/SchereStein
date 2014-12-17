package de.mi.vuwmse.spiel;
/**
 * @author Max
 * Waffenfabrik! Klasse erzeugt die zur Verfügung stehenden Waffen mit 
 * den entsprechenden Eigenschaften
 */
public class WaffenErzeugung {
    public static Waffe create(WaffenTyp typ){
        switch(typ){
        case Schere:
            return new Waffe(WaffenTyp.Schere,WaffenTyp.Echse,WaffenTyp.Papier,WaffenTyp.Stein,WaffenTyp.Spock);
        case Stein:
            return new Waffe(WaffenTyp.Stein,WaffenTyp.Schere,WaffenTyp.Echse,WaffenTyp.Spock,WaffenTyp.Papier);
        case Papier:
            return new Waffe(WaffenTyp.Papier,WaffenTyp.Stein,WaffenTyp.Spock,WaffenTyp.Echse,WaffenTyp.Schere);
        case Echse:
            return new Waffe(WaffenTyp.Echse,WaffenTyp.Papier,WaffenTyp.Spock,WaffenTyp.Stein,WaffenTyp.Schere);
        case Spock:
            return new Waffe(WaffenTyp.Spock,WaffenTyp.Stein,WaffenTyp.Schere,WaffenTyp.Papier,WaffenTyp.Echse);
        default:
            return null;
        }
    }
}
