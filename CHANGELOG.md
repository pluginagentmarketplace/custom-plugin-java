# Changelog

## [3.0.0] - 2025-12-30

### 🎯 Production-Grade Upgrade

Complete upgrade to production-grade EQHM-compliant agent-skill architecture.

### Changed

#### Agents (8) - Production-Grade
All agents upgraded with:
- Input/Output JSON schemas
- ReAct pattern workflow
- Error handling strategies with fallbacks
- Token/cost optimization settings
- Comprehensive troubleshooting guides
- Debug checklists and log interpretation

| Agent | Role |
|-------|------|
| `01-java-fundamentals` | Java syntax, OOP, collections, streams |
| `02-java-advanced` | Concurrency, JVM internals, performance |
| `03-java-spring` | Spring Boot, MVC, Security, Cloud |
| `04-java-testing` | JUnit 5, Mockito, integration testing |
| `05-java-build-tools` | Maven, Gradle, CI/CD pipelines |
| `06-java-persistence` | JPA, Hibernate, query optimization |
| `07-java-microservices` | Spring Cloud, distributed systems |
| `08-java-devops` | Docker, Kubernetes, monitoring |

#### Skills (12) - SASMP v1.3.0 Compliant
All skills upgraded with:
- Parameter validation schemas
- Primary/Secondary bond types
- Quick reference code examples
- Troubleshooting tables
- Debug checklists

| Skill | Bonded Agent | Bond Type |
|-------|--------------|-----------|
| `java-fundamentals` | 01-java-fundamentals | PRIMARY |
| `java-concurrency` | 02-java-advanced | PRIMARY |
| `java-spring-boot` | 03-java-spring | PRIMARY |
| `java-testing` | 04-java-testing | PRIMARY |
| `java-maven-gradle` | 05-java-build-tools | PRIMARY |
| `java-jpa-hibernate` | 06-java-persistence | PRIMARY |
| `java-microservices` | 07-java-microservices | PRIMARY |
| `java-docker` | 08-java-devops | PRIMARY |
| `java-maven` | 05-java-build-tools | SECONDARY |
| `java-gradle` | 05-java-build-tools | SECONDARY |
| `java-performance` | 02-java-advanced | SECONDARY |
| `java-testing-advanced` | 04-java-testing | SECONDARY |

#### Commands (4) - v3.0.0
All commands upgraded with:
- Parameter validation in frontmatter
- Exit codes documentation
- Troubleshooting tables

### Fixed
- java-testing-advanced bonded_agent corrected to 04-java-testing
- All agent↔skill references verified
- Version consistency across all components

---

## [2.0.0] - 2025-12-29

### 🚀 Complete Rewrite

Complete rewrite with Java-specific content based on roadmap.sh structure.

### Added

#### Agents (8)
- `java-fundamentals` - Syntax, data types, control flow
- `java-oop` - Classes, inheritance, polymorphism
- `java-collections` - List, Set, Map, Queue
- `java-concurrency` - Threads, executors, CompletableFuture
- `java-build-tools` - Maven, Gradle
- `java-spring` - Spring Boot, Spring MVC
- `java-testing` - JUnit 5, Mockito
- `java-jvm` - Memory, GC, profiling

#### Skills (12) - Golden Format
- All skills with SKILL.md + assets/ + scripts/ + references/

#### Commands (4)
- `/java-check` - Environment verification
- `/java-new` - Project creation
- `/java-build` - Build automation
- `/java-debug` - Troubleshooting

### Changed
- Renamed to "java-development-assistant"
- SASMP v1.3.0 compliance

### Removed
- Generic developer roadmap content

## [1.0.0] - 2025-12-28

### Initial Release (Incorrect Content)
- Generic content (WRONG)
