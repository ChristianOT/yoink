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
 * This category contains details for the cloning steps used in
 * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
 * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
 * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is 
 * provided data in the later two categories may be omitted.
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_src_gen_cloneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_src_gen_cloneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_src_gen_clone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gene_insert_method">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="L"/>
 *                         &lt;enumeration value="R"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="marker" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="A"/>
 *                         &lt;enumeration value="F"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="purification_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="transformation_method" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="H"/>
 *                         &lt;enumeration value="E"/>
 *                         &lt;enumeration value="C"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vector_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vector_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="verification_method" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="P"/>
 *                         &lt;enumeration value="R"/>
 *                         &lt;enumeration value="D"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
@XmlType(name = "pdbx_entity_src_gen_cloneType", propOrder = {
    "pdbxEntitySrcGenClone"
})
public class PdbxEntitySrcGenCloneType {

    @XmlElement(name = "pdbx_entity_src_gen_clone")
    protected List<PdbxEntitySrcGenCloneType.PdbxEntitySrcGenClone> pdbxEntitySrcGenClone;

    /**
     * Gets the value of the pdbxEntitySrcGenClone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntitySrcGenClone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntitySrcGenClone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntitySrcGenCloneType.PdbxEntitySrcGenClone }
     * 
     * 
     */
    public List<PdbxEntitySrcGenCloneType.PdbxEntitySrcGenClone> getPdbxEntitySrcGenClone() {
        if (pdbxEntitySrcGenClone == null) {
            pdbxEntitySrcGenClone = new ArrayList<PdbxEntitySrcGenCloneType.PdbxEntitySrcGenClone>();
        }
        return this.pdbxEntitySrcGenClone;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gene_insert_method">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="L"/>
     *               &lt;enumeration value="R"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="marker" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="A"/>
     *               &lt;enumeration value="F"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="purification_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="transformation_method" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="H"/>
     *               &lt;enumeration value="E"/>
     *               &lt;enumeration value="C"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vector_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vector_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="verification_method" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="P"/>
     *               &lt;enumeration value="R"/>
     *               &lt;enumeration value="D"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    public static class PdbxEntitySrcGenClone {

        @XmlElementRef(name = "date", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> date;
        @XmlElementRef(name = "end_construct_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endConstructId;
        @XmlElement(name = "gene_insert_method", required = true)
        protected String geneInsertMethod;
        @XmlElementRef(name = "marker", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> marker;
        @XmlElement(name = "next_step_id", required = true)
        protected BigInteger nextStepId;
        @XmlElementRef(name = "purification_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> purificationDetails;
        @XmlElementRef(name = "robot_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> robotId;
        @XmlElementRef(name = "summary", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> summary;
        @XmlElementRef(name = "transformation_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> transformationMethod;
        @XmlElementRef(name = "vector_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> vectorDetails;
        @XmlElementRef(name = "vector_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> vectorName;
        @XmlElementRef(name = "verification_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> verificationMethod;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "step_id", required = true)
        protected BigInteger stepId;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDate(JAXBElement<String> value) {
            this.date = value;
        }

        /**
         * Gets the value of the endConstructId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndConstructId() {
            return endConstructId;
        }

        /**
         * Sets the value of the endConstructId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndConstructId(JAXBElement<String> value) {
            this.endConstructId = value;
        }

        /**
         * Gets the value of the geneInsertMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeneInsertMethod() {
            return geneInsertMethod;
        }

        /**
         * Sets the value of the geneInsertMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeneInsertMethod(String value) {
            this.geneInsertMethod = value;
        }

        /**
         * Gets the value of the marker property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMarker() {
            return marker;
        }

        /**
         * Sets the value of the marker property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMarker(JAXBElement<String> value) {
            this.marker = value;
        }

        /**
         * Gets the value of the nextStepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNextStepId() {
            return nextStepId;
        }

        /**
         * Sets the value of the nextStepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNextStepId(BigInteger value) {
            this.nextStepId = value;
        }

        /**
         * Gets the value of the purificationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPurificationDetails() {
            return purificationDetails;
        }

        /**
         * Sets the value of the purificationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPurificationDetails(JAXBElement<String> value) {
            this.purificationDetails = value;
        }

        /**
         * Gets the value of the robotId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRobotId() {
            return robotId;
        }

        /**
         * Sets the value of the robotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRobotId(JAXBElement<String> value) {
            this.robotId = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSummary(JAXBElement<String> value) {
            this.summary = value;
        }

        /**
         * Gets the value of the transformationMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTransformationMethod() {
            return transformationMethod;
        }

        /**
         * Sets the value of the transformationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTransformationMethod(JAXBElement<String> value) {
            this.transformationMethod = value;
        }

        /**
         * Gets the value of the vectorDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVectorDetails() {
            return vectorDetails;
        }

        /**
         * Sets the value of the vectorDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVectorDetails(JAXBElement<String> value) {
            this.vectorDetails = value;
        }

        /**
         * Gets the value of the vectorName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVectorName() {
            return vectorName;
        }

        /**
         * Sets the value of the vectorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVectorName(JAXBElement<String> value) {
            this.vectorName = value;
        }

        /**
         * Gets the value of the verificationMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVerificationMethod() {
            return verificationMethod;
        }

        /**
         * Sets the value of the verificationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVerificationMethod(JAXBElement<String> value) {
            this.verificationMethod = value;
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

    }

}
