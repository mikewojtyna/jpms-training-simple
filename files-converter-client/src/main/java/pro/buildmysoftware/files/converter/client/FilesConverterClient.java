package pro.buildmysoftware.files.converter.client;

import pro.buildmysoftware.files.converter.api.FileData;
import pro.buildmysoftware.files.converter.api.FilesConverterApi;
import pro.buildmysoftware.files.converter.api.FilesConverterFactory;

public class FilesConverterClient {
    public static void main(String[] args) throws Exception {
        FilesConverterApi api = FilesConverterFactory.getApi();
        FileData fData = new FileData("xml");
        System.out.println(api.convert(fData, "pdf"));
    }
}
