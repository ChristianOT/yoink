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
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category 
 * annotate deletions in the sequence of the entity described 
 * in the referenced database entry.
 * 
 *     Example 1 
 * <PDBx:pdbx_struct_ref_seq_deletionCategory>
 *    <PDBx:pdbx_struct_ref_seq_deletion id="1">
 *       <PDBx:asym_id>A</PDBx:asym_id>
 *       <PDBx:comp_id>LEU</PDBx:comp_id>
 *       <PDBx:db_code>P15456</PDBx:db_code>
 *       <PDBx:db_name>UNP</PDBx:db_name>
 *       <PDBx:db_seq_id>23</PDBx:db_seq_id>
 *       <PDBx:details xsi:nil="true" />
 *    </PDBx:pdbx_struct_ref_seq_deletion>
 *    <PDBx:pdbx_struct_ref_seq_deletion id="1">
 *       <PDBx:asym_id>A</PDBx:asym_id>
 *       <PDBx:comp_id>THR</PDBx:comp_id>
 *       <PDBx:db_code>P15456</PDBx:db_code>
 *       <PDBx:db_name>UNP</PDBx:db_name>
 *       <PDBx:db_seq_id>24</PDBx:db_seq_id>
 *       <PDBx:details xsi:nil="true" />
 *    </PDBx:pdbx_struct_ref_seq_deletion>
 *    <PDBx:pdbx_struct_ref_seq_deletion id="1">
 *       <PDBx:asym_id>A</PDBx:asym_id>
 *       <PDBx:comp_id>GLN</PDBx:comp_id>
 *       <PDBx:db_code>P15456</PDBx:db_code>
 *       <PDBx:db_name>UNP</PDBx:db_name>
 *       <PDBx:db_seq_id>25</PDBx:db_seq_id>
 *       <PDBx:details xsi:nil="true" />
 *    </PDBx:pdbx_struct_ref_seq_deletion>
 * </PDBx:pdbx_struct_ref_seq_deletionCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_ref_seq_deletionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_ref_seq_deletionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_ref_seq_deletion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "pdbx_struct_ref_seq_deletionType", propOrder = {
    "pdbxStructRefSeqDeletion"
})
public class PdbxStructRefSeqDeletionType {

    @XmlElement(name = "pdbx_struct_ref_seq_deletion")
    protected List<PdbxStructRefSeqDeletionType.PdbxStructRefSeqDeletion> pdbxStructRefSeqDeletion;

    /**
     * Gets the value of the pdbxStructRefSeqDeletion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructRefSeqDeletion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructRefSeqDeletion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructRefSeqDeletionType.PdbxStructRefSeqDeletion }
     * 
     * 
     */
    public List<PdbxStructRefSeqDeletionType.PdbxStructRefSeqDeletion> getPdbxStructRefSeqDeletion() {
        if (pdbxStructRefSeqDeletion == null) {
            pdbxStructRefSeqDeletion = new ArrayList<PdbxStructRefSeqDeletionType.PdbxStructRefSeqDeletion>();
        }
        return this.pdbxStructRefSeqDeletion;
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
     *         &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
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
    public static class PdbxStructRefSeqDeletion {

        @XmlElement(name = "asym_id", required = true)
        protected String asymId;
        @XmlElement(name = "comp_id", required = true)
        protected String compId;
        @XmlElement(name = "db_code", required = true)
        protected String dbCode;
        @XmlElement(name = "db_name", required = true)
        protected String dbName;
        @XmlElement(name = "db_seq_id", required = true)
        protected BigInteger dbSeqId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the asymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsymId() {
            return asymId;
        }

        /**
         * Sets the value of the asymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsymId(String value) {
            this.asymId = value;
        }

        /**
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
        }

        /**
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbCode(String value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbName(String value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the dbSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDbSeqId() {
            return dbSeqId;
        }

        /**
         * Sets the value of the dbSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDbSeqId(BigInteger value) {
            this.dbSeqId = value;
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
