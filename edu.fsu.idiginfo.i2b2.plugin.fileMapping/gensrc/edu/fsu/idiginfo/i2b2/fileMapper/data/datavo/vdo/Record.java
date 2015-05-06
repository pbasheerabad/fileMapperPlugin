//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.06 at 08:40:15 AM EDT 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://www.fsu.edu/data/datavo/vdo/}FieldValue" maxOccurs="unbounded"/>
 *         &lt;element name="HasAllKeys" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.fsu.edu/data/datavo/vdo/}get_dataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "fields",
    "hasAllKeys",
    "getDataType"
})
public class Record
    implements Serializable
{

    private final static long serialVersionUID = 1337L;
    @XmlElement(name = "Fields", required = true)
    protected List<FieldValue> fields;
    @XmlElement(name = "HasAllKeys")
    protected boolean hasAllKeys;
    @XmlElement(name = "get_dataType", namespace = "http://www.fsu.edu/data/datavo/vdo/", required = true)
    protected DataType getDataType;

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getFields() {
        if (fields == null) {
            fields = new ArrayList<FieldValue>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the hasAllKeys property.
     * 
     */
    public boolean isHasAllKeys() {
        return hasAllKeys;
    }

    /**
     * Sets the value of the hasAllKeys property.
     * 
     */
    public void setHasAllKeys(boolean value) {
        this.hasAllKeys = value;
    }

    /**
     * Gets the value of the getDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getGetDataType() {
        return getDataType;
    }

    /**
     * Sets the value of the getDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setGetDataType(DataType value) {
        this.getDataType = value;
    }

}
