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
//  <b>Funktionen in Transformation kombinieren</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 10 Funktionen in Transformation kombinieren.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_combine_functions_into_transform.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Muster "Combine Functions into Transform" besteht darin, mehrere Funktionen, die abgeleitete Informationen aus gemeinsamen Daten berechnen, in eine einzige Transformationsfunktion zu integrieren. Diese Funktion nimmt die Ausgangsdaten als Eingabe und berechnet alle abgeleiteten Werte, die dann in den Ausgangsdaten gespeichert werden.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Das Hauptziel dieses Musters ist es, Duplikationen in der Logik zur Berechnung abgeleiteter Daten zu vermeiden und einen konsistenten Ort für die Verwaltung dieser Funktionen zu schaffen. Die Verwendung einer Transformationsfunktion erleichtert das Auffinden und Aktualisieren der Berechnungen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Eine Transformationsfunktion erstellen, die den zu transformierenden Datensatz entgegennimmt und die gleichen Werte zurückgibt.
// - In der Regel wird eine tiefe Kopie des Datensatzes benötigt. Es ist oft sinnvoll, einen Test zu schreiben, um sicherzustellen, dass die Transformation das Original nicht verändert.
// - Eine Logik auswählen und ihren Körper in die Transformationsfunktion verschieben, um ein neues Feld im Datensatz zu erstellen. Den Client-Code ändern, um auf das neue Feld zuzugreifen.
// - Bei komplexer Logik zuerst Extract Function verwenden.
// - Testen.
// - Wiederholen Sie den Vorgang für die anderen relevanten Funktionen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


