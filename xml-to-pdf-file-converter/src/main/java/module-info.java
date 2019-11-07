import pro.buildmysoftware.files.xmlToPdf.file.converter.XmlToPdfConverter;

module pro.buildmysoftware.files.xmlToPdf.file.converter {
    requires pro.buildmysoftware.files.converter;
    provides pro.buildmysoftware.files.converter.api.Converter with XmlToPdfConverter;
    //it should only provide and not export
}