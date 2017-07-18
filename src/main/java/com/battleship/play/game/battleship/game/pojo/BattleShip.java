package com.battleship.play.game.battleship.game.pojo;

import com.battleship.play.game.game.constant.BattleshipType;

public class BattleShip {

	private BattleshipType battleShipType;
	private int numberOfCells;

	public BattleShip() {
		super();
	}

	public BattleShip(BattleshipType battleShipType, int numberOfCells) {
		super();
		this.battleShipType = battleShipType;
		this.numberOfCells = numberOfCells;
	}

	public BattleshipType getBattleShipType() {
		return battleShipType;
	}

	public void setBattleShipType(BattleshipType battleShipType) {
		this.battleShipType = battleShipType;
	}

	public int getNumberOfCells() {
		return numberOfCells;
	}

	public void setNumberOfCells(int numberOfCells) {
		this.numberOfCells = numberOfCells;
	}

	@Override
	public String toString() {
		return "BattleShip [battleShipType=" + battleShipType + ", numberOfCells=" + numberOfCells + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battleShipType == null) ? 0 : battleShipType.hashCode());
		result = prime * result + numberOfCells;
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
		BattleShip other = (BattleShip) obj;
		if (battleShipType != other.battleShipType)
			return false;
		if (numberOfCells != other.numberOfCells)
			return false;
		return true;
	}

}
