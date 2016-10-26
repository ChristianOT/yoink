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
 * Data items in the PUBL_MANUSCRIPT_INCL category allow
 * the authors of a manuscript submitted for publication to list
 * data names that should be added to the standard request list
 * used by the journal printing software.
 * 
 *     Example 1 - hypothetical example.
 * <PDBx:publ_manuscript_inclCategory>
 *    <PDBx:publ_manuscript_incl entry_id="EXAMHYPO">
 *       <PDBx:extra_defn>yes</PDBx:extra_defn>
 *       <PDBx:extra_info>to emphasise special sites</PDBx:extra_info>
 *       <PDBx:extra_item>_atom_site.symmetry_multiplicity</PDBx:extra_item>
 *    </PDBx:publ_manuscript_incl>
 *    <PDBx:publ_manuscript_incl entry_id="EXAMHYPO">
 *       <PDBx:extra_defn>yes</PDBx:extra_defn>
 *       <PDBx:extra_info>rare material, unusual source</PDBx:extra_info>
 *       <PDBx:extra_item>_chemical.compound_source</PDBx:extra_item>
 *    </PDBx:publ_manuscript_incl>
 *    <PDBx:publ_manuscript_incl entry_id="EXAMHYPO">
 *       <PDBx:extra_defn>yes</PDBx:extra_defn>
 *       <PDBx:extra_info>limited data is a problem here</PDBx:extra_info>
 *       <PDBx:extra_item>_reflns.d_resolution_high</PDBx:extra_item>
 *    </PDBx:publ_manuscript_incl>
 *    <PDBx:publ_manuscript_incl entry_id="EXAMHYPO">
 *       <PDBx:extra_defn>no</PDBx:extra_defn>
 *       <PDBx:extra_info>unusual value for this material</PDBx:extra_info>
 *       <PDBx:extra_item>_crystal.magnetic_permeability</PDBx:extra_item>
 *    </PDBx:publ_manuscript_incl>
 * </PDBx:publ_manuscript_inclCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for publ_manuscript_inclType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publ_manuscript_inclType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publ_manuscript_incl" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="extra_defn" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="extra_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="extra_item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "publ_manuscript_inclType", propOrder = {
    "publManuscriptIncl"
})
public class PublManuscriptInclType {

    @XmlElement(name = "publ_manuscript_incl")
    protected List<PublManuscriptInclType.PublManuscriptIncl> publManuscriptIncl;

    /**
     * Gets the value of the publManuscriptIncl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publManuscriptIncl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublManuscriptIncl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublManuscriptInclType.PublManuscriptIncl }
     * 
     * 
     */
    public List<PublManuscriptInclType.PublManuscriptIncl> getPublManuscriptIncl() {
        if (publManuscriptIncl == null) {
            publManuscriptIncl = new ArrayList<PublManuscriptInclType.PublManuscriptIncl>();
        }
        return this.publManuscriptIncl;
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
     *         &lt;element name="extra_defn" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="extra_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="extra_item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PublManuscriptIncl {

        @XmlElementRef(name = "extra_defn", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> extraDefn;
        @XmlElementRef(name = "extra_info", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> extraInfo;
        @XmlElementRef(name = "extra_item", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> extraItem;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the extraDefn property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExtraDefn() {
            return extraDefn;
        }

        /**
         * Sets the value of the extraDefn property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExtraDefn(JAXBElement<String> value) {
            this.extraDefn = value;
        }

        /**
         * Gets the value of the extraInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExtraInfo() {
            return extraInfo;
        }

        /**
         * Sets the value of the extraInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExtraInfo(JAXBElement<String> value) {
            this.extraInfo = value;
        }

        /**
         * Gets the value of the extraItem property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExtraItem() {
            return extraItem;
        }

        /**
         * Sets the value of the extraItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExtraItem(JAXBElement<String> value) {
            this.extraItem = value;
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

    }

}
