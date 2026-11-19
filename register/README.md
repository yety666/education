# Console Authentication System (Java)

A simple console-based user registration and login system built in Java using `ArrayList` and `Scanner`.

## Features
- **Sign Up:** Registers a new user with a login and password, checking for empty inputs and duplicate usernames.
- **Log In:** Authenticates existing users by matching the exact login index with the corresponding password.
- **Input Validation:** Handles menu navigation safely via string parsing to prevent input buffer issues and crashes.
- **Standalone Builds:** Includes compiled `.jar` archive and Windows `.exe` executable wrapped via Launch4j.

## Project Structure
- `register.java` — Main source code.
- `register.jar` — Executable Java archive.
- `Register.exe` — Standalone Windows console executable.

## How to Run

### 1. From Source
```bash
javac register.java
java register
