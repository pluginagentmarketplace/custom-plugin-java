---
name: devops-cloud
description: Master DevOps, containerization, orchestration, cloud platforms, and infrastructure automation. Learn Docker, Kubernetes, Terraform, AWS, GCP, Azure, CI/CD, and GitOps.
sasmp_version: "1.3.0"
bonded_agent: 01-web-development-specialist
bond_type: PRIMARY_BOND
---

# DevOps & Cloud Skills

## Quick Navigation

### Main Roadmaps
- **DevOps Roadmap** - Complete DevOps practices
- **Docker** - Containerization technology
- **Kubernetes** - Container orchestration
- **Terraform** - Infrastructure as Code
- **AWS** - Amazon cloud platform
- **Linux** - OS fundamentals
- **Cloudflare** - CDN and security

## DevOps Fundamentals

### Core Concepts
```
Infrastructure as Code (IaC)
    ↓
Containerization (Docker)
    ↓
Orchestration (Kubernetes)
    ↓
CI/CD Pipelines
    ↓
Monitoring & Logging
    ↓
GitOps & Automation
```

## Learning Paths

### DevOps Beginner to Professional (12-18 months)

#### Phase 1: Foundations (2-3 months)
```
1. Linux fundamentals
   - File system, permissions
   - Users, groups, sudo
   - Bash scripting basics
   - System processes

2. Networking basics
   - IP, DNS, TCP/IP
   - HTTP/HTTPS
   - Ports and services
   - Firewalls

3. Web servers
   - Nginx configuration
   - Apache basics
   - Virtual hosts
   - SSL/TLS certificates
```

#### Phase 2: Containerization (3-4 months)
```
1. Docker essentials
   - Images and containers
   - Dockerfile writing
   - Docker Compose
   - Registry management

2. Container networking
   - Bridge networks
   - Custom networks
   - Port mapping
   - Volume management

3. Security
   - Image scanning
   - Run as non-root
   - Network policies
```

#### Phase 3: Orchestration (4-6 months)
```
1. Kubernetes basics
   - Pods, deployments, services
   - ConfigMaps and secrets
   - Persistent volumes
   - YAML manifests

2. Advanced K8s
   - Helm charts
   - Operators
   - StatefulSets
   - Networking policies

3. Monitoring
   - Prometheus setup
   - Grafana dashboards
   - Alerts configuration
```

#### Phase 4: Infrastructure & Cloud (3-4 months)
```
1. Infrastructure as Code
   - Terraform basics
   - AWS resources
   - State management
   - Modules

2. Cloud platform
   - Choose: AWS, GCP, or Azure
   - Networking (VPC)
   - Compute (EC2/VM)
   - Storage (S3, etc)

3. CI/CD pipelines
   - GitHub Actions
   - GitLab CI
   - Jenkins basics
   - Deployment automation
```

## Technology Stack Comparison

### Container Platforms
| Tool | Purpose | Learning | Industry Use |
|------|---------|----------|--------------|
| **Docker** | Containerization | Easy | 95% adoption |
| **Podman** | Docker alternative | Easy | Growing |
| **containerd** | Container runtime | Hard | Enterprise |

### Orchestration
| Tool | Purpose | Learning | Enterprise |
|------|---------|----------|------------|
| **Kubernetes** | Production scaling | Hard | 75% adoption |
| **Docker Swarm** | Simple orchestration | Easy | 10% adoption |
| **OpenShift** | K8s distribution | Hard | Enterprise |

### Infrastructure as Code
| Tool | Cloud | Learning | Features |
|------|-------|----------|----------|
| **Terraform** | Multi-cloud | Easy | Broad |
| **CloudFormation** | AWS-only | Medium | AWS native |
| **Pulumi** | Multi-cloud | Hard | Programmatic |

### Cloud Platforms
| Platform | Market Share | Learning | Cost |
|----------|-------------|----------|------|
| **AWS** | 35% | Hard | Low free tier |
| **GCP** | 10% | Medium | Medium free tier |
| **Azure** | 23% | Medium | High free tier |

## Docker Quick Start

### Basic Dockerfile
```dockerfile
FROM node:18-alpine

WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .

EXPOSE 3000
CMD ["node", "server.js"]
```

### Build and Run
```bash
docker build -t my-app:1.0 .
docker run -p 3000:3000 my-app:1.0
docker compose up  # multi-container
```

## Kubernetes Quick Start

### Deployment Manifest
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: my-app
spec:
  replicas: 3
  selector:
    matchLabels:
      app: my-app
  template:
    metadata:
      labels:
        app: my-app
    spec:
      containers:
      - name: app
        image: my-app:1.0
        ports:
        - containerPort: 3000
