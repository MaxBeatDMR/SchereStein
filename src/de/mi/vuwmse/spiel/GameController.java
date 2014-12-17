package de.mi.vuwmse.spiel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Max 
 * Klasse steuert den Spielablaul und stellt die nötigen Methoden
 * zum Starten des Spiels zur Verfügung
 */
public class GameController {
	private GameView view;
	static GameController controller = new GameController();

	public GameController() {
		super();
		view = new GameView();
	}

	public void starteSpiel() {
		while (true) {
			Waffe spielerWaffe = spielerWaffenWahl();
			Waffe computerWaffe = kiWaffenWahl();

			Ergebnisse kampf = spielerWaffe
					.ermittleRundenausgang(computerWaffe);
			view.ausgangKampf(kampf);
		}
	}

	private Waffe kiWaffenWahl() {
		int Zufall = (int) (Math.random() * 5);
		switch (Zufall) {
		case 0:
			System.out.println("Dein Gegner wählt einen rostige Schere");
			return WaffenErzeugung.create(WaffenTyp.Schere);
		case 1:
			System.out.println("Dein Gegner wählt einen riesigen Stein");
			return WaffenErzeugung.create(WaffenTyp.Stein);
		case 2:
			System.out
					.println("Dein Gegner greift zu einer alten mystischen Pergamentrolle");
			return WaffenErzeugung.create(WaffenTyp.Papier);
		case 3:
			System.out
					.println("Dein Gegner schickt eine furchteinflößende Echse in den Kampf");
			return WaffenErzeugung.create(WaffenTyp.Echse);
		case 4:
			System.out.println("Dein Gegner schickt Spock in den Kampf");
			return WaffenErzeugung.create(WaffenTyp.Spock);
		}
		return null;
	}

	private Waffe spielerWaffenWahl() {
		try {
			System.out.println("Welche Waffe wählst du?:");
			System.out.println("1) Schere");
			System.out.println("2) Stein");
			System.out.println("3) Papier");
			System.out.println("4) Echse");
			System.out.println("5) Spock");
			System.out.print("Deine Eingabe: ");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			int eingabe = Integer.parseInt(reader.readLine());

			if (eingabe < 1) {
				System.out.println("Eingabe zu klein");
				System.out.println("Automatische Zuweisung: Schere");

				eingabe = 1;
			} else if (eingabe > 5) {
				System.out.println("Eingabe zu groß");
				System.out.println("Automatische Zuweisung: Spock");

				eingabe = 5;
			}

			switch (eingabe) {
			case 1:
				System.out.println("Du wählst die rostige Schere");
				return WaffenErzeugung.create(WaffenTyp.Schere);
			case 2:
				System.out.println("Du wählst den riesigen Stein");

				return WaffenErzeugung.create(WaffenTyp.Stein);
			case 3:
				System.out
						.println("Du greifst zu einer alten mystischen Pergamentrolle");

				return WaffenErzeugung.create(WaffenTyp.Papier);
			case 4:
				System.out
						.println("Du schickst eine furchteinflößende Echse in den Kampf");

				return WaffenErzeugung.create(WaffenTyp.Echse);
			case 5:
				System.out.println("Du schickst Spock in den Kampf");

				return WaffenErzeugung.create(WaffenTyp.Spock);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		catch (NumberFormatException nfe)

		{
			System.out.println("Nur Zahlen eingeben!");
			main(null);

		}

		return null;
	}

	public static void main(String[] args) {
		controller.intro();
	}

	private void intro() {
		GameView.zeigeIntro();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int eingabeIntro = Integer.parseInt(reader.readLine());

			if (eingabeIntro == 0) {
				GameView.zeigeRegeln();
				controller.starteSpiel();
			} else if (eingabeIntro == 1) {
				controller.starteSpiel();

			} else {

			}
		}

		catch (NumberFormatException nfe) {
			System.out.println("Nur Zahlen eingeben!");
			main(null);
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
