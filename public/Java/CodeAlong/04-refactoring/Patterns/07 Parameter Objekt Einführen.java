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
//  <b>Parameter Objekt Einführen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Parameter Objekt Einführen.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_parameter_object.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Parameterobjekt einführen" fasst Daten, die häufig gemeinsam in verschiedenen Funktionen auftreten, in einer einzigen Datenstruktur zusammen. Dadurch werden Parameterlisten reduziert und tiefere Änderungen am Code ermöglicht, indem neue Abstraktionen geschaffen werden, die das Verständnis des Anwendungsbereichs vereinfachen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Wenn mehrere Datenelemente häufig gemeinsam in Funktionen auftreten, bilden sie einen Datenklumpen. Das Ersetzen dieses Datenklumpens durch eine einzelne Datenstruktur macht die Beziehung zwischen den Datenelementen explizit, reduziert die Größe von Parameterlisten und verbessert die Konsistenz. Das Einführen eines Parameterobjekts kann dazu führen, dass das Verhalten des Programms neu strukturiert wird, um die neue Struktur zu nutzen, Funktionen zu erstellen, die gemeinsames Verhalten erfassen, und möglicherweise neue Abstraktionen zu bilden, die das Verständnis des Anwendungsbereichs vereinfachen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Wenn es noch keine geeignete Struktur gibt, erstelle eine. Verwende vorzugsweise eine Klasse, um das spätere Gruppieren von Verhalten zu erleichtern. Stelle sicher, dass diese Strukturen Wertobjekte sind.
// - Teste den Code.
// - Verwende das Muster "Funktionsdeklaration ändern", um einen Parameter für die neue Struktur hinzuzufügen.
// - Teste den Code.
// - Passe jeden Aufrufer an, um die korrekte Instanz der neuen Struktur zu übergeben. Teste nach jeder Änderung.
// - Ersetze für jedes Element der neuen Struktur die Verwendung des ursprünglichen Parameters durch das Element der Struktur. Entferne den Parameter. Teste den Code.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
