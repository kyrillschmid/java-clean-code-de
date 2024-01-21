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
//  <b>Wie findet man gute Namen?</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 03 Wie findet man gute Namen.java -->
// <!-- slides/module_230_clean_code/topic_131_finding_names.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Wie findet man gute Namen?
//
// - Wähle nach Aussagekraft, nicht nach Bequemlichkeit
// - Verwende Namen, die sagen, was sie bedeuten, und bedeuten, was sie sagen
// - Sonst wird die Wartung viel schwieriger...
// - ... und der größte Teil der Kosten für Software entsteht durch Wartung

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Was ist ein guter Name?
//
// - Beantwortet
//   - Warum gibt es diese Funktion (Klasse, Modul, Objekt...)?
//   - Was macht sie?
//   - Wie wird sie verwendet?
// - Kommuniziert die Intention (ist "intention revealing")
// - (Ist im Allgemeinen nicht leicht zu finden)


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Was ist ein schlechter Name?
//
// - Braucht einen Kommentar
// - Kann nur verstanden werden, wenn man sich den Code ansieht
// - Verbreitet Desinformation
// - Entspricht nicht den Namensregeln

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Clean Code Namensregeln
//
// Gute Namen
//
// - sind selbsterklärend
// - offenbaren die Intention
// - sind aussprechbar und durchsuchbar
// - beschreiben das Problem, nicht die Implementierung
// - vermeiden Desinformation und benennen eine sinnvolle Unterscheidung
// - vermeiden Kodierungen (ungarische Notation)
// - verwenden die richtige Wortart (lexikalische Kategorie)
// - verwenden die Regeln für Umfang und Länge (Scope-Length Rules)


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Selbsterklärende Namen

// %% tags=["keep"]
// Elapsed time in days
int d = 0;

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Namen, die die Intention offenbaren
//
// Reflektieren Absicht, Verhalten, Existenzberechtigung

// %% tags=["keep"]
ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(
                            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));

// %% tags=["keep"]
ArrayList<Integer> dpmLst = new ArrayList<>(Arrays.asList(
                            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Namen sind aussprechbar und durchsuchbar


// %% tags=["keep"]
ArrayList<Integer> hwCrsrPxy = new ArrayList<>(Arrays.asList(0, 0));

// %%


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Namen beschreiben das Problem, nicht die Implementierung
//
// Vermeide Namen, die sich auf Implementierungsdetails beziehen:
// - Sie verraten nicht, warum der Code so geschrieben wurde, wie er geschrieben ist
// - Aber die Vermittlung der Intention hinter dem Code hat höchste Priorität!

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public int calculateFactorialRecursive(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateFactorialRecursive(number - 1);
        }
}


// %% tags=["keep"]
calculateFactorialRecursive(10);



// %%

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Desinformation und sinnvolle Unterscheidungen
//
// - Namen bedeuten etwas
// - Desinformation:
//   - Die Bedeutung des Namens impliziert etwas anderes als der Programmcode:


// %% tags=["keep"]
public class Pair {
    public int first;
    public int second;
    public int third;
}


// %%


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Regeln zur Vermeidung von Desinformation
//
// - Vermeide Plattformnamen wie `sco`, `aix`, `nt`
//   - Oft sind Merkmalsprüfungen besser
// - Nimm keinen Typ in einen Variablennamen auf, wenn die Variable nicht von
//   diesem Typ ist
//   - Meistens: Gib überhaupt keinen Typ in einem Variablennamen an

// %% tags=["keep"]
int vectorOfCards = 0;

// %%

// %%

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Regeln zur Vermeidung von Desinformation
//
// - Sei vorsichtig mit Namen, die sich nur geringfügig unterscheiden

// %% tags=["keep"]
boolean isMeleeDefenceAvailable = true;
boolean isMeleeDefenseAvailable = false;

// %% tags=["keep"]
System.out.println(isMeleeDefenceAvailable == isMeleeDefenseAvailable);

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Regeln zur Vermeidung von Desinformation
//
// - Benutze Namen, die etwas bedeuten

// %% tags=["keep"]
int fooBar = 0;
int bar = 1;

// %%

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Regeln zur Vermeidung von Desinformation
//
// - Sei bei der Namensgebung konsistent

// %% tags=["keep"]
int numberOfObjects = 10;
int numBuyers = 12;
int nTransactions = 2;

// %%

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Sinnvolle Unterscheidungen
//
// - Verwende Namen, die die Bedeutung der Konzepte so klar wie möglich ausdrücken


// %% tags=["keep"]
String a1 = "Fluffy";
String a2 = "Garfield";

// %%

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
int INCLUDE_NONE = 0;
int INCLUDE_ONE = 1;
int INClUDE_SECOND = 2;
int INCLUDE_BOTH = 3;

// %% tags=["keep"]
int INCLUDE_NO_DATE = 0;
int INCLUDE_START_DATE = 1;
int INCLUDE_END_DATE = 2;
int INCLUDE_START_AND_END_DATE = 3;


// %%


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Sinnvolle Unterscheidungen
//
// - Verwende denselben Namen für dasselbe Konzept


// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
import java.nio.file.Path;
import java.nio.file.Paths;

// %% tags=["keep"]
Path myPath = Paths.get(System.getProperty("user.home"));
Path yourDir = Paths.get(System.getProperty("user.home"));
Path fileLoc = Paths.get(System.getProperty("user.home"));

// %% tags=["keep"]
Path myPath = Paths.get(System.getProperty("user.home"));
Path yourPath = Paths.get(System.getProperty("user.home"));
Path filePath = Paths.get(System.getProperty("user.home"));



// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Sinnvolle Unterscheidungen
//
// - Verwende deutlich unterschiedliche Namen für verschiedene Konzepte


// %% tags=["keep"]
Object MY_EFFICIENT_STRING_PROCESSING_HANDLE; // a handle is a reference to a resource
Object MY_EFFICIENT_STRING_PROCESSING_HANDLER; // a handler is a block of code that handles an event or error condition


// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Vermeide Kodierungen
//
// Verwende keine ungarische Notation:


// %% tags=["keep"]
int iDays = 12;
int iMonth = 3;


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vermeide Kodierungen
//
// Verwende keine Präfixe für Attribute:

// %% tags=["keep"]
public class MyClass {
    int mDays;
    int mMonth;
}


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vermeide Kodierungen
//
// Vermeiden Sie Präfixe wie C/I: CClass, IInterface

// %% tags=["keep"]
public class CMyClass {
    int days;
    int months;
}


// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Verwende die richtige lexikalische Kategorie
//
// - Klassen und Variablen: Substantive oder Substantivphrasen
// - Funktionen: Verben oder Verbphrasen
// - Enums: oft Adjektive
// - Boolesche Variablen und Funktionen: oft Prädikate: `ist_...`, `hat_...`

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Möglicherweise
//
// Vermeide Wörter, die keine Bedeutung haben, wie Manager, Prozessor, Daten,
// Info

// %% tags=["keep"]
public class ObjectManager{

}


// %% tags=["keep"]
public class ObjectController{

}


// %% tags=["keep"]
public class DataController {

}



// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Regeln für Umfang und Länge (Scope-Length Rules)
//
// - Variablen:
// - Langer Geltungsbereich = langer Name
// - Kurzer Geltungsbereich = kurzer Name
// - Klassen und Methoden
// - Langer Geltungsbereich = kurzer Name
// - Kurzer Geltungsbereich = langer Name
//
// **Oder:** Verwende lange Namen für lange Geltungsbereiche


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
public class FixedSizeOrderedCollectionIndexedByInts {

}


// %%
