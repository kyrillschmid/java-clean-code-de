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
//  <b>Ändern der Funktionsdeklaration</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Ändern der Funktionsdeklaration.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_change_function_declaration.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Ändern der Funktionsdeklaration" besteht darin, die Deklaration einer Funktion (wie Name, Parameter oder Rückgabetyp) zu ändern, um die Verständlichkeit und Wartbarkeit des Codes zu verbessern. Dies kann das Umbenennen einer Funktion, das Hinzufügen oder Entfernen von Parametern oder das Ändern des Rückgabetyps umfassen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Funktionen sind die Hauptbausteine eines Programms. Die Deklarationen von Funktionen repräsentieren die Verbindungen zwischen den Teilen eines Softwaresystems. Eine gute Benennung und geeignete Parameter verbessern das Verständnis des Codes und erleichtern das Hinzufügen neuer Funktionen. Daher ist es wichtig, die Funktionsdeklarationen im Laufe der Zeit anzupassen, um die beste Struktur für den Code zu finden.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Einfaches Vorgehen
// - Wenn Sie einen Parameter entfernen, stellen Sie sicher, dass er im Funktionskörper nicht referenziert wird.
// - Ändern Sie die Funktionsdeklaration in die gewünschte Deklaration.
// - Suchen und aktualisieren Sie alle Referenzen auf die alte Funktionsdeklaration.
// - Testen Sie den Code.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beachten
// - Nicht eindeutige Namen (Andere Funktion hat gleichen Namen) - Caller nicht ändern
// - Je mehr Aufrufe der Funktion und anderer Funktionen mit gleichem Namen desto schwieriger
// - In diesem Fall stufenweise Mechanik anwenden

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Stufenweises Vorgehen

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Anwendung von Extract Function

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - Schrittweises ersetzen aller Aufrufe von `doStuff()` mit `sayHello()`
// - Testen nach jeder Änderung
