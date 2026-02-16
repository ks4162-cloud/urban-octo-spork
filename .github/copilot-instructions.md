# OOPS Banner App - AI Agent Instructions

## Project Overview
This is an educational Java project demonstrating Object-Oriented Programming fundamentals through a banner application. The project follows a use-case-driven development approach with incremental feature implementation (UC1, UC2, etc.).

**Key Focus:** Java fundamentals, proper code documentation, professional git workflows, and compile-test-merge discipline.

## Project Structure
- `opps.java` - Main application class (note: lowercase class name for learning purpose)
- `.github/copilot-instructions.md` - This file

## Development Workflow (Critical)
Always follow this exact sequence when implementing use cases:

1. **Branch Creation:** Create feature branches using pattern `feature/uc{N}-{short-description}` (lowercase, hyphens)
   - Example: `git checkout -b feature/uc1-print-oops`

2. **Code Implementation:** Write code with proper JavaDoc comments
   - Include `@author`, `@version` tags in class-level JavaDoc
   - Document all public methods with `@param` and method purpose
   - Reference: [opps.java](opps.java) for standard JavaDoc format

3. **Compile & Test:** Use javac and java commands
   ```
   javac opps.java
   java opps
   ```

4. **Git Operations:** Commit to feature branch, merge to dev branch
   ```
   git add opps.java
   git commit -m "UC{N}: [clear description]"
   git checkout dev && git merge feature/uc{N}-...
   ```

## Code Patterns & Conventions

### Main Class Structure
- Class name: `opps` (matches filename minus extension)
- All application logic starts in `main(String[] args)` static method
- Use `System.out.println()` for console output

### JavaDoc Standards
Every class must include:
- Class-level summary (1 line)
- Purpose/key concepts (2-3 lines)
- `@author` and `@version` tags
- Method-level documentation with `@param` tags

**Example:**
```java
/**
 * Brief description.
 * 
 * Detailed explanation of what this class/method does.
 * 
 * @author Developer
 * @version 1.0
 */
```

## Key Commands
| Task | Command |
|------|---------|
| Compile | `javac opps.java` |
| Run | `java opps` |
| Create feature branch | `git checkout -b feature/uc{N}-...` |
| Commit | `git commit -m "UC{N}: [description]"` |
| Merge to dev | `git checkout dev && git merge feature/uc{N}-...` |

## Git Branch Model
- `master` - Production-ready code (stable state)
- `dev` - Integration branch for all features
- `feature/uc*` - Feature branches (temporary, deleted after merge)

## Important Notes for AI Agents
1. **Learn by Doing:** Code implementation is the primary learning mechanism—avoid over-explaining concepts
2. **Professional Standards:** All code must include JavaDoc; all work must go through git workflow
3. **Test Before Committing:** Always compile and run successfully before staging changes
4. **Naming Discipline:** Follow the exact branch naming pattern; git rejects colons in branch names
5. **Sequential Development:** Each use case builds on previous ones; maintain backward compatibility
