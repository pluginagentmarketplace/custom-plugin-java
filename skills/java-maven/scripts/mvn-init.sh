#!/bin/bash
# Initialize Maven project

GROUP_ID=${1:-"com.example"}
ARTIFACT_ID=${2:-"my-app"}

mvn archetype:generate \
    -DgroupId=$GROUP_ID \
    -DartifactId=$ARTIFACT_ID \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

echo "✅ Created Maven project: $ARTIFACT_ID"
