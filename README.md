# Plugin Archetype for LogiCommerce

Template for create Plugins for LogiCommerce Platform.

**Clone project**:

```git clone https://github.com/logicommerce/plugin-archetype.git```

**Install archetype locally**:

```mvn clean install```

**Generate project from the archetype**:

```sh
mvn archetype:generate \
    -DarchetypeGroupId=com.logicommerce \
    -DarchetypeArtifactId=plugin-archetype \
    -DarchetypeVersion=1.2.1 \
    -DgroupId=your.project.groupId \
    -DartifactId=your-project-artifactId \
    -Dversion=your-project-version
```

You must replace with appropriate values for your project:

- your.project.groupId
- your-project-artifactId
- your-project-version

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
