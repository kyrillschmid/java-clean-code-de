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
//  <b>Clean Code: Namen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Clean Code Namen.java -->
// <!-- slides/module_230_clean_code/topic_130_names.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Clean Code: Namen
//
// Unterschätze niemals die Macht von Namen!

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Namen sind ein mächtiges Kommunikationsmittel.
// - Sie sind überall im Programm zu finden
// - Sie verbinden den Code mit Domänen-Konzepten.


// %% tags=["keep"]
public double foo(double a, double b){
    if(b > 40){
        throw new IllegalArgumentException("Not allowed");
        }
    return 40.0 * a + 60.0 * b;
}
// %%
foo(40.0, 3.5);

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public static final double REGULAR_PAY_PER_HOUR = 40.0;
public static final double OVERTIME_PAY_PER_HOUR = 60.0;
public static final double MAX_ALLOWED_OVERTIME = 40.0;

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public double computeTotalSalary(double regularHoursWorked, double overTimeHoursWorked){
    if(overTimeHoursWorked > MAX_ALLOWED_OVERTIME){
        throw new IllegalArgumentException("Not allowed to work " + overTimeHoursWorked
            + " hours overtime");
    }
    double regularPay = regularHoursWorked * REGULAR_PAY_PER_HOUR;
    double overtimePay = overTimeHoursWorked * OVERTIME_PAY_PER_HOUR;
    return regularPay + overtimePay;
}

// %%
computeTotalSalary(40.0, 3.5);

// %%
// computeTotalSalary(40.0, 50.0);

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class BadNames {
    private List<Integer> theList = new ArrayList<>();

    public List<Integer> getThem() {
        List<Integer> list1 = new ArrayList<>();
        for (Integer x : theList) {
            if (x == 1) {
                list1.add(x);
            }
        }
        return list1;
    }
}

// %% [markdown] lang="de" tags=["notes"] slideshow={"slide_type": "notes"}
// <div style='background:yellow'>
//
// Zusätzlich zur Verwendung guter Variablennamen gibt es mehrere Möglichkeiten
// Namen ins Programm einzuführen:
// - Erklärende Variablen
// - Enumerations
// - Benannte Tupel
// - Klassen
// - ...
// </div>

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
enum Status {
    FLAGGED,
    UNFLAGGED,
}


// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class Cell {
    private int index;
    public Status status = Status.UNFLAGGED;
    private int bombCount = 0;
}


// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public ArrayList<Cell> makeBoard(int size){

    ArrayList<Cell> board = new ArrayList<Cell>();

    for(int i = 0; i < size; i++){
        board.add(new Cell(i));
    }
    return board;
}


// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class MineSweeper {
    private ArrayList<Cell> board = makeBoard(64);

    private ArrayList<Cell> getFlaggedCells(){

        ArrayList<Cell> flaggedCells = new ArrayList<Cell>();

        for(Cell cell : board){
            if (cell.status == Status.FLAGGED){
                flaggedCells.add(cell());
            }
        }
        return flaggedCells;
    }
}
