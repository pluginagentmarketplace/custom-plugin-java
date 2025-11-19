---
name: architecture-security
description: Master system design, software architecture, cybersecurity, threat modeling, and blockchain technologies. Build secure, scalable systems and understand architectural trade-offs.
---

# Architecture & Security Skills

## Quick Navigation

### Main Roadmaps
- **System Design** - Distributed systems and scaling
- **Software Architect** - Enterprise architecture patterns
- **Cyber Security** - Security hardening and compliance
- **Blockchain** - Web3 and smart contracts

## System Design Fundamentals

### Core Concepts (Beginner)
```
Scalability
    ├─ Horizontal scaling (multiple servers)
    ├─ Vertical scaling (bigger server)
    └─ Caching & CDN

Consistency & Availability
    ├─ CAP theorem (Pick 2)
    ├─ ACID vs BASE
    └─ Eventual consistency

APIs & Services
    ├─ REST principles
    ├─ GraphQL
    └─ gRPC

Databases
    ├─ SQL vs NoSQL
    ├─ Sharding & replication
    └─ Indexing strategies
```

### Advanced Concepts (Expert)
```
Distributed Systems
    ├─ Consensus (Raft, Paxos)
    ├─ Message queues
    └─ Event sourcing

Microservices
    ├─ Service boundaries
    ├─ API contracts
    ├─ Async communication
    └─ Saga pattern

Fault Tolerance
    ├─ Redundancy
    ├─ Failover mechanisms
    ├─ Circuit breakers
    └─ Bulkheads
```

## System Design Interview Prep

### Common Questions
1. **Design a URL Shortening Service** (like Bitly)
2. **Design a Social Media Feed** (like Twitter)
3. **Design a Real-time Chat** (like Slack)
4. **Design a Video Streaming Platform** (like YouTube)
5. **Design an E-commerce System** (like Amazon)
6. **Design a Ride-Sharing System** (like Uber)
7. **Design a Search Engine** (like Google)

### Design Process (6 steps)
```
1. Understand Requirements
   - Functional (what should it do)
   - Non-functional (scale, latency, etc)
   - Users, QPS, data volume

2. High-level Design
   - Draw architecture diagram
   - Identify main components
   - Define data flow

3. Deep Dive
   - Database schema
   - API design
   - Caching strategy
   - Search/indexing

4. Bottlenecks
   - Identify single points of failure
   - Scalability issues
   - Cost analysis

5. Trade-offs
   - Consistency vs Availability
   - Latency vs Throughput
   - Cost vs Performance

6. Optimization
   - CDN for static content
   - Database optimization
   - Monitoring and alerting
```

## Software Architecture Patterns

### Monolithic Architecture
```
Pros:
- Simple to develop initially
- Easy to deploy
- Performance is good

Cons:
- Hard to scale
- Tech stack locked
- Deployment all-or-nothing
```

### Microservices Architecture
```
Pros:
- Independent scaling
- Technology flexibility
- Autonomous teams
- Easy to replace components

Cons:
- Network latency
- Data consistency
- Operational complexity
- Monitoring overhead
```

### Event-Driven Architecture
```
Pros:
- Loose coupling
- Scalable
- Real-time capabilities

Cons:
- Eventual consistency
- Complex debugging
- Message ordering issues
```

### Serverless Architecture
```
Pros:
- No infrastructure management
- Pay per invocation
- Auto-scaling

Cons:
- Cold start latency
- Vendor lock-in
- Execution time limits
```

## Cybersecurity Essentials

### OWASP Top 10 (2023)
```
1. Broken Access Control
   - Authorization bypass
   - Privilege escalation
   - Horizontal/vertical escalation

2. Cryptographic Failures
   - Unencrypted sensitive data
   - Weak encryption
   - Exposed secrets

3. Injection
   - SQL injection
   - NoSQL injection
   - Command injection
   - LDAP injection

4. Insecure Design
   - Missing threat modeling
   - No security requirements
   - No input validation

5. Security Misconfiguration
   - Default credentials
   - Unnecessary services enabled
   - Missing security patches

6. Vulnerable/Outdated Components
   - Known vulnerabilities
   - Out of support software
   - Unpatched dependencies

7. Authentication Failures
   - Weak passwords
   - Session fixation
   - Credential exposure

8. Software/Data Integrity Failures
   - Insecure CI/CD
   - Unsigned updates
   - Insecure deserialization

9. Logging & Monitoring Failures
   - Missing logs
   - Insufficient audit trails
   - No alerting

10. SSRF (Server-Side Request Forgery)
    - Accessing internal services
    - Cloud metadata access
    - Local resource access
```

### Security by Development Phase

#### Design Phase
- Threat modeling (STRIDE, PASTA)
- Security requirements
- Data classification
- Risk assessment

#### Development Phase
- Secure coding practices
- Input validation/sanitization
- Error handling
- Dependency scanning (SAST)

