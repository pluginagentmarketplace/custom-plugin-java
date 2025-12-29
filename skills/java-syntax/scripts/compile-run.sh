#!/bin/bash
# Java Compile and Run Script

set -e

if [ -z "$1" ]; then
    echo "Usage: $0 <JavaFile.java>"
    exit 1
fi

FILE=$1
CLASS_NAME="${FILE%.java}"

echo "☕ Compiling $FILE..."
javac --release 21 "$FILE"

echo "🚀 Running $CLASS_NAME..."
java "$CLASS_NAME"

# Cleanup
rm -f "${CLASS_NAME}.class"

echo "✅ Done!"
