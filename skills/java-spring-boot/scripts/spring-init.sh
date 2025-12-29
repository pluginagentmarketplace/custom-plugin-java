#!/bin/bash
curl https://start.spring.io/starter.tgz \
    -d type=maven-project \
    -d language=java \
    -d bootVersion=3.2.0 \
    -d javaVersion=21 \
    -d dependencies=web,data-jpa,postgresql \
    -d name=myapp | tar -xzf -
echo "✅ Spring Boot project created"
