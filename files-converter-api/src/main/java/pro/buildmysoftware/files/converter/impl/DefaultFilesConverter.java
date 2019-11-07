package pro.buildmysoftware.files.converter.impl;

import pro.buildmysoftware.files.converter.api.Converter;
import pro.buildmysoftware.files.converter.api.FileData;
import pro.buildmysoftware.files.converter.api.FilesConverterApi;

import java.util.ServiceLoader;

public class DefaultFilesConverter implements FilesConverterApi {
    @Override
    public FileData convert(FileData fromFile, String extension) {
        String fromExtension = fromFile.getExtension();
        return ServiceLoader.load(Converter.class).stream().map(ServiceLoader.Provider::get)
                .filter(c -> c.isSupported(fromExtension, extension))
                .findAny().orElseThrow().convert(fromFile);

        //.findFirst().orElseThrow().provide();
    }
}
