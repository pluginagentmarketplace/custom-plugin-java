---
name: backend-systems
description: Master backend development with databases, APIs, microservices, and system design. Covers Node.js, Python, Java, Go, PostgreSQL, MongoDB, and architectural patterns for building scalable systems.
sasmp_version: "1.3.0"
bonded_agent: 01-web-development-specialist
bond_type: PRIMARY_BOND
---

# Backend & Systems Skills

## Quick Navigation

### Main Roadmaps
- **Backend Developer** - Full backend development path
- **Node.js** - JavaScript runtime (Express, Fastify, NestJS)
- **Python** - Versatile language (Django, FastAPI, Flask)
- **Java** - Enterprise systems (Spring Boot)
- **Go** - Systems programming (performance, concurrency)
- **Rust** - Memory safety and performance
- **PostgreSQL** - Advanced relational database
- **MongoDB** - NoSQL document database
- **Redis** - In-memory data store (caching, sessions)

## Core Concepts Roadmap

### Phase 1: Fundamentals (3-6 months)
```
Internet & Protocols
    ↓
Choose Language (Node/Python/Java/Go)
    ↓
Core Language Features
    ↓
HTTP & REST APIs
    ↓
Databases Basics (SQL)
```

### Phase 2: Web Development (6-12 months)
```
Framework Basics (Express/Django/Spring/Gin)
    ↓
Authentication & Authorization
    ↓
Database Design & Optimization
    ↓
API Design (REST, GraphQL)
    ↓
Testing (Unit, Integration, E2E)
    ↓
Caching & Performance
```

### Phase 3: Systems (12+ months)
```
Microservices Architecture
    ↓
Distributed Systems
    ↓
Message Queues (Kafka, RabbitMQ)
    ↓
Database Scaling (Sharding, Replication)
    ↓
System Design
```

## Language Selection Guide

| Language | Best For | Popularity | Salary | Learning |
|----------|----------|-----------|--------|----------|
| **Node.js** | APIs, Full-stack | Very High (70%) | $120-160k | Easy |
| **Python** | Data, APIs, Fast | Very High (60%) | $110-150k | Easy |
| **Java** | Enterprise, Scale | High (50%) | $130-180k | Hard |
| **Go** | Microservices, Ops | Growing (30%) | $120-170k | Medium |
| **Rust** | Systems, Performance | Emerging (20%) | $140-190k | Hard |
| **PHP** | Web, WordPress | Established (30%) | $100-130k | Easy |

## Backend Framework Comparison

### Node.js Ecosystem
```javascript
// Express - Minimal, flexible
const app = require('express')();
app.get('/', (req, res) => res.send('Hello'));

// Fastify - High performance
const fastify = require('fastify')();
fastify.get('/', async () => ({ message: 'Hello' }));

// NestJS - Full-featured, TypeScript
@Controller('cats')
export class CatsController {
  @Get() findAll(): Cat[] { }
}
```

### Python Ecosystem
```python
# FastAPI - Modern, async
@app.get("/items/{item_id}")
async def read_item(item_id: int):
    return {"item_id": item_id}

# Django - Batteries-included
class Post(models.Model):
    title = models.CharField(max_length=200)

# Flask - Lightweight
@app.route('/hello')
def hello():
    return 'Hello World'
```

### Java Ecosystem
```java
// Spring Boot - Industry standard
@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) { }
}

// Play Framework - Functional
public Result index() {
    return ok(index.render());
}
```

## Database Selection Matrix

| Use Case | Best Choice | Alternatives |
|----------|------------|--------------|
| Relational data | PostgreSQL | MySQL, MariaDB |
| NoSQL documents | MongoDB | CouchDB, Firebase |
| Key-value cache | Redis | Memcached |
| Time-series | InfluxDB | Prometheus |
| Graph data | Neo4j | ArangoDB |
| Full-text search | Elasticsearch | Solr |
| Distributed SQL | CockroachDB | Spanner |

## Learning Path by Goal

### Goal: Get First Backend Job (6-12 months)
```
1. Pick language: Node.js (easiest) or Python (versatile)
2. Learn framework: Express (Node) or FastAPI (Python)
3. Master: HTTP, REST APIs, SQL, Git
4. Build: 3 backend projects (TODO API, Blog API, Real app)
5. Learn: Testing and Docker basics
6. Deploy: Heroku or AWS free tier
```

