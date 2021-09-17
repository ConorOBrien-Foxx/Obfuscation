# Tic-Tac-Toe
Consisting of two programs, an interactive Tic Tac Toe interface written in Python, and a Ruby driver that furnishes the game with a perfect AI. The second program was written in response to a challenge I received from [Benny Blue](https://benny.blue/) after he saw the first one.

## Execution

Run the Python file as:

```
python tictactoe.py
```

And simply provide space-separated coordinates to move for the turn player.

To run the driver, call as:

```
ruby tictactoe-driver.rb ai-number
```

`ai-number` is either `1` or `2`, and indicates which player the AI should control.

## Explanation

The Python script uses the wonderful new feature (as of 3.8) called "Assignment expressions", facilitated by the walrus operator `:=`. Basically, in my case, it allows me to completely abandon the disgusting mandatory whitespace of Python and embrace my own Zen. The script is a single tuple, full of function and constant definitions. It implements a game of Tic-Tac-Toe functionally by calling and maintaining data objects representing the board state and turn player. (Note that, since Python does not have tail call optimization, this program does not handle Tic-Tac-Toe games that would exceed Python's default recursion limit. I think this shouldn't be a problem, however.)

The Ruby script implements [this Perfect Tic-Tac-Toe strategy](https://en.wikipedia.org/wiki/Tic-tac-toe#Strategy) almost verbatim. Other than that, most of the code implements the logic for communicating with the Python script. The general code structure can be seen more clearly in [`tictactoe-driver-unobfs.rb`](./tictactoe-driver-unobfs.rb). See [File Structure](#file-structure) below.

## File Structure

- `tictactoe.py` and `tictactoe-driver.rb` - the main attraction
- `tictactoe-driver-unobfs.rb` - an in-progress snapshot of `tictactoe-driver.rb`, which might help clarify some of the Ruby grawlix
- `test-ttt.txt` - a test case I used while developing `tictactoe.py`
- `output.txt` - showcases the output from a sample game (with intermittent `False` and `True` debug messages) from an earlier stage in development; I have included it as an example of what the program outputs

## Version Information
Since obfuscation tends to abuse features of the language, it's generally a good idea to include the specific version used to run these programs. It should hopefully work on anything newer than what's listed, but I make no promises.

```
λ python --version
Python 3.8.6

λ ruby --version
ruby 2.5.1p57 (2018-03-29 revision 63029) [x64-mingw32]
```