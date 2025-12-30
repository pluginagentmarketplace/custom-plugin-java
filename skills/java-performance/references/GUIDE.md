# Java Performance Guide

## Overview

This guide provides comprehensive documentation for the **java-performance** skill in the custom-plugin-java plugin.

## Category: Database

## Quick Start

### Prerequisites

- Familiarity with database concepts
- Development environment set up
- Plugin installed and configured

### Basic Usage

```bash
# Invoke the skill
claude "java-performance - [your task description]"

# Example
claude "java-performance - analyze the current implementation"
```

## Core Concepts

### Key Principles

1. **Consistency** - Follow established patterns
2. **Clarity** - Write readable, maintainable code
3. **Quality** - Validate before deployment

### Best Practices

- Always validate input data
- Handle edge cases explicitly
- Document your decisions
- Write tests for critical paths

## Common Tasks

### Task 1: Basic Implementation

```python
# Example implementation pattern
def implement_java_performance(input_data):
    """
    Implement java-performance functionality.

    Args:
        input_data: Input to process

    Returns:
        Processed result
    """
    # Validate input
    if not input_data:
        raise ValueError("Input required")

    # Process
    result = process(input_data)

    # Return
    return result
```

### Task 2: Advanced Usage

For advanced scenarios, consider:

- Configuration customization via `assets/config.yaml`
- Validation using `scripts/validate.py`
- Integration with other skills

## Troubleshooting

### Common Issues

| Issue | Cause | Solution |
|-------|-------|----------|
| Skill not found | Not installed | Run plugin sync |
| Validation fails | Invalid config | Check config.yaml |
| Unexpected output | Missing context | Provide more details |

## Related Resources

- SKILL.md - Skill specification
- config.yaml - Configuration options
- validate.py - Validation script

---

*Last updated: 2025-12-30*
