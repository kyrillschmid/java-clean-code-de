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
//  <b>Junit5 Parametrisierte Tests</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 10 Junit5 Parametrisierte Tests.java -->
// <!-- slides/module_240_unit_testing/topic_190_e05.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// Junit5 ermöglicht es, Tests mehrfach mit unterschiedlichen Argumenten auszuführen
// - Einzelner Test kann daher viele unterschiedliche Testfälle abprüfen
// - Annotation @ParameterizedTest
// ## Test hat Source aus der Daten bezogen werden
// - @ValueSource
// - @EnumSource
// - @CsvSource
// - @CsvFileSource

