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
//  <b>Clean Code: Funktionen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Clean Code Funktionen.java -->
// <!-- slides/module_230_clean_code/topic_140_functions.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// // Clean Code: Funktionen
//
// Verpacke Sinnvolle Operationen als sorgfältig benannte Funktionen
//
// - Besser lesbar
// - Einfacher zu testen
// - Wird eher wiederverwendet
// - Fehler sind weniger wahrscheinlich

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Die 1. Clean Code Regel für Funktionen
//
// - Funktionen sollten kurz sein
// - Kürzer als man meint!
// - Maximal 4 Zeilen!

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Weniger strikte Regeln
//
// (Aus den C++ Core Guidelines)
//
// - Funktionen sollten auf einen Bildschirm passen
// - Große Funktionen sollten in kleinere, zusammenhängende und benannte
//   Funktionen aufgeteilt werden
// - Funktionen mit einer bis fünf Zeilen sollten als normal angesehen werden

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Konzentration auf eine Aufgabe
//
// - Funktionen sollten eine Aufgabe erfüllen ("do one thing")
// - Sie sollten diese Aufgabe gut erfüllen
// - Sie sollten nur diese Aufgabe erfüllen

// %% tags=["keep"]
public int computeSaveAndPrintResults(int a, int b, List<Integer> results) {
        int newResult = a + b;  // Complex computation...
        results.add(newResult);
        for (int result : results) {
            System.out.println(result);
        }
        return newResult;
}

// %% tags=["keep"]
List myResults = new ArrayList<Integer>(Arrays.asList(12, 43));
int newResult = computeSaveAndPrintResults(2, 4, myResults);
System.out.println(myResults);


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public int computeResult(int a, int b) {
    return a + b;
}


// %% tags=["keep"]
public void saveResult(int newResult, List<Integer> results) {
    results.add(newResult);
}


// %% tags=["keep"]
public void printResults(List<Integer> results) {
    for (int result : results) {
        System.out.println(result);
    }
}


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
// Better but still sketchy (see later for further refinement):
public void processNewSensorData(int a, int b, List<Integer> results) {
    int newResult = computeResult(a, b);
    saveResult(newResult, results);
    printResults(results);
}

// %% tags=["keep"]
List<Integer> yourResults = new ArrayList<>(Arrays.asList(12, 43));
processNewSensorData(2, 4, yourResults);
System.out.println(yourResults);

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Abstraktionsebenen
//
// Alles, was die Funktion in ihrem Rumpf tut, sollte eine (und nur eine)
// Abstraktionsebene unterhalb der Funktion selbst sein.

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## "Um zu"-Absätze: Kontrolle der Abstraktionsebenen
//
// Um `render_page_with_setups_and_teardowns()` durchzuführen
//
// prüfen wir, ob die Seite eine Testseite ist und
//
// wenn ja, binden wir Setup- und Teardown-Elemente ein.
//
// In jedem Fall rendern wir die Seite in HTML.

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Die Step-Down-Regel
//
// - Wir wollen, dass sich der Code wie eine Erzählung von oben nach unten liest
// - Auf jede Funktion sollten die Funktionen eine Abstraktionsebene darunter
//   folgen
