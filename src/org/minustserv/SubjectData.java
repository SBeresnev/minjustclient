
package org.minustserv;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCRT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DFROM" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DISKL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DLIK" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DVSVD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NGRN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NKATETE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NKOPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NKSTRAN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VADRPRIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VKORP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNAIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNRISKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNRLIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNSVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNTNPK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VNTULK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VOBLAST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VORGCRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VORGISKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VORGLIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRAION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VULITSA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectData", propOrder = {
    "address",
    "dcrt",
    "dfrom",
    "diskl",
    "dlik",
    "dvsvd",
    "ngrn",
    "nkatete",
    "nkopf",
    "nkstran",
    "status",
    "vadrprim",
    "vdom",
    "vfn",
    "vkorp",
    "vn_",
    "vnaim_",
    "vnp",
    "vnriskl",
    "vnrlik",
    "vnsvd",
    "vntnpk",
    "vntulk",
    "voblast",
    "vorgcrt",
    "vorgiskl",
    "vorglik",
    "vpom",
    "vraion",
    "vulitsa"
})
public class SubjectData {

    @XmlElementRef(name = "ADDRESS", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElement(name = "DCRT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dcrt;
    @XmlElement(name = "DFROM")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dfrom;
    @XmlElement(name = "DISKL")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar diskl;
    @XmlElement(name = "DLIK")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dlik;
    @XmlElement(name = "DVSVD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dvsvd;
    @XmlElement(name = "NGRN")
    protected BigDecimal ngrn;
    @XmlElement(name = "NKATETE")
    protected BigDecimal nkatete;
    @XmlElement(name = "NKOPF")
    protected BigDecimal nkopf;
    @XmlElement(name = "NKSTRAN")
    protected BigDecimal nkstran;
    @XmlElementRef(name = "STATUS", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "VADRPRIM", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vadrprim;
    @XmlElementRef(name = "VDOM", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vdom;
    @XmlElementRef(name = "VFN", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vfn;
    @XmlElementRef(name = "VKORP", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vkorp;
    @XmlElementRef(name = "VN", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vn_;
    @XmlElementRef(name = "VNAIM", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnaim_;
    @XmlElementRef(name = "VNP", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnp;
    @XmlElementRef(name = "VNRISKL", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnriskl;
    @XmlElementRef(name = "VNRLIK", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnrlik;
    @XmlElementRef(name = "VNSVD", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnsvd;
    @XmlElementRef(name = "VNTNPK", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vntnpk;
    @XmlElementRef(name = "VNTULK", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vntulk;
    @XmlElementRef(name = "VOBLAST", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voblast;
    @XmlElementRef(name = "VORGCRT", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vorgcrt;
    @XmlElementRef(name = "VORGISKL", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vorgiskl;
    @XmlElementRef(name = "VORGLIK", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vorglik;
    @XmlElementRef(name = "VPOM", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpom;
    @XmlElementRef(name = "VRAION", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vraion;
    @XmlElementRef(name = "VULITSA", namespace = "http://schemas.datacontract.org/2004/07/MinustServ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vulitsa;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRESS(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the dcrt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDCRT() {
        return dcrt;
    }

    /**
     * Sets the value of the dcrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDCRT(XMLGregorianCalendar value) {
        this.dcrt = value;
    }

    /**
     * Gets the value of the dfrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFROM() {
        return dfrom;
    }

    /**
     * Sets the value of the dfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFROM(XMLGregorianCalendar value) {
        this.dfrom = value;
    }

    /**
     * Gets the value of the diskl property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDISKL() {
        return diskl;
    }

    /**
     * Sets the value of the diskl property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDISKL(XMLGregorianCalendar value) {
        this.diskl = value;
    }

    /**
     * Gets the value of the dlik property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDLIK() {
        return dlik;
    }

    /**
     * Sets the value of the dlik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDLIK(XMLGregorianCalendar value) {
        this.dlik = value;
    }

    /**
     * Gets the value of the dvsvd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDVSVD() {
        return dvsvd;
    }

    /**
     * Sets the value of the dvsvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDVSVD(XMLGregorianCalendar value) {
        this.dvsvd = value;
    }

    /**
     * Gets the value of the ngrn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNGRN() {
        return ngrn;
    }

    /**
     * Sets the value of the ngrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNGRN(BigDecimal value) {
        this.ngrn = value;
    }

    /**
     * Gets the value of the nkatete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNKATETE() {
        return nkatete;
    }

    /**
     * Sets the value of the nkatete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNKATETE(BigDecimal value) {
        this.nkatete = value;
    }

    /**
     * Gets the value of the nkopf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNKOPF() {
        return nkopf;
    }

    /**
     * Sets the value of the nkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNKOPF(BigDecimal value) {
        this.nkopf = value;
    }

    /**
     * Gets the value of the nkstran property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNKSTRAN() {
        return nkstran;
    }

    /**
     * Sets the value of the nkstran property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNKSTRAN(BigDecimal value) {
        this.nkstran = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the vadrprim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVADRPRIM() {
        return vadrprim;
    }

    /**
     * Sets the value of the vadrprim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVADRPRIM(JAXBElement<String> value) {
        this.vadrprim = value;
    }

    /**
     * Gets the value of the vdom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVDOM() {
        return vdom;
    }

    /**
     * Sets the value of the vdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVDOM(JAXBElement<String> value) {
        this.vdom = value;
    }

    /**
     * Gets the value of the vfn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVFN() {
        return vfn;
    }

    /**
     * Sets the value of the vfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVFN(JAXBElement<String> value) {
        this.vfn = value;
    }

    /**
     * Gets the value of the vkorp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVKORP() {
        return vkorp;
    }

    /**
     * Sets the value of the vkorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVKORP(JAXBElement<String> value) {
        this.vkorp = value;
    }

    /**
     * Gets the value of the vn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public  JAXBElement<String> getVN_() {
        return vn_;
    }

    /**
     * Sets the value of the vn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVN_(JAXBElement<String> value) {
        this.vn_ = value;
    }

    /**
     * Gets the value of the vnaim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNAIM_() {
        return vnaim_;
    }

    /**
     * Sets the value of the vnaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNAIM_(JAXBElement<String> value) {
        this.vnaim_ = value;
    }

    /**
     * Gets the value of the vnp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNP() {
        return vnp;
    }

    /**
     * Sets the value of the vnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNP(JAXBElement<String> value) {
        this.vnp = value;
    }

    /**
     * Gets the value of the vnriskl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNRISKL() {
        return vnriskl;
    }

    /**
     * Sets the value of the vnriskl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNRISKL(JAXBElement<String> value) {
        this.vnriskl = value;
    }

    /**
     * Gets the value of the vnrlik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNRLIK() {
        return vnrlik;
    }

    /**
     * Sets the value of the vnrlik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNRLIK(JAXBElement<String> value) {
        this.vnrlik = value;
    }

    /**
     * Gets the value of the vnsvd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNSVD() {
        return vnsvd;
    }

    /**
     * Sets the value of the vnsvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNSVD(JAXBElement<String> value) {
        this.vnsvd = value;
    }

    /**
     * Gets the value of the vntnpk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNTNPK() {
        return vntnpk;
    }

    /**
     * Sets the value of the vntnpk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNTNPK(JAXBElement<String> value) {
        this.vntnpk = value;
    }

    /**
     * Gets the value of the vntulk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNTULK() {
        return vntulk;
    }

    /**
     * Sets the value of the vntulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNTULK(JAXBElement<String> value) {
        this.vntulk = value;
    }

    /**
     * Gets the value of the voblast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVOBLAST() {
        return voblast;
    }

    /**
     * Sets the value of the voblast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVOBLAST(JAXBElement<String> value) {
        this.voblast = value;
    }

    /**
     * Gets the value of the vorgcrt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVORGCRT() {
        return vorgcrt;
    }

    /**
     * Sets the value of the vorgcrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVORGCRT(JAXBElement<String> value) {
        this.vorgcrt = value;
    }

    /**
     * Gets the value of the vorgiskl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVORGISKL() {
        return vorgiskl;
    }

    /**
     * Sets the value of the vorgiskl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVORGISKL(JAXBElement<String> value) {
        this.vorgiskl = value;
    }

    /**
     * Gets the value of the vorglik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVORGLIK() {
        return vorglik;
    }

    /**
     * Sets the value of the vorglik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVORGLIK(JAXBElement<String> value) {
        this.vorglik = value;
    }

    /**
     * Gets the value of the vpom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOM() {
        return vpom;
    }

    /**
     * Sets the value of the vpom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOM(JAXBElement<String> value) {
        this.vpom = value;
    }

    /**
     * Gets the value of the vraion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVRAION() {
        return vraion;
    }

    /**
     * Sets the value of the vraion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVRAION(JAXBElement<String> value) {
        this.vraion = value;
    }

    /**
     * Gets the value of the vulitsa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVULITSA() {
        return vulitsa;
    }

    /**
     * Sets the value of the vulitsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVULITSA(JAXBElement<String> value) {
        this.vulitsa = value;
    }

}
