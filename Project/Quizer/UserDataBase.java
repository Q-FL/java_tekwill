import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserDataBase{

	private String fileName = "UserDataBase.txt";

	UserDataBase(){}
	UserDataBase(String newFileName){
		this.fileName = newFileName+".txt";
		File createFile = new File(fileName);
	}
	public void addNewUser(String name){
		BufferedReader br = null;
		BufferedWriter bw = null;
		String tmpFileName = "tempo.txt";
		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(tmpFileName));
			String line;
			boolean flag = true;
			while ((line = br.readLine()) != null) {
				if (line.contains(name) && line.substring(0,line.indexOf("^")).length() == name.length()){
					System.out.println("User with name: '" + name + "' already exists !");
					flag = false;
				}
				bw.write(line+"\n");
			}
			if (flag)
				bw.write(name + "^0\n");
			br.close();
			bw.close();
		}
		catch (Exception e) {}
		File oldFile = new File(fileName);
		oldFile.delete();
		File newFile = new File(tmpFileName);
		newFile.renameTo(oldFile);
	}
	public void updateUserScore(String userName,int newUserScore){
		BufferedReader br = null;
		BufferedWriter bw = null;
		String tmpFileName = "tempo.txt";
		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(tmpFileName));
			String line;
			boolean flag = true;
			while ((line = br.readLine()) != null) {
				if (line.contains(userName) && line.substring(0,line.indexOf("^")).length() == userName.length()){
					line = userName + "^" + newUserScore;
					flag = false;
				}
				bw.write(line+"\n");
			}
			if (flag)
				System.out.println("User '" + userName + "' does not exist !");
			br.close();
			bw.close();
		}
		catch (Exception e) {}
		File oldFile = new File(fileName);
		oldFile.delete();
		File newFile = new File(tmpFileName);
		newFile.renameTo(oldFile);
	}
	public void removeUser(String userName){
		BufferedReader br = null;
		BufferedWriter bw = null;
		String tmpFileName = "tempo.txt";
		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(tmpFileName));
			String line;
			boolean flag = true;
			while ((line = br.readLine()) != null) {
				if (line.contains(userName) && line.substring(0,line.indexOf("^")).length() == userName.length())
					flag = false;
				else
					bw.write(line+"\n");
			}
			if (flag)
				System.out.println("User '" + userName + "' does not exist !");
			br.close();
			bw.close();
		}
		catch (Exception e) {}
		File oldFile = new File(fileName);
		oldFile.delete();
		File newFile = new File(tmpFileName);
		newFile.renameTo(oldFile);
	}
	public void getUserInfo(String userName){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			boolean flag = true;
			while ((line = br.readLine()) != null) {
				if (line.contains(userName) && line.substring(0,line.indexOf("^")).length() == userName.length()) {
					System.out.println("User: " + userName + " | Score: " + line.substring(line.indexOf("^")+1));
					flag = false;
				}
			}
			if (flag)
				System.out.println("User '" + userName + "' does not exist !");
			br.close();
		}
		catch (Exception e) {}
	}
	public void getAllUsersInfo(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null)
				if (line.contains("^"))
					System.out.println("User: " + line.substring(0,line.indexOf("^")) + " | Score: " + line.substring(line.indexOf("^")+1));	
			br.close();
		}
		catch (Exception e) {}
	}
	public boolean userExist(String userName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			boolean flag = true;
			while ((line = br.readLine()) != null) {
				if (line.contains(userName) && line.substring(0,line.indexOf("^")).length() == userName.length()){
					br.close();
					return true;
				}
			}
			br.close();
		}catch (Exception e) {}
		return false;
	}
}
