import java.io.FileReader;
public class Test{
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("tempo.txt"));
			for (String line; )
				System.out.println("User: " + line.substring(0,line.indexOf("^")) + " | Score: " + line.substring(line.indexOf("^")+1));
			// String line;
			// while ((line = br.readLine()) != null)
			// 	if (line.contains("^"))
			}
		catch (Exception e) {
			System.out.println("Gotcha bitch, you have an error !");
			e.printStackTrace();
		}
		// List<String> newLines = new ArrayList<>();
		// for (String line : Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)) {
		//     if (line.contains("1313131")) {
		//        newLines.add(line.replace("1313131", ""+System.currentTimeMillis()));
		//     } else {
		//        newLines.add(line);
		//     }
		// }
		// Files.write(Paths.get(fileName), newLines, StandardCharsets.UTF_8);
	}
}