//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.17 at 01:45:00 PM EST 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo package. 
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

    private final static QName _GetDataType_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_dataType");
    private final static QName _GetDataTypeField_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_dataTypeField");
    private final static QName _GetGetDataTypes_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_GetDataTypes");
    private final static QName _GetKeys_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_Keys");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Keys }
     * 
     */
    public Keys createKeys() {
        return new Keys();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link Fields }
     * 
     */
    public Fields createFields() {
        return new Fields();
    }

    /**
     * Create an instance of {@link DataTypeField }
     * 
     */
    public DataTypeField createDataTypeField() {
        return new DataTypeField();
    }

    /**
     * Create an instance of {@link GetKeys }
     * 
     */
    public GetKeys createGetKeys() {
        return new GetKeys();
    }

    /**
     * Create an instance of {@link GetDataTypes }
     * 
     */
    public GetDataTypes createGetDataTypes() {
        return new GetDataTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_dataType")
    public JAXBElement<DataType> createGetDataType(DataType value) {
        return new JAXBElement<DataType>(_GetDataType_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_dataTypeField")
    public JAXBElement<DataType> createGetDataTypeField(DataType value) {
        return new JAXBElement<DataType>(_GetDataTypeField_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_GetDataTypes")
    public JAXBElement<GetDataTypes> createGetGetDataTypes(GetDataTypes value) {
        return new JAXBElement<GetDataTypes>(_GetGetDataTypes_QNAME, GetDataTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_Keys")
    public JAXBElement<GetKeys> createGetKeys(GetKeys value) {
        return new JAXBElement<GetKeys>(_GetKeys_QNAME, GetKeys.class, null, value);
    }

}
