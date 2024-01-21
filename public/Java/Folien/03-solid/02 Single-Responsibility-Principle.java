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
//  <b>Single-Responsibility-Principle</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Single-Responsibility-Principle.java -->
// <!-- slides/module_280_solid/topic_120_a3_solid_srp.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## SOLID: Single-Responsibility-Principle
//
// Wie ist der folgende Code zu bewerten?

// %% tags=["keep"]
public class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D move(double dx, double dy) {
        return new Point2D(x + dx, y + dy);
    }
}


// %% tags=["keep"]
public class Figure2d {
    private final Point2D pivot;
    private final List<Integer> sprite;
    private final double health;
    private final Object healthBar; // In reality a widget...
    private final Object database; // The connection to the DB

    public Figure2d(Point2D pivot, List<Integer> sprite, double health, Object healthBar, Object database) {
        this.pivot = pivot;
        this.sprite = sprite;
        this.health = health;
        this.healthBar = healthBar;
        this.database = database;
    }

    public void move(double dx, double dy) {
        // ...
    }

    public boolean isPlayerAvatar() {
        // Check whether the figure is the player's avatar...
        return true;
    }

    public void updateGui() {
        // Update the health bar widget.
        // ...
    }

    public void saveToDb() {
        // Write the figure data to the database.
        // ...
    }
}


// %%
public class GameEditor {

    public void editFigure(Figure2d figure) {
        // Edit the figure...
        figure.saveToDb();
    }
}


// %%
public class Game {
    private final Figure2d playerAvatar;

    public Game(Figure2d playerAvatar) {
        this.playerAvatar = playerAvatar;
    }

    public void runGameLoop() {
        // Do lots of things...
        playerAvatar.updateGui();
    }
}


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Single-Responsibility-Prinzip
//
// - Für jede Klasse sollte es nur einen einzigen Grund geben, warum sie geändert
//   werden muss
// - Der Name ist nicht ganz korrekt: SRP besagt nicht, dass jede Klasse nur eine
//   einzige Verantwortung haben darf

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Eine Verantwortung?
//
// <img src="img/book_01.png"
//      style="display:block;margin:auto;width:35%"/>
//

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Verletzung des SRPs
//
// <img src="img/book_02.png"
//      style="display:block;margin:auto;width:60%"/>
//

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class Book {
    private final String title;
    private final String author;
    private final int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void print() {
        // Lots of code that handles the printer
        System.out.println("Printing to printer.");
    }

    public void save() {
        // Lots of code that handles the database
        System.out.println("Saving to database.");
    }
}


// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Auflösung der SRP-Verletzung (Version 1)
//
// <img src="img/book_resolution_1.png"
//      style="display:block;margin:auto;width:50%"/>

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Auflösung der SRP-Verletzung (Version 2)
//
// <img src="img/book_resolution_2.png"
//      style="display:block;margin:auto;width:80%"/>

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vergleich
//
// <div>
// <img src="img/book_resolution_1.png"
//      style="float:left;padding:5px;width:40%"/>
// <img src="img/book_resolution_2.png"
//      style="float:right;padding:5px;width:50%"/>
// </div>

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Workshop: Employee
//
// Sie haben die folgende Implementierung eines Personal-Management Systems, die
// mehrere SRP-Verletzungen enthält. Implementieren Sie eine Variante, die diese
// beseitigt. 
//
// Hinweis: Nutzen Sie dafür ggf. Eclipse (Starter-Code im Verzeichnis examples)

// %% [markdown]
// <img src="img/employee_01.png"
//      style="display:block;margin:auto;width:40%"/>

