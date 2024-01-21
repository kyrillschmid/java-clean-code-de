// -*- coding: utf-8 -*-
// ---
// jupyter:
//   jupytext:
//     text_representation:
//       extension: .java
//       format_name: percent
//       format_version: '1.3'
//       jupytext_version: 1.15.2
//   kernelspec:
//     display_name: Java
//     language: java
//     name: java
// ---

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// <div style="text-align:center; font-size:200%;">
//  <b>Strategien zum Finden von Tests</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 17 Strategien zum Finden von Tests.java -->
// <!-- slides/module_240_unit_testing/topic_180_strategies_for_finding_tests.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// // Strategien zum Finden von Tests
//
// - Strategien zum Finden von Tests
// - Analyse von Randwerten (Boundary Value Analysis, BVA)
// - Partitionierung
// - Zustandsbasiertes Testen
// - Kontrollflussbasiertes Testen
// - Richtlinien
// - Kenntnis häufiger Fehler
// - (Kenntnis häufiger Probleme von Tests (Test Smells))


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Boundary Value Analysis
//
// - Viele Fehler treten am "Rand" des Definitionsbereichs von Funktionen
//   oder Prozeduren auf
// - Eine gute Strategie zum effizienten Testen ist es daher, derartige
//   Randwerte zu betrachten
//   - Der/die letzten gültigen Werte
//   - Werte, die gerade außerhalb des Definitionsbereichs liegen
// - Ist z.B. eine Funktion für ganzzahlige Werte zwischen 0 und 5
//   definiert, so kann sie mit Eingaben -1, 0, 5, 6 getestet werden


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Boundary Value Analysis
//
// ##// Vorteil:
//
// - Man konzentriert sich auf empirisch häufige Fehlerquellen
//
// ##// Schwierigkeiten:
//
// - Bei vielen Bereichen ist nicht klar, was "Randwerte" sind
//   - (Allerdings lassen sich oft alternative Kriterien finden, z.B.
//     Länge von Collection-Argumenten)
// - Werte außerhalb des Definitionsbereichs können manchmal zu undefiniertem
//   Verhalten führen
// - Bei Funktionen mit vielen Parametern gibt es eine kombinatorische
//   Explosion von Randwerten

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Merkregel für (erweiterte) BVA: CORRECT
//
// - **Conformance:** Entspricht der Wert einem erwarteten Format?
// - **Ordering:** Sind die möglichen Werte geordnet oder ungeordnet?
// - **Range:** Hat der Wert einen minimalen und/oder maximalen Wert?
// - **Reference:** Hat der Code externe Referenzen, die nicht unter seiner Kontrolle
//   sind?
// - **Exist:** Existiert der Wert (ist er nicht null, in einer vorgegebenen Menge
//   enthalten, ...)
// - **Cardinality:** Sind genug Werte vorhanden? Sind zu viele Werte vorhanden?
// - **Time:** Sind die Werte zum benötigten Zeitpunkt verfügbar?
//   In der erwarteten Reihenfolge?

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Partitionierung
// - Argumente von Funktionen, Ein/Ausgabe des Programms und Zustände
//   von Klassen können oft in Äquivalenzklassen unterteilt werden, sodass…
//   - Das Verhalten für Elemente aus der gleichen Äquivalenzklasse ähnlich
//     ist (z.B. den gleichen Kontrollflusspfad nimmt)
//   - Elemente aus unterschiedlichen Klassen verschiedenes Verhalten zeigen
//   - Beispiel: Die Argumente der sqrt-Funktion können unterteilt werden in
//       - Positive Zahlen und 0
//       - Negative Zahlen
//   - Eine feinere Unterteilung wäre zusätzlich in Quadratzahlen und Nicht-Quadratzahlen
// - Eine derartige Äquivalenzklasse heißt Partition (oder Domäne)


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Partitionierung
//
// Finde Partitionen für das getestete Element und teste die folgenden Elemente:
//
// - Einen Wert aus der "Mitte" der Partition
// - Einen Wert auf oder nahe jeder Partitionsgrenze
//
// Häufig findet man Partitionen durch BVA.
//
// Beispiel: Um die Quadratwurzelfunktion zu testen, schreibe Tests für:
// - `sqrt(0.0)`
// - `sqrt(2.0)`
// - `sqrt(-2.0)`

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Zustandsbasiertes Testen
//
// Kann man das Verhalten eines Objekts durch ein Zustandsdiagramm beschreiben, so kann
// man sich beim Testen an den Zuständen und Transitionen orientieren
//
// - Ein zustandsbasierter Test wird durch eine Folge von Events beschrieben,
//   die die Zustandsmaschine steuern
// - Die erwarteten Ergebnisse sind
//   - die Zustände (falls beobachtbar) und
//   - die Aktivitäten bzw. Ausgaben, die durch die Eingabe-Events verursacht werden
// - Es gibt verschiedene Methoden, um fehlerhafte Aktivitäten bzw. Ausgaben und
//   falsche Zustandsübergänge zu finden (z.B. Transition Tour, Distinguishing Sequence)

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Kontrollflussbasiertes Testen
//
// - Der Kontrollfluss-Graph (CFG) eines Programms ist ein gerichteter
//   Graph, der die Kontrollstruktur eines Programms repräsentiert
//   - Knoten sind Basic Blocks (lineare Folgen von Anweisungen)
//   - Kanten repräsentieren mögliche Programmabläufe
// - Fallunterscheidungen: Knoten mit mehreren Nachfolgern
// - Schleifen im Programm führen zu Schleifen im CFG


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public void controlFlow(int x) {
    if (x == 0) {
        System.out.println("x == 0");
        System.out.println("This is interesting.");
    } else {
        System.out.println("x !== 0");
        System.out.println("The boring case.");
    }
    System.out.println("Done.");
}


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Mit dem CFG kann man verschiedene Maße für die "Testabdeckung" des Programms
// definieren:
//
// - Anweisungsüberdeckung (Statement Coverage): Der Prozentsatz and Programmanweisungen
//   (Knoten im CFG), der durch die Tests abgedeckt wird. Eine Test-Suite hat 100%
//   Anweisungsüberdeckung, wenn jede Programmanweisung durch mindestens einen Test
//   abgedeckt wird
// - Entscheidungsüberdeckung (Branch Coverage, Decision Coverage): Der Prozentsatz
//   an Kanten im CFG, der von Tests abgedeckt wird. Eine Test-Suite hat 100%
//   Entscheidungsüberdeckung, wenn jede mögliche Verzweigung im Programm von einem
//   Test abgedeckt wird, d.h., wenn jede Kante im CFG von einem Test durchlaufen wird
// - 100% Entscheidungsüberdeckung impliziert 100% Anweisungsüberdeckung,
//   aber nicht umgekehrt

// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public void controlFlow2(int x) {
    if (x == 0) {
        System.out.println("x == 0");
        System.out.println("This is interesting.");
    }
    System.out.println("Done.");
}

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Richtlinien
//
// - Repräsentieren projekt- oder domänenspezifisches Wissen
// - Können erweitert werden, wenn Defekte gefunden werden, die nicht von
//   den bisherigen Tests erfasst wurden

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beispiele für Richtlinien
//
// - Schreibe Unit-Tests, die jede mögliche Fehlermeldung triggern
// - Teste jede Funktion, die einen Buffer verwendet mit einer
//   Eingabe, die größer als die maximale Buffergröße ist
// - Teste gecachte Funktionen mehrmals mit der gleichen Eingabe
//   und stelle sicher, dass sich die Ausgabe nicht ändert
// - Teste jede Funktion mit Eingaben, die außerhalb des gültigen
//   Definitionsbereichs liegen
// - Teste jede Funktion, die eine Collection als Eingabeparameter
//   hat, mit der leeren Collection und mit einelementigen Collections
// - Verwende Collections verschiedener Größen in Tests
// - Stelle sicher, dass auf Elemente von Anfang, Mitte und Ende
//   einer Collection zugegriffen wird (falls möglich)


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Einige "Häufige Fehler”
//
// - Falsche Boole’sche Bedingungen
//   - Betrachte Partitionen, die durch Bedingungen generiert werden
//   - Betrachte die Randwerte von Bedingungen
// - Nichtterminierende Berechnungen
//   - Vergessene/unvollständige Basisfälle in rekursiven Funktionen
//     (z.B. Test auf = 0 statt <= 0)
//   - Unvorhergesehenes Inkrement/Dekrement des Zählers in for- oder while-Schleifen
// - Falsche Vorbedingungen für Code
//   - Schreibe Assertions im Code, die Vorbedingungen überprüfen
//   - Schreibe Tests, die diese Assertions triggern
// - Falsche Invarianten
//   - Schreibe Funktionen, die Invarianten testen, sofern diese auf nicht-zugreifbarem
//     Zustand beruhen
//   - Schreibe Tests, die diese Funktionen verwenden


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Einige "Häufige Fehler”
//
// - Nullpointer, nicht-initialisierter Speicher
//   - Im Allgemeinen schwer durch Tests zu finden; verwende Tools wie Valgrind
//     und schalte Compilerwarnungen ein, falls verfügbar
//   - Versuche Partitionen zu finden, die Werte uninitialisiert lassen
// - Ungewöhnliche Bereiche
//   - Leere oder einelementige Collections
//   - Sehr kleine Werte (z.B. 1.0e-300)
//   - Sehr große Werte oder Collections
// - Off-by-One, Zaunpfahl-Fehler (Fencepost Errors)
//   - Teste, dass Schleifen nicht zu oft oder zu selten durchlaufen werden
//   - Verwende for-in (falls möglich)


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Einige "Häufige Fehler”
//
// - Falsche Operatorpräzedenz
//   - Überprüfe, dass Formeln auch die erwartete Bedeutung haben
//   - Versuche Partitionen zu finden, die das sicherstellen
// - Ungeeignete Algorithmen
//   - Schlechte Laufzeiteigenschaften
//   - Über-/Unterlauf für bestimmte Eingaben
// - Ungeeignete Repräsentation von Daten
//   - Gleitkommazahlen für Geldbeträge
//   - Darstellung von Werten, die nur aus Ziffern bestehen können
//     (z.B. Bankleitzahlen, Kontonummern, ISBN-Nummern) durch int-Werte
//     (führende Nullen, Länge der Repräsentation)
// - Zu wenige Werte für produktiven Einsatz, z.B. 8-bit User-ID


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Einige "Häufige Fehler” bei numerischen Berechnungen
//
// - Verwendung inexakter Repräsentationen, wo eine exakte Repräsentation nötig wäre
//   - z.B. Gleitkommazahlen für Brüche
// - Verwendung von Gleitkommazahlen mit zu geringer Präzision
// - Verwendung numerisch instabiler Algorithmen
// - Durchführung numerischer Berechnungen ohne Rücksicht auf Ordnung der Operationen
//   - Kann numerischen Fehler drastisch vergrößern

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Umfang der Unit-Tests
//
// Unit-Tests sollen die getestete Einheit möglichst komplett abdecken
//
// - Funktionen/Methoden
//   - Aufruf mit Parametern aus jeder (white-Box) Input-Partition
// - Klassen/Objekte
//   - Test aller relevanten Operationen
//   - Mindestens ein Test für jede Zustandspartition
//   - Tests für alle möglichen Zustandstransitionen
//   - Tests, die sicherstellen, dass geerbte Attribute und Operationen wie gewünscht
//     funktionieren


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// - Beispiel: Wächter in einem Spiel
// - Zustände:
//   - Patrolling
//   - Searching
//   - Fighting
//   - Dead
// - Zustandsübergänge
//   - Patrolling ↔ Searching
//   - Patrolling ↔ Fighting ("→" nur, wenn er angegriffen wird)
//   - Searching → Fighting
//   - (Any) → Dead

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Qualitätskriterien für Unit Tests: FIRST
// - **Fast:**
//   - Jeder Test benötigt höchstens einige Millisekunden Laufzeit
// - **Isolated:**
//   - Jeder Test testet eine geringe Menge an Code und ist vom Rest des Systems isoliert
//   - Tests sind voneinander isoliert, Reihenfolge der Ausführung spielt keine Rolle
// - **Repeatable:**
//   - Das Ergebnis eines Tests sollte immer identisch sein
//   - Häufige Probleme: Zeit, Datum, Threads, Random
// - **Self-Validating:**
//   - Es sollte keine externe Verifikation nötig sein (z.B. manuelle
//     Inspektion der Testausgabe)
// - **Timely:**
//   - Unit Tests sollten zusammen mit dem Code, den sie testen, erstellt werden


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Right-BICEP: Was bzw. wie soll getestet werden?
//
// - **Right**: Sind die Ergebnisse/Ausgaben des Programms korrekt?
//   - "Happy-Path Tests"
//   - Validierungstesten
// - **Boundary Conditions:** Werden Randwerte korrekt behandelt?
// - **Inverse Relationships:** Ist es sinnvoll, die inverse Beziehung zu
//   testen? (Beispiel: Quadratwurzel)
// - **Cross-Checking:** Können Ergebnisse durch "Gegenprobe" verifiziert werden?
//   (Beispiel: langsamer aber einfacher Algorithmus)
// - **Forcing Error Conditions:** Können Fehlerbedingungen erzwungen werden?
//   - "Unhappy-Path Tests"
//   – Defekttesten
// - **Performance Characteristics:** Ist die Performance der Implementierung ausreichend?
//   Skaliert die Implementierung?

