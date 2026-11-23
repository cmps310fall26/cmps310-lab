# Lab 12 code

This folder contains the code for Lab 12. You do not need to retype the code listings from the handout.

| Folder | Used in | What it contains |
|---|---|---|
| `310Lab12` | Tasks 1, 2 and 4 | Package `adapter` is empty: write your Task 1 classes there. Package `performance` contains `PrimeCalculator` and `PrimeCalculatorJMeter` (Task 2). Package `APS` contains the APS classes and `ClientPerformanceTest2` (Task 4, S3). |
| `PrintShopLab10` | Task 3 | The Lab 10 Print Shop project with the new package `perf`, which contains `SlowPAS` (S1) and `PrintShopJMeter` (S2). |

## Before you start

1. In Eclipse, choose **File > Import > General > Existing Projects into Workspace** and import both folders. If you already have a `PrintShopLab10` project from Lab 10, either replace it or copy the package `perf` into it.
2. Each project shows errors until the JMeter JARs are on its Build Path. Add the four JARs listed in handout step 2.4 to **both** projects: `ApacheJMeter_core.jar` and `ApacheJMeter_java.jar` from `lib/ext`, and `jorphan.jar` and `log4j-api-2.22.1.jar` from `lib`.
3. Use Java 17 or later both to compile and to run JMeter. JMeter cannot load classes compiled for a newer Java version than the one it runs on.

## Building the JARs for JMeter

| Task | Packages to export | JAR name | Classname in the Java Request |
|---|---|---|---|
| 2 | `performance` | `primecalc.jar` | `performance.PrimeCalculatorJMeter` |
| 3 | `model`, `controller`, `perf` | `printshop.jar` | `perf.PrintShopJMeter` |
| 4 | `APS` | `aps.jar` | `APS.ClientPerformanceTest2` |

Copy each JAR into `apache-jmeter-5.6.3/lib/ext` and **restart JMeter**, because JMeter reads that folder only when it starts. Do not export the JMeter JARs or the JRE.

## A correction to the handout

In S2 (`PrintShopJMeter`), the handout creates the user with `new User(userId, "Test User", userId + "@qu.edu.qa")`. The Lab 10 `User` class has only `User(String userId, String name)`, so the supplied code uses `new User(userId, "Test User")`. Nothing else changes.
