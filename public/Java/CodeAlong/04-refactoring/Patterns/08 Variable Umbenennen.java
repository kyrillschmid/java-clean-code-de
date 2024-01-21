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
//  <b>Variable Umbenennen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 08 Variable Umbenennen.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_rename_variable.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Variable umbenennen" wird verwendet, um die Klarheit des Codes zu verbessern, indem Variablen sinnvolle und beschreibende Namen gegeben werden. Dies hilft dabei, den Zweck und die Funktion der Variablen im Code zu kommunizieren und macht ihn leichter verständlich


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Die richtige Benennung von Variablen ist für eine klare Programmierung unerlässlich, da sie hilft, den Zweck des Codes zu erklären. Es kann jedoch sein, dass Variablennamen im Laufe der Zeit geändert werden müssen, wenn sich das Verständnis des Programmierers für das Problem verbessert oder wenn sich der Zweck des Programms aufgrund der Anforderungen der Benutzer ändert. Die Bedeutung eines Variablennamens hängt von seinem Umfang und seiner Verwendung ab; dauerhafte Felder oder Variablen, die in mehreren Funktionen verwendet werden, erfordern eine sorgfältigere Namensgebung.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Wenn die Variable weit verbreitet verwendet wird, ziehen Sie in Erwägung, das Encapsulate-Variable-Muster zu verwenden.
// - Finden Sie alle Verweise auf die Variable und ändern Sie jeden einzelnen.
// - Wenn es Verweise aus einer anderen Codebasis gibt, die Variable eine veröffentlichte Variable ist und Sie diese Refaktorisierung nicht durchführen können.
// - Wenn sich die Variable nicht ändert, können Sie sie in eine mit dem neuen Namen kopieren und dann schrittweise ändern, wobei Sie nach jeder Änderung testen.
// - Testen Sie den Code.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


