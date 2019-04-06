
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfblogservicelibrary.ArrayOfMyBlog;
import org.datacontract.schemas._2004._07.wcfblogservicelibrary.MyBlog;


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

    private final static QName _AddBlogS_QNAME = new QName("http://tempuri.org/", "s");
    private final static QName _AddBlogResponseAddBlogResult_QNAME = new QName("http://tempuri.org/", "AddBlogResult");
    private final static QName _GetAllBlogResponseGetAllBlogResult_QNAME = new QName("http://tempuri.org/", "GetAllBlogResult");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBlogResponse }
     * 
     */
    public GetAllBlogResponse createGetAllBlogResponse() {
        return new GetAllBlogResponse();
    }

    /**
     * Create an instance of {@link AddBlogResponse }
     * 
     */
    public AddBlogResponse createAddBlogResponse() {
        return new AddBlogResponse();
    }

    /**
     * Create an instance of {@link GetAllBlog }
     * 
     */
    public GetAllBlog createGetAllBlog() {
        return new GetAllBlog();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link AddBlog }
     * 
     */
    public AddBlog createAddBlog() {
        return new AddBlog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "s", scope = AddBlog.class)
    public JAXBElement<MyBlog> createAddBlogS(MyBlog value) {
        return new JAXBElement<MyBlog>(_AddBlogS_QNAME, MyBlog.class, AddBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddBlogResult", scope = AddBlogResponse.class)
    public JAXBElement<String> createAddBlogResponseAddBlogResult(String value) {
        return new JAXBElement<String>(_AddBlogResponseAddBlogResult_QNAME, String.class, AddBlogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllBlogResult", scope = GetAllBlogResponse.class)
    public JAXBElement<ArrayOfMyBlog> createGetAllBlogResponseGetAllBlogResult(ArrayOfMyBlog value) {
        return new JAXBElement<ArrayOfMyBlog>(_GetAllBlogResponseGetAllBlogResult_QNAME, ArrayOfMyBlog.class, GetAllBlogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<String> createGetDataResponseGetDataResult(String value) {
        return new JAXBElement<String>(_GetDataResponseGetDataResult_QNAME, String.class, GetDataResponse.class, value);
    }

}
