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
//  <b>Workshop Refactoring: Teil 3a - Extract Method</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Workshop Refactoring Teil 3a - Extract Method.java -->
// <!-- slides/module_250_refactoring/topic_140_a3_refactoring_workshop_03_extract_method.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Refactoring Pattern Extract Method
// - Die Funktion `invoke` ist immer noch zu lang
// - Wir wollen sie in kleinere Methoden aufteilen
// - Wir erkennen, dass sich einige Blöcke wiederholen

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// - Folgender Block kommt in vier leicht unterschiedlichen Varianten vor:

// %%

// %%


// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// - Um daraus eine Methode zu extrahieren, müssen wir die Unterschiede eliminieren
// - Wir können die Unterschiede eliminieren, indem wir den String parametrisieren
// - Wir ersetzen "setup" und "teardown" durch den Parameter `mode`

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// - Anschließend können wir die Methode extrahieren
// - Wir nennen sie `includePage`
// - IntelliJ IDEA: Refactor -> Extract -> Method
// - Eclipse: Refactor -> Extract Method
// - Die IDE fragt uns ob wir alle Vorkommen ersetzen wollen
