# Plugin Archetype for LogiCommerce

Template for create Plugins for LogiCommerce Platform.

```sh
mvn archetype:generate \
    -DarchetypeGroupId=your.archetype.groupId \
    -DarchetypeArtifactId=your-archetype-artifactId \
    -DarchetypeVersion=your-archetype-version \
    -DgroupId=your.project.groupId \
    -DartifactId=your-project-artifactId \
    -Dversion=your-project-version
```

It will create a folder with artifactId name with basic plugin structure for LogiCommerce Platform

- artifactId/
  - src/
    - main/
      - /java
        - your.package
          - Definition.java
          - PropertiesValidator.jaava
        - module-info.java
      - resources/META-INF/your.package/
        - plugin.json
    - test/java
      - PropertiesValidatorTest.java
  - pom.xml
