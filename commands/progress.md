# /progress

Track your learning journey across any roadmap with visual progress, analytics, and recommendations.

## Usage

```
/progress
/progress [roadmap-name]
/progress react
/progress system-design
```

## What It Does

### Visual Progress Tracking
- **Progress Bar**: See % complete for current roadmap
- **Topic Breakdown**: Which topics are done/in-progress/not started
- **Time Tracking**: Hours spent on learning
- **Streak**: Days of consistent learning

### Learning Analytics
- **Completion Rate**: % of roadmap completed
- **Learning Pace**: Days per topic average
- **Estimated Finish**: When you'll finish at current pace
- **Comparison**: How you compare to others on same path

### Smart Recommendations
- **Next Steps**: What to learn next
- **Time to Job**: Months until job-ready
- **Skills Gap**: What's missing for target role
- **Related Skills**: Complementary skills to add

## Examples

### Track React Learning
```
/progress react

React Developer Roadmap - Your Progress
├─ Overall: ████████░░ 45% complete
├─ Fundamentals: ██████░░░░ 60% (10/17 topics)
├─ Hooks: ██████░░░░ 60% (6/10 topics)
├─ State Management: ████░░░░░░ 30% (2/7 topics)
├─ Advanced: ░░░░░░░░░░ 0% (0/8 topics)
├─ Projects: ████░░░░░░ 40% (2/5)
├─ Estimated finish: 3 months at current pace
├─ Streak: 12 days (Great job!)
├─ Next: Learn Redux or Zustand (State Management)
└─ Time to first job: 2-3 months from now
```

### Track System Design Learning
```
/progress system-design

System Design Roadmap - Your Progress
├─ Overall: ██░░░░░░░░ 15% complete
├─ Fundamentals: ███░░░░░░░ 25% (Done: Scalability, Basics)
├─ Databases: ░░░░░░░░░░ 0% (Not started)
├─ Distributed Systems: ░░░░░░░░░░ 0% (Not started)
├─ Real-world Design: ░░░░░░░░░░ 0% (Not started)
├─ Practice Problems: ░░░░░░░░░░ 0% (0/5 completed)
├─ Estimated finish: 5-6 months at current pace
├─ Time Spent: 32 hours
├─ Learning Rate: 2.5 hours/week
├─ Next: Deep dive into Database Design (recommended)
├─ Skills Gap for Senior role: Advanced Databases, Distributed Systems
└─ Complementary skills: Microservices, DevOps basics
```

### Multi-Roadmap Progress
```
/progress --all

Your Learning Journey
├─ Frontend (React): 45% ████████░░
├─ Backend (Node.js): 30% ███░░░░░░░
├─ DevOps (Docker): 20% ██░░░░░░░░
├─ System Design: 15% █░░░░░░░░░
├─
├─ Total Learning Hours: 180 hours
├─ Streak: 45 days (Amazing!)
├─ Next Big Goal: First full-stack project
└─ Estimated Timeline: Full-stack ready in 4 months
```

## Features

### Mark Topics Complete
```
Mark a topic as done:
/progress react mark-complete --topic="hooks"

This updates:
- Progress percentage
- Estimated finish time
- Recommendations for next steps
```

### Add Study Time
```
Log hours spent learning:
/progress react log-time --hours=2.5 --topic="state-management"

Tracks:
- Total hours per topic
- Learning velocity
- Time to job readiness
```

### Set Goals
```
Set a target completion date:
/progress react --goal-date="2025-03-01"

Shows:
- Required weekly hours
- Topics per week needed
- Feasibility assessment
```

### Compare Paths
```
Compare your progress across roadmaps:
/progress --compare

Shows:
- Which path you're progressing fastest in
- Which path needs more focus
- Recommended focus areas
```

## Smart Analytics

### Learning Velocity
- **Days per topic**: Average time per concept
- **Topics per week**: Completion rate
- **Time to completion**: Realistic finish date
- **Pace comparison**: How you compare to peers

### Skill Coverage
- **Total skills**: How many covered
- **Depth**: How deep you've gone
- **Gaps**: Missing important topics
- **Strengths**: Topics you've mastered

### Job Readiness
- **Current level**: Beginner/Intermediate/Advanced
- **Job market demand**: For your chosen path
- **Time to hire-ready**: Months until job-ready
- **Salary expectations**: Based on your progress

## Goal Setting

### Timeline Goals
```
/progress react --goal="finish-3-months"
→ Calculates: 3 hours/day needed
→ Recommends: Which topics to prioritize
→ Warns: If goal is unrealistic
```

### Job Goals
```
/progress nodejs --goal="land-junior-job"
→ Calculates: Time to job readiness
→ Shows: Critical skills for hiring
→ Tracks: Progress toward job-readiness
```

### Skill Goals
```
/progress system-design --goal="senior-engineer-level"
→ Calculates: Time to mastery (6-12 months typical)
→ Shows: Advanced topics needed
→ Warns: Usually requires 3-5 years experience first
```

## Motivational Features

### Streaks
- Track consecutive learning days
- Celebrate milestones (7, 30, 100 days)
- Motivational messages
- Share your streak

### Achievements
- First topic completed
- First project finished
- 25% complete
- 50% complete
- 75% complete
- 100% complete (certificate)
- Job landed!

### Community Benchmarks
- See how many completed this roadmap
- Average time to completion
- Job placement rate
- Salary outcomes

## Review & Reflection

### Weekly Review
```
/progress --weekly-review

Questions:
1. What did you learn this week?
2. What was challenging?
3. What projects did you build?
4. What's your next focus?
```

### Monthly Review
```
/progress --monthly-review

Insights:
- Progress vs goal pace
- Topics mastered vs pending
- Time spent vs estimated
- Adjustment recommendations
```

## Export & Share

### Export Progress
```
/progress react --export=pdf
→ Creates PDF report with:
   - Progress overview
   - Topics completed
   - Projects built
   - Time spent
   - Next steps
```

### Share Progress
```
/progress react --share
→ Shareable URL showing:
   - Roadmap and progress
   - Public profile
   - Achievements
   - Community ranking (optional)
```

## Follow-up Actions

After `/progress`, you can:

1. **`/explore`** - Deep dive into next topic
2. **`/learn`** - Adjust your learning path
3. **Mark Complete** - Track your progress
4. **Log Time** - Record study hours
5. **Ask for Help** - "I'm stuck on [topic]"
6. **Find Resources** - "Best tutorials for [topic]"

## Pro Tips

✅ Track daily for best accuracy
✅ Set realistic goals (not too ambitious)
✅ Review weekly to stay on track
✅ Celebrate small wins
✅ Adjust pace based on analytics
✅ Focus on hands-on projects
✅ Don't just consume content - build things!

## Common Scenarios

### Falling Behind
```
/progress nodejs

Shows you're 2 months behind goal
→ Recommends: Focus on fundamentals first
→ Suggests: Reduce scope or extend deadline
→ Offers: More intensive learning plan
```

### Ahead of Schedule
```
/progress react

Shows you're 1 month ahead
→ Recommends: Add complementary skills
→ Suggests: Deepen understanding with advanced topics
→ Offers: Start next roadmap early
```

### Ready for Job
```
/progress --job-ready

Confirms you're ready for:
- Junior Developer roles
- Entry-level positions
- Internships

Shows:
- Required portfolio projects
- Interview preparation
- Job search strategies
```

---

**Track your learning!** Use `/progress` to stay motivated and on track.
