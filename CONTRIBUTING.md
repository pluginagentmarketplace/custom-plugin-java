# Contributing to Java Plugin

Thank you for your interest in contributing to this Claude Code plugin!

## 📋 How to Contribute

1. **Fork** the repository
2. **Create** your feature branch (`git checkout -b feature/amazing-feature`)
3. **Follow** the Golden Format for new skills
4. **Test** your changes thoroughly
5. **Commit** your changes (`git commit -m 'feat: Add amazing feature'`)
6. **Push** to the branch (`git push origin feature/amazing-feature`)
7. **Open** a Pull Request

## 📐 Guidelines

### SASMP v1.3.0 Compliance

All contributions must follow SASMP (Standardized Agent/Skill Metadata Protocol) v1.3.0:

- Agents must include `sasmp_version: "1.3.0"` and `eqhm_enabled: true`
- Skills must include `bonded_agent` and `bond_type` fields
- Commands must have YAML frontmatter

### Agent Development

```yaml
---
name: agent-name
description: Agent description
model: sonnet
tools: Read, Write, Bash
sasmp_version: "1.3.0"
eqhm_enabled: true
---
```

### Skill Development (Golden Format)

```
skills/skill-name/
├── SKILL.md          # Main skill definition
├── assets/           # Templates, configs, schemas
├── scripts/          # Automation scripts
└── references/       # Documentation, guides
```

SKILL.md frontmatter:
```yaml
---
name: skill-name
description: Skill description
sasmp_version: "1.3.0"
bonded_agent: agent-name
bond_type: PRIMARY_BOND
---
```

### Command Development

```yaml
---
name: command-name
description: Command description
allowed-tools: Read, Glob
---
```

## ✅ Testing Requirements

- Test all new features locally
- Verify agent/skill bonding
- Run `/plugin validate` before submitting
- Ensure no E-code errors

## 🔒 Code of Conduct

- Be respectful and constructive
- Follow existing code style
- Document your changes
- Test before submitting

## ❓ Questions?

Open an issue for any questions or suggestions.

---

© 2025 Dr. Umit Kacar & Muhsin Elcicek. All Rights Reserved.
