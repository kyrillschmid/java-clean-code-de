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
//  <b>Funktion Extrahieren</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 Funktion Extrahieren.java -->
// <!-- slides/module_250_refactoring/topic_190_a3_extract_function.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Beschreibung
// Das Extract Function-Muster ist eine häufige Refactoring-Technik, bei der ein Codefragment in eine separate Funktion (oder Methode in objektorientierten Sprachen) extrahiert wird. Diese neue Funktion sollte nach ihrem Zweck benannt werden. Das Hauptziel besteht darin, die Absicht des Codes klarer zu machen und die Trennung zwischen Absicht und Implementierung zu verbessern.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
// Die Motivation für die Verwendung des Extract Function-Musters besteht darin, die Lesbarkeit des Codes zu verbessern, indem Codefragmente in separate Funktionen extrahiert werden. Dabei sollte die Funktion nach ihrer Absicht und nicht nach ihrer Implementierung benannt werden. Dies erleichtert das Verständnis des Codes und ermöglicht es, die Funktion ohne Kenntnis der genauen Implementierung zu verwenden.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vorgehen
// - Erstellen Sie eine neue Funktion und benennen Sie sie nach der Absicht der Funktion.
// - Kopieren Sie den extrahierten Code aus der Quellfunktion in die neue Ziel-Funktion.
// - Suchen Sie im extrahierten Code nach Verweisen auf lokale Variablen und passen Sie diese als Parameter an.
// - Falls nötig, verschieben Sie Deklarationen von Variablen, die nur im extrahierten Code verwendet werden, in den extrahierten Code.
// - Kompilieren Sie den Code, um sicherzustellen, dass alle Variablen ordnungsgemäß behandelt wurden.
// - Ersetzen Sie den extrahierten Code in der Quellfunktion durch einen Aufruf der Ziel-Funktion.
// - Führen Sie Tests durch, um sicherzustellen, dass keine Funktionalität verloren gegangen ist.
// - Suchen Sie nach weiterem Code, der dem gerade extrahierten Code ähnelt, und erwägen Sie, diesen ebenfalls durch Aufrufe der neuen Funktion zu ersetzen.


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Beispiel

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class ExtractFunctionExample {
    public static void main(String[] args) {
        double price = 100;
        int quantity = 5;
        double discount = 0.1;
        double tax = 0.05;

        double total = price * quantity * (1 - discount);
        double taxedTotal = total * (1 + tax);
        System.out.println("Total price: " + taxedTotal);
    }
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class ExtractFunctionExample {
    public static void main(String[] args) {
        double price = 100;
        int quantity = 5;
        double discount = 0.1;
        double tax = 0.05;

        double total = calculateTotal(price, quantity, discount);
        double taxedTotal = applyTax(total, tax);
        System.out.println("Total price: " + taxedTotal);
    }

    private static double calculateTotal(double price, int quantity, double discount) {
        return price * quantity * (1 - discount);
    }

    private static double applyTax(double total, double tax) {
        return total * (1 + tax);
    }
}
