package com.battleship.play.game.battleship.game.pojo;

public class Cell {

	private boolean isBattleship;
	private BattleShip battleShip;
	private int cellPower;

	public Cell() {
		super();

	}

	public Cell(boolean isBattleship, BattleShip battleShip, int cellPower) {
		super();
		this.isBattleship = isBattleship;
		this.battleShip = battleShip;
		this.cellPower = cellPower;

	}

	public boolean isBattleship() {
		return isBattleship;
	}

	public void setIsBattleship(boolean isBattleship) {
		this.isBattleship = isBattleship;
	}

	public BattleShip getBattleShip() {
		return battleShip;
	}

	public void setBattleShip(BattleShip battleShip) {
		this.battleShip = battleShip;
	}

	public int getCellPower() {
		return cellPower;
	}

	public void setCellPower(int cellPower) {
		this.cellPower = cellPower;
	}

	@Override
	public String toString() {
		return "Cell [isBattleship=" + isBattleship + ", battleShip=" + battleShip + ", cellPower=" + cellPower + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battleShip == null) ? 0 : battleShip.hashCode());
		result = prime * result + cellPower;
		result = prime * result + (isBattleship ? 1231 : 1237);
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
		Cell other = (Cell) obj;
		if (battleShip == null) {
			if (other.battleShip != null)
				return false;
		} else if (!battleShip.equals(other.battleShip))
			return false;
		if (cellPower != other.cellPower)
			return false;
		if (isBattleship != other.isBattleship)
			return false;
		return true;
	}

}
