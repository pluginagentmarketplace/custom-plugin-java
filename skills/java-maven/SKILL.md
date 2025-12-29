---
name: java-maven
description: Master Apache Maven - project management, dependencies, and build automation
sasmp_version: "1.3.0"
bonded_agent: java-build-tools
bond_type: PRIMARY_BOND
---

# Java Maven Skill

## POM Structure

```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <properties>
        <java.version>21</java.version>
        <maven.compiler.source>${java.version}</maven.compiler.source>
        <maven.compiler.target>${java.version}</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>3.2.0</version>
        </dependency>
    </dependencies>
</project>
```

## Common Commands

```bash
# Lifecycle
mvn clean           # Clean target/
mvn compile         # Compile sources
mvn test            # Run tests
mvn package         # Create JAR/WAR
mvn install         # Install to local repo
mvn deploy          # Deploy to remote repo

# Useful commands
mvn dependency:tree  # Show dependency tree
mvn versions:display-dependency-updates
mvn help:effective-pom
```

## Dependency Scopes

| Scope | Compile | Test | Runtime |
|-------|---------|------|---------|
| compile | ✅ | ✅ | ✅ |
| provided | ✅ | ✅ | ❌ |
| runtime | ❌ | ✅ | ✅ |
| test | ❌ | ✅ | ❌ |

## Assets

- `pom-templates/` - POM templates
- `settings/` - Settings examples

## References

- `MAVEN_GUIDE.md` - Complete reference
