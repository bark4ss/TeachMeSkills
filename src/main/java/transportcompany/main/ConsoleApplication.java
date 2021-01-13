package transportcompany.main;

import static transportcompany.util.Constants.FILE_NAME;

import java.util.List;

import transportcompany.model.TimeTableCell;
import transportcompany.util.TimeTableFileReader;
import transportcompany.util.TimeTableFilter;
import transportcompany.util.TimeTableFilterImpl;
import transportcompany.util.TimeTablePrintFormatter;
import transportcompany.util.TimeTablePrintFormatterImpl;
import transportcompany.util.TimeTableReaderImpl;

public class ConsoleApplication {

	public static void main(String[] args) {
		TimeTableFileReader tableFileReader = new TimeTableReaderImpl();
		List<TimeTableCell> tableCells = tableFileReader.getTimeTableCells(FILE_NAME);

		TimeTableFilter timeTableFilter = new TimeTableFilterImpl();
		List<TimeTableCell> filteredCells = timeTableFilter.filter(tableCells);
		TimeTablePrintFormatter printFormatter = new TimeTablePrintFormatterImpl();
		printFormatter.formattedPrint(filteredCells);

	}

}
