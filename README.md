# BattleShipGame
This is a BattleShip Game.

Battleship game is a war game played on ocean by two players. Each player own his
battle area and each player will get same number of ships where each ship may have
different size placed at some position in non-overlapping fashion. Note, players cannot
see each others ship's location.
The player who destroys all the ships of other player is winner of the game. If at the end
none of the player wins then both player declares peace.
In this example, Let’s consider each player gets 3 ships of size 1x3, 2x2 and 1x4. First
ship is spanned in between B1, B2 and B3 cells. Next ship is spanned in between D1, D2,
E1 and E2 cells. Last ship is spanned in between F3, F4, F5 and F6 cells. Similarly
Player-2 can place the same set of ships in different positions in his battle area.
Player-1 battle Area
1 2 3 4 5 6
A
B
C
D
E
F
Player-2 battle Area
1 2 3 4 5 6
A
B
C
D
E
F
Both players will get the chance to launch missiles one by one. For example if Player-1
fires missile in Player-2 battle area by calling some position(ex E1) on the Player-2 battle
area and the missile hits the Player-2 ship, Player-2 should communicate to the Player-1
whether it hits the ship or not.
In the example above, the missile hits the ship on E1. In this case, Player-1 gets one more
chance of firing as he successfully fired the missile. The same process will get repeated.
If the missile landed in empty place, then Player-2 gets the chance of firing. Each player
will have finite number of missiles.
If ship is hit in all the cells then that ship is considered as destroyed, for example if E1,
E2, E3 and E4 from Player-2 battle area is hit by the Player-1, then that ship is considered
as destroyed. Note that hitting only a live cell will give the chance of playing
again. Some ships are classified as Type-P which are little weak then the ship classified 
as Type-Q. Each part/cell of Type-Q ship requires 2 accurate missiles hit to get destroyed
whereas Type-P ship part will get destroyed only by 1 missile hit.
Input:
First line of the input contains dimensions of battle area having width and height
separated by space. Then the next line will have number (B) of battleships each player
has. Then in the next line battleship type, dimensions (width and height) & positions (Y
coordinate and X coordinate) for Player-1 and then for Player-2 will be given separated
by space. And then in the next line Player-1’s sequence (separated by space) of missiles
target location coordinates (Y and X) will be given and then for sequence for Player-2.
Constraints:
1 <= Width of Battle area (M’) <= 9,
A <= Height of Battle area (N’) <= Z
1 <= Number of battleships <= M’ * N’
Type of ship = {‘P’, ‘Q’}
1 <= Width of battleship <= M’
A <= Height of battleship <= N’
1 <= X coordinate of ship <= M’
A <= Y coordinate of ship <= N’
Sample Input:
5 E
2
Q 1 1 A1 B2
P 2 1 D4 C3
A1 B2 B2 B3
A1 B2 B3 A1 D1 E1 D4 D4 D5 D5
Player-1 battle Area
1 2 3 4 5
A Q
B
C
D P P
E
Player-2 battle Area
1 2 3 4 5
A
B Q
C P P
D
E
Sample Output:
Player-1 fires a missile with target A1 which got miss
Player-2 fires a missile with target A1 which got hit
Player-2 fires a missile with target B2 which got miss
Player-1 fires a missile with target B2 which got hit
Player-1 fires a missile with target B2 which got hit
Player-1 fires a missile with target B3 which got miss
Player-2 fires a missile with target B3 which got miss
Player-1 has no more missiles left to launch
Player-2 fires a missile with target A1 which got hit
Player-2 fires a missile with target D1 which got miss
Player-1 has no more missiles left to launch
Player-2 fires a missile with target E1 which got miss
Player-1 has no more missiles left to launch
Player-2 fires a missile with target D4 which got hit
Player-2 fires a missile with target D4 which got miss
Player-1 no more missiles left to launch
Player-2 fires a missile with target D5 which got hit
Player-2 won the battle
