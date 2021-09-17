# Game of Life
Implement's [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) in Java. Took me a couple hours each day for about 3 days.

## Execution

Compile and run as:

```
javac $.java
java $ filename [argument]
```

`filename` is a path to a raw text file which represents a pattern. Each character represents a cell in the grid; ` ` and `.` are treated as dead cells, and everything else is treated a live cell.

By default, the program is run frame-by-frame, scanning for an empty input line to continue. To display it as an animation, simply provide *anything* as a second parameter for `[argument]`.

## Explanation

(Todo.)

## File Structure

- `$.java` - the main attraction
- `gol.txt`, `pulsar.txt`, `tumbler.txt`, `blocker-chain.txt` - example input files
- `README.md` - this file
- `constant-gen-$.rb` - a helper script used to brute force all the constants I needed to generate using Peano Arithmetic
- `debug.txt` - the output of the above program
- `progress/` - a folder consisting of some pre-obfuscation files from various steps in the process

## Version Information
Since obfuscation tends to abuse features of the language, it's generally a good idea to include the specific version used to run these programs. It should work on anything 

```
λ java --version
java 11.0.2 2019-01-15 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.2+9-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.2+9-LTS, mixed mode)

λ javac --version
javac 11.0.2
```