# project0
Frank Win
https://github.com/fwin49/project0

This repository contains a tiny Java example and instructions to compile and debug it (both with the command-line debugger `jdb` and with VS Code).

Files added:
- `src/com/example/App.java` — small program with an intentional off-by-one bug in `sumToN` to demonstrate stepping and breakpoints.
- `.vscode/launch.json` — VS Code debug configuration for the Java debugger extension.

Quick overview:

1. Compile: `javac -d out src/com/example/App.java`
2. Run: `java -cp out com.example.App 10`
3. Debug with jdb: `jdb -classpath out com.example.App 10`
4. Debug with VS Code: open this folder in VS Code, install the "Language Support for Java(TM) by Red Hat" and "Debugger for Java" extensions, then use the Run view and the "Debug (Launch) - App" configuration.

See the detailed instructions below.


