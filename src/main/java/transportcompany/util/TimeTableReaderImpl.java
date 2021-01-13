package transportcompany.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static transportcompany.util.Constants.BUS_NAME_COMFORT_COMPANY;

import transportcompany.model.TimeTableCell;

public class TimeTableReaderImpl implements TimeTableFileReader {

	@Override
	public List<TimeTableCell> getTimeTableCells(String fileName) {

		List<TimeTableCell> timeTableCells = new ArrayList<>();
		try (BufferedReader fileIn = new BufferedReader(new FileReader(fileName));) {

			String line;
			while ((line = fileIn.readLine()) != null) {

				timeTableCells.add(parseLineToTimeTableCell(line));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return timeTableCells;
	}

	private TimeTableCell parseLineToTimeTableCell(String line) {
		TimeTableCell timeTableCell = new TimeTableCell();
		String[] split = line.split(" ");
		timeTableCell.setName(split[0]);
		timeTableCell.setDeparture(LocalTime.parse(split[1]));
		timeTableCell.setArrival(LocalTime.parse(split[2]));

		if (timeTableCell.getName().equals(BUS_NAME_COMFORT_COMPANY)) {
			timeTableCell.setComfortRating(2);
		}

		return timeTableCell;
	}

}
