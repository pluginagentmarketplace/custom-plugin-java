#!/bin/bash
mvn clean package -DskipTests
docker build -t myapp:latest .
echo "✅ Docker image built"