### Goal: Full-Stack Development (9-15 months)
```
1. Frontend: React or Vue (6 months)
2. Backend: Node.js + Express (4 months)
3. Databases: PostgreSQL (2 months)
4. Deploy: Docker + Basic DevOps (2 months)
5. System Design: Caching, Scaling (ongoing)
```

### Goal: Microservices Specialist (18-24 months)
```
1. Master one language deeply (6-9 months)
2. Learn system design (6 months)
3. Learn microservices patterns (3-6 months)
4. Learn orchestration: Kubernetes (3-6 months)
5. Build distributed system (3+ months)
```

### Goal: Database Specialist (12-18 months)
```
1. Learn SQL deeply: PostgreSQL (6 months)
2. NoSQL: MongoDB (3-4 months)
3. Database design and optimization (4 months)
4. Distributed databases (2-3 months)
5. Replication and sharding (2-3 months)
```

## Architecture Patterns Overview

### Simple Monolith
```
┌─────────────────────┐
│   Single Service    │
├─────────────────────┤
│   Web Server        │
│   Business Logic    │
│   Database Driver   │
└─────────────────────┘
   └─── PostgreSQL
```
Best for: Startups, MVPs, Small teams

### Layered Architecture
```
┌──────────────┐
│  API Layer   │ (Controllers)
├──────────────┤
│ Service Layer│ (Business logic)
├──────────────┤
│ Data Layer   │ (Repositories)
├──────────────┤
│ Database     │
└──────────────┘
```
Best for: Mid-size applications

### Microservices
```
┌──────────┐  ┌──────────┐  ┌──────────┐
│  Auth MS │  │  User MS │  │  Post MS │
└────┬─────┘  └────┬─────┘  └────┬─────┘
     │             │             │
     └─────────────┼─────────────┘
            ┌──────┴──────┐
            │   API GW    │
            └─────────────┘
            │   Messaging │
            └─────────────┘
```
Best for: Large scale, complex domains

## Essential Tools

### Development
- **Languages**: Node.js, Python, Java, Go
- **Package Managers**: npm/yarn, pip, Maven, Cargo
- **Editors**: VS Code, IntelliJ (Java), GoLand
- **HTTP Testing**: Postman, Thunder Client, curl

### Databases
- **SQL**: PostgreSQL, MySQL
- **NoSQL**: MongoDB, Redis
- **Clients**: DBeaver, DataGrip, Studio 3T

### API Development
- **REST**: OpenAPI/Swagger
- **GraphQL**: Apollo, Hasura
- **gRPC**: Protocol Buffers

### Testing
- **Unit**: Jest, Pytest, JUnit
- **Integration**: Testcontainers, Test fixtures
- **API**: Postman, RestAssured
- **Performance**: k6, JMeter

### Monitoring
- **Logs**: ELK Stack, Loki
- **Metrics**: Prometheus, Grafana
- **Tracing**: Jaeger, Zipkin
- **APM**: DataDog, New Relic

## Quick Start: Build Your First API

### Node.js + Express (30 minutes)
```bash
mkdir my-api && cd my-api
npm init -y
npm install express
# Create app.js with REST endpoints
node app.js
```

### Python + FastAPI (30 minutes)
```bash
mkdir my-api && cd my-api
python -m venv venv
source venv/bin/activate
pip install fastapi uvicorn
# Create main.py with endpoints
uvicorn main:app --reload
```

## Common Mistakes to Avoid

❌ Learning too many languages
❌ Skipping database fundamentals
❌ Not writing tests
❌ Ignoring security (SQL injection, auth)
❌ Building without API design
❌ Not monitoring production

✅ Pick ONE language and master it
✅ Learn SQL deeply
✅ Write tests from day 1
✅ Follow OWASP guidelines
✅ Design APIs properly first
✅ Setup monitoring early

## Next Steps

- Use `/explore` to see specific framework/language roadmaps
- Use `/learn` to get backend learning path
- Ask for API design patterns or database optimization tips
- Explore complementary DevOps and architecture concepts
