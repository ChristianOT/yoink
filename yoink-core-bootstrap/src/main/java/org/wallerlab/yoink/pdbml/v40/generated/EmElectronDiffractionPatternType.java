//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * data items in the em_electron_diffraction_pattern category
 * record details about the pattern information
 * from the electron diffraction experiment.
 *   example 1 - based on pdb entry 1tub and laboratory records for the
 *                 structure corresponding to pdb entry 1tub
 * <PDBx:em_electron_diffraction_patternCategory>
 *    <PDBx:em_electron_diffraction_pattern entry_id="1TUB" id="1">
 *       <PDBx:num_images_by_tilt_angle>4</PDBx:num_images_by_tilt_angle>
 *       <PDBx:num_patterns_by_tilt_angle>1</PDBx:num_patterns_by_tilt_angle>
 *       <PDBx:tilt_angle xsi:nil="true" />
 *    </PDBx:em_electron_diffraction_pattern>
 * </PDBx:em_electron_diffraction_patternCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_electron_diffraction_patternType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_electron_diffraction_patternType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_electron_diffraction_pattern" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="num_images_by_tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="num_patterns_by_tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "em_electron_diffraction_patternType", propOrder = {
    "emElectronDiffractionPattern"
})
public class EmElectronDiffractionPatternType {

    @XmlElement(name = "em_electron_diffraction_pattern")
    protected List<EmElectronDiffractionPatternType.EmElectronDiffractionPattern> emElectronDiffractionPattern;

    /**
     * Gets the value of the emElectronDiffractionPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emElectronDiffractionPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmElectronDiffractionPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmElectronDiffractionPatternType.EmElectronDiffractionPattern }
     * 
     * 
     */
    public List<EmElectronDiffractionPatternType.EmElectronDiffractionPattern> getEmElectronDiffractionPattern() {
        if (emElectronDiffractionPattern == null) {
            emElectronDiffractionPattern = new ArrayList<EmElectronDiffractionPatternType.EmElectronDiffractionPattern>();
        }
        return this.emElectronDiffractionPattern;
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
     *         &lt;element name="num_images_by_tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="num_patterns_by_tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="tilt_angle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    public static class EmElectronDiffractionPattern {

        @XmlElementRef(name = "num_images_by_tilt_angle", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numImagesByTiltAngle;
        @XmlElementRef(name = "num_patterns_by_tilt_angle", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numPatternsByTiltAngle;
        @XmlElementRef(name = "tilt_angle", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> tiltAngle;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the numImagesByTiltAngle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumImagesByTiltAngle() {
            return numImagesByTiltAngle;
        }

        /**
         * Sets the value of the numImagesByTiltAngle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumImagesByTiltAngle(JAXBElement<BigInteger> value) {
            this.numImagesByTiltAngle = value;
        }

        /**
         * Gets the value of the numPatternsByTiltAngle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumPatternsByTiltAngle() {
            return numPatternsByTiltAngle;
        }

        /**
         * Sets the value of the numPatternsByTiltAngle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumPatternsByTiltAngle(JAXBElement<BigInteger> value) {
            this.numPatternsByTiltAngle = value;
        }

        /**
         * Gets the value of the tiltAngle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getTiltAngle() {
            return tiltAngle;
        }

        /**
         * Sets the value of the tiltAngle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setTiltAngle(JAXBElement<BigInteger> value) {
            this.tiltAngle = value;
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
