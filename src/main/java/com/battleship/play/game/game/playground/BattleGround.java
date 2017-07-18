package com.battleship.play.game.game.playground;

import com.battleship.play.game.battleship.game.pojo.Player;
import com.battleship.play.game.game.player.factory.PlayerFactory;

public class BattleGround {

	public String playGame(String[] player1Moves, String[] player2Moves, Player player1, Player player2) {
		int p1Counter = 0;
		int p2Counter = 0;

		while (p1Counter < player1Moves.length || p2Counter < player2Moves.length) {

			p1Counter = makeTheMove(player2, player1, player1Moves, p1Counter);

			if (PlayerFactory.hasLost(player2)) {

				return player1.getPlayerName() + " won the battle";

			}

			p2Counter = makeTheMove(player1, player2, player2Moves, p2Counter);

			if (PlayerFactory.hasLost(player1)) {

				return player2.getPlayerName() + " won the battle";

			}

		}

		return "Its a draw";

	}

	public int makeTheMove(Player playerToBeAttacked, Player attackingPlayer, String[] playerMoves, int pCounter) {

		while (true) {

			if (pCounter < playerMoves.length) {

				boolean isAttackSuccess = PlayerFactory.attackCell(playerMoves[pCounter], playerToBeAttacked);
				pCounter++;
				if (isAttackSuccess) {
					System.out.println(attackingPlayer.getPlayerName() + " fires a missile with target "
							+ playerMoves[pCounter - 1] + " which got hit");
				} else {

					System.out.println(attackingPlayer.getPlayerName() + " fires a missile with target "
							+ playerMoves[pCounter - 1] + " which got miss");
					return pCounter;
				}

			} else {

				System.out.println(attackingPlayer.getPlayerName() + " has no more missiles left to launch");
				return pCounter;
			}
		}

	}

}
