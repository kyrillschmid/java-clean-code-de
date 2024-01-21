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
//  <b>Split Phase</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 11 Split Phase.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_split_phase.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Split Phase" besteht darin, Code, der sich mit zwei verschiedenen Dingen befasst, in separate Module aufzuteilen. Die Aufteilung in zwei sequenzielle Phasen ermöglicht es, die beiden Themen getrennt voneinander zu behandeln und Änderungen leichter vorzunehmen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Das Hauptziel dieses Musters ist es, die Komplexität von Code zu reduzieren und die Wartbarkeit zu verbessern, indem unterschiedliche Aufgaben in separate Module aufgeteilt werden. Dies macht die Unterschiede im Code explizit und erleichtert das Verständnis der verschiedenen Aspekte.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Den Code der zweiten Phase in eine eigene Funktion extrahieren.
// - Testen.
// - Eine Zwischendatenstruktur als zusätzliches Argument für die extrahierte Funktion einführen.
// - Testen.
// - Jeden Parameter der extrahierten zweiten Phase untersuchen. Wenn er von der ersten Phase verwendet wird, in die Zwischendatenstruktur verschieben. Nach jedem Verschieben testen.
// - Manchmal sollte ein Parameter nicht von der zweiten Phase verwendet werden. In diesem Fall die Ergebnisse jeder Verwendung des Parameters in ein Feld der Zwischendatenstruktur extrahieren und Move Statements to Callers auf die Zeile anwenden, die es füllt.
// - Extract Function auf den Code der ersten Phase anwenden und die Zwischendatenstruktur zurückgeben.
// - Es ist auch sinnvoll, die erste Phase in ein Transformer-Objekt zu extrahieren.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %%

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


