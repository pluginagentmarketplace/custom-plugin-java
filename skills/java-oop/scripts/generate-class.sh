#!/bin/bash
# Generate Java class template

CLASS_NAME=${1:-"MyClass"}
PACKAGE=${2:-"com.example"}

mkdir -p "src/main/java/${PACKAGE//./\/}"

cat > "src/main/java/${PACKAGE//./\/}/${CLASS_NAME}.java" << EOF
package ${PACKAGE};

/**
 * ${CLASS_NAME}
 *
 * @author Generated
 */
public class ${CLASS_NAME} {

    public ${CLASS_NAME}() {
        // Constructor
    }

    public static void main(String[] args) {
        var instance = new ${CLASS_NAME}();
        System.out.println("Hello from ${CLASS_NAME}!");
    }
}
EOF

echo "✅ Created: src/main/java/${PACKAGE//./\/}/${CLASS_NAME}.java"
