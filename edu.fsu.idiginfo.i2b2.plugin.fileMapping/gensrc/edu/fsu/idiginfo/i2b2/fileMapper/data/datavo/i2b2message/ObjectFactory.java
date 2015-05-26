//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.21 at 02:06:11 PM EDT 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.i2b2message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.i2b2message package. 
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

    private final static QName _Response_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "response");
    private final static QName _Request_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.i2b2message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link PollingUrlType }
     * 
     */
    public PollingUrlType createPollingUrlType() {
        return new PollingUrlType();
    }

    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link ProcessingIdType }
     * 
     */
    public ProcessingIdType createProcessingIdType() {
        return new ProcessingIdType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link ResultStatusType }
     * 
     */
    public ResultStatusType createResultStatusType() {
        return new ResultStatusType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link MessageTypeType }
     * 
     */
    public MessageTypeType createMessageTypeType() {
        return new MessageTypeType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link MessageControlIdType }
     * 
     */
    public MessageControlIdType createMessageControlIdType() {
        return new MessageControlIdType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link ConditionsType.Condition }
     * 
     */
    public ConditionsType.Condition createConditionsTypeCondition() {
        return new ConditionsType.Condition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "response")
    public JAXBElement<ResponseMessageType> createResponse(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_Response_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "request")
    public JAXBElement<RequestMessageType> createRequest(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_Request_QNAME, RequestMessageType.class, null, value);
    }

}
