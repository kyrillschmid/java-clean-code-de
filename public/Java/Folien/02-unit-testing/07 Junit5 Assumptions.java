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
//  <b>Junit5 Assumptions</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Junit5 Assumptions.java -->
// <!-- slides/module_240_unit_testing/topic_190_e04.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// // Manchmal würde ein Test fehlschlagen aufgrund externer Umstände außerhalb unserer Kontrolle
// - Abhängig von Zeit-/Datum
// - Plattform auf der der Test ausgeführt wird
// Plattform auf der der Test ausgeführt wird 
// In solchen Fällen, wollen wir verhindern, dass unsere Tests ausgeführt werden und fehlschlagen
// ## Junit5 Assumptions:
// - Prüfe Vorbedingungen, die erfüllt sein müssen, wenn wir Test ausführen
// - Test für den Bedingungen nicht erfüllt sind, wird nicht ausgeführt

