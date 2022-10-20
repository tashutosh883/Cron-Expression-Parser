# Cron Expression Parser

### Supported Cron format:

```
<Minute> <Hour> <Day_of_the_month> <month> <day_of_week> <command>
```

### Supported special characters:

* \* -star
* *-* - range
* *,* -list
* \*/* -step


### TODO:

* ?, L, W 
* Validate Cron





#### Steps to run:

```
1. Clone the repository
2. mvn clean install in source root
3. cd target
4. java -jar cron-expression-parser-1.0-SNAPSHOT.jar '<cron>'
```
