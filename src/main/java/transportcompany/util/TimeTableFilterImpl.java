package transportcompany.util;

import java.util.ArrayList;
import java.util.List;

import transportcompany.model.TimeTableCell;
import transportcompany.util.comparator.TimeTableCellComparatorByDeparture;

public class TimeTableFilterImpl implements TimeTableFilter {

	@Override
	public List<TimeTableCell> filter(List<TimeTableCell> timeTableCells) {
		List<TimeTableCell> resultTimeTableCells = new ArrayList<>();
		timeTableCells.sort(new TimeTableCellComparatorByDeparture());
		for (int i = 1; i < timeTableCells.size(); i++) {
			if (timeTableCells.get(i - 1).getArrival().equals(timeTableCells.get(i).getArrival())) {
				if (timeTableCells.get(i - 1).getDeparture().equals(timeTableCells.get(i).getDeparture())) {
					if (timeTableCells.get(i - 1).getComfortRating() > timeTableCells.get(i).getComfortRating()) {
						resultTimeTableCells.add(timeTableCells.get(i - 1));
					} else {
						resultTimeTableCells.add(timeTableCells.get(i));
					}
					i++;
				}
			} else if (timeTableCells.get(i - 1).getArrival().equals(timeTableCells.get(i).getArrival())) {
				if (timeTableCells.get(i - 1).getDeparture().isBefore(timeTableCells.get(i).getDeparture())) {
					resultTimeTableCells.add(timeTableCells.get(i));
					i++;
				}
			} else if (timeTableCells.get(i - 1).getArrival().isAfter(timeTableCells.get(i).getArrival())) {
				if (timeTableCells.get(i - 1).getDeparture().isBefore(timeTableCells.get(i).getDeparture())) {
					resultTimeTableCells.add(timeTableCells.get(i));
					i++;
				}
			} else {
				resultTimeTableCells.add(timeTableCells.get(i - 1));
			}
		}
		resultTimeTableCells.sort(null);
		return resultTimeTableCells;
	}

}
