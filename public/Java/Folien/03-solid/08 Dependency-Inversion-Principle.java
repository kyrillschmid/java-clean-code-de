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
//  <b>Dependency-Inversion-Principle</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 08 Dependency-Inversion-Principle.java -->
// <!-- slides/module_280_solid/topic_160_a3_solid_dip.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## SOLID: Dependency-Inversion-Principle
//
// - Die Kernfunktionalität eines Systems hängt nicht von seiner Umgebung ab
//   - **Konkrete Artefakte hängen von Abstraktionen ab** (nicht umgekehrt)
//   - **Instabile Artefakte hängen von stabilen Artefakten ab** (nicht umgekehrt)
//   - **Äußere Schichten** der Architektur **abhängig von inneren Schichten**
//     (nicht umgekehrt)
//   - Klassen/Module hängen von Abstraktionen (z. B. Schnittstellen) ab,
//     nicht von anderen Klassen/Modulen
// - Abhängigkeitsinversion erreicht dies durch die Einführung von Schnittstellen,
//   die "die Abhängigkeiten umkehren"

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// <img src="img/dip-01.png"
//      style="display:block;margin:auto;width:95%"/>

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// <img src="img/dip-02.png"
//      style="display:block;margin:auto;width:95%"/>

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// <img src="img/dip-03.png"
//      style="display:block;margin:auto;width:95%"/>

