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
//  <b>Variable Extrahieren</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 03 Variable Extrahieren.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_extract_variable.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Extract Variable-Muster besteht darin, komplexe Ausdrücke in lokale Variablen aufzuteilen, um den Code leichter verständlich und lesbar zu gestalten. Diese Variablen ermöglichen es, Teile einer komplexeren Logik zu benennen und das Debugging zu erleichtern.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Die Motivation für die Verwendung von Extract Variable besteht darin, komplexe Ausdrücke durch lokale Variablen lesbarer und verständlicher zu gestalten. Diese Variablen können das Verständnis des Codes verbessern, indem sie Teile einer komplexeren Logik benennen, und sind auch praktisch für das Debugging.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Stellen Sie sicher, dass der Ausdruck, den Sie extrahieren möchten, keine Nebeneffekte hat.
// - Deklarieren Sie eine unveränderliche Variable und weisen Sie ihr eine Kopie des Ausdrucks zu, den Sie benennen möchten.
// - Ersetzen Sie den ursprünglichen Ausdruck durch die neue Variable.
// - Testen Sie den Code.
// - Wenn der Ausdruck mehr als einmal vorkommt, ersetzen Sie jedes Vorkommen durch die Variable und testen Sie nach jeder Ersetzung.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
