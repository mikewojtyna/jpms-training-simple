package pro.buildmysoftware.files.xmlToPdf.file.converter;

import pro.buildmysoftware.files.converter.api.Converter;
import pro.buildmysoftware.files.converter.api.FileData;

public class XmlToPdfConverter implements Converter {
    @Override
    public boolean isSupported(String fromExtension, String toExtension) {
        return fromExtension.equals("xml") && toExtension.equals("pdf");
    }

    @Override
    public FileData convert(FileData fromFile) {
        fromFile.setExtension("pdf");
        //TODO: implement
        return fromFile;
    }
}
