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
 * 
 * In this section, enter information on those experiments that were 
 * used to generate constraint data. For each NMR experiment indicate 
 * which sample and which sample conditions were used for the experiment.
 *  This example was taken from the MCP-1 study.
 * <PDBx:pdbx_nmr_exptlCategory>
 *    <PDBx:pdbx_nmr_exptl conditions_id="1" experiment_id="1" solution_id="3">
 *       <PDBx:type>3D_15N-separated_NOESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 *    <PDBx:pdbx_nmr_exptl conditions_id="1" experiment_id="2" solution_id="1">
 *       <PDBx:type>3D_13C-separated_NOESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 *    <PDBx:pdbx_nmr_exptl conditions_id="2" experiment_id="3" solution_id="1">
 *       <PDBx:type>4D_13C/15N-separated_NOESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 *    <PDBx:pdbx_nmr_exptl conditions_id="1" experiment_id="4" solution_id="1">
 *       <PDBx:type>4D_13C-separated_NOESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 *    <PDBx:pdbx_nmr_exptl conditions_id="1" experiment_id="5" solution_id="1">
 *       <PDBx:type>3D_15N-separated_ROESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 *    <PDBx:pdbx_nmr_exptl conditions_id="1" experiment_id="6" solution_id="3">
 *       <PDBx:type>3D_13C-separated_ROESY</PDBx:type>
 *    </PDBx:pdbx_nmr_exptl>
 * </PDBx:pdbx_nmr_exptlCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_exptlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_exptlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_exptl" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="sample_state" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="isotropic"/>
 *                         &lt;enumeration value="anisotropic"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="spectrometer_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="conditions_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="experiment_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="solution_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_exptlType", propOrder = {
    "pdbxNmrExptl"
})
public class PdbxNmrExptlType {

    @XmlElement(name = "pdbx_nmr_exptl")
    protected List<PdbxNmrExptlType.PdbxNmrExptl> pdbxNmrExptl;

    /**
     * Gets the value of the pdbxNmrExptl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrExptl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrExptl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrExptlType.PdbxNmrExptl }
     * 
     * 
     */
    public List<PdbxNmrExptlType.PdbxNmrExptl> getPdbxNmrExptl() {
        if (pdbxNmrExptl == null) {
            pdbxNmrExptl = new ArrayList<PdbxNmrExptlType.PdbxNmrExptl>();
        }
        return this.pdbxNmrExptl;
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
     *         &lt;element name="sample_state" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="isotropic"/>
     *               &lt;enumeration value="anisotropic"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="spectrometer_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="conditions_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="experiment_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="solution_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrExptl {

        @XmlElementRef(name = "sample_state", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sampleState;
        @XmlElementRef(name = "spectrometer_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> spectrometerId;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "conditions_id", required = true)
        protected String conditionsId;
        @XmlAttribute(name = "experiment_id", required = true)
        protected String experimentId;
        @XmlAttribute(name = "solution_id", required = true)
        protected String solutionId;

        /**
         * Gets the value of the sampleState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSampleState() {
            return sampleState;
        }

        /**
         * Sets the value of the sampleState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSampleState(JAXBElement<String> value) {
            this.sampleState = value;
        }

        /**
         * Gets the value of the spectrometerId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getSpectrometerId() {
            return spectrometerId;
        }

        /**
         * Sets the value of the spectrometerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setSpectrometerId(JAXBElement<BigInteger> value) {
            this.spectrometerId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
        }

        /**
         * Gets the value of the conditionsId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConditionsId() {
            return conditionsId;
        }

        /**
         * Sets the value of the conditionsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConditionsId(String value) {
            this.conditionsId = value;
        }

        /**
         * Gets the value of the experimentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExperimentId() {
            return experimentId;
        }

        /**
         * Sets the value of the experimentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExperimentId(String value) {
            this.experimentId = value;
        }

        /**
         * Gets the value of the solutionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSolutionId() {
            return solutionId;
        }

        /**
         * Sets the value of the solutionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSolutionId(String value) {
            this.solutionId = value;
        }

    }

}
