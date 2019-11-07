import pro.buildmysoftware.files.PdfToXml.file.converter.PdfToXmlConverter;

module pro.buildmysoftware.files.pdfToXml.file.converter {
    requires pro.buildmysoftware.files.converter;
    provides pro.buildmysoftware.files.converter.api.Converter with PdfToXmlConverter;
    //it should only provide and not export
}