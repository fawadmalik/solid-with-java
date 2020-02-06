package com.e2eqa.solidwithjava.hr.app.documents;

/*
Common interface used in application when there is
a need for document exports
 */
public interface ExportableDocument {
    byte[] toPdf();
    String toJson();
    String toTxt();
}
