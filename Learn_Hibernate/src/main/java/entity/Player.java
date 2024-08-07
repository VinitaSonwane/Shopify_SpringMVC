package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
    @Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", jerseyNumber=" + jerseyNumber + ", score=" + score
				+ ", totalRuns=" + totalRuns + "]";
	}

	@Id
    private int id;
    private String name;
    private int jerseyNumber;
    private int score;
	private int totalRuns;

    public Player() {
    }

    public Player(int id, String name, int jerseyNumber, int score,int totalRuns) {
        this.id = id;
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.score = score;
        this.totalRuns = totalRuns;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getScore() {
        return score;
    }

   

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public void setScore(int score) {
        this.score = score;
    }
}
