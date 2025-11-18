# Developer Roadmap Navigator Plugin

🚀 **Your comprehensive guide to modern development careers and skills**

A powerful Claude Code plugin that brings the complete [developer-roadmap](https://github.com/kamranahmedse/developer-roadmap) ecosystem into Claude Code with 7 specialized agents, interactive learning paths, progress tracking, and curated resources.

## Features

✨ **69 Developer Roadmaps** - Access to every development career path from roadmap.sh
🤖 **7 Specialized Agents** - Expert guidance for web, backend, mobile, data, DevOps, architecture, and leadership
📚 **Interactive Learning Paths** - Personalized recommendations based on your goals and experience
📊 **Progress Tracking** - Visual progress, analytics, streaks, and motivational milestones
🎯 **Resource Curation** - Best tutorials, courses, books, communities, and projects
⚖️ **Technology Comparison** - Compare frameworks, languages, and platforms side-by-side
💼 **Career Guidance** - Navigate transitions and specializations with confidence
📈 **Job Market Insights** - Real-time demand, salary data, and hiring trends

## Quick Start

### Installation

```bash
# Using local path in Claude Code
claude code plugins add ./developer-roadmap-navigator

# Or use plugin marketplace (coming soon)
claude code plugins add marketplace:developer-roadmap-navigator
```

### Usage

Start with the `/learn` command to get personalized recommendations:

```
/learn
```

Then explore the available commands:

- **`/learn`** - Get personalized learning path based on your goals
- **`/explore`** - Deep-dive into any of 69 roadmaps with detailed breakdowns
- **`/progress`** - Track your learning journey with analytics
- **`/resources`** - Find curated tutorials, courses, books, and communities

## 7 Specialized Agents

| Agent | Focus | Best For |
|-------|-------|----------|
| 🌐 **Web Development Specialist** | Frontend, React, Vue, Angular, TypeScript | Building web applications |
| 🔧 **Backend & Systems Architect** | Node.js, Python, Java, Go, databases, APIs | Server-side development |
| 📱 **Mobile & Data Expert** | iOS, Android, React Native, Flutter, ML, AI | Mobile apps and data science |
| ☁️ **DevOps & Cloud Engineer** | Docker, Kubernetes, Terraform, AWS, cloud | Infrastructure and deployment |
| 🏗️ **Architecture & Security Specialist** | System Design, Security, Blockchain | Scalable and secure systems |
| 👥 **Leadership & Specializations** | Product, Management, Writing, DevRel, QA, UX | Career transitions and leadership |
| 🗺️ **Universal Navigator** | All 69 roadmaps | Finding your path |

## Plugin Structure

```
developer-roadmap-navigator/
├── .claude-plugin/
│   └── plugin.json ..................... Plugin manifest
├── agents/
│   ├── 01-web-development-specialist.md
│   ├── 02-backend-systems-architect.md
│   ├── 03-mobile-data-expert.md
│   ├── 04-devops-cloud-engineer.md
│   ├── 05-architecture-security-specialist.md
│   ├── 06-leadership-specializations.md
│   └── 07-universal-navigator.md
├── commands/
│   ├── learn.md ................. Personalized learning paths
│   ├── explore.md ............... Deep-dive into roadmaps
│   ├── progress.md .............. Track learning journey
│   └── resources.md ............. Find learning resources
├── skills/
│   ├── web-dev/SKILL.md
│   ├── backend-systems/SKILL.md
│   ├── mobile-data/SKILL.md
│   ├── devops-cloud/SKILL.md
│   ├── architecture-security/SKILL.md
│   ├── specializations/SKILL.md
│   └── universal-reference/SKILL.md
├── hooks/
│   └── hooks.json ............... Automation and progress tracking
└── README.md ..................... This file
```

## Roadmap Coverage

### 🌐 Web Development (9)
Frontend, React, Vue, Angular, Svelte, Solid, TypeScript, HTML/CSS, Next.js

### 🔧 Backend & Languages (12)
Backend, Node.js, Python, Java, Go, Rust, Kotlin, PHP, C++, SQL, PostgreSQL, MongoDB

### 📱 Mobile & Game Dev (8)
iOS, Android, React Native, Flutter, Swift, Game Dev, Server-Side Games, Unreal Engine

### 📊 Data & AI (8)
Data Scientist, Data Engineer, AI Engineer, ML Engineer, MLOps, BI Analyst, Prompt Engineering, AI & Data Scientist

### 🛠️ DevOps & Infrastructure (9)
DevOps, Docker, Kubernetes, Terraform, AWS, GCP, Azure, Linux, Cloudflare

### 🏗️ Architecture & Security (7)
System Design, Software Architect, Cyber Security, Blockchain, AI Red Teaming, GitOps, Cloudflare

### 👥 Leadership & Specialties (8)
Product Manager, Engineering Manager, Technical Writer, DevRel, QA, UX Designer, Game Designer, Prompt Engineer

## Example Workflows

### Getting Your First Developer Job (Beginner)
```
1. Run /learn → Select "Get first job" goal
2. Choose specialization (Frontend, Backend, or Mobile)
3. Follow personalized learning path
4. Track progress with /progress
5. Build portfolio projects
6. Interview preparation
```

### Career Transition (Intermediate)
```
1. Run /learn → Select "Career transition" goal
2. Select current role and target role
3. Get bridging path (e.g., Frontend → Backend)
4. Follow structured learning path
5. Practice with projects
6. Update portfolio for new role
```

### Specialization (Advanced)
```
1. Run /explore → Pick specialty (System Design, Security, etc)
2. Deep-dive into the roadmap
3. Follow advanced learning path
4. Practice real-world problems
5. Interview preparation for senior roles
```

## Key Concepts

### Experience Levels
- **Beginner**: 0-6 months coding
- **Intermediate**: 6-18 months experience
- **Advanced**: 18+ months, looking to specialize

### Learning Paths
- **Specialist**: Deep expertise in one area (React, Kubernetes, etc)
- **Generalist**: Broad knowledge across areas (Full-stack, DevOps)
- **Balanced**: Core specialization + complementary skills

### Career Progressions
```
Beginner → Junior Developer → Mid-level → Senior →
  ├─ Staff Engineer (technical)
  ├─ Engineering Manager (people)
  ├─ Architect (systems)
  └─ Specialist roles (Product, DevRel, etc)
```

## Progress Tracking Features

- **Visual Progress**: See % complete for each roadmap
- **Time Tracking**: Log hours and estimate completion
- **Streak Counting**: Celebrate consecutive learning days
- **Milestones**: Unlock achievements
- **Analytics**: Learning velocity and pace analysis
- **Weekly Reports**: Automatic progress summaries
- **Job Readiness**: Know when you're ready for roles

## Advanced Features

### Technology Comparison
Compare frameworks, languages, cloud platforms:
```
/explore react vs vue vs angular
```

### Resource Curation
Find best tutorials and courses:
```
/resources python --difficulty=beginner --format=video
```

### Job Market Insights
See real-time demand and salary data:
```
/resources system-design --goal=interview
```

## Hooks & Automation

The plugin includes intelligent hooks for:
- Auto-save progress when completing topics
- Learning streak tracking and celebration
- Skill recommendations at milestones
- Job readiness alerts
- Resource suggestions for new topics
- Agent routing for questions
- Weekly progress reports
- Community engagement prompts
- Burnout prevention
- Learning path optimization

## Configuration

All features can be enabled/disabled via `hooks.json`:
```json
{
  "enableNotifications": true,
  "enableProgressTracking": true,
  "enableAnalytics": true,
  "enableCommunityFeatures": true
}
```

## Community

- **GitHub**: [developer-roadmap](https://github.com/kamranahmedse/developer-roadmap)
- **Community**: [roadmap.sh](https://roadmap.sh) (+2.1M developers)
- **Discussions**: GitHub discussions, Reddit, Discord

## Contributing

Contributions welcome! Areas to improve:
- Add more resources and curations
- Expand agent capabilities
- Improve recommendations
- Add new roadmaps

## License

MIT License - Free to use and modify

## Support

- **Documentation**: See README.md
- **Issues**: Report via GitHub
- **Questions**: Ask in Claude Code chat
- **Feedback**: Community discussions

---

**Ready to start your learning journey?** Use `/learn` to get started! 🚀
