//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records 
 * subcomponent sequence from which this entity could be built.
 * 
 *     Example: 1 0G6
 * <PDBx:pdbx_reference_entity_subcomponentsCategory>
 *    <PDBx:pdbx_reference_entity_subcomponents prd_id="PRD_000001" seq="DPN PRO ARG 0QE">
 *       <PDBx:chem_comp_id>0G6</PDBx:chem_comp_id>
 *    </PDBx:pdbx_reference_entity_subcomponents>
 * </PDBx:pdbx_reference_entity_subcomponentsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_subcomponentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_subcomponentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_subcomponents" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_entity_subcomponentsType", propOrder = {
    "pdbxReferenceEntitySubcomponents"
})
public class PdbxReferenceEntitySubcomponentsType {

    @XmlElement(name = "pdbx_reference_entity_subcomponents")
    protected List<PdbxReferenceEntitySubcomponentsType.PdbxReferenceEntitySubcomponents> pdbxReferenceEntitySubcomponents;

    /**
     * Gets the value of the pdbxReferenceEntitySubcomponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntitySubcomponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntitySubcomponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntitySubcomponentsType.PdbxReferenceEntitySubcomponents }
     * 
     * 
     */
    public List<PdbxReferenceEntitySubcomponentsType.PdbxReferenceEntitySubcomponents> getPdbxReferenceEntitySubcomponents() {
        if (pdbxReferenceEntitySubcomponents == null) {
            pdbxReferenceEntitySubcomponents = new ArrayList<PdbxReferenceEntitySubcomponentsType.PdbxReferenceEntitySubcomponents>();
        }
        return this.pdbxReferenceEntitySubcomponents;
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
     *       &lt;/all>
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceEntitySubcomponents {

        @XmlElementRef(name = "chem_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> chemCompId;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;
        @XmlAttribute(name = "seq", required = true)
        protected String seq;

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
         * Gets the value of the seq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeq(String value) {
            this.seq = value;
        }

    }

}
