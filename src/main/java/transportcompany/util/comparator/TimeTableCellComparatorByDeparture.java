package transportcompany.util.comparator;

import java.util.Comparator;

import transportcompany.model.TimeTableCell;

public class TimeTableCellComparatorByDeparture implements Comparator<TimeTableCell> {

	@Override
	public int compare(TimeTableCell o1, TimeTableCell o2) {

		return o1.getDeparture().compareTo(o2.getDeparture());
	}

}
