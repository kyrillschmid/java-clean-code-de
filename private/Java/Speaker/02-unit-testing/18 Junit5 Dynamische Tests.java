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
//  <b>Junit5 Dynamische Tests</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 18 Junit5 Dynamische Tests.java -->
// <!-- slides/module_240_unit_testing/topic_190_e06.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// Junit5 ermöglicht es dynamisch Tests zu erstellen
// Hilfreich wenn 
// - Test-Fälle datengetrieben erzeugt werden sollen 
// - Konditionale Tests bei denen die Bedingungen zur Compile-Zeit noch nicht bekannt sind
// - Dynamische Tests werden mit der @TestFactory-Annotation erzeugt
// - Methode gibt Stream zurück (auch möglich Collection, Iterable oder Iterator)
// - Stream enthält DynamicNode-Instanzen, die ausgeführt werden

