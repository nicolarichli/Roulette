package DATA;

public class Data implements DataTransmission{
	String playerName;
	int money;
	int round;

	public void setName(String playerName) {
		this.playerName = playerName;
	}

	public int getRound() {
		return 0;
	}

	@Override
	public void setRound(int round) {
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return playerName;
	}
}
