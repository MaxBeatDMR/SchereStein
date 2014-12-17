package de.mi.vuwmse.spiel;

/**
 * @author Max 
 * Auswertung der einzelnen KŠmpfe durch Vergleich der Eigenschaften
 */
public class Waffe {
	private WaffenTyp name;

	private WaffenTyp staerke1;
	private WaffenTyp staerke2;
	private WaffenTyp schwaeche1;
	private WaffenTyp schwaeche2;

	public Ergebnisse ermittleRundenausgang(Waffe gegner) {
		if (gegner.getName().equals(staerke1)
				|| gegner.getName().equals(staerke2)) {
			return Ergebnisse.Sieg;
		} else if (gegner.getName().equals(schwaeche1)
				|| gegner.getName().equals(schwaeche2)) {
			return Ergebnisse.Niederlage;
		}

		return Ergebnisse.Unentschieden;
	}

	public Waffe(WaffenTyp name, WaffenTyp staerke1, WaffenTyp staerke2,
			WaffenTyp schwaeche1, WaffenTyp schwaeche2) {
		super();
		this.setName(name);
		this.setStaerke1(staerke1);
		this.setStaerke2(staerke2);

		this.setSchwaeche1(schwaeche1);
		this.setSchwaeche2(schwaeche2);

	}

	public WaffenTyp getName() {
		return name;
	}


	public void setName(WaffenTyp name) {
		this.name = name;
	}

	public void setStaerke1(WaffenTyp staerke1) {
		this.staerke1 = staerke1;

	}

	public void setSchwaeche1(WaffenTyp schwaeche1) {
		this.schwaeche1 = schwaeche1;
	}

	public void setStaerke2(WaffenTyp staerke2) {
		this.staerke2 = staerke2;
	}

	public void setSchwaeche2(WaffenTyp schwaeche2) {
		this.schwaeche2 = schwaeche2;
	}

}
