//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.28 at 12:23:57 PM EST 
//


package fileMapper.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTypeField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTypeField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="table_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeField", propOrder = {
    "tableCD",
    "fieldCD",
    "dataType",
    "isKey"
})
public class DataTypeField {

    @XmlElement(name = "table_CD", required = true)
    protected String tableCD;
    @XmlElement(name = "field_CD", required = true)
    protected String fieldCD;
    protected int dataType;
    protected boolean isKey;

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
     * Gets the value of the fieldCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldCD() {
        return fieldCD;
    }

    /**
     * Sets the value of the fieldCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldCD(String value) {
        this.fieldCD = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     */
    public int getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     */
    public void setDataType(int value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the isKey property.
     * 
     */
    public boolean isIsKey() {
        return isKey;
    }

    /**
     * Sets the value of the isKey property.
     * 
     */
    public void setIsKey(boolean value) {
        this.isKey = value;
    }

}
