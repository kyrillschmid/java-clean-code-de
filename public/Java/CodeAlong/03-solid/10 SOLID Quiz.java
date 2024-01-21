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
//  <b>SOLID Quiz</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 10 SOLID Quiz.java -->
// <!-- slides/module_280_solid/topic_180_quiz.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Frage 1:
// Welches SOLID-Prinzip wird in folgendem Code verletzt?:

// %% tags=["keep"]
interface Bird {
    void sing();
    void fly();
}

class Sparrow implements Bird {
    public void sing() {
        // Sing behaviour
    }
    public void fly() {
        // Fly behaviour
    }
}

class Ostrich implements Bird {
    public void sing() {
        throw new UnsupportedOperationException();
    }
    public void fly() {
        throw new UnsupportedOperationException();
    }
}

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Frage 2:
// Welches SOLID-Prinzip wird in folgendem Code verletzt?:

// %% tags=["keep"]
class Email {
    void sendEmail(String address, String subject, String content) {
        // Send an email
    }
}

class Notification {
    private Email email;

    void notifyUser(String user, String message) {
        email.sendEmail(user, "Notification", message);
    }
}

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Frage 3:
// Welches SOLID-Prinzip wird in folgendem Code verletzt?:

// %% tags=["keep"]
class DiscountCalculator {
    void calculateDiscount(Product product) {
        if (product.getType() == ProductType.SALE) {
            // Calculate sale discount
        } else if (product.getType() == ProductType.REGULAR) {
            // Calculate regular discount
        }
    }
}

// %%

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Frage 4:
// Welches SOLID-Prinzip wird in folgendem Code verletzt?:

// %% tags=["keep"]
public class Employee {
    private String name;
    private int age;
    private String address;

    public void saveEmployee() {
        // Code to save employee in database
    }
    
    public void generateEmployeeReport() {
        // Code to generate report
    }
}


// %%
