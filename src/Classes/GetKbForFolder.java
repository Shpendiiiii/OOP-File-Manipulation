package Classes;


import java.io.File;
import java.io.FileFilter;

// will return the size in kilobytes for a given folder
public class GetKbForFolder {

    private final String folderName;

    public GetKbForFolder(String folderName) {
        this.folderName = folderName;
    }

    public void getFolderSize() {
        double sizeInBytes = 0;

        File dir = new File(folderName);

        File[] files = dir.listFiles();

        for (File file : files
        ) {
            sizeInBytes += file.length();
        }
        sizeInBytes = sizeInBytes / 1024;
        System.out.println("File size is " + sizeInBytes + " KB");
    }

    public void fileTypeGetSize(String fileType) {
        double sizeInBytes = 0;

        File dir = new File(folderName);

        File[] files = dir.listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.getName().endsWith(fileType);
                    }
                }
        );

        for (File file : files
        ) {
            sizeInBytes += file.length();
            System.out.println("File: " + file.getName());
        }
        sizeInBytes = sizeInBytes / 1024;
        System.out.println("File size is " + sizeInBytes + " KB");
    }

    public void countFiles() {
        int count = 0;

        File dir = new File(folderName);

        File[] files = dir.listFiles();
        for (File file : files
        ) {
            count++;
        }
        System.out.println("There are " + count + " files" + " in the folder " + folderName);
    }
}
