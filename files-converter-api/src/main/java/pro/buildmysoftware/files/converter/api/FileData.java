package pro.buildmysoftware.files.converter.api;

import java.io.InputStream;

public class FileData {
    public FileData(String extension) {
        this.extension = extension;
        this.inputStream = InputStream.nullInputStream();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    String extension;
    InputStream inputStream;
}
