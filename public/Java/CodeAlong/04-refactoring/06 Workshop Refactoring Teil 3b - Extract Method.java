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
//  <b>Workshop Refactoring: Teil 3b - Extract Method</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 06 Workshop Refactoring Teil 3b - Extract Method.java -->
// <!-- slides/module_250_refactoring/topic_140_a3_refactoring_workshop_04_extract_method.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// // Workshop: htmlgen
// ## Teil 3: Extract Method
// - Im letzten Teil haben Sie gesehen, wie man eine Methode extrahiert
// - Wir haben die Methode `includePage` extrahiert
// - Dazu wurde der String parametrisiert mit dem Parameter `mode`

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// - Es gibt noch einen weiteren Block, der sich wiederholt

// %%


// %% [markdown] lang="de"
// - Eliminieren Sie die Unterschiede nach dem gleichen Schema wie zuvor
// - Erzeugen Sie eine Variable für den SetupName
// - Extrahieren Sie eine Methode `includeIfInherited`

