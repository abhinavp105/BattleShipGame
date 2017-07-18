package com.battleship.play.game.game.player.factory;

import com.battleship.play.game.battleship.game.pojo.BattleShip;
import com.battleship.play.game.battleship.game.pojo.Cell;
import com.battleship.play.game.battleship.game.pojo.Player;
import com.battleship.play.game.battleship.game.util.GameBattleUtil;

public class PlayerFactory {

	public static boolean attackCell(String cellId, Player playerToBeAtacked) {

		char[] cellCordi = cellId.toCharArray();

		int xDim = GameBattleUtil.getRealIndexValue(cellCordi[0]);
		int yDim = Integer.parseInt(String.valueOf(cellCordi[1])) - 1;

		Cell[][] battleField = playerToBeAtacked.getBattlefield();

		if (battleField[xDim][yDim].isBattleship()) {
			Cell cell = battleField[xDim][yDim];

			cell.setCellPower(cell.getCellPower() - 1);

			if (cell.getCellPower() == 0) {
				cell.setIsBattleship(false);

				int updatedNumberOfCells = cell.getBattleShip().getNumberOfCells() - 1;
				BattleShip battleShip = cell.getBattleShip();

				battleShip.setNumberOfCells(updatedNumberOfCells);

				if (cell.getBattleShip().getNumberOfCells() == 0) {
					playerToBeAtacked.setNumberOfbattleShips(playerToBeAtacked.getNumberOfbattleShips() - 1);
				}
			}
			return true;

		}

		return false;

	}

	public static boolean hasLost(Player player) {

		if (player.getNumberOfbattleShips() == 0) {
			return true;
		} else {
			return false;
		}

	}

}
