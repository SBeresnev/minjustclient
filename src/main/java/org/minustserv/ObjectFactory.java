
package org.minustserv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.minustserv package. 
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

    private final static QName _ArrayOfSubjectData_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "ArrayOfSubjectData");
    private final static QName _SubjectData_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "SubjectData");
    private final static QName _SubjectDataVADRPRIM_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VADRPRIM");
    private final static QName _SubjectDataVORGLIK_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VORGLIK");
    private final static QName _SubjectDataVFN_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VFN");
    private final static QName _SubjectDataVORGCRT_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VORGCRT");
    private final static QName _SubjectDataADDRESS_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "ADDRESS");
    private final static QName _SubjectDataVKORP_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VKORP");
    private final static QName _SubjectDataVNSVD_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNSVD");
    private final static QName _SubjectDataVNTULK_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNTULK");
    private final static QName _SubjectDataVN_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VN");
    private final static QName _SubjectDataVNAIM_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNAIM");
    private final static QName _SubjectDataVNTNPK_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNTNPK");
    private final static QName _SubjectDataVOBLAST_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VOBLAST");
    private final static QName _SubjectDataSTATUS_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "STATUS");
    private final static QName _SubjectDataVPOM_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VPOM");
    private final static QName _SubjectDataVDOM_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VDOM");
    private final static QName _SubjectDataVRAION_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VRAION");
    private final static QName _SubjectDataVULITSA_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VULITSA");
    private final static QName _SubjectDataVORGISKL_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VORGISKL");
    private final static QName _SubjectDataVNP_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNP");
    private final static QName _SubjectDataVNRLIK_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNRLIK");
    private final static QName _SubjectDataVNRISKL_QNAME = new QName("http://schemas.datacontract.org/2004/07/MinustServ", "VNRISKL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.minustserv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfSubjectData }
     * 
     */
    public ArrayOfSubjectData createArrayOfSubjectData() {
        return new ArrayOfSubjectData();
    }

    /**
     * Create an instance of {@link SubjectData }
     * 
     */
    public SubjectData createSubjectData() {
        return new SubjectData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubjectData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "ArrayOfSubjectData")
    public JAXBElement<ArrayOfSubjectData> createArrayOfSubjectData(ArrayOfSubjectData value) {
        return new JAXBElement<ArrayOfSubjectData>(_ArrayOfSubjectData_QNAME, ArrayOfSubjectData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "SubjectData")
    public JAXBElement<SubjectData> createSubjectData(SubjectData value) {
        return new JAXBElement<SubjectData>(_SubjectData_QNAME, SubjectData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VADRPRIM", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVADRPRIM(String value) {
        return new JAXBElement<String>(_SubjectDataVADRPRIM_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VORGLIK", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVORGLIK(String value) {
        return new JAXBElement<String>(_SubjectDataVORGLIK_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VFN", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVFN(String value) {
        return new JAXBElement<String>(_SubjectDataVFN_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VORGCRT", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVORGCRT(String value) {
        return new JAXBElement<String>(_SubjectDataVORGCRT_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "ADDRESS", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataADDRESS(String value) {
        return new JAXBElement<String>(_SubjectDataADDRESS_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VKORP", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVKORP(String value) {
        return new JAXBElement<String>(_SubjectDataVKORP_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNSVD", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNSVD(String value) {
        return new JAXBElement<String>(_SubjectDataVNSVD_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNTULK", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNTULK(String value) {
        return new JAXBElement<String>(_SubjectDataVNTULK_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VN", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVN(String value) {
        return new JAXBElement<String>(_SubjectDataVN_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNAIM", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNAIM(String value) {
        return new JAXBElement<String>(_SubjectDataVNAIM_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNTNPK", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNTNPK(String value) {
        return new JAXBElement<String>(_SubjectDataVNTNPK_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VOBLAST", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVOBLAST(String value) {
        return new JAXBElement<String>(_SubjectDataVOBLAST_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "STATUS", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataSTATUS(String value) {
        return new JAXBElement<String>(_SubjectDataSTATUS_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VPOM", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVPOM(String value) {
        return new JAXBElement<String>(_SubjectDataVPOM_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VDOM", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVDOM(String value) {
        return new JAXBElement<String>(_SubjectDataVDOM_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VRAION", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVRAION(String value) {
        return new JAXBElement<String>(_SubjectDataVRAION_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VULITSA", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVULITSA(String value) {
        return new JAXBElement<String>(_SubjectDataVULITSA_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VORGISKL", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVORGISKL(String value) {
        return new JAXBElement<String>(_SubjectDataVORGISKL_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNP", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNP(String value) {
        return new JAXBElement<String>(_SubjectDataVNP_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNRLIK", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNRLIK(String value) {
        return new JAXBElement<String>(_SubjectDataVNRLIK_QNAME, String.class, SubjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MinustServ", name = "VNRISKL", scope = SubjectData.class)
    public JAXBElement<String> createSubjectDataVNRISKL(String value) {
        return new JAXBElement<String>(_SubjectDataVNRISKL_QNAME, String.class, SubjectData.class, value);
    }

}
