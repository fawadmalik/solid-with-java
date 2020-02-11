![Java CI](https://github.com/fawadmalik/solid-with-java/workflows/Java%20CI/badge.svg)
# solid-with-java

### Running with maven
Use this commandlineinvocation:
$ mvn exec:java -Dexec.mainClass=com.e2eqa.solidwithjava.hr.main.NatHolidayEmployeeTimeOffMain

If you run the classed ending in Bad in the main package you will get runtime exceptions due to bad ngeritance implementation.
If you run the other classes without the Bad postfix, then you will get expected results. This will demonstrate the LikovsubstitutionPrinciple.

Use the difference in the Bad and regular namesake classes to observe how the refactoring has ixed the problems seen due to bad OOP.
```
WeRUs@DESKTOP-OO638E0 MINGW64 /c/dev/eclipse-workspace/solid-with-java (feature-liskov-substitution-principle)
$ mvn exec:java -Dexec.mainClass=com.e2eqa.solidwithjava.hr.main.NatHolidayEmployeeTimeOffMain
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< com.e2eqa.solidwithjava:solid-with-java >---------------
[INFO] Building solid-with-java 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ solid-with-java ---
Time off request for full time employee Anna Smith; Nb days 1; Requested from Steve Jackson
Time off request for full time employee Billy Leech; Nb days 1; Requested from Steve Jackson
Time off request for part time employee Steve Jones; Nb days 1; Requested from Steve Jackson
Time off request for part time employee Magda Iovan; Nb days 1; Requested from Steve Jackson
Time off request for intern John Lee; Nb days 1; Requested from Steve Jackson
Time off request for intern Catherine Allison; Nb days 1; Requested from Steve Jackson
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.020 s
[INFO] Finished at: 2020-02-10T20:08:51-08:00
[INFO] ------------------------------------------------------------------------

WeRUs@DESKTOP-OO638E0 MINGW64 /c/dev/eclipse-workspace/solid-with-java (feature-liskov-substitution-principle)
$ mvn exec:java -Dexec.mainClass=com.e2eqa.solidwithjava.hr.main.CalculateEmployeeTaxesMain
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< com.e2eqa.solidwithjava:solid-with-java >---------------
[INFO] Building solid-with-java 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ solid-with-java ---
Info: Anna Smith taxes: $620.00
Info: Billy Leech taxes: $339.00
Info: Steve Jones taxes: $268.00
Info: Magda Iovan taxes: $293.00
Info: John Lee taxes: $0.00
Info: Catherine Allison taxes: $80.00
Info: Total taxes = $1,600.00
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.759 s
[INFO] Finished at: 2020-02-10T20:09:06-08:00
[INFO] ------------------------------------------------------------------------
```
