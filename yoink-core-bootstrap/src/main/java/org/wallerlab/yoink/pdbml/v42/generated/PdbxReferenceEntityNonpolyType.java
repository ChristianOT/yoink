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
 * Data items in the PDBX_REFERENCE_ENTITY_NONPOLY category record
 * the list of entities within each reference molecule.
 * 
 *     Example: 1
 * <PDBx:pdbx_reference_entity_nonpolyCategory>
 *    <PDBx:pdbx_reference_entity_nonpoly prd_id="PRD_000004" ref_entity_id="2">
 *       <PDBx:chem_comp_id>QUI</PDBx:chem_comp_id>
 *       <PDBx:name>2-CARBOXYQUINOXALINE</PDBx:name>
 *    </PDBx:pdbx_reference_entity_nonpoly>
 * </PDBx:pdbx_reference_entity_nonpolyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_nonpolyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_nonpolyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_nonpoly" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_entity_nonpolyType", propOrder = {
    "pdbxReferenceEntityNonpoly"
})
public class PdbxReferenceEntityNonpolyType {

    @XmlElement(name = "pdbx_reference_entity_nonpoly")
    protected List<PdbxReferenceEntityNonpolyType.PdbxReferenceEntityNonpoly> pdbxReferenceEntityNonpoly;

    /**
     * Gets the value of the pdbxReferenceEntityNonpoly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntityNonpoly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntityNonpoly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntityNonpolyType.PdbxReferenceEntityNonpoly }
     * 
     * 
     */
    public List<PdbxReferenceEntityNonpolyType.PdbxReferenceEntityNonpoly> getPdbxReferenceEntityNonpoly() {
        if (pdbxReferenceEntityNonpoly == null) {
            pdbxReferenceEntityNonpoly = new ArrayList<PdbxReferenceEntityNonpolyType.PdbxReferenceEntityNonpoly>();
        }
        return this.pdbxReferenceEntityNonpoly;
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
     *         &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceEntityNonpoly {

        @XmlElementRef(name = "chem_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> chemCompId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;
        @XmlAttribute(name = "ref_entity_id", required = true)
        protected String refEntityId;

        /**
         * Gets the value of the chemCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getChemCompId() {
            return chemCompId;
        }

        /**
         * Sets the value of the chemCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setChemCompId(JAXBElement<String> value) {
            this.chemCompId = value;
        }

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setName(JAXBElement<String> value) {
            this.name = value;
        }

        /**
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrdId(String value) {
            this.prdId = value;
        }

        /**
         * Gets the value of the refEntityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefEntityId() {
            return refEntityId;
        }

        /**
         * Sets the value of the refEntityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefEntityId(String value) {
            this.refEntityId = value;
        }

    }

}