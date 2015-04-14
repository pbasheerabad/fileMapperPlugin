//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.14 at 12:41:26 PM EDT 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="table_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_set" type="{http://www.fsu.edu/data/datavo/vdo/}DataTypeField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDimension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "name",
    "tableCD",
    "fieldSet",
    "isDimension"
})
public class DataType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "table_CD", required = true)
    protected String tableCD;
    @XmlElement(name = "field_set")
    protected List<DataTypeField> fieldSet;
    protected boolean isDimension;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tableCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableCD() {
        return tableCD;
    }

    /**
     * Sets the value of the tableCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableCD(String value) {
        this.tableCD = value;
    }

    /**
     * Gets the value of the fieldSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTypeField }
     * 
     * 
     */
    public List<DataTypeField> getFieldSet() {
        if (fieldSet == null) {
            fieldSet = new ArrayList<DataTypeField>();
        }
        return this.fieldSet;
    }

    /**
     * Gets the value of the isDimension property.
     * 
     */
    public boolean isIsDimension() {
        return isDimension;
    }

    /**
     * Sets the value of the isDimension property.
     * 
     */
    public void setIsDimension(boolean value) {
        this.isDimension = value;
    }

}
