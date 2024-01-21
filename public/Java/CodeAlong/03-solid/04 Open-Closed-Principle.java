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
//  <b>Open-Closed-Principle</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Open-Closed-Principle.java -->
// <!-- slides/module_280_solid/topic_130_a3_solid_ocp.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## SOLID: Open-Closed-Principle
//
// Klassen sollen
//
// - Offen für Erweiterung
// - Geschlossen für Modifikation
//
// sein.

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
public enum MovieKindV0 {
    REGULAR,
    CHILDREN;
}


// %% tags=["keep"]
public class MovieV0 {
    private String title;
    private MovieKindV0 kind;

    public MovieV0(String title, MovieKindV0 kind) {
        this.title = title;
        this.kind = kind != null ? kind : MovieKindV0.REGULAR;
    }

    public MovieV0(String title) {
        this(title, MovieKindV0.REGULAR);
    }

    public double computePrice() {
        if (kind == MovieKindV0.REGULAR) {
            return 4.99;
        } else if (kind == MovieKindV0.CHILDREN) {
            return 5.99;
        }
        return 0;
    }

    public void printInfo() {
        System.out.printf("%s costs %.2f%n", title, computePrice());
    }
}



// %% tags=["keep"]
MovieV0 m1 = new MovieV0("Casablanca");
MovieV0 m2 = new MovieV0("Shrek", MovieKindV0.CHILDREN);

// %% tags=["keep"]
m1.printInfo();
m2.printInfo();


// %% tags=["keep"]
public enum MovieKindV1 {
    REGULAR,
    CHILDREN,
    NEW_RELEASE;
}



// %% tags=["keep"]
public class MovieV1 {
    private String title;
    private MovieKindV1 kind;

    public MovieV1(String title) {
        this.title = title;
        this.kind = MovieKindV1.REGULAR;
    }

    public MovieV1(String title, MovieKindV1 kind) {
        this.title = title;
        this.kind = kind;
    }

    public double computePrice() {
        if (this.kind == MovieKindV1.REGULAR) {
            return 4.99;
        } else if (this.kind == MovieKindV1.CHILDREN) {
            return 5.99;
        } else if (this.kind == MovieKindV1.NEW_RELEASE) {
            return 6.99;
        }
        throw new IllegalArgumentException("Invalid movie kind");
    }

    public void printInfo() {
        System.out.println(this.title + " costs " + this.computePrice());
    }
}



// %% tags=["keep"]
MovieV1 m1 = new MovieV1("Casablanca");
MovieV1 m2 = new MovieV1("Shrek", MovieKindV1.CHILDREN);
MovieV1 m3 = new MovieV1("Brand New", MovieKindV1.NEW_RELEASE);


// %% tags=["keep"]
m1.printInfo();
m2.printInfo();
m3.printInfo();


// %%

// %%


// %%

// %%

// %%


// %%

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Workshop: Employee OCP
//
// Beim SRP haben wir die `Employee`-Klasse refactored um die SRP-Verletzungen zu
// beseitigen. Verbessern Sie das Beispiel weiter, indem Sie auch die
// OCP-Verletzungen beseitigen. Starten Sie von der Klasse `EmployeeV1`
// ausgehend:
