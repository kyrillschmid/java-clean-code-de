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
//  <b>Einführung ins Unit Testing</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 15 Einführung ins Unit Testing.java -->
// <!-- slides/module_240_unit_testing/topic_140_a3_unit_testing_intro.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Was ist ein Unit Test?
//
// - Test einer (Teil-)Funktionalität
// - Genauer: Test eines Szenarios für die Ausführung einer Teilfunktionalität

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Was können Unit Tests testen?
//
// - Funktionen
// - Methoden
// - (Klassen)
// - (Einfache Komponenten)

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Eigenschaften von Unit-Tests (V1)
//
// - Feingranular
//   - z.B. Test eines Methodenaufrufs mit gewissen Parametern
// - Keine Interaktion zwischen Tests
//   - Isolierte Testfälle
// - Keine Interaktion zwischen getesteter Einheit und dem Rest des Systems
//   - Externe Subsysteme werden oft durch einfache Simulationen ersetzt (Mocks)

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Gründe für das Unit-Testen
//
// - Frühes Finden von Fehlern
// - Einfachere Lokalisierung von Fehlern
// - "Sicherheitsnetz" für Programmierer
//   - Fungieren auch als Regressionstests
//   - Fehler werden (hoffentlich) gefunden, bevor sie das Gesamtsystem beeinflussen
// - Unterstützen Wartbarkeit und Erweiterbarkeit von Code
// - Erleichtern Refactoring, da viele dabei auftretende Fehler durch Unit-Tests
//   gefunden werden
// - Stellen sicher, dass Erweiterungen die existierende Funktionalität nicht
//   beeinträchtigen
// - Dienen als zusätzliche Dokumentation
// - Können aber Architekturdiagramme etc. nicht ersetzen

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Eigenschaften von guten Unit-Tests (V2)
//
// Unit-Tests sollen
// - automatisiert sein
// - selbsttestend sein
// - einzelne Programmelemente isoliert testen
// - zu jedem Zeitpunkt erfolgreich ausführbar sein
// - nicht viel Zeit zur Ausführung benötigen
// - für alle Systembestandteile geschrieben werden
// - alle wichtigen Zustände jedes getesteten Elements abdecken
//
// Später: detailliertere Richtlinien - FIRST, Right-BICEP, CORRECT
