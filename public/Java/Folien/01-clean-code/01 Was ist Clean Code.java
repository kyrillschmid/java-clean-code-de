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
//  <b>Was ist Clean Code?</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 Was ist Clean Code.java -->
// <!-- slides/module_230_clean_code/topic_110_intro.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Was ist Clean Code?
//
// Meinungen von Experten:

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Grady Booch (OODA)
//
// - Clean code is simple and direct.
// - Clean code reads like well-written prose.
// - Clean code never obscures the designer’s intent but rather is full of crisp
//   abstractions and straightforward lines of control.

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Bjarne Stroustrup (C++)
//
// - I like my code to be elegant and efficient.
// - The logic should be straightforward to make it hard for bugs to hide, the
//   dependencies minimal to ease maintenance, error handling complete according
//   to an articulated strategy, and performance close to optimal so as not to
//   tempt people to make the code messy with unprincipled optimizations.
// - Clean code does one thing well.

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Ward Cunningham (Wiki)
//
// - You know you are reading clean code, when every routine that you read is
//   pretty much what you expected.
// - You can call it beautiful code when the code also makes it look like the
//   language was made for the problem.

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Michael Feathers (Legacy Code Book)
//
// - Clean code always looks like it was written by someone who cares.

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Ziel
//
// Eine Codebasis, mit der es Spaß macht zu arbeiten.

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Wie erreichen wir das?
//
// In vielen kleinen Schritten!

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Die Boy Scout Rule (für Code)
//
// Hinterlasse den Code besser als du ihn vorgefunden hast.
//
// (Robert C. Martin)
