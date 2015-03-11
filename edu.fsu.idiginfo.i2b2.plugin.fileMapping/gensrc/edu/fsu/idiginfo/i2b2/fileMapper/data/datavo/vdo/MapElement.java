//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 04:00:32 PM EDT 
//


package edu.fsu.idiginfo.i2b2.fileMapper.data.datavo.vdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Map_Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Map_Element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COLUMN_INDEX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACTIVE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TARGET_TABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TARGET_FIELD_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOURCE_FIELD_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_FACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONCEPT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANSFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_VIRTUAL_COLUMN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VIRTUAL_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fsu.edu/data/datavo/vdo/}get_Map"/>
 *         &lt;element ref="{http://www.fsu.edu/data/datavo/vdo/}get_dataTypeField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Map_Element", propOrder = {
    "elementid",
    "columnindex",
    "active",
    "targettable",
    "targetfieldname",
    "sourcefieldname",
    "isfact",
    "conceptcd",
    "iskey",
    "transformation",
    "isvirtualcolumn",
    "virtualvalue",
    "getMap",
    "getDataTypeField"
})
public class MapElement {

    @XmlElement(name = "ELEMENT_ID", required = true)
    protected String elementid;
    @XmlElement(name = "COLUMN_INDEX")
    protected int columnindex;
    @XmlElement(name = "ACTIVE", required = true)
    protected String active;
    @XmlElement(name = "TARGET_TABLE", required = true)
    protected String targettable;
    @XmlElement(name = "TARGET_FIELD_NAME", required = true)
    protected String targetfieldname;
    @XmlElement(name = "SOURCE_FIELD_NAME")
    protected String sourcefieldname;
    @XmlElement(name = "IS_FACT", required = true)
    protected String isfact;
    @XmlElement(name = "CONCEPT_CD")
    protected String conceptcd;
    @XmlElement(name = "IS_KEY", required = true)
    protected String iskey;
    @XmlElement(name = "TRANSFORMATION")
    protected String transformation;
    @XmlElement(name = "IS_VIRTUAL_COLUMN", required = true)
    protected String isvirtualcolumn;
    @XmlElement(name = "VIRTUAL_VALUE")
    protected String virtualvalue;
    @XmlElement(name = "get_Map", namespace = "http://www.fsu.edu/data/datavo/vdo/", required = true)
    protected Map getMap;
    @XmlElement(name = "get_dataTypeField", namespace = "http://www.fsu.edu/data/datavo/vdo/", required = true)
    protected DataType getDataTypeField;

    /**
     * Gets the value of the elementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTID() {
        return elementid;
    }

    /**
     * Sets the value of the elementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTID(String value) {
        this.elementid = value;
    }

    /**
     * Gets the value of the columnindex property.
     * 
     */
    public int getCOLUMNINDEX() {
        return columnindex;
    }

    /**
     * Sets the value of the columnindex property.
     * 
     */
    public void setCOLUMNINDEX(int value) {
        this.columnindex = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVE() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVE(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the targettable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGETTABLE() {
        return targettable;
    }

    /**
     * Sets the value of the targettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGETTABLE(String value) {
        this.targettable = value;
    }

    /**
     * Gets the value of the targetfieldname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGETFIELDNAME() {
        return targetfieldname;
    }

    /**
     * Sets the value of the targetfieldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGETFIELDNAME(String value) {
        this.targetfieldname = value;
    }

    /**
     * Gets the value of the sourcefieldname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEFIELDNAME() {
        return sourcefieldname;
    }

    /**
     * Sets the value of the sourcefieldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEFIELDNAME(String value) {
        this.sourcefieldname = value;
    }

    /**
     * Gets the value of the isfact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISFACT() {
        return isfact;
    }

    /**
     * Sets the value of the isfact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISFACT(String value) {
        this.isfact = value;
    }

    /**
     * Gets the value of the conceptcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTCD() {
        return conceptcd;
    }

    /**
     * Sets the value of the conceptcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTCD(String value) {
        this.conceptcd = value;
    }

    /**
     * Gets the value of the iskey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISKEY() {
        return iskey;
    }

    /**
     * Sets the value of the iskey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISKEY(String value) {
        this.iskey = value;
    }

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFORMATION() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFORMATION(String value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the isvirtualcolumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISVIRTUALCOLUMN() {
        return isvirtualcolumn;
    }

    /**
     * Sets the value of the isvirtualcolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISVIRTUALCOLUMN(String value) {
        this.isvirtualcolumn = value;
    }

    /**
     * Gets the value of the virtualvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALVALUE() {
        return virtualvalue;
    }

    /**
     * Sets the value of the virtualvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALVALUE(String value) {
        this.virtualvalue = value;
    }

    /**
     * Gets the value of the getMap property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetMap() {
        return getMap;
    }

    /**
     * Sets the value of the getMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetMap(Map value) {
        this.getMap = value;
    }

    /**
     * Gets the value of the getDataTypeField property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getGetDataTypeField() {
        return getDataTypeField;
    }

    /**
     * Sets the value of the getDataTypeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setGetDataTypeField(DataType value) {
        this.getDataTypeField = value;
    }

}