package com.battleship.play.game.battleship.game.pojo;

import java.util.Arrays;

import com.battleship.play.game.battleship.game.util.GameBattleUtil;
import com.battleship.play.game.game.constant.BattleshipType;

public class Player {

	private String playerName;
	private int numberOfbattleShips;
	private Cell[][] battlefield;

	public Player() {
		super();

	}

	public Player(String playerName, int numberOfbattleShips) {
		super();
		this.playerName = playerName;
		this.numberOfbattleShips = numberOfbattleShips;

	}

	public void initBattlefield(char x, int yDim) {

		int xDim = GameBattleUtil.getRealIndexValue(x) + 1;
		battlefield = new Cell[xDim][yDim];

		for (int i = 0; i < battlefield[0].length; i++) {

			for (int j = 0; j < battlefield.length; j++) {

				battlefield[i][j] = new Cell(false, null, 0);

			}
		}
	}

	public void fillBattleField(BattleshipType type, int len, int wid, String position) {

		int xDim = GameBattleUtil.getRealIndexValue(position.charAt(0)) + 1;
		int yDim = Integer.parseInt(String.valueOf(position.charAt(1)));

		if (xDim + (len - 1) <= battlefield[0].length) {

			BattleShip battleShip = new BattleShip(type, len * wid);

			for (int i = yDim; i <= (yDim + len) - 1; i++) {
				if (type == BattleshipType.P_TYPE) {
					Cell cell = new Cell(true, battleShip, 1);
					battlefield[xDim - 1][i - 1] = cell;
				} else if (type == BattleshipType.Q_TYPE) {
					Cell cell = new Cell(true, battleShip, 2);
					battlefield[xDim - 1][i - 1] = cell;
				}

			}

			for (int i = xDim; i <= (wid + xDim) - 1; i++) {
				if (type == BattleshipType.P_TYPE) {
					Cell cell = new Cell(true, battleShip, 1);
					battlefield[i - 1][yDim - 1] = cell;
				} else if (type == BattleshipType.Q_TYPE) {
					Cell cell = new Cell(true, battleShip, 2);
					battlefield[i - 1][yDim - 1] = cell;
				}
			}
		}

	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNumberOfbattleShips() {
		return numberOfbattleShips;
	}

	public void setNumberOfbattleShips(int numberOfbattleShips) {
		this.numberOfbattleShips = numberOfbattleShips;
	}

	public Cell[][] getBattlefield() {
		return battlefield;
	}

	public void setBattlefield(Cell[][] battlefield) {
		this.battlefield = battlefield;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(battlefield);
		result = prime * result + numberOfbattleShips;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (!Arrays.deepEquals(battlefield, other.battlefield))
			return false;
		if (numberOfbattleShips != other.numberOfbattleShips)
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		return true;
	}

}
