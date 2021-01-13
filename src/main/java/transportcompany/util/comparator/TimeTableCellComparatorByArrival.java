package transportcompany.util.comparator;

import java.util.Comparator;

import transportcompany.model.TimeTableCell;

public class TimeTableCellComparatorByArrival implements Comparator<TimeTableCell> {

	@Override
	public int compare(TimeTableCell o1, TimeTableCell o2) {

		return o1.getArrival().compareTo(o2.getArrival());
	}

}
