
package com.soa.lab4ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soa.lab4ws package. 
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

    private final static QName _CountTransferred_QNAME = new QName("http://service.lab4ws.soa.com/", "countTransferred");
    private final static QName _CountTransferredResponse_QNAME = new QName("http://service.lab4ws.soa.com/", "countTransferredResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soa.lab4ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountTransferredResponse }
     * 
     */
    public CountTransferredResponse createCountTransferredResponse() {
        return new CountTransferredResponse();
    }

    /**
     * Create an instance of {@link CountTransferred }
     * 
     */
    public CountTransferred createCountTransferred() {
        return new CountTransferred();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountTransferred }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab4ws.soa.com/", name = "countTransferred")
    public JAXBElement<CountTransferred> createCountTransferred(CountTransferred value) {
        return new JAXBElement<CountTransferred>(_CountTransferred_QNAME, CountTransferred.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountTransferredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab4ws.soa.com/", name = "countTransferredResponse")
    public JAXBElement<CountTransferredResponse> createCountTransferredResponse(CountTransferredResponse value) {
        return new JAXBElement<CountTransferredResponse>(_CountTransferredResponse_QNAME, CountTransferredResponse.class, null, value);
    }

}
