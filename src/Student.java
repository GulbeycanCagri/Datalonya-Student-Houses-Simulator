

public class Student {
	private int id;
	private String name;
	private int duration;
	private double rating;
	Student(int id, String name,int duration, double rating){
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.rating = rating;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * Decreasing the duration 1 semester if it is possible.
	 */
	public void decreaseSemester(){
		if(this.duration>0) {
			this.duration--;

		}
	}
}
