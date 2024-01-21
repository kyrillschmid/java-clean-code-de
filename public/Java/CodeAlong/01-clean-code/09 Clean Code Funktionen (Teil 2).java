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
//  <b>Clean Code Funktionen (Teil 2)</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 09 Clean Code Funktionen (Teil 2).java -->
// <!-- slides/module_230_clean_code/topic_160_functions_part_two.java -->

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Weitere Regeln für Funktionen
//
// - Verwende beschreibende Namen
// - Verwende wenige (oder keine) Argumente
// - Verwende keine booleschen Argumente (Flag-Argumente)
// - Vermeide versteckte Seiteneffekte

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Versteckte Seiteneffekte

// %% [markdown]
//
// ```java
// public boolean checkPassword(String userName, String password) {
//    Optional<User> userOptional = UserGateway.findByName(userName);
//    if (userOptional.isPresent()) {
//        User user = userOptional.get();
//        String codedPhrase = user.getPhraseEncodedByPassword();
//        String phrase = cryptographer.decrypt(codedPhrase, password);
//        if ("Valid Password".equals(phrase)) {
//            session.initialize();
//            return true;
//        }
//    }
//    return false;
// }
// ```

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Vermeide "Ausgabeargumente"

// %% tags=["keep"]
public class HitResultV1 {
    boolean collisionOccurred = false;
}

public class Obstacle {
    
}


// %% tags=["keep"]
public class PlayerV1 {
    
    public void checkCollision(List<Obstacle> obstacles, HitResultV1 hitResult) {
        // Complicated computation...
        hitResult.collisionOccurred = true;
    }
}


// %% tags=["keep"]
PlayerV1 player = new PlayerV1();
HitResultV1 hitResult = new HitResultV1();
player.checkCollision(Collections.emptyList(), hitResult);
if (hitResult.collisionOccurred) {
    System.out.println("Detected collision!");
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%


// %% tags=["keep"]
Player player = new Player();
HitResult hitResult = player.checkCollision(new ArrayList<Obstacle>());
if(hitResult.collisionOccurred){
    System.out.println("Collision detected!");
}

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Command-Query Separation

// %% tags=["keep"]
int defaultValue = -1;


// %% tags=["keep"]
private boolean badHasDefaultValue() {
    if (defaultValue >= 0) {
        return true;
    } else {
        defaultValue = 123;
        return false;
    }
}


// %%

// %%

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


// %%


// %%

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Fehlerbehandlung
//
// Verwende Ausnahmen zur Fehlerbehandlung.

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## DRY: Don't Repeat Yourself
//
// - Versuche, duplizierten Code zu eliminieren.
//   - Wiederholung bläht den Code auf
//   - Wiederholung von Code erfordert mehrere Modifikationen für jede Änderung
// - Aber: oft ist duplizierter Code mit anderem Code durchsetzt
// - Berücksichtige den Bereich, in dem Sie den Code DRY halten!
