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
//  <b>Junit5 Lifecycle Annotations</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Junit5 Lifecycle Annotations.java -->
// <!-- slides/module_240_unit_testing/topic_190_e02.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Junit5 bietet Lifecycle-Annotationen
// Lifecycle-Annotationen ermöglichen bestimmte Methoden 
// - Einmalig vor- oder nach allen Tests auszuführen
// - Jeweils vor- oder nach Tests auszuführen
// - Aufwändiger SetUp/Teardown-Code, Test-Objekte als Instanz-Attribute

