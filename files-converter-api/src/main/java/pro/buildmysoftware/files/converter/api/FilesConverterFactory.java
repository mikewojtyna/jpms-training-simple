package pro.buildmysoftware.files.converter.api;

import pro.buildmysoftware.files.converter.impl.DefaultFilesConverter;

public class FilesConverterFactory {
    static public FilesConverterApi getApi(){
        return new DefaultFilesConverter();
    }
}
