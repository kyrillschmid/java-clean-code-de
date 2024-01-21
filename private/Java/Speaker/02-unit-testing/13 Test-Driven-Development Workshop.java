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
//  <b>Test-Driven-Development Workshop</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 13 Test-Driven-Development Workshop.java -->
// <!-- slides/module_240_unit_testing/topic_170_test_driven_development_workshop.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Kata: FizzBuzz
//
// Schreiben Sie eine Funktion `fizzBuzz(n)`, die die Zahlen von 1 bis `n`
// ausgibt aber dabei
//
// - jede Zahl, die durch 3 teilbar ist, durch `Fizz` ersetzt
// - jede Zahl, die durch 5 teilbar ist, durch `Buzz` ersetzt
// - jede Zahl, die durch 3 und 5 teilbar ist, durch `FizzBuzz` ersetzt
//
// Zum Beispiel soll `fizzBuzz(31)` die folgende Ausgabe erzeugen:
//
// ```
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz
// 16
// 17
// Fizz
// 19
// Buzz
// Fizz
// 22
// 23
// Fizz
// Buzz
// 26
// Fizz
// 28
// 29
// FizzBuzz
// 31
// ```

// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
// %maven org.junit.jupiter:junit-jupiter-api:5.8.2
import static org.junit.jupiter.api.Assertions.assertEquals;

// %%
public void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}


// %%
fizzBuzz(31)


// %% tags=["subslide", alt]
public String fizzbuzzNumber(int n) {
    return Integer.toString(n);
}


// %% tags=["alt"]
assertEquals(fizzbuzzNumber(1), "1")


// %% tags=["subslide", alt]
public String fizzbuzzNumber(int n) {
    if (n == 3) {
        return "Fizz";
    }
    return Integer.toString(n);
}


// %% tags=["alt"]
assertEquals(fizzbuzzNumber(1), "1");
assertEquals(fizzbuzzNumber(3), "Fizz");


// %% tags=["subslide", alt]
public String fizzbuzzNumber(int n) {
    if (n == 3) {
        return "Fizz";
    }
    if (n == 5){
        return "Buzz";
    }
    return Integer.toString(n);
}


// %% tags=["alt"]
assertEquals(fizzbuzzNumber(1), "1");
assertEquals(fizzbuzzNumber(3), "Fizz");
assertEquals(fizzbuzzNumber(5), "Buzz");


// %% tags=["subslide", alt]
public String fizzbuzzNumber(int n) {
    if (n % 3 == 0) {
        return "Fizz";
    }
    if (n % 5 == 0){
        return "Buzz";
    }
    return Integer.toString(n);
}


// %% tags=["alt"]
assertEquals(fizzbuzzNumber(1), "1");
assertEquals(fizzbuzzNumber(3), "Fizz");
assertEquals(fizzbuzzNumber(5), "Buzz");
assertEquals(fizzbuzzNumber(6), "Fizz");


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public String fizzbuzzNumber(int n) {
    if (n % 15 == 0) {
        return "FizzBuzz";
    }
    if (n % 3 == 0) {
        return "Fizz";
    }
    if (n % 5 == 0){
        return "Buzz";
    }
    return Integer.toString(n);
}


// %%
assertEquals(fizzbuzzNumber(1), "1");
assertEquals(fizzbuzzNumber(3), "Fizz");
assertEquals(fizzbuzzNumber(5), "Buzz");
assertEquals(fizzbuzzNumber(6), "Fizz");
assertEquals(fizzbuzzNumber(15), "FizzBuzz");

