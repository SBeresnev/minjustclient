
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.minustserv.ArrayOfSubjectData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSubjectDataNameName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _GetSubjectDataNameResponseGetSubjectDataNameResult_QNAME = new QName("http://tempuri.org/", "GetSubjectDataNameResult");
    private final static QName _GetSubjectDataResponseGetSubjectDataResult_QNAME = new QName("http://tempuri.org/", "GetSubjectDataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubjectDataNameResponse }
     * 
     */
    public GetSubjectDataNameResponse createGetSubjectDataNameResponse() {
        return new GetSubjectDataNameResponse();
    }

    /**
     * Create an instance of {@link GetSubjectData }
     * 
     */
    public GetSubjectData createGetSubjectData() {
        return new GetSubjectData();
    }

    /**
     * Create an instance of {@link GetSubjectDataName }
     * 
     */
    public GetSubjectDataName createGetSubjectDataName() {
        return new GetSubjectDataName();
    }

    /**
     * Create an instance of {@link GetSubjectDataResponse }
     * 
     */
    public GetSubjectDataResponse createGetSubjectDataResponse() {
        return new GetSubjectDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = GetSubjectDataName.class)
    public JAXBElement<String> createGetSubjectDataNameName(String value) {
        return new JAXBElement<String>(_GetSubjectDataNameName_QNAME, String.class, GetSubjectDataName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubjectData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSubjectDataNameResult", scope = GetSubjectDataNameResponse.class)
    public JAXBElement<ArrayOfSubjectData> createGetSubjectDataNameResponseGetSubjectDataNameResult(ArrayOfSubjectData value) {
        return new JAXBElement<ArrayOfSubjectData>(_GetSubjectDataNameResponseGetSubjectDataNameResult_QNAME, ArrayOfSubjectData.class, GetSubjectDataNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubjectData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSubjectDataResult", scope = GetSubjectDataResponse.class)
    public JAXBElement<ArrayOfSubjectData> createGetSubjectDataResponseGetSubjectDataResult(ArrayOfSubjectData value) {
        return new JAXBElement<ArrayOfSubjectData>(_GetSubjectDataResponseGetSubjectDataResult_QNAME, ArrayOfSubjectData.class, GetSubjectDataResponse.class, value);
    }

}
