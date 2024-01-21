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
//  <b>Inline Variable</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Inline Variable.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_inline_variable.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Inline Variable-Muster besteht darin, eine lokale Variable zu entfernen und ihren Wert direkt in den entsprechenden Ausdrücken zu verwenden. Dies ist hilfreich, wenn der Variablenname keine zusätzliche Klarheit bietet oder die Variable eine Refaktorisierung des umgebenden Codes behindert.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Variablen bieten Namen für Ausdrücke innerhalb einer Funktion und sind normalerweise nützlich. Manchmal kommuniziert der Name jedoch nicht mehr als der Ausdruck selbst. In anderen Fällen kann eine Variable die Refaktorisierung des benachbarten Codes behindern. In diesen Fällen kann es nützlich sein, die Variable in den Ausdruck zu integrieren.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Überprüfen Sie, ob die rechte Seite der Zuweisung frei von Nebeneffekten ist.
// - Wenn die Variable noch nicht als unveränderlich deklariert ist, tun Sie dies und testen Sie. Dies stellt sicher, dass sie nur einmal zugewiesen wird.
// - Suchen Sie die erste Referenz auf die Variable und ersetzen Sie sie durch die rechte Seite der Zuweisung.
// - Testen Sie den Code.
// - Wiederholen Sie das Ersetzen von Referenzen auf die Variable, bis Sie alle ersetzt haben.
// - Entfernen Sie die Deklaration und Zuweisung der Variable.
// - Testen Sie den Code.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public int calculateTriangleArea(int base, int height) {
    int area = base * height;
    return area;
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public int calculateTriangleArea(int base, int height) {
    return base * height;
}
