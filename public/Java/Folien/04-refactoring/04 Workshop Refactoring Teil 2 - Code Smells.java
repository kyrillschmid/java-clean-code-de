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
//  <b>Workshop Refactoring: Teil 2 - Code Smells</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Workshop Refactoring Teil 2 - Code Smells.java -->
// <!-- slides/module_250_refactoring/topic_140_a3_refactoring_workshop_02_code_smells.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Welche Code Smells gibt es?
// - Lange Methode (Long Method)
// - Code Duplikate (Duplicated Code)

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Lange Methode
// - Eine Methode ist zu lang
// - Sie sollte in kleinere Methoden aufgeteilt werden
// - Die kleineren Methoden sollten sinnvoll benannt werden
// - Die kleineren Methoden müssen in der richtigen Reihenfolge aufgerufen werden
// - Die kleineren Methoden sollten in der richtigen Klasse sein

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Lange Funktion eliminieren
// - Funktion testableHTML ist lang und unübersichtlich
// - Um sie zu verbessern, wollen wir sie in eine Klasse umwandeln
// - Die Klasse soll die eigentlich Funktionalität Kapseln
// - Die lokalen Variablen werden zu Instanzvariablen

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Das "Replace with Command Pattern"
// - Manchmal bietet es sich an eine Funktion in einem eigenen Objekt zu kapseln (Command-Objekt)
// - Vorteil, wenn Funktion viele lokale Variablen hat
// - Vorgehen: 
//   - Command-Klasse erstellen
//   - Command-Klasse mit den lokalen Variablen initialisieren
//   - Move Method: Code der Funktion in die Command-Klasse verschieben
//   - Instanzvariablen für Argumente der Funktion erstellen
//
//
//
//

