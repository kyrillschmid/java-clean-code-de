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
//  <b>Interface-Segregation-Principle</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Interface-Segregation-Principle.java -->
// <!-- slides/module_280_solid/topic_150_a3_solid_isp.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## SOLID: Interface-Segregation-Principle
//
// - Kein Client einer Klasse C sollte von Methoden abhängen, die er nicht
//   benutzt.
// - Wenn das nicht der Fall ist
//   - Unterteile die Schnittstelle von C in mehrere unabhängige Schnittstellen.
//   - Ersetze C in jedem Client durch die vom Client tatsächlich verwendeten
//     Schnittstellen.

// %% tags=["keep", "slide"] slideshow={"slide_type": "slide"}
public interface Animal {
    void makeSound();
    void swim();
    void fly();
}

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void fly() {
        // Not applicable for a dog
        throw new UnsupportedOperationException("Dogs can't fly");
    }
}

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class Fish implements Animal {

    @Override
    public void makeSound() {
        // Not applicable for a fish
        throw new UnsupportedOperationException("Fish don't make sounds");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void fly() {
        // Not applicable for a fish
        throw new UnsupportedOperationException("Fish can't fly");
    }
}

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void swim() {
        // Not applicable for a bird
        throw new UnsupportedOperationException("Birds don't swim");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// %% tags=["keep"]
List<Animal> animals = Arrays.asList(new Dog(), new Bird(), new Fish());

// %%
for (Animal animal : animals) {
            animal.makeSound();
        }

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public interface SoundMaker {
    void makeSound();
}

public interface Swimmer {
    void swim();
}

public interface Flyer {
    void fly();
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class Dog implements SoundMaker, Swimmer {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}

// %%
public class Fish implements Swimmer {

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// %%
public class Bird implements SoundMaker, Flyer {

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// %% [markdown] lang="de"
//
// Mini-Workshop 1: Interface Segregation Principle
// ===============================================
// - Erstelle ein Interface `Vehicle` mit den Methoden `drive`, `fly` und `swim`
// - Erstelle eine Klasse `Car` die das Interface `Vehicle` implementiert
// - Erstelle eine Klasse `Boat` die das Interface `Vehicle` implementiert
// - Erstelle eine Klasse `Helicopter` die das Interface `Vehicle` implementiert
// - Erstelle eine Klasse `Amphibian` die das Interface `Vehicle` implementiert
// - Refaktoriere das Interface `Vehicle` so, dass es dem Interface Segregation


// %%
public interface Vehicle {
    void drive();
    void fly();
    void swim();
}

// %%
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void fly() {
        // Not applicable for a car
        throw new UnsupportedOperationException("Cars can't fly");
    }

    @Override
    public void swim() {
        // Not applicable for a car
        throw new UnsupportedOperationException("Cars can't swim");
    }
}

// %%
public class Boat implements Vehicle {

    @Override
    public void drive() {
        // Not applicable for a boat
        throw new UnsupportedOperationException("Boats can't drive");
    }

    @Override
    public void fly() {
        // Not applicable for a boat
        throw new UnsupportedOperationException("Boats can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Boat is swimming");
    }
}

// %%
public class Helicopter implements Vehicle {

    @Override
    public void drive() {
        // Not applicable for a helicopter
        throw new UnsupportedOperationException("Helicopters can't drive");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void swim() {
        // Not applicable for a helicopter
        throw new UnsupportedOperationException("Helicopters can't swim");
    }
}

// %%
public class Amphibian implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Amphibian is driving");
    }

    @Override
    public void fly() {
        System.out.println("Amphibian is flying");
    }

    @Override
    public void swim() {
        System.out.println("Amphibian is swimming");
    }
}

// %%
public interface Driveable {
    void drive();
}

// %%
public interface Flyable {
    void fly();
}

// %%
public interface Swimmable {
    void swim();
}
