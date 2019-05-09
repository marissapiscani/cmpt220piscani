package madlibs;

public class storyFile {
	public String fileName;
	public storyFile (String fname) {
		//asks user and returns specific file for story
		fileName=fname;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
