import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryContent {
    private String dirPAth;
    public DirectoryContent(String directory){
        this.dirPAth = directory;

    }

    public String getDirPAth() {
        return dirPAth;
    }

    public List<String> getDirectoryContent() {
        File directory = new File(getDirPAth());
        File[] files = directory.listFiles();
        List<String> contentList = new ArrayList<>();

        if (files != null && files.length > 0) {
            for (File file : files) {
                contentList.add(file.getName()); // Добавляем имя файла или директории в список
            }
        }

        return contentList;
    }
}
