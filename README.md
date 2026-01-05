<div align="center">

<!-- Animated Typing Banner -->
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=28&duration=3000&pause=1000&color=2E9EF7&center=true&vCenter=true&multiline=true&repeat=true&width=600&height=100&lines=Java+Assistant;8+Agents+%7C+12+Skills;Claude+Code+Plugin" alt="Java Assistant" />

<br/>

<!-- Badge Row 1: Status Badges -->
[![Version](https://img.shields.io/badge/Version-3.0.0-blue?style=for-the-badge)](https://github.com/pluginagentmarketplace/custom-plugin-java/releases)
[![License](https://img.shields.io/badge/License-Custom-yellow?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Production-brightgreen?style=for-the-badge)](#)
[![SASMP](https://img.shields.io/badge/SASMP-v1.3.0-blueviolet?style=for-the-badge)](#)
[![EQHM](https://img.shields.io/badge/EQHM-Enabled-green?style=for-the-badge)](#)

<!-- Badge Row 2: Content Badges -->
[![Agents](https://img.shields.io/badge/Agents-8-orange?style=flat-square&logo=robot)](#-agents)
[![Skills](https://img.shields.io/badge/Skills-12-purple?style=flat-square&logo=lightning)](#-skills)
[![Commands](https://img.shields.io/badge/Commands-4-green?style=flat-square&logo=terminal)](#-commands)

<br/>

<!-- Quick CTA Row -->
[📦 **Install Now**](#-quick-start) · [🤖 **Explore Agents**](#-agents) · [📖 **Documentation**](#-documentation) · [⭐ **Star this repo**](https://github.com/pluginagentmarketplace/custom-plugin-java)

---

### What is this?

> **Java Assistant** is a Claude Code plugin with **8 agents** and **12 skills** for java development.

</div>

---

## 📑 Table of Contents

<details>
<summary>Click to expand</summary>

- [Quick Start](#-quick-start)
- [Features](#-features)
- [Agents](#-agents)
- [Skills](#-skills)
- [Commands](#-commands)
- [Documentation](#-documentation)
- [Contributing](#-contributing)
- [License](#-license)

</details>

---

## 🚀 Quick Start

### Prerequisites

- Claude Code CLI v2.0.27+
- Active Claude subscription

### Installation (Choose One)

<details open>
<summary><strong>Option 1: From Marketplace (Recommended)</strong></summary>

```bash
# Step 1️⃣ Add the marketplace
/plugin marketplace add pluginagentmarketplace/custom-plugin-java

# Step 2️⃣ Install the plugin
/plugin install java-development-assistant@pluginagentmarketplace-java

# Step 3️⃣ Restart Claude Code
# Close and reopen your terminal/IDE
```

</details>

<details>
<summary><strong>Option 2: Local Installation</strong></summary>

```bash
# Clone the repository
git clone https://github.com/pluginagentmarketplace/custom-plugin-java.git
cd custom-plugin-java

# Load locally
/plugin load .

# Restart Claude Code
```

</details>

### ✅ Verify Installation

After restart, you should see these agents:

```
java-development-assistant:01-java-fundamentals
java-development-assistant:02-java-advanced
java-development-assistant:03-java-spring
java-development-assistant:04-java-testing
java-development-assistant:05-java-build-tools
java-development-assistant:06-java-persistence
java-development-assistant:07-java-microservices
java-development-assistant:08-java-devops
```

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🤖 **8 Agents** | Production-grade AI agents with ReAct pattern |
| 🛠️ **12 Skills** | SASMP-compliant skills with Golden Format |
| ⌨️ **4 Commands** | Quick slash commands with validation |
| 🔄 **SASMP v1.3.0** | Full protocol compliance |
| ✅ **EQHM** | Error handling, quality, and monitoring enabled |

---

## 🤖 Agents

### 8 Production-Grade Agents

| # | Agent | Purpose | Primary Skill |
|---|-------|---------|---------------|
| 1 | **01-java-fundamentals** | Java syntax, OOP, collections, streams | `java-fundamentals` |
| 2 | **02-java-advanced** | Concurrency, JVM internals, performance | `java-concurrency` |
| 3 | **03-java-spring** | Spring Boot, MVC, Security, Cloud | `java-spring-boot` |
| 4 | **04-java-testing** | JUnit 5, Mockito, integration testing | `java-testing` |
| 5 | **05-java-build-tools** | Maven, Gradle, CI/CD pipelines | `java-maven-gradle` |
| 6 | **06-java-persistence** | JPA, Hibernate, query optimization | `java-jpa-hibernate` |
| 7 | **07-java-microservices** | Spring Cloud, distributed systems | `java-microservices` |
| 8 | **08-java-devops** | Docker, Kubernetes, monitoring | `java-docker` |

---

## 🛠️ Skills

### 12 SASMP-Compliant Skills

| Skill | Description | Bond Type |
|-------|-------------|-----------|
| `java-fundamentals` | Core Java syntax, OOP, collections, streams | PRIMARY |
| `java-concurrency` | Threads, executors, CompletableFuture, virtual threads | PRIMARY |
| `java-spring-boot` | Spring Boot REST APIs, Security, Data, Actuator | PRIMARY |
| `java-testing` | JUnit 5, Mockito, integration testing, TDD | PRIMARY |
| `java-maven-gradle` | Build configuration, dependencies, CI/CD | PRIMARY |
| `java-jpa-hibernate` | Entity design, queries, transactions, caching | PRIMARY |
| `java-microservices` | Spring Cloud, service mesh, event-driven patterns | PRIMARY |
| `java-docker` | Dockerfile optimization, JVM settings, security | PRIMARY |
| `java-maven` | Maven POM, lifecycle, plugins | SECONDARY |
| `java-gradle` | Gradle Kotlin DSL, build optimization | SECONDARY |
| `java-performance` | JVM tuning, GC, profiling, benchmarking | SECONDARY |
| `java-testing-advanced` | Testcontainers, contract testing, mutation testing | SECONDARY |

---

## ⌨️ Commands

| Command | Description |
|---------|-------------|
| `/java-build` | Build Java project with Maven or Gradle |
| `/java-new` | Create a new Java project with Maven or Gradle |
| `/java-check` | Check Java and build tool installation and configuration |
| `/java-debug` | Debug Java applications and troubleshoot common issues |

---

## 📚 Documentation

| Document | Description |
|----------|-------------|
| [CHANGELOG.md](CHANGELOG.md) | Version history |
| [CONTRIBUTING.md](CONTRIBUTING.md) | How to contribute |
| [LICENSE](LICENSE) | License information |

---

## 📁 Project Structure

<details>
<summary>Click to expand</summary>

```
custom-plugin-java/
├── 📁 .claude-plugin/
│   ├── plugin.json
│   └── marketplace.json
├── 📁 agents/              # 8 agents
├── 📁 skills/              # 12 skills (Golden Format)
├── 📁 commands/            # 4 commands
├── 📁 hooks/
├── 📄 README.md
├── 📄 CHANGELOG.md
└── 📄 LICENSE
```

</details>

---

## 📅 Metadata

| Field | Value |
|-------|-------|
| **Version** | 3.0.0 |
| **Last Updated** | 2025-12-30 |
| **Status** | Production Ready |
| **SASMP** | v1.3.0 |
| **EQHM** | Enabled |
| **Agents** | 8 |
| **Skills** | 12 |
| **Commands** | 4 |

---

## 🤝 Contributing

Contributions are welcome! Please read our [Contributing Guide](CONTRIBUTING.md).

1. Fork the repository
2. Create your feature branch
3. Follow the Golden Format for new skills
4. Submit a pull request

---

## ⚠️ Security

> **Important:** This repository contains third-party code and dependencies.
>
> - ✅ Always review code before using in production
> - ✅ Check dependencies for known vulnerabilities
> - ✅ Follow security best practices
> - ✅ Report security issues privately via [Issues](../../issues)

---

## 📝 License

Copyright © 2025 **Dr. Umit Kacar** & **Muhsin Elcicek**

Custom License - See [LICENSE](LICENSE) for details.

---

## 👥 Contributors

<table>
<tr>
<td align="center">
<strong>Dr. Umit Kacar</strong><br/>
Senior AI Researcher & Engineer
</td>
<td align="center">
<strong>Muhsin Elcicek</strong><br/>
Senior Software Architect
</td>
</tr>
</table>

---

<div align="center">

**Made with ❤️ for the Claude Code Community**

[![GitHub](https://img.shields.io/badge/GitHub-pluginagentmarketplace-black?style=for-the-badge&logo=github)](https://github.com/pluginagentmarketplace)

</div>
