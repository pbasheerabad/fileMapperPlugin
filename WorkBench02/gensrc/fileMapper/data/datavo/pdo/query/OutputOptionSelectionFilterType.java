//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.28 at 09:52:48 AM EST 
//


package fileMapper.data.datavo.pdo.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionSelectionFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionSelectionFilterType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="min_value"/>
 *     &lt;enumeration value="max_value"/>
 *     &lt;enumeration value="first_value"/>
 *     &lt;enumeration value="last_value"/>
 *     &lt;enumeration value="single_observation"/>
 *     &lt;enumeration value="last_n_values"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionSelectionFilterType")
@XmlEnum
public enum OutputOptionSelectionFilterType {

    @XmlEnumValue("min_value")
    MIN_VALUE("min_value"),
    @XmlEnumValue("max_value")
    MAX_VALUE("max_value"),
    @XmlEnumValue("first_value")
    FIRST_VALUE("first_value"),
    @XmlEnumValue("last_value")
    LAST_VALUE("last_value"),
    @XmlEnumValue("single_observation")
    SINGLE_OBSERVATION("single_observation"),
    @XmlEnumValue("last_n_values")
    LAST_N_VALUES("last_n_values");
    private final String value;

    OutputOptionSelectionFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionSelectionFilterType fromValue(String v) {
        for (OutputOptionSelectionFilterType c: OutputOptionSelectionFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
