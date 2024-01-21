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
//  <b>Klassifizierung von Tests</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 14 Klassifizierung von Tests.java -->
// <!-- slides/module_240_unit_testing/topic_130_a3_test_classification.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Nach Größe des Systems under Test (SuT)
// - Unit Tests:
//   - Testen einzelne Methoden oder Klassen,
//   - Typischerweise isoliert vom Rest des Systems
// - Komponententests:
//   - Testen einzelne Komponenten in Isolation
// - Integrations-/Systemtests:
//   - Testen das komplette System.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Nach Zielen
// - Validierungstesten ( „validation testing“):
//   versucht sicherzustellen, dass das System seine intendierte Funktion korrekt erfüllt
// - Defekttesten ( „defect testing“):
//   versucht Fehler (eigentlich Fehlerzustände) zu finden
//   - selten betrachtete Ausführungspfade oder Use Cases
//   - Randbedingungen
// - Die Übergänge zwischen den beiden Klassen sind fließend

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ##// Nach Zeitpunkt
// - Entwicklungstests:
//   - Das System wird während der Entwicklungsphase getestet
//   - Werden i.A. von den Entwicklern selber ausgeführt
// - Release Tests:
//   - Eine vollständige Version des Systems wird getestet bevor es an
//     Kunden übergeben wird
//   - Werden oft von einem speziellen Test-Team ausgeführt
// - Endbenutzertests:
//   - Benutzer oder potenzielle Benutzer testen das System, oft in ihrer eigenen
//     Systemumgebung
//   - Akzeptanztests sind eine Form der Endbenutzertests

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Andere Bezeichnungen/Testarten
//
// - Regressionstests:
//   - Tests, die bereits behobene Fehler testen.
//   - Sollen sicherstellen, dass diese Fehler nicht erneut ins System gelangen können.
//   - Regressionstests können Unit-, Komponenten- oder Integrations/Systemtests sein
// - Performanztests:
//   - Tests, die das Verhalten des Systems unter Belastung überprüfen
//     (Lasttests, Stresstests, Spike-Tests, ...)
// - Benutzbarkeitstests (Usability Tests):
//   - Tests, die überprüfen, wie gut Benutzer mit dem System zurechtkommen

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Teststrategien
// - White Box vs. Black Box
// - Top Down vs. Bottom Up

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## White-Box Tests
//
// - Auch Glass-Box oder strukturelles Testen genannt
// - Tester haben Zugriff auf Design und Implementierung des Systems und können
//   - die Design-Dokumente lesen
//   - den Code inspizieren
//   um potentielle Fehler zu finden
// - Wenn Programmierer Tests für ihren eigenen Code schreiben handelt es sich
//   immer um White-Box Tests

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Black-Box Tests
// - Tester können das Systemverhalten (z.B. Ausgaben) für von ihnen gewählte Eingaben
//   überprüfen
// - Tester haben keinen Zugriff auf Systeminterna
// - (Klassisches) Fuzzing ist eine automatisierte Form des Black-Box Testens
// - Haben Tester Zugriff auf die Design-Dokumente aber nicht den Programmcode
//   spricht man manchmal von Gray-Box-Testing

