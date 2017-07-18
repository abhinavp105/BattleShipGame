package com.battleship.play.game.game.constant;

public enum BattleshipType {

	Q_TYPE("Q"), P_TYPE("P");
	String type;

	BattleshipType(String type) {
		this.type = type;
	}

	public String getBattleshipType() {
		return type;
	}
}
