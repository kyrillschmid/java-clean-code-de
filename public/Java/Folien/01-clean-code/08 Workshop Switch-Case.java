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
//  <b>Workshop Switch-Case</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 08 Workshop Switch-Case.java -->
// <!-- slides/module_230_clean_code/topic_151_switch_workshop.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Mini-Workshop: Ersetzen von Switch-Anweisungen
//
// Strukturieren Sie den folgenden Code so um, dass nur noch bei der Erzeugung
// der Objekte eine "switch-Anweisung" verwendet wird:

// %% tags=["keep"]
public enum ComputerType {
    COMPUTER_TYPE_PC,
    COMPUTER_TYPE_MAC,
    COMPUTER_TYPE_CHROMEBOOK
}


// %% tags=["keep"]
public class ComputerV1 {
    private final ComputerType computerType;
    
    public ComputerV1(ComputerType computerType){
        this.computerType = computerType;
    }
    
    public ComputerType getComputerType(){
        return this.computerType;
    }
}


// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
public void compileCode(ComputerV1 computer) {
    switch (computer.getComputerType()) {
        case COMPUTER_TYPE_PC:
            System.out.println("Compiling code for PC.");
            break;
        case COMPUTER_TYPE_MAC:
            System.out.println("Compiling code for Mac.");
            break;
        case COMPUTER_TYPE_CHROMEBOOK:
            System.out.println("Compiling code for Chromebook.");
            break;
        default:
            throw new IllegalArgumentException(
                String.format("Don't know how to compile code for %s.", computer)
            );
    }
}


// %% tags=["keep"]
ComputerV1 myPc = new ComputerV1(ComputerType.COMPUTER_TYPE_PC);
ComputerV1 myMac = new ComputerV1(ComputerType.COMPUTER_TYPE_MAC);
ComputerV1 myChromebook = new ComputerV1(ComputerType.COMPUTER_TYPE_CHROMEBOOK);

// %% tags=["keep"]
compileCode(myPc);
compileCode(myMac);
compileCode(myChromebook);


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public abstract class Computer {
    public abstract void compileCode();
}


// %%
public class PC extends Computer {
    @Override
    public void compileCode() {
        System.out.println("Compiling code for PC.");
    }
    
    @Override
    public String toString(){
        return "I'm a Computer";
    }
}


// %%
public class Mac extends Computer {
    @Override
    public void compileCode() {
        System.out.println("Compiling code for Mac.");
    }
    
    @Override
    public String toString(){
        return "I'm a Mac";
    }
}


// %%
public class Chromebook extends Computer {
    @Override
    public void compileCode() {
        System.out.println("Compiling code for Chromebook.");
    }
    
    @Override
    public String toString(){
        return "I'm a ChromeBook";
    }
}


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public Computer createComputer(ComputerType type) {
    switch (type) {
        case COMPUTER_TYPE_PC:
            return new PC();
        case COMPUTER_TYPE_MAC:
            return new Mac();
        case COMPUTER_TYPE_CHROMEBOOK:
            return new Chromebook();
        default:
            throw new IllegalArgumentException("Don't know how to create computer of type " + type + ".");
    }
}

// %%
Computer myPc = createComputer(ComputerType.COMPUTER_TYPE_PC);
Computer myMac = createComputer(ComputerType.COMPUTER_TYPE_MAC);
Computer myChromebook = createComputer(ComputerType.COMPUTER_TYPE_CHROMEBOOK);
System.out.println(List.of(myPc.toString(), myMac, myChromebook));

// %%
myPc.compileCode();
myMac.compileCode();
myChromebook.compileCode();
