package readwritestream;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		String nameDir = "/teachMeSkills/readwritestream/newdir";
		String pathDir = "/teachMeSkills/readwritestream/";
		File a = new File(nameDir);
		File path = new File(pathDir);
		a.mkdir();
		for (String name : path.list()) {
			System.out.println(name);
		}

	}

}
