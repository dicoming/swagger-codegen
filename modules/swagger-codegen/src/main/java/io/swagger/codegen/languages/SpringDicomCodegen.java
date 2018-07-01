package io.swagger.codegen.languages;

/**
 * SpringCodegen class for generating DICOM Consulting company's APIs
 */
public class SpringDicomCodegen extends SpringCodegen {

    public SpringDicomCodegen() {
        super();
        outputFolder = "generated-code/javaDicomSpring";
        embeddedTemplateDir = templateDir = "JavaSpring-DICOM";
        setLibrary(SPRING_CLOUD_LIBRARY);
    }
}