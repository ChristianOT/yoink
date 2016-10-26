//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the STRUCT_NCS_DOM category record information
 * about the domains in an ensemble of domains related by one or
 * more noncrystallographic symmetry operators.
 * 
 * A domain need not correspond to a complete polypeptide chain;
 * it can be composed of one or more segments in a single chain,
 * or by segments from more than one chain.
 * 
 *     Example 1 - based on laboratory records for the collagen-like
 *                 peptide, HYP-.
 * <PDBx:struct_ncs_domCategory>
 *    <PDBx:struct_ncs_dom id="d1" pdbx_ens_id="1">
 *       <PDBx:details>Chains A, B, and C</PDBx:details>
 *    </PDBx:struct_ncs_dom>
 *    <PDBx:struct_ncs_dom id="d2" pdbx_ens_id="1">
 *       <PDBx:details>Chains D, E, and F</PDBx:details>
 *    </PDBx:struct_ncs_dom>
 * </PDBx:struct_ncs_domCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_ncs_domType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_ncs_domType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_ncs_dom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pdbx_ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_ncs_domType", propOrder = {
    "structNcsDom"
})
public class StructNcsDomType {

    @XmlElement(name = "struct_ncs_dom")
    protected List<StructNcsDomType.StructNcsDom> structNcsDom;

    /**
     * Gets the value of the structNcsDom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structNcsDom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructNcsDom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructNcsDomType.StructNcsDom }
     * 
     * 
     */
    public List<StructNcsDomType.StructNcsDom> getStructNcsDom() {
        if (structNcsDom == null) {
            structNcsDom = new ArrayList<StructNcsDomType.StructNcsDom>();
        }
        return this.structNcsDom;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pdbx_ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructNcsDom {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "pdbx_ens_id", required = true)
        protected String pdbxEnsId;

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDetails(JAXBElement<String> value) {
            this.details = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the pdbxEnsId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxEnsId() {
            return pdbxEnsId;
        }

        /**
         * Sets the value of the pdbxEnsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxEnsId(String value) {
            this.pdbxEnsId = value;
        }

    }

}
