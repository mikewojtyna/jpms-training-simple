package pro.buildmysoftware.files.PdfToXml.file.converter;

import pro.buildmysoftware.files.converter.api.Converter;
import pro.buildmysoftware.files.converter.api.FileData;

public class PdfToXmlConverter implements Converter {
    @Override
    public boolean isSupported(String fromExtension, String toExtension) {
        return fromExtension.equals("pdf") && toExtension.equals("xml");
    }

    @Override
    public FileData convert(FileData fromFile) {
        fromFile.setExtension("xml");
        //TODO: implement
        return fromFile;
    }
}