#### Testing Phase
- Security testing (DAST)
- Penetration testing
- Vulnerability scanning
- API security testing

#### Deployment Phase
- Infrastructure hardening
- Secret management
- SSL/TLS certificates
- Access controls (RBAC)

#### Operations Phase
- Security monitoring
- Log aggregation
- Incident response
- Compliance auditing

### Common Security Tools

**Vulnerability Scanning**
- Nessus, OpenVAS, Qualys
- npm audit, pip-audit
- OWASP Dependency-Check

**SAST (Static Analysis)**
- SonarQube, Checkmarx
- Veracode, Snyk
- Semgrep

**DAST (Dynamic Analysis)**
- Burp Suite, OWASP ZAP
- Acunetix, Rapid7

**Container Security**
- Trivy, Aqua
- Twistlock, Falco
- Snyk Container

**Secret Management**
- HashiCorp Vault
- AWS Secrets Manager
- Azure Key Vault
- Sealed Secrets (K8s)

## Blockchain & Smart Contracts

### Blockchain Basics
```
Block = Hash + Previous Hash + Transactions + Timestamp

Chain = Block1 → Block2 → Block3 → ...

Consensus = Agreement on state without central authority
```

### Consensus Mechanisms
```
Proof of Work (PoW)
- Bitcoin, Ethereum (before)
- Computational puzzle solving
- Energy-intensive

Proof of Stake (PoS)
- Ethereum 2.0, Polygon
- Validator selection by stake
- Energy-efficient

Practical Byzantine Fault Tolerance
- Hyperledger Fabric
- Quick finality
- Enterprise use
```

### Smart Contracts (Solidity)
```solidity
pragma solidity ^0.8.0;

contract SimpleStorage {
    uint value;

    function setValue(uint newValue) public {
        value = newValue;
    }

    function getValue() public view returns (uint) {
        return value;
    }
}
```

### DeFi Concepts
```
Automated Market Makers (AMM)
- UniswapV3, Curve Finance
- Liquidity pools

Lending/Borrowing
- Aave, Compound
- Supply collateral, borrow

Derivatives
- Perpetual futures
- Options protocols
```

### Smart Contract Security

Common Vulnerabilities
```
❌ Reentrancy Attack
   Function calls itself recursively

❌ Integer Overflow/Underflow
   Math operations exceed limits

❌ Front-running
   Transaction ordering manipulation

❌ Poor Access Control
   Missing permission checks

❌ Uninitialized Storage
   Variables in wrong slots
```

Best Practices
```
✅ Use SafeMath library
✅ Check effects patterns
✅ External function restrictions
✅ Reentrancy guards
✅ Security audit before launch
```

## Design Trade-offs Matrix

| Choice | Trade-off | Scenario |
|--------|-----------|----------|
| **SQL vs NoSQL** | ACID vs Scalability | Structured data vs flexible schema |
| **Sync vs Async** | Latency vs Coupling | Real-time vs eventual consistency |
| **Cache vs DB** | Consistency vs Performance | Always fresh vs stale data |
| **Microservices vs Monolith** | Complexity vs Modularity | Scale vs simplicity |
| **On-premise vs Cloud** | Control vs Management | Data sovereignty vs flexibility |

## Getting Started: 30-Day Challenge

### System Design
```
Week 1: Fundamentals
- [ ] Learn scalability concepts
- [ ] Study databases and caching
- [ ] Understand CAP theorem

Week 2: Distributed Systems
- [ ] Message queues
- [ ] Load balancing
- [ ] Replication/sharding

Week 3: Practice
- [ ] Design a service (Tiny URL)
- [ ] Design a feed system
- [ ] Design a chat system

Week 4: Interview Prep
- [ ] Practice explaining designs
- [ ] Discuss trade-offs
- [ ] Improve communication
```

### Cybersecurity
```
Week 1: Fundamentals
- [ ] Learn OWASP Top 10
- [ ] Understand crypto basics
- [ ] Learn authentication

Week 2: Web Security
- [ ] SQL injection prevention
- [ ] XSS prevention
- [ ] CSRF protection

Week 3: Infrastructure
- [ ] Network security
- [ ] Access control
- [ ] Monitoring

Week 4: Practice
- [ ] OWASP WebGoat
- [ ] HackTheBox
- [ ] TryHackMe
```

## Essential Architecture Tools

- **Diagramming**: Lucidchart, Draw.io, Miro
- **API Design**: Postman, Swagger Editor
- **Load Testing**: k6, JMeter, Locust
- **Monitoring**: Prometheus, Grafana
- **Tracing**: Jaeger, Zipkin
- **Code Analysis**: SonarQube

## Next Steps

- Use `/explore` for detailed System Design or Security roadmaps
- Use `/learn` for architecture learning path
- Ask about specific design problems
- Explore threat modeling techniques
- Study blockchain architecture