```

### Deploy
```bash
kubectl apply -f deployment.yaml
kubectl get pods
kubectl logs pod-name
```

## Terraform Quick Start

### Main Configuration
```hcl
# Configure AWS provider
provider "aws" {
  region = "us-east-1"
}

# Create EC2 instance
resource "aws_instance" "web" {
  ami           = "ami-0c55b159cbfafe1f0"
  instance_type = "t2.micro"

  tags = {
    Name = "web-server"
  }
}

# Output public IP
output "public_ip" {
  value = aws_instance.web.public_ip
}
```

### Deploy
```bash
terraform init
terraform plan
terraform apply
```

## CI/CD Pipeline Example

### GitHub Actions
```yaml
name: Deploy
on: [push]

jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Build Docker image
        run: docker build -t my-app .
      - name: Push to registry
        run: docker push my-app:latest
      - name: Deploy to K8s
        run: kubectl apply -f k8s/
```

## Tools & Technologies

### Container Management
- **Docker**: Image building and container runtime
- **Docker Compose**: Multi-container orchestration
- **Container Registry**: Docker Hub, ECR, GCR

### Kubernetes Ecosystem
- **kubectl**: Command-line interface
- **Helm**: Package manager for K8s
- **Kustomize**: Template overlay engine
- **ArgoCD**: GitOps continuous deployment

### Infrastructure as Code
- **Terraform**: Declare infrastructure
- **CloudFormation**: AWS infrastructure
- **Ansible**: Configuration management

### CI/CD Tools
- **GitHub Actions**: Built-in GitHub CI
- **GitLab CI**: Built-in GitLab CI
- **Jenkins**: Open-source automation
- **Cloud Build**: GCP CI/CD

### Monitoring & Observability
- **Prometheus**: Metrics collection
- **Grafana**: Visualization dashboard
- **ELK Stack**: Logs aggregation
- **Jaeger**: Distributed tracing
- **Datadog**: Full observability

### Cloud Services (AWS Example)
- **Compute**: EC2, Lambda, ECS, EKS
- **Storage**: S3, EBS, EFS
- **Networking**: VPC, CloudFront, Route53
- **Databases**: RDS, DynamoDB, ElastiCache

## Common DevOps Workflows

### Local Development
```
code → docker-compose up → test → commit → push
```

### CI/CD Pipeline
```
push → test → build image → push registry → deploy to k8s → verify
```

### Production Deployment
```
git tag → CI builds image → push to registry →
K8s pulls image → rolling update → health checks → done
```

## Performance Optimization

### Container Optimization
- Multi-stage Docker builds
- Alpine base images
- Layer caching
- .dockerignore files

### Kubernetes Optimization
- Resource limits and requests
- Horizontal pod autoscaling
- Readiness and liveness probes
- Node affinity

### Cost Optimization
- Spot instances
- Reserved instances
- Auto-scaling policies
- Right-sizing

## Security Best Practices

### Container Security
- [ ] Scan images for vulnerabilities
- [ ] Run containers as non-root
- [ ] Use read-only filesystems
- [ ] Update base images regularly
- [ ] Use private registries

### Kubernetes Security
- [ ] Network policies
- [ ] RBAC (Role-based access control)
- [ ] Secrets encryption
- [ ] Pod security policies
- [ ] Regular audits

### Cloud Security
- [ ] Least privilege IAM roles
- [ ] Encryption at rest and in transit
- [ ] VPC isolation
- [ ] Security groups/NACLs
- [ ] CloudTrail logging

## Getting Started: 30-Day Challenge

```
Week 1: Docker fundamentals
- [ ] Understand containers
- [ ] Write Dockerfile
- [ ] Build and run containers
- [ ] Docker Compose basics

Week 2: Kubernetes basics
- [ ] Understand pods, deployments
- [ ] Deploy app to Minikube/Kind
- [ ] Services and networking
- [ ] ConfigMaps and secrets

Week 3: Infrastructure as Code
- [ ] Learn Terraform basics
- [ ] Deploy VM to cloud
- [ ] Create networking resources
- [ ] Use modules

Week 4: CI/CD & Automation
- [ ] Setup GitHub Actions
- [ ] Automate tests
- [ ] Build Docker images
- [ ] Deploy to cloud
```

## Common Mistakes

❌ Skipping Linux fundamentals
❌ Running containers as root
❌ Not setting resource limits
❌ No monitoring or logging
❌ Manual deployments
❌ Not versioning infrastructure

✅ Master Linux first
✅ Follow security best practices
✅ Set CPU/memory limits
✅ Monitor everything
✅ Automate all deployments
✅ Version control for IaC

## Next Steps

- Use `/explore` to see detailed Docker, K8s, or Terraform roadmaps
- Use `/learn` for DevOps learning path
- Ask about cloud platform selection
- Explore complementary security and architecture concepts
