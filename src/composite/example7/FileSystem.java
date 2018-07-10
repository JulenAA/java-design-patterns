package composite.example7;

public class FileSystem {

	private File allFiles;

	public FileSystem(File allFiles) {
		this.allFiles = allFiles;
	}

	public void printFiles() {
		allFiles.showInfo();
	}

}
