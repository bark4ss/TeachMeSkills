package readwritestream;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		String nameDir = System.getProperty("user.dir") + "/newdir";
		
		String pathDir = "/teachMeSkills/readwritestream/";
		File a = new File(nameDir);
		File path = new File(pathDir);
		a.mkdir();
		for (String name : path.list()) {
			File temp = new File(name);
			if(temp.isFile()) {
				System.out.println(temp.getName() + "Total size: " + temp.length() + "B");
			}
			
		}

	}

}
