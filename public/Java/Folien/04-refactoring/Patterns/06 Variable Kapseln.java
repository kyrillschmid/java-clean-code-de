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
//  <b>Variable Kapseln</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 06 Variable Kapseln.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_encapsulate_variable.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Kapseln von Variablen" besteht darin, den Zugriff und die Aktualisierung einer Variable über Funktionen zu steuern, um die Wartbarkeit und Flexibilität des Codes zu verbessern. Dies ermöglicht es, Änderungen an der Variable besser zu überwachen und Validierung oder zusätzliche Logik bei Aktualisierungen hinzuzufügen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Daten sind schwerer zu manipulieren als Funktionen, besonders wenn der Zugriff auf die Daten breit gestreut ist. Durch das Kapseln von Variablen können Änderungen an Daten auf die einfachere Aufgabe der Umorganisation von Funktionen reduziert werden. Das Kapseln von Daten ist auch wertvoll für das Hinzufügen von Validierung oder Logik bei Aktualisierungen und das Reduzieren der Kopplung von weit verbreiteten Daten. Bei Objektorientierung liegt der Schwerpunkt auf der Privatsphäre der Daten eines Objekts, weshalb das Kapseln von Variablen eine wichtige Praktik ist.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Erstellen Sie kapselnde Funktionen, um auf die Variable zuzugreifen und sie zu aktualisieren.
// - Führen Sie statische Überprüfungen durch.
// - Ersetzen Sie für jede Referenz auf die Variable den Zugriff durch einen Aufruf der entsprechenden kapselnden Funktion. Testen Sie nach jeder Ersetzung.
// - Beschränken Sie die Sichtbarkeit der Variable.
// - Manchmal ist es nicht möglich, den Zugriff auf die Variable zu verhindern. In diesem Fall kann es nützlich sein, verbleibende Referenzen durch Umbenennen der Variable und Testen zu erkennen.
// - Testen Sie den Code.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class Person {
    public String name;
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
Person somePerson = new Person();
// Zugriff auf die Variable
String personName = somePerson.name;

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
Person somePerson = new Person();
// Zugriff auf die Variable über kapselnde Funktionen
String personName = somePerson.getName();
