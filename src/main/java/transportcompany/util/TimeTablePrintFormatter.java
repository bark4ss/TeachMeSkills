package transportcompany.util;

import java.util.List;

import transportcompany.model.TimeTableCell;

public interface TimeTablePrintFormatter {

	void formattedPrint(List<TimeTableCell> timeTableCell);

}
