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
//  <b>Workshop: Namen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Workshop Namen.java -->
// <!-- slides/module_230_clean_code/topic_132_names_workshop.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Mini-Workshop: Namen
//
// Das folgende Programm verwendet sehr schlechte Namen. Ändern Sie die Namen
// so, dass sie den Regeln für gute Namen folgen.

// %% tags=["keep"]
// Class representing Line Items:
public class LI {
    
    //number of items
    int X;
    // description of the items
    String ChrLst;
    // price per item
    double Y;
    
    
    public LI(int X, String ChrLst, double Y){
        this.X = X;
        this.ChrLst = ChrLst;
        this.Y = Y;
    }
    
    // compute the total price
    public double foo(){
        return this.X * this.Y;
    }
}


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
// Class representing an Order
public class LIManager{
    // a list of line items
    ArrayList<LI> LIVec = new ArrayList<LI>();
    
    // compute the total price
    public double myResult(){
        double result = 0.0;
        for(LI li : LIVec){
            result += li.foo();
        }
        return result;
    }
}


// %% tags=["keep"]
// Prepare an order
LIManager myOrder = new LIManager();
LI l1 = new LI(2, "Tea", 0.99);
LI l2 = new LI(3, "Coffee", 0.89);
myOrder.LIVec.add(l1);
myOrder.LIVec.add(l2);
System.out.println(myOrder.myResult())


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class LineItem {
    
    int numItems;
    String description;
    double pricePerItem;
    
    public LineItem(int numItems, String description, double pricePerItem){
        this.numItems = numItems;
        this.description = description;
        this.pricePerItem = pricePerItem;
    }
    
    public double computeTotalPrice(){
        return this.numItems * this.pricePerItem;
    }
}


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class Order{

    ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
    
    public double totalPrice(){
        double result = 0.0;
        for(LineItem item : lineItems){
            result += item.computeTotalPrice();
        }
        return result;
    }
}

