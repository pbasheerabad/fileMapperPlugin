//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.27 at 11:31:23 AM EDT 
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
    private final static QName _GetDataTable_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_DataTable");
    private final static QName _GetMap_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_Map");
    private final static QName _GetMapElement_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_MapElement");
    private final static QName _GetGetDataTypes_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_GetDataTypes");
    private final static QName _GetRecord_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_Record");
    private final static QName _GetKeys_QNAME = new QName("http://www.fsu.edu/data/datavo/vdo/", "get_Keys");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMaps }
     * 
     */
    public GetMaps createGetMaps() {
        return new GetMaps();
    }

    /**
     * Create an instance of {@link ColumnData }
     * 
     */
    public ColumnData createColumnData() {
        return new ColumnData();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link DataTable }
     * 
     */
    public DataTable createDataTable() {
        return new DataTable();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link GetKeys }
     * 
     */
    public GetKeys createGetKeys() {
        return new GetKeys();
    }

    /**
     * Create an instance of {@link FieldValue }
     * 
     */
    public FieldValue createFieldValue() {
        return new FieldValue();
    }

    /**
     * Create an instance of {@link FieldColumnMatch }
     * 
     */
    public FieldColumnMatch createFieldColumnMatch() {
        return new FieldColumnMatch();
    }

    /**
     * Create an instance of {@link ColumnMatch }
     * 
     */
    public ColumnMatch createColumnMatch() {
        return new ColumnMatch();
    }

    /**
     * Create an instance of {@link MapElement }
     * 
     */
    public MapElement createMapElement() {
        return new MapElement();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link DataFile }
     * 
     */
    public DataFile createDataFile() {
        return new DataFile();
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link GetDataTypes }
     * 
     */
    public GetDataTypes createGetDataTypes() {
        return new GetDataTypes();
    }

    /**
     * Create an instance of {@link DataTypeField }
     * 
     */
    public DataTypeField createDataTypeField() {
        return new DataTypeField();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_DataTable")
    public JAXBElement<DataTable> createGetDataTable(DataTable value) {
        return new JAXBElement<DataTable>(_GetDataTable_QNAME, DataTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_Map")
    public JAXBElement<Map> createGetMap(Map value) {
        return new JAXBElement<Map>(_GetMap_QNAME, Map.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_MapElement")
    public JAXBElement<MapElement> createGetMapElement(MapElement value) {
        return new JAXBElement<MapElement>(_GetMapElement_QNAME, MapElement.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Record }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fsu.edu/data/datavo/vdo/", name = "get_Record")
    public JAXBElement<Record> createGetRecord(Record value) {
        return new JAXBElement<Record>(_GetRecord_QNAME, Record.class, null, value);
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
