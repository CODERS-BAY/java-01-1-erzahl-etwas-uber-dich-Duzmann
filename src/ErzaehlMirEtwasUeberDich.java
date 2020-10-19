public class ErzaehlMirEtwasUeberDich {
    public static void main(String[] args) {

/* Aufgabe 1.1 - Erzähl mir etwas über dich
Deklariere Variablen für dein Alter, deinen Vornamen, dein Geschlecht,
deinen Nachnamen, dein Geburtsdatum, deinen Notendurchschnitt und dafür
ob du verheiratet bist oder nicht. Überleg dir gut welchen Datentyp du
für welche Variablen am besten verwenden solltest.

Gib alle Variablen mit System.out.println auf der Konsole aus.*/

        // Variablen

        int Alter;
        String Vorname, Nachname, Geschlecht, GeburtsDatum;
        boolean Verheiratet;
        double Notendurchschnitt, Note1, Note2, Note3;

        // Werte zuweisen

        Alter = 42;
        Vorname = "Karim";
        Nachname = "Zuderell";
        Geschlecht = "Männlich";
        GeburtsDatum = "10.02.1978";
        Verheiratet = false;
        Note1 = 4;
        Note2 = 5;
        Note3 = 1;
        Notendurchschnitt = (Note1 + Note2 + Note3) / 3;

        // Ausgabe

        System.out.println("Datenblatt " + Vorname + " " + Nachname);
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Geburtsdatum: " + GeburtsDatum);
        System.out.println("Geschlecht: " + Geschlecht);
        System.out.print("Familienstand: ");
        if (Verheiratet == true) System.out.println("Verheiratet");
        else System.out.println("Ledig");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");

    }
}
