# PasswordMatcher

A Java brute-force password cracker that exhaustively searches all character permutations to match a given password, reporting the time taken.

## Features

- **Brute-force search** over the character set `A-Z`, `a-z`, `0-9`, and `_` (63 characters)
- **Recursive permutation generation** for passwords of a known length
- **Input validation** — rejects passwords containing unsupported characters
- **Timing** — reports approximate elapsed time to find the match using Apache Commons `StopWatch`
- Accepts the target password as a command-line argument (defaults to `_ABc12`)

## Requirements

- **Java 11** or later
- **Apache Maven 3.6+**

## Installation / Build

Clone the repository and build with Maven:

```bash
git clone https://github.com/<user>/PasswordMatcher.git
cd PasswordMatcher
mvn clean package
```

This produces two JARs in `target/`:

| Artifact | Description |
|---|---|
| `password-1.0-SNAPSHOT.jar` | Thin JAR (requires commons-lang3 on classpath) |
| `password-1.0-SNAPSHOT-jar-with-dependencies.jar` | Fat JAR with all dependencies bundled |

### Running Tests

```bash
mvn test
```

All 3 unit tests should pass.

## Usage

### Run via the fat JAR

```bash
# Use the default password (_ABc12)
java -jar target/password-1.0-SNAPSHOT-jar-with-dependencies.jar

# Supply a custom password
java -jar target/password-1.0-SNAPSHOT-jar-with-dependencies.jar aB1_
```

### Run via Maven exec plugin

```bash
mvn exec:java -Dexec.args="myPass"
```

### Example Output

```
Password is: aB1_
Approximate time taken: 00:00:00.042
```

## Notes / Known Limitations

- The algorithm requires **knowing the password length** in advance — it only searches permutations of exactly the target's length.
- Execution time grows exponentially with password length (63^n permutations). Short passwords (≤ 4–5 characters) complete quickly; longer passwords may take a very long time.
- This is an **educational / demonstration** tool, not intended for real-world password cracking.
- Only the 63-character set (`A-Za-z0-9_`) is supported; any other characters are rejected.