
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

    private final static QName _UpdateBlogResponseUpdateBlogResult_QNAME = new QName("http://tempuri.org/", "UpdateBlogResult");
    private final static QName _AddBlogResponseAddBlogResult_QNAME = new QName("http://tempuri.org/", "AddBlogResult");
    private final static QName _UpdateBlogS_QNAME = new QName("http://tempuri.org/", "s");
    private final static QName _GetBlogByIdResponseGetBlogByIdResult_QNAME = new QName("http://tempuri.org/", "GetBlogByIdResult");
    private final static QName _GetAllBlogResponseGetAllBlogResult_QNAME = new QName("http://tempuri.org/", "GetAllBlogResult");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _DeleteBlogResponseDeleteBlogResult_QNAME = new QName("http://tempuri.org/", "DeleteBlogResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBlogByIdResponse }
     * 
     */
    public GetBlogByIdResponse createGetBlogByIdResponse() {
        return new GetBlogByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllBlogResponse }
     * 
     */
    public GetAllBlogResponse createGetAllBlogResponse() {
        return new GetAllBlogResponse();
    }

    /**
     * Create an instance of {@link DeleteBlogResponse }
     * 
     */
    public DeleteBlogResponse createDeleteBlogResponse() {
        return new DeleteBlogResponse();
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
     * Create an instance of {@link UpdateBlogResponse }
     * 
     */
    public UpdateBlogResponse createUpdateBlogResponse() {
        return new UpdateBlogResponse();
    }

    /**
     * Create an instance of {@link GetBlogById }
     * 
     */
    public GetBlogById createGetBlogById() {
        return new GetBlogById();
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
     * Create an instance of {@link DeleteBlog }
     * 
     */
    public DeleteBlog createDeleteBlog() {
        return new DeleteBlog();
    }

    /**
     * Create an instance of {@link UpdateBlog }
     * 
     */
    public UpdateBlog createUpdateBlog() {
        return new UpdateBlog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateBlogResult", scope = UpdateBlogResponse.class)
    public JAXBElement<String> createUpdateBlogResponseUpdateBlogResult(String value) {
        return new JAXBElement<String>(_UpdateBlogResponseUpdateBlogResult_QNAME, String.class, UpdateBlogResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "s", scope = UpdateBlog.class)
    public JAXBElement<MyBlog> createUpdateBlogS(MyBlog value) {
        return new JAXBElement<MyBlog>(_UpdateBlogS_QNAME, MyBlog.class, UpdateBlog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBlogByIdResult", scope = GetBlogByIdResponse.class)
    public JAXBElement<MyBlog> createGetBlogByIdResponseGetBlogByIdResult(MyBlog value) {
        return new JAXBElement<MyBlog>(_GetBlogByIdResponseGetBlogByIdResult_QNAME, MyBlog.class, GetBlogByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "s", scope = AddBlog.class)
    public JAXBElement<MyBlog> createAddBlogS(MyBlog value) {
        return new JAXBElement<MyBlog>(_UpdateBlogS_QNAME, MyBlog.class, AddBlog.class, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteBlogResult", scope = DeleteBlogResponse.class)
    public JAXBElement<String> createDeleteBlogResponseDeleteBlogResult(String value) {
        return new JAXBElement<String>(_DeleteBlogResponseDeleteBlogResult_QNAME, String.class, DeleteBlogResponse.class, value);
    }

}
