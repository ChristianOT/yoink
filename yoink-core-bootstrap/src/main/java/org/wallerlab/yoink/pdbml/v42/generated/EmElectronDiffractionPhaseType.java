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
 * data items in the em_electron_diffraction_phase category
 * record details about the phase information
 * from the electron diffraction experiment.
 *   example 1 - based on pdb entry 1tub and laboratory records for the
 *                 structure corresponding to pdb entry 1tub
 * <PDBx:em_electron_diffraction_phaseCategory>
 *    <PDBx:em_electron_diffraction_phase entry_id="1TUB" id="1">
 *       <PDBx:d_res_high>4</PDBx:d_res_high>
 *       <PDBx:highest_resolution_shell_error xsi:nil="true" />
 *       <PDBx:overall_error xsi:nil="true" />
 *       <PDBx:rejection_criteria_error xsi:nil="true" />
 *       <PDBx:residual xsi:nil="true" />
 *    </PDBx:em_electron_diffraction_phase>
 * </PDBx:em_electron_diffraction_phaseCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_electron_diffraction_phaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_electron_diffraction_phaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_electron_diffraction_phase" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="d_res_high" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="highest_resolution_shell_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="overall_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="rejection_criteria_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="residual" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "em_electron_diffraction_phaseType", propOrder = {
    "emElectronDiffractionPhase"
})
public class EmElectronDiffractionPhaseType {

    @XmlElement(name = "em_electron_diffraction_phase")
    protected List<EmElectronDiffractionPhaseType.EmElectronDiffractionPhase> emElectronDiffractionPhase;

    /**
     * Gets the value of the emElectronDiffractionPhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emElectronDiffractionPhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmElectronDiffractionPhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmElectronDiffractionPhaseType.EmElectronDiffractionPhase }
     * 
     * 
     */
    public List<EmElectronDiffractionPhaseType.EmElectronDiffractionPhase> getEmElectronDiffractionPhase() {
        if (emElectronDiffractionPhase == null) {
            emElectronDiffractionPhase = new ArrayList<EmElectronDiffractionPhaseType.EmElectronDiffractionPhase>();
        }
        return this.emElectronDiffractionPhase;
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
     *         &lt;element name="d_res_high" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="highest_resolution_shell_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="overall_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="rejection_criteria_error" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="residual" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class EmElectronDiffractionPhase {

        @XmlElementRef(name = "d_res_high", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> dResHigh;
        @XmlElementRef(name = "highest_resolution_shell_error", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> highestResolutionShellError;
        @XmlElementRef(name = "overall_error", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> overallError;
        @XmlElementRef(name = "rejection_criteria_error", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> rejectionCriteriaError;
        @XmlElementRef(name = "residual", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> residual;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the dResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getDResHigh() {
            return dResHigh;
        }

        /**
         * Sets the value of the dResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setDResHigh(JAXBElement<BigInteger> value) {
            this.dResHigh = value;
        }

        /**
         * Gets the value of the highestResolutionShellError property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getHighestResolutionShellError() {
            return highestResolutionShellError;
        }

        /**
         * Sets the value of the highestResolutionShellError property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setHighestResolutionShellError(JAXBElement<BigInteger> value) {
            this.highestResolutionShellError = value;
        }

        /**
         * Gets the value of the overallError property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getOverallError() {
            return overallError;
        }

        /**
         * Sets the value of the overallError property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setOverallError(JAXBElement<BigInteger> value) {
            this.overallError = value;
        }

        /**
         * Gets the value of the rejectionCriteriaError property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getRejectionCriteriaError() {
            return rejectionCriteriaError;
        }

        /**
         * Sets the value of the rejectionCriteriaError property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setRejectionCriteriaError(JAXBElement<BigInteger> value) {
            this.rejectionCriteriaError = value;
        }

        /**
         * Gets the value of the residual property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getResidual() {
            return residual;
        }

        /**
         * Sets the value of the residual property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setResidual(JAXBElement<BigInteger> value) {
            this.residual = value;
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

    }

}
