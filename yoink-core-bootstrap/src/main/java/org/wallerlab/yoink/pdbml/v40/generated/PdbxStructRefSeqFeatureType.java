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
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
 * mechanism for identifying and annotating sequence features.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_struct_ref_seq_featureCategory>
 *    <PDBx:pdbx_struct_ref_seq_feature feature_id="1">
 *       <PDBx:align_id>algn2</PDBx:align_id>
 *       <PDBx:beg_auth_mon_id>GLU</PDBx:beg_auth_mon_id>
 *       <PDBx:beg_auth_seq_id>10</PDBx:beg_auth_seq_id>
 *       <PDBx:details>  Special </PDBx:details>
 *       <PDBx:end_auth_mon_id>PHE</PDBx:end_auth_mon_id>
 *       <PDBx:end_auth_seq_id>14</PDBx:end_auth_seq_id>
 *       <PDBx:type>variant</PDBx:type>
 *    </PDBx:pdbx_struct_ref_seq_feature>
 * </PDBx:pdbx_struct_ref_seq_featureCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_ref_seq_featureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_ref_seq_featureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_ref_seq_feature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="align_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="deletion"/>
 *                         &lt;enumeration value="expression tag"/>
 *                         &lt;enumeration value="variant"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="feature_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_struct_ref_seq_featureType", propOrder = {
    "pdbxStructRefSeqFeature"
})
public class PdbxStructRefSeqFeatureType {

    @XmlElement(name = "pdbx_struct_ref_seq_feature")
    protected List<PdbxStructRefSeqFeatureType.PdbxStructRefSeqFeature> pdbxStructRefSeqFeature;

    /**
     * Gets the value of the pdbxStructRefSeqFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructRefSeqFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructRefSeqFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructRefSeqFeatureType.PdbxStructRefSeqFeature }
     * 
     * 
     */
    public List<PdbxStructRefSeqFeatureType.PdbxStructRefSeqFeature> getPdbxStructRefSeqFeature() {
        if (pdbxStructRefSeqFeature == null) {
            pdbxStructRefSeqFeature = new ArrayList<PdbxStructRefSeqFeatureType.PdbxStructRefSeqFeature>();
        }
        return this.pdbxStructRefSeqFeature;
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
     *         &lt;element name="align_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="deletion"/>
     *               &lt;enumeration value="expression tag"/>
     *               &lt;enumeration value="variant"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="feature_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxStructRefSeqFeature {

        @XmlElement(name = "align_id", required = true)
        protected String alignId;
        @XmlElementRef(name = "asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> asymId;
        @XmlElementRef(name = "beg_auth_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthMonId;
        @XmlElementRef(name = "beg_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthSeqId;
        @XmlElementRef(name = "beg_pdb_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begPdbInsCode;
        @XmlElementRef(name = "beg_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begSeqNum;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "end_auth_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthMonId;
        @XmlElementRef(name = "end_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthSeqId;
        @XmlElementRef(name = "end_pdb_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endPdbInsCode;
        @XmlElementRef(name = "end_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endSeqNum;
        @XmlElementRef(name = "pdb_strand_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbStrandId;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "feature_id", required = true)
        protected BigInteger featureId;

        /**
         * Gets the value of the alignId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlignId() {
            return alignId;
        }

        /**
         * Sets the value of the alignId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlignId(String value) {
            this.alignId = value;
        }

        /**
         * Gets the value of the asymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAsymId() {
            return asymId;
        }

        /**
         * Sets the value of the asymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAsymId(JAXBElement<String> value) {
            this.asymId = value;
        }

        /**
         * Gets the value of the begAuthMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthMonId() {
            return begAuthMonId;
        }

        /**
         * Sets the value of the begAuthMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthMonId(JAXBElement<String> value) {
            this.begAuthMonId = value;
        }

        /**
         * Gets the value of the begAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthSeqId() {
            return begAuthSeqId;
        }

        /**
         * Sets the value of the begAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthSeqId(JAXBElement<String> value) {
            this.begAuthSeqId = value;
        }

        /**
         * Gets the value of the begPdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegPdbInsCode() {
            return begPdbInsCode;
        }

        /**
         * Sets the value of the begPdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegPdbInsCode(JAXBElement<String> value) {
            this.begPdbInsCode = value;
        }

        /**
         * Gets the value of the begSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegSeqNum() {
            return begSeqNum;
        }

        /**
         * Sets the value of the begSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegSeqNum(JAXBElement<String> value) {
            this.begSeqNum = value;
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
         * Gets the value of the endAuthMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthMonId() {
            return endAuthMonId;
        }

        /**
         * Sets the value of the endAuthMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthMonId(JAXBElement<String> value) {
            this.endAuthMonId = value;
        }

        /**
         * Gets the value of the endAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthSeqId() {
            return endAuthSeqId;
        }

        /**
         * Sets the value of the endAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthSeqId(JAXBElement<String> value) {
            this.endAuthSeqId = value;
        }

        /**
         * Gets the value of the endPdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndPdbInsCode() {
            return endPdbInsCode;
        }

        /**
         * Sets the value of the endPdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndPdbInsCode(JAXBElement<String> value) {
            this.endPdbInsCode = value;
        }

        /**
         * Gets the value of the endSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndSeqNum() {
            return endSeqNum;
        }

        /**
         * Sets the value of the endSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndSeqNum(JAXBElement<String> value) {
            this.endSeqNum = value;
        }

        /**
         * Gets the value of the pdbStrandId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbStrandId() {
            return pdbStrandId;
        }

        /**
         * Sets the value of the pdbStrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbStrandId(JAXBElement<String> value) {
            this.pdbStrandId = value;
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
         * Gets the value of the featureId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFeatureId() {
            return featureId;
        }

        /**
         * Sets the value of the featureId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFeatureId(BigInteger value) {
            this.featureId = value;
        }

    }

}
