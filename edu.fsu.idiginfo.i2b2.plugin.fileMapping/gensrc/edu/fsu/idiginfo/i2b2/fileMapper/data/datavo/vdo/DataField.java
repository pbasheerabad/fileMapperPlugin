//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.06 at 03:06:29 PM EDT 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.fsu.edu/data/datavo/vdo/}DataType" minOccurs="0"/>
 *         &lt;element name="FileColumn" type="{http://www.fsu.edu/data/datavo/vdo/}ColumnMatch" minOccurs="0"/>
 *         &lt;element name="Field" type="{http://www.fsu.edu/data/datavo/vdo/}DataTypeField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataField", propOrder = {
    "type",
    "fileColumn",
    "field"
})
public class DataField {

    @XmlElement(name = "Type")
    protected DataType type;
    @XmlElement(name = "FileColumn")
    protected ColumnMatch fileColumn;
    @XmlElement(name = "Field")
    protected DataTypeField field;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setType(DataType value) {
        this.type = value;
    }

    /**
     * Gets the value of the fileColumn property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnMatch }
     *     
     */
    public ColumnMatch getFileColumn() {
        return fileColumn;
    }

    /**
     * Sets the value of the fileColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnMatch }
     *     
     */
    public void setFileColumn(ColumnMatch value) {
        this.fileColumn = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeField }
     *     
     */
    public DataTypeField getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeField }
     *     
     */
    public void setField(DataTypeField value) {
        this.field = value;
    }

}
