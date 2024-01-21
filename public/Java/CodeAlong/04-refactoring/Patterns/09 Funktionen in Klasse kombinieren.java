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
//  <b>Funktionen in Klasse kombinieren</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 09 Funktionen in Klasse kombinieren.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_combine_functions_into_class.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Combine Functions into Class" besteht darin, eine Gruppe von Funktionen, die eng zusammenarbeiten und gemeinsame Daten verwenden, in eine Klasse zu integrieren. Dies verbessert die Übersichtlichkeit, reduziert die Anzahl der benötigten Argumente in Funktionsaufrufen und ermöglicht das einfache Weitergeben des Objekts an andere Systemteile.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Das Hauptziel dieses Musters ist es, die Organisation und Zusammenarbeit von Funktionen, die eng miteinander in Bezug auf gemeinsame Daten arbeiten, zu verbessern. Durch die Verwendung einer Klasse wird die gemeinsame Umgebung, die diese Funktionen teilen, expliziter und einfacher zu verwalten.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Encapsulate Record auf das gemeinsame Datenrecord anwenden.
// - Falls die gemeinsamen Daten noch nicht in einer Recordstruktur gruppiert sind, Introduce Parameter Object verwenden, um sie zu gruppieren.
// - Jede Funktion, die das gemeinsame Record verwendet, mit Move Function in die neue Klasse verschieben.
// - Argumente aus der Argumentliste entfernen, die bereits Mitglieder der Klasse sind.
// - Logikabschnitte, die die Daten bearbeiten, mit Extract Function extrahieren und in die neue Klasse verschieben.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


