
package org.datacontract.schemas._2004._07.wcfblogservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MyBlog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyBlog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blogNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="blogby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyBlog", propOrder = {
    "blogNO",
    "blogby",
    "content",
    "doc",
    "password",
    "title"
})
public class MyBlog {

    protected Integer blogNO;
    @XmlElementRef(name = "blogby", namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", type = JAXBElement.class)
    protected JAXBElement<String> blogby;
    @XmlElementRef(name = "content", namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", type = JAXBElement.class)
    protected JAXBElement<String> content;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doc;
    @XmlElementRef(name = "password", namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "title", namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", type = JAXBElement.class)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the blogNO property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlogNO() {
        return blogNO;
    }

    /**
     * Sets the value of the blogNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlogNO(Integer value) {
        this.blogNO = value;
    }

    /**
     * Gets the value of the blogby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlogby() {
        return blogby;
    }

    /**
     * Sets the value of the blogby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlogby(JAXBElement<String> value) {
        this.blogby = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoc(XMLGregorianCalendar value) {
        this.doc = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
