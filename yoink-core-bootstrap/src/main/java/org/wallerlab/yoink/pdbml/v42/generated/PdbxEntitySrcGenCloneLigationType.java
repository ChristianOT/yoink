//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * This category contains details for the ligation-based cloning steps used in
 * the overall protein production process.
 * attribute clone_step_id in category pdbx_entity_src_gen_clone_ligation in this category
 *  must point at a defined attribute step_id in category pdbx_entity_src_gen_clone. The details in
 *  PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
 * to cover ligation dependent cloning steps.
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_src_gen_clone_ligationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_src_gen_clone_ligationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_src_gen_clone_ligation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="cleavage_enzymes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ligation_enzymes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="temperature">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="time">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_entity_src_gen_clone_ligationType", propOrder = {
    "pdbxEntitySrcGenCloneLigation"
})
public class PdbxEntitySrcGenCloneLigationType {

    @XmlElement(name = "pdbx_entity_src_gen_clone_ligation")
    protected List<PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation> pdbxEntitySrcGenCloneLigation;

    /**
     * Gets the value of the pdbxEntitySrcGenCloneLigation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntitySrcGenCloneLigation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntitySrcGenCloneLigation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation }
     * 
     * 
     */
    public List<PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation> getPdbxEntitySrcGenCloneLigation() {
        if (pdbxEntitySrcGenCloneLigation == null) {
            pdbxEntitySrcGenCloneLigation = new ArrayList<PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation>();
        }
        return this.pdbxEntitySrcGenCloneLigation;
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
     *         &lt;element name="cleavage_enzymes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ligation_enzymes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="temperature">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="time">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxEntitySrcGenCloneLigation {

        @XmlElement(name = "cleavage_enzymes", required = true)
        protected String cleavageEnzymes;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElement(name = "ligation_enzymes", required = true)
        protected String ligationEnzymes;
        @XmlElement(required = true)
        protected PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Temperature temperature;
        @XmlElement(required = true)
        protected PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Time time;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "step_id", required = true)
        protected BigInteger stepId;

        /**
         * Gets the value of the cleavageEnzymes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCleavageEnzymes() {
            return cleavageEnzymes;
        }

        /**
         * Sets the value of the cleavageEnzymes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCleavageEnzymes(String value) {
            this.cleavageEnzymes = value;
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
         * Gets the value of the ligationEnzymes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLigationEnzymes() {
            return ligationEnzymes;
        }

        /**
         * Sets the value of the ligationEnzymes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLigationEnzymes(String value) {
            this.ligationEnzymes = value;
        }

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Temperature }
         *     
         */
        public PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Temperature getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Temperature }
         *     
         */
        public void setTemperature(PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Temperature value) {
            this.temperature = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Time }
         *     
         */
        public PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Time getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Time }
         *     
         */
        public void setTime(PdbxEntitySrcGenCloneLigationType.PdbxEntitySrcGenCloneLigation.Time value) {
            this.time = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
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
         * Gets the value of the stepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStepId() {
            return stepId;
        }

        /**
         * Sets the value of the stepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStepId(BigInteger value) {
            this.stepId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Temperature {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "celsius";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Time {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "minutes";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
