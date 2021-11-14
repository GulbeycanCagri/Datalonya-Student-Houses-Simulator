
public class House {
	private int id;
	private int duration;
	private double rating;
	House(int id, int duration, double rating){
		this.id = id;
		this.duration = duration;
		this.rating = rating;
	}
	/**
	 * checking whether a student can live at the house
	 * @param rating
	 * @return
	 */
	public Boolean isAvailable(double rating,int duration){
		if (this.rating>=rating && duration > 0) {
			this.duration = duration;
			return true;
		}
		else {
			return false;
		}
		
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
