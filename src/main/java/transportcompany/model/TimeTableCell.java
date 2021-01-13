package transportcompany.model;

import java.time.LocalTime;

import static transportcompany.util.Constants.BUS_STANDART_RATING;

public class TimeTableCell implements Comparable<TimeTableCell> {

	private String name;
	private LocalTime departure;
	private LocalTime arrival;
	private int comfortRating = BUS_STANDART_RATING;

	public TimeTableCell() {

	}

	public TimeTableCell(String name, LocalTime departure, LocalTime arrival) {
		super();
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}

	public LocalTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}

	public int getComfortRating() {
		return comfortRating;
	}

	public void setComfortRating(int comfortRating) {
		this.comfortRating = comfortRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrival == null) ? 0 : arrival.hashCode());
		result = prime * result + comfortRating;
		result = prime * result + ((departure == null) ? 0 : departure.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TimeTableCell other = (TimeTableCell) obj;
		if (arrival == null) {
			if (other.arrival != null)
				return false;
		} else if (!arrival.equals(other.arrival))
			return false;
		if (comfortRating != other.comfortRating)
			return false;
		if (departure == null) {
			if (other.departure != null)
				return false;
		} else if (!departure.equals(other.departure))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeTableCell [name=" + name + ", departure=" + departure + ", arrival=" + arrival + ", comfortRating="
				+ comfortRating + "]";
	}

	@Override
	public int compareTo(TimeTableCell o) {
		return o.getComfortRating() - this.comfortRating;
	}

}
