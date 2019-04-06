
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfblogservicelibrary.ArrayOfMyBlog;


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
 *         &lt;element name="GetAllBlogResult" type="{http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary}ArrayOfMyBlog" minOccurs="0"/>
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
    "getAllBlogResult"
})
@XmlRootElement(name = "GetAllBlogResponse")
public class GetAllBlogResponse {

    @XmlElementRef(name = "GetAllBlogResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMyBlog> getAllBlogResult;

    /**
     * Gets the value of the getAllBlogResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMyBlog }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMyBlog> getGetAllBlogResult() {
        return getAllBlogResult;
    }

    /**
     * Sets the value of the getAllBlogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMyBlog }{@code >}
     *     
     */
    public void setGetAllBlogResult(JAXBElement<ArrayOfMyBlog> value) {
        this.getAllBlogResult = value;
    }

}
