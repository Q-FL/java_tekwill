import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tempoJ {
	public static void main(String[] args) {
		String userName = "TESTER";
		int newUserScore = 1;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "UserDataBase.txt";
		String tmpFileName = "tempo.txt";
		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(tmpFileName));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains(userName))
					line = userName + "^" + newUserScore;
				bw.write(line+"\n");
			}
			br.close();
			bw.close();
		}
		catch (Exception e) {
			System.out.println("Gotcha bitch, you are wrooong !");
		}
		File oldFile = new File(fileName);
		oldFile.delete();
		File newFile = new File(tmpFileName);
		newFile.renameTo(oldFile);
	}
}