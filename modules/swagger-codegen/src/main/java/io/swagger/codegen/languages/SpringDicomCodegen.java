package io.swagger.codegen.languages;

/**
 * SpringCodegen class for generating DICOM Consulting company's APIs
 */
// TODO: 10.07.18 подтягивать LocalDateTime из других спек
// TODO: 10.07.18 подставлять Ideaable, если среди переменных есть idда
// TODO: 13.07.18 подмечать как @EqualsAndHashcode(callSuper=true), если есть наследование
public class SpringDicomCodegen extends SpringCodegen {

    public SpringDicomCodegen() {
        super();
        outputFolder = "generated-code/javaDicomSpring";
        embeddedTemplateDir = templateDir = "JavaSpring-DICOM";
        setLibrary(SPRING_CLOUD_LIBRARY);
    }

    @Override
    public String getName() {
        return "spring-dicom";
    }

    @Override
    public String getHelp() {
        return "Generates a Java SpringBoot Server application using the SpringFox integration "
                + "for DICOM Consulting company's internal projects.";
    }

}