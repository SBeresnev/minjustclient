
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.minustserv.ArrayOfSubjectData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSubjectDataNameResult" type="{http://schemas.datacontract.org/2004/07/MinustServ}ArrayOfSubjectData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSubjectDataNameResult"
})
@XmlRootElement(name = "GetSubjectDataNameResponse")
public class GetSubjectDataNameResponse {

    @XmlElementRef(name = "GetSubjectDataNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubjectData> getSubjectDataNameResult;

    /**
     * Gets the value of the getSubjectDataNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubjectData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSubjectData> getGetSubjectDataNameResult() {
        return getSubjectDataNameResult;
    }

    /**
     * Sets the value of the getSubjectDataNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubjectData }{@code >}
     *     
     */
    public void setGetSubjectDataNameResult(JAXBElement<ArrayOfSubjectData> value) {
        this.getSubjectDataNameResult = value;
    }

}
