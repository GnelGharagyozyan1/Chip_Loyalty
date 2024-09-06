# Test Automation Project for [Chips Loyalty](https://www.iwantchips.com/)

## **Contents:** ##

* <a href="#tools">Technologies and tools</a>

* <a href="#cases">Examples of automated test cases</a>

* <a href="#jenkins">Build in Jenkins</a>

* <a href="#console">Run from Terminal</a>

* <a href="#allure">Allure report</a>



-----
<a id="tools"></a>
## <a name="Technologies and tools">**Technologies and tools:**</a>

<p align="center">
<a href="https://www.w3schools.com/java/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" title="Java" alt="Java" width="40" height="40"/> </a> 
<a href="https://www.jetbrains.com/idea/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" title="IntelliJ Idea" alt="IntelliJ Idea" width="40" height="40"/> </a> 
<a href="https://git-scm.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" title="Git" alt="Git" width="40" height="40"/> </a> 
<a href="https://junit.org/junit5"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" title="JUnit5" alt="JUnit5" width="40" height="40"/> </a>
<a href="https://selenide.org"> <img src="images/selenide.png" title="Selenide" alt="Selenide" width="40" height="40"/> </a>
<a href="https://gradle.org"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" title="Gradle" alt="Gradle" width="40" height="40"/> </a>
<a href="https://allurereport.org/"> <img src="images/allure_report.png" title="Allure report" alt="Allure report" width="40" height="40"/> </a>
<a href="https://www.jenkins.io"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" title="Jenkins" alt="Jenkins" width="40" height="40"/> </a>
<a href="https://www.atlassian.com/software/jira"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg" title="Jira" alt="Jira" width="40" height="40"/> </a>
</p>

- The UI autotests were written in **Java**.
- **Gradle** was used as a builder.
- **JUnit 5** and **Selenide** frameworks were used as test frameworks.
- For remote run, a job in **Jenkins** with **Allure report** generation.


----
<a id="console"></a>
## Run from Terminal
___
**Local launch**
```bash  
gradle clean test
```

----
<a id="allure"></a>
## Allure report 

**Main report page**
<p align="center">  
<img src="images/Screenshot 2024-09-06 at 06.39.01.png" alt="Allure Report main" width="950"/></a>  
</p>

**Test cases**
<p align="center">  
<img src="images/Screenshot 2024-09-06 at 06.39.29.png" alt="Allure Report testcases" width="950"/></a>  
</p>



