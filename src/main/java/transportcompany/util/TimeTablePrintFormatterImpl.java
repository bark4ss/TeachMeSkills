package transportcompany.util;

import java.util.List;

import static transportcompany.util.Constants.BUS_NAME_COMFORT_COMPANY;
import static transportcompany.util.Constants.BUS_NAME_STANDART_COMPANY;

import transportcompany.model.TimeTableCell;

public class TimeTablePrintFormatterImpl implements TimeTablePrintFormatter {

	@Override
	public void formattedPrint(List<TimeTableCell> timeTableCell) {
		timeTableCell.stream().filter(x -> x.getName().equals(BUS_NAME_COMFORT_COMPANY)).forEach(System.out::println);
		System.out.println();
		timeTableCell.stream().filter(x -> x.getName().equals(BUS_NAME_STANDART_COMPANY)).forEach(System.out::println);

	}

}
