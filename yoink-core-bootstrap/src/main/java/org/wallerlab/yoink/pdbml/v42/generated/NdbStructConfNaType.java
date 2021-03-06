//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the NDB_STRUCT_CONF_NA category 
 * describes secondary structure features in this entry.
 * 
 *          
 * 
 * <p>Java class for ndb_struct_conf_naType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ndb_struct_conf_naType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ndb_struct_conf_na" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="feature_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="feature" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="double helix"/>
 *                       &lt;enumeration value="a-form double helix"/>
 *                       &lt;enumeration value="b-form double helix"/>
 *                       &lt;enumeration value="z-form double helix"/>
 *                       &lt;enumeration value="other right-handed double helix"/>
 *                       &lt;enumeration value="triple helix"/>
 *                       &lt;enumeration value="quadruple helix"/>
 *                       &lt;enumeration value="parallel strands"/>
 *                       &lt;enumeration value="internal loop"/>
 *                       &lt;enumeration value="bulge loop"/>
 *                       &lt;enumeration value="tetraloop"/>
 *                       &lt;enumeration value="hairpin loop"/>
 *                       &lt;enumeration value="two-way junction"/>
 *                       &lt;enumeration value="three-way junction"/>
 *                       &lt;enumeration value="four-way junction"/>
 *                       &lt;enumeration value="mismatched base pair"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ndb_struct_conf_naType", propOrder = {
    "ndbStructConfNa"
})
public class NdbStructConfNaType {

    @XmlElement(name = "ndb_struct_conf_na")
    protected List<NdbStructConfNaType.NdbStructConfNa> ndbStructConfNa;

    /**
     * Gets the value of the ndbStructConfNa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndbStructConfNa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdbStructConfNa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NdbStructConfNaType.NdbStructConfNa }
     * 
     * 
     */
    public List<NdbStructConfNaType.NdbStructConfNa> getNdbStructConfNa() {
        if (ndbStructConfNa == null) {
            ndbStructConfNa = new ArrayList<NdbStructConfNaType.NdbStructConfNa>();
        }
        return this.ndbStructConfNa;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="feature_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="feature" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="double helix"/>
     *             &lt;enumeration value="a-form double helix"/>
     *             &lt;enumeration value="b-form double helix"/>
     *             &lt;enumeration value="z-form double helix"/>
     *             &lt;enumeration value="other right-handed double helix"/>
     *             &lt;enumeration value="triple helix"/>
     *             &lt;enumeration value="quadruple helix"/>
     *             &lt;enumeration value="parallel strands"/>
     *             &lt;enumeration value="internal loop"/>
     *             &lt;enumeration value="bulge loop"/>
     *             &lt;enumeration value="tetraloop"/>
     *             &lt;enumeration value="hairpin loop"/>
     *             &lt;enumeration value="two-way junction"/>
     *             &lt;enumeration value="three-way junction"/>
     *             &lt;enumeration value="four-way junction"/>
     *             &lt;enumeration value="mismatched base pair"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class NdbStructConfNa {

        @XmlElementRef(name = "feature_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> featureCount;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "feature", required = true)
        protected String feature;

        /**
         * Gets the value of the featureCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getFeatureCount() {
            return featureCount;
        }

        /**
         * Sets the value of the featureCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setFeatureCount(JAXBElement<BigInteger> value) {
            this.featureCount = value;
        }

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

        /**
         * Gets the value of the feature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeature() {
            return feature;
        }

        /**
         * Sets the value of the feature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeature(String value) {
            this.feature = value;
        }

    }

}
