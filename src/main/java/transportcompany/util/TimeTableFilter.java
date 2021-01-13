package transportcompany.util;

import java.util.List;

import transportcompany.model.TimeTableCell;

public interface TimeTableFilter {

	List<TimeTableCell> filter(List<TimeTableCell> timeTableCells);

}
