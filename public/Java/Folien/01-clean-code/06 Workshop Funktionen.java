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
//  <b>Workshop: Funktionen</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 06 Workshop Funktionen.java -->
// <!-- slides/module_230_clean_code/topic_141_functions_workshop.java -->

// %% [markdown] lang="de" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Mini-Workshop: Do one Thing
//
// Die Funktion `handle_money_stuff()` macht mehr als eine Sache.
//
// Teilen Sie sie in mehrere Funktionen auf, so dass jede nur eine Sache tut.
// Stellen Sie sicher, dass
// - jede Funktion ihre Aufgabe gut erfüllt und sich auf einer einzigen
//   Abstraktionsebene befindet,
// - alle Namen angemessen sind, und
// - der Code leicht zu verstehen ist.
//
// *Tipp:* Beginnen Sie damit, die Variablen gemäß den Kommentaren umzubenennen,
// um den Rest der Arbeit zu vereinfachen.


// %% lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Name der Wochentage
List<String> lstDns = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri");

// %% [markdown] lang="de" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Die Funktion `handle_money_stuff()` hat folgende Parameter:
//
// - den Wochentag (`i_dow`, day of week),
// - das Gehalt pro Tag (`f_spd`, salary per day),
// - den Namen des Angestellten (`str_n`, name) und
// - einen Liste der bisher gezahlten Gehälter (`lst_slrs`, salaries).
//
// Das neue Gehalt wird an die Liste `lst_slrs` angehängt.
//
// Die Funktion gibt die zu zahlende Steuer zurück.

// %% tags=["keep"]
public double handleMoneyStuff(int iDow, float fSpd, String strN, List<Double> lstSlrs, List<String> lstDns) {
    // Get the day of week from the list of days.
    // We count Sunday as 1, Monday as 2, etc. but the work week starts on Monday.
    String strDow = lstDns.get(iDow - 1);
    // Compute the salary so far based on the day
    double fSsf = (iDow - 1) * fSpd;
    // The tax
    double fT = 0.0;
    if (fSsf > 500.0 && fSsf <= 1000.0) {
        fT = fSsf * 0.05;
    } else if (fSsf > 1000.0 && fSsf <= 2000.0) {
        fT = fSsf * 0.1;
    } else {
        fT = fSsf * 0.15;
    }
    // Update salary based on the tax to pay
    fSsf = fSsf - fT;
    // Add the salary to the list of all salaries paid
    lstSlrs.add(fSsf);
    System.out.printf("%s worked till %s and earned $%.2f this week.%n", strN, strDow, fSsf);
    System.out.printf("Their taxes were $%.2f.%n", fT);
    return fT;
}




// %% tags=["keep"]
List<Double> salaries = new ArrayList<>(Arrays.asList(2345.0, 1234.0));
double result = handleMoneyStuff(4, 200.0f, "Joe", salaries, lstDns);
System.out.println(result);

// %% tags=["keep"]
assert Arrays.equals(salaries.toArray(), new Double[] {2345.0, 1234.0, 570.0});
assert result == 30.0;

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
List<String> dayOfWeekNames = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri");

// %%
public double computeSalaryAndTaxesV1(int dayOfWeekIndex, float salaryPerDay, String employeeName, List<Double> salaries, List<String> dayOfWeekNames) {
    String dayOfWeek = dayOfWeekNames.get(dayOfWeekIndex - 1);
    int daysWorkedThisWeek = dayOfWeekIndex - 1;
    double salarySoFar = daysWorkedThisWeek * salaryPerDay;
    double tax = 0.0;
    if (salarySoFar > 500.0 && salarySoFar <= 1000.0) {
        tax = salarySoFar * 0.05;
    } else if (salarySoFar > 1000.0 && salarySoFar <= 2000.0) {
        tax = salarySoFar * 0.1;
    } else {
        tax = salarySoFar * 0.15;
    }
    salarySoFar = salarySoFar - tax;
    salaries.add(salarySoFar);
    System.out.printf("%s worked till %s and earned $%.2f this week.%n", employeeName, dayOfWeek, salarySoFar);
    System.out.printf("Their taxes were $%.2f.%n", tax);
    return tax;
}


// %% tags=["keep"]
List<Double> salaries = new ArrayList<>(Arrays.asList(2345.0, 1234.0));

// %%
double result = computeSalaryAndTaxesV1(4, 200.0f, "Joe", salaries, dayOfWeekNames);
System.out.println(result);

// %% tags=["keep"]
assert Arrays.equals(salaries.toArray(), new Double[] {2345.0, 1234.0, 570.0});
assert result == 30.0;


// %%
public double computeSalaryAndTaxesV2(int dayOfWeekIndex, float salaryPerDay, String employeeName, List<Double> salaries, List<String> dayOfWeekNames) {
    double baseSalary = computeBaseSalary(dayOfWeekIndex, salaryPerDay);
    double[] netSalaryAndTax = computeNetSalaryAndTax(baseSalary);
    double netSalary = netSalaryAndTax[0];
    double tax = netSalaryAndTax[1];
    storeNetSalary(netSalary, salaries);
    printEmployeeInfo(dayOfWeekIndex, employeeName, netSalary, tax, dayOfWeekNames);
    return tax;
}


// %%
public double computeBaseSalary(int dayOfWeekIndex, float salaryPerDay) {
    int daysWorkedThisWeek = dayOfWeekIndex - 1;
    return daysWorkedThisWeek * salaryPerDay;
}


// %%
public double[] computeNetSalaryAndTax(double baseSalary) {
    double tax = computeTax(baseSalary);
    double netSalary = baseSalary - tax;
    return new double[] {netSalary, tax};
}


// %%
public double computeTax(double baseSalary) {
    if (baseSalary > 500.0 && baseSalary <= 1000.0) {
        return baseSalary * 0.05;
    } else if (baseSalary > 1000.0 && baseSalary <= 2000.0) {
        return baseSalary * 0.1;
    } else {
        return baseSalary * 0.15;
    }
}

// %%
public void storeNetSalary(double netSalary, List<Double> salaries) {
    salaries.add(netSalary);
}

// %%
public void printEmployeeInfo(int dayOfWeekIndex, String name, double salary, double tax, List<String> dayOfWeekNames) {
    String dayOfWeek = dayOfWeekNames.get(dayOfWeekIndex - 1);
    System.out.printf("%s worked till %s and earned $%.2f this week.%n", name, dayOfWeek, salary);
    System.out.printf("Their taxes were $%.2f.%n", tax);
}

// %%
public String getDayOfWeekFromIndex(int index, List<String> dayOfWeekNames) {
    return dayOfWeekNames.get(index - 1);
}

// %%
List<Double> salaries = new ArrayList<>(Arrays.asList(2345.0, 1234.0));
double result = computeSalaryAndTaxesV2(4, 200.0f, "Joe", salaries, dayOfWeekNames);
System.out.println(result);


// %% tags=["keep"]
assert Arrays.equals(salaries.toArray(), new Double[] {2345.0, 1234.0, 570.0});
assert result == 30.0;
