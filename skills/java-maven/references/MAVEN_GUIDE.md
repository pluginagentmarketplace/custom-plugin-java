# Maven Complete Guide

## Build Lifecycle

### Default Lifecycle
1. validate
2. compile
3. test
4. package
5. verify
6. install
7. deploy

### Clean Lifecycle
1. pre-clean
2. clean
3. post-clean

## Multi-Module Projects

```xml
<!-- Parent pom.xml -->
<project>
    <groupId>com.example</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <modules>
        <module>core</module>
        <module>api</module>
        <module>web</module>
    </modules>

    <dependencyManagement>
        <dependencies>
            <!-- Shared versions -->
        </dependencies>
    </dependencyManagement>
</project>
```

## Profiles

```xml
<profiles>
    <profile>
        <id>dev</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <properties>
            <db.url>jdbc:postgresql://localhost/devdb</db.url>
        </properties>
    </profile>
    <profile>
        <id>prod</id>
        <properties>
            <db.url>jdbc:postgresql://prod-server/proddb</db.url>
        </properties>
    </profile>
</profiles>
```

## Common Plugins

```xml
<!-- Compiler -->
<plugin>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <source>21</source>
        <target>21</target>
    </configuration>
</plugin>

<!-- Surefire (tests) -->
<plugin>
    <artifactId>maven-surefire-plugin</artifactId>
</plugin>

<!-- JAR -->
<plugin>
    <artifactId>maven-jar-plugin</artifactId>
    <configuration>
        <archive>
            <manifest>
                <mainClass>com.example.Main</mainClass>
            </manifest>
        </archive>
    </configuration>
</plugin>
```
