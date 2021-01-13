package transportcompany.util;

import java.util.List;

import transportcompany.model.TimeTableCell;

public interface TimeTableFileReader {

	List<TimeTableCell> getTimeTableCells(String fileName);

}
