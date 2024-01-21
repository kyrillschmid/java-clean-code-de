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
//  <b>Schreiben von guten Unit-Tests</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 16 Schreiben von guten Unit-Tests.java -->
// <!-- slides/module_240_unit_testing/topic_160_writing_unit_tests.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Welche Form hat ein Unit Test?
// - Arrange
// - Act
// - Assert

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
// %maven org.junit.jupiter:junit-jupiter-api:5.8.2
import static org.junit.jupiter.api.Assertions.assertEquals;

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public void testTheAddAllMethodOfArrayList() {
    List<Integer> x = new ArrayList<>(Arrays.asList(1, 2, 3)); // arrange
    List<Integer> y = Arrays.asList(10, 20);

    x.addAll(y); // act

    assertEquals(x, Arrays.asList(1, 2, 3, 10, 20)); // assert
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
testTheAddAllMethodOfArrayList();

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Wie finden wir gute Tests?

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Versuch: Erschöpfendes Testen
//
// - Wir schreiben erschöpfende Tests, d.h. Tests, die alle möglichen Eingaben eines
//   Programms abdecken

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// - Erschöpfendes Testen ist nicht möglich
// - Beispiel Passworteingabe:
//   - Angenommen, Passwörter mit maximal 20 Zeichen sind zulässig,
//     80 Eingabezeichen sind erlaubt (große und kleine Buchstaben, Sonderzeichen)
//   - Das ergibt $80^{20}$ = 115.292.150.460.684.697.600.000.000.000.000.000.000
//     mögliche Eingaben
//   - Bei 10ns für einen Test würde man ca. $10^{24}$ Jahre brauchen, um alle Eingaben
//     zu testen
//   - Das Universum ist ungefähr $1.4 \times 10^{10}$ Jahre alt

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Effektivität und Effizienz von Tests
//
// - Unit-Tests sollen effektiv und effizient sein
//   - Effektiv: Die Tests sollen so viele Fehler wie möglich finden
//   - Effizient: Wir wollen die größte Anzahl an Fehlern mit der geringsten Anzahl
//     an möglichst einfachen Tests finden
// - Effizienz ist wichtig, da Tests selbst Code sind, der gewartet werden muss und
//   Fehler enthalten kann

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Strategien zum Finden von (effektiven und effizienten) Tests
//
// - Analyse von Randwerten (Boundary Value Analysis, BVA)
// - Partitionierung
// - Zustandsbasiertes Testen
// - Kontrollflussbasiertes Testen
// - Richtlinien
// - Kenntnis häufiger Fehler in Software
// - (Kenntnis häufiger Probleme von Tests (Test Smells))


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Faustregeln für Unit-Tests
//
// - Teste Funktionalität, nicht Implementierung
// - Verwende Test-Doubles dann (aber auch nur dann), wenn eine Abhängigkeit
//   "eine Rakete abfeuert"
// - Bevorzuge Tests von Werten gegenüber Tests von Zuständen
// - Bevorzuge Tests von Zuständen gegenüber Tests von Verhalten
// - Teste kleine Einheiten
// - (Diese Regeln setzen voraus, dass der Code solche Tests erlaubt)

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Teste Funktionalität, nicht Implementierung
//
// Abstrahiere so weit wie möglich von Implementierungsdetails
// - Auch auf Unit-Test Ebene
// - Oft testen sich verschiedene Methoden gegenseitig
// - Dies erfordert manchmal die Einführung von zusätzlichen Methoden
//     - Diese Methoden sind oft nicht nur für Tests sinnvoll
//     - Oft "abstrakter Zustand" von Objekten
//     - **Nicht:** konkreten Zustand öffentlich machen

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Teste Funktionalität, nicht Implementierung
//
// **Warum?**
// - Funktionalität ist leichter zu verstehen
// - Funktionalität ist stabiler als Implementierung
// - Funktionalität entspricht eher dem Kundennutzen

// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public class Stack {
    public List<Object> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(Object newItem) {
        items.add(newItem);
    }

    public Object pop() {
        if (items.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }
}


// %% tags=["keep"]
// arange
Stack myStack = new Stack();

// %% tags=["keep"]
// act
myStack.push(1);

// %% tags=["keep"]
// assert
assertEquals(myStack.items, Arrays.asList(1)); // Whats the problem here?


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public class Stack {
    private List<Object> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public int size() {
        return items.size();
    }

    public void push(Object newItem) {
        items.add(newItem);
    }

    public Object pop() {
        if (items.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }
}


// %% tags=["keep"]
Stack myStack = new Stack();
myStack.push(5)

// %% tags=["keep"]
assertEquals(myStack.size(), 1);
assertEquals(myStack.pop(), 5);


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Test Doubles
//
// - Test Doubles: Stubs, Fakes, Spies, Mocks
// - Ersetzen eine Abhängigkeit im System durch eine vereinfachte Version
//   - z.B. Ersetzen einer Datenbankabfrage durch einen fixen Wert
// - Test Doubles sind wichtig zum Vereinfachen von Tests
// - Aber: zu viele oder komplexe Test Doubles machen Tests unübersichtlich
//   - Was wird von einem Test eigentlich getestet?


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Typischer Einsatz von Test Doubles
//
// - Zugriff auf Datenbank, Dateisystem
// - Zeit, Zufallswerte
// - Nichtdeterminismus
// - Verborgener Zustand (`AdderSpy`)

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Werte > Zustand > Verhalten
//
// - Verständlicher
// - Leichter zu testen
// - Oft stabiler gegenüber Refactorings
//
// Ausnahme: Testen von Protokollen


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Wert

// %%
public int add(int x, int y) {
    return x + y;
}


// %%
assertEquals(add(2, 3), 5);


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Zustand

// %%
public class Adder {
    public int result;

    public Adder(int x, int y) {
        this.result = x + y;
    }
}


// %%
Adder myAdder = new Adder(2, 3);
assertEquals(myAdder.result, 5);


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Verhalten

// %%
import java.util.function.BiFunction;
public static String callAdd(BiFunction<Integer, Integer, Integer> add) {
        int hiddenResult = add.apply(2, 3);
        // Presumably do something with hiddenResult...
        return "How do you test that add was called?";
}


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class AdderSpy implements BiFunction<Integer, Integer, Integer> {
    private boolean wasCalled;
    private int result;

    public AdderSpy() {
        this.wasCalled = false;
        this.result = 0;
    }

    @Override
    public Integer apply(Integer x, Integer y) {
        this.wasCalled = true;
        this.result = x + y;
        return this.result;
    }

    public boolean wasCalled() {
        return wasCalled;
    }

    public int getResult() {
        return result;
    }
}


// %%
AdderSpy spy = new AdderSpy();
assertEquals(!spy.wasCalled(), true);

// %%
assertEquals(spy.apply(2, 3), 5);

// %%
assertEquals(spy.wasCalled(), true);
assertEquals(spy.getResult(), 5);

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
AdderSpy adderSpy = new AdderSpy();
callAdd(adderSpy);
assertEquals(adderSpy.wasCalled(), true);
assertEquals(adderSpy.getResult(), 5);

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Teste kleine Einheiten (bei Unit-Tests)
// - Test von kleinen Einheiten
//   - spezifizieren das Verhalten der getesteten Einheit besser
//   - erleichtern die Lokalisierung von Fehlern
//   - sind leichter zu pflegen
// - Tests größerer Einheiten oder des Gesamtsystems sind wichtig als
//   - Integrationstests
//   - Systemtests
//   - Akzeptanztests

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Wie schreibt man testbaren Code?
//
// - Keine globalen oder statischen Daten
// - Techniken aus der funktionalen Programmierung (Iterables, Higher-order Funktionen,
//   etc.)
// - Funktionale Datenstrukturen (Immutability)
// - Gutes objektorientiertes Design
//   - Hohe Kohärenz
//   - Geringe Kopplung, Management von Abhängigkeiten
// - Etc.
//
// Hilfsmittel: Test-Driven Development


// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Mini-Workshop: Tests für die Einkaufslisten-Implementierung
//
// Fügen Sie zur Implementierung einer Einkaufsliste in `examples/ShoppingListPytestSK`
// geeignete Unit-Tests hinzu.
//
// (Falls Sie die Einkaufsliste in einem vorherigen Workshop bereits implementiert haben,
// ist es besser, Sie verwenden stattdessen Ihre eigene Implementierung.)
