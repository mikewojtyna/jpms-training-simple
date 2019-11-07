package pro.buildmysoftware.files.converter.api;

public interface Converter {
    boolean isSupported(String fromExtension, String toExtension);
    FileData convert(FileData fromFile);
}
