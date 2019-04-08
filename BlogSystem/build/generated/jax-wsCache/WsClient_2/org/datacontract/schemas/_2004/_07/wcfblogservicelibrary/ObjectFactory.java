
package org.datacontract.schemas._2004._07.wcfblogservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfblogservicelibrary package. 
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

    private final static QName _ArrayOfMyBlog_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", "ArrayOfMyBlog");
    private final static QName _MyBlog_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", "MyBlog");
    private final static QName _MyBlogBlogby_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", "blogby");
    private final static QName _MyBlogTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", "title");
    private final static QName _MyBlogContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", "content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfblogservicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyBlog }
     * 
     */
    public MyBlog createMyBlog() {
        return new MyBlog();
    }

    /**
     * Create an instance of {@link ArrayOfMyBlog }
     * 
     */
    public ArrayOfMyBlog createArrayOfMyBlog() {
        return new ArrayOfMyBlog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", name = "ArrayOfMyBlog")
    public JAXBElement<ArrayOfMyBlog> createArrayOfMyBlog(ArrayOfMyBlog value) {
        return new JAXBElement<ArrayOfMyBlog>(_ArrayOfMyBlog_QNAME, ArrayOfMyBlog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", name = "MyBlog")
    public JAXBElement<MyBlog> createMyBlog(MyBlog value) {
        return new JAXBElement<MyBlog>(_MyBlog_QNAME, MyBlog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", name = "blogby", scope = MyBlog.class)
    public JAXBElement<String> createMyBlogBlogby(String value) {
        return new JAXBElement<String>(_MyBlogBlogby_QNAME, String.class, MyBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", name = "title", scope = MyBlog.class)
    public JAXBElement<String> createMyBlogTitle(String value) {
        return new JAXBElement<String>(_MyBlogTitle_QNAME, String.class, MyBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfBlogServiceLibrary", name = "content", scope = MyBlog.class)
    public JAXBElement<String> createMyBlogContent(String value) {
        return new JAXBElement<String>(_MyBlogContent_QNAME, String.class, MyBlog.class, value);
    }

}
