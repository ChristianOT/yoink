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
 * Data items in the STRUCT_SHEET_RANGE category record details
 * about the residue ranges that form a beta-sheet. Residues are
 * included in a range if they made beta-sheet-type hydrogen-bonding
 * interactions with at least one adjacent strand and if there are
 * at least two residues in the range.
 * 
 *     Example 1 - simple beta-barrel.
 * <PDBx:struct_sheet_rangeCategory>
 *    <PDBx:struct_sheet_range id="strand_a" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>20</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>30</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_b" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>40</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>50</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_c" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>60</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>70</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_d" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>80</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>90</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_e" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>100</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>110</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_f" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>120</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>130</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_g" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>140</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>150</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_h" sheet_id="sheet_1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>160</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>170</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 * </PDBx:struct_sheet_rangeCategory>
 * 
 * 
 *     Example 2 - five stranded mixed-sense sheet with one two-piece strand.
 * <PDBx:struct_sheet_rangeCategory>
 *    <PDBx:struct_sheet_range id="strand_a" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>10</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>18</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_b" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>110</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>119</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_c" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>30</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>41</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_d1" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>50</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>52</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_d2" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>90</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>97</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 *    <PDBx:struct_sheet_range id="strand_e" sheet_id="sheet_2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ala</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>70</PDBx:beg_label_seq_id>
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>ala</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>80</PDBx:end_label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_sheet_range>
 * </PDBx:struct_sheet_rangeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_sheet_rangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_sheet_rangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_sheet_range" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="pdbx_beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_sheet_rangeType", propOrder = {
    "structSheetRange"
})
public class StructSheetRangeType {

    @XmlElement(name = "struct_sheet_range")
    protected List<StructSheetRangeType.StructSheetRange> structSheetRange;

    /**
     * Gets the value of the structSheetRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSheetRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSheetRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSheetRangeType.StructSheetRange }
     * 
     * 
     */
    public List<StructSheetRangeType.StructSheetRange> getStructSheetRange() {
        if (structSheetRange == null) {
            structSheetRange = new ArrayList<StructSheetRangeType.StructSheetRange>();
        }
        return this.structSheetRange;
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
     *         &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="pdbx_beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructSheetRange {

        @XmlElementRef(name = "beg_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthAsymId;
        @XmlElementRef(name = "beg_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthCompId;
        @XmlElementRef(name = "beg_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthSeqId;
        @XmlElement(name = "beg_label_asym_id", required = true)
        protected String begLabelAsymId;
        @XmlElement(name = "beg_label_comp_id", required = true)
        protected String begLabelCompId;
        @XmlElement(name = "beg_label_seq_id", required = true)
        protected BigInteger begLabelSeqId;
        @XmlElementRef(name = "end_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthAsymId;
        @XmlElementRef(name = "end_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthCompId;
        @XmlElementRef(name = "end_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthSeqId;
        @XmlElement(name = "end_label_asym_id", required = true)
        protected String endLabelAsymId;
        @XmlElement(name = "end_label_comp_id", required = true)
        protected String endLabelCompId;
        @XmlElement(name = "end_label_seq_id", required = true)
        protected BigInteger endLabelSeqId;
        @XmlElementRef(name = "pdbx_beg_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxBegPDBInsCode;
        @XmlElementRef(name = "pdbx_end_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxEndPDBInsCode;
        @XmlElementRef(name = "symmetry", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> symmetry;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "sheet_id", required = true)
        protected String sheetId;

        /**
         * Gets the value of the begAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthAsymId() {
            return begAuthAsymId;
        }

        /**
         * Sets the value of the begAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthAsymId(JAXBElement<String> value) {
            this.begAuthAsymId = value;
        }

        /**
         * Gets the value of the begAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthCompId() {
            return begAuthCompId;
        }

        /**
         * Sets the value of the begAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthCompId(JAXBElement<String> value) {
            this.begAuthCompId = value;
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
         * Gets the value of the begLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelAsymId() {
            return begLabelAsymId;
        }

        /**
         * Sets the value of the begLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelAsymId(String value) {
            this.begLabelAsymId = value;
        }

        /**
         * Gets the value of the begLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelCompId() {
            return begLabelCompId;
        }

        /**
         * Sets the value of the begLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelCompId(String value) {
            this.begLabelCompId = value;
        }

        /**
         * Gets the value of the begLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBegLabelSeqId() {
            return begLabelSeqId;
        }

        /**
         * Sets the value of the begLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBegLabelSeqId(BigInteger value) {
            this.begLabelSeqId = value;
        }

        /**
         * Gets the value of the endAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthAsymId() {
            return endAuthAsymId;
        }

        /**
         * Sets the value of the endAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthAsymId(JAXBElement<String> value) {
            this.endAuthAsymId = value;
        }

        /**
         * Gets the value of the endAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthCompId() {
            return endAuthCompId;
        }

        /**
         * Sets the value of the endAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthCompId(JAXBElement<String> value) {
            this.endAuthCompId = value;
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
         * Gets the value of the endLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelAsymId() {
            return endLabelAsymId;
        }

        /**
         * Sets the value of the endLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelAsymId(String value) {
            this.endLabelAsymId = value;
        }

        /**
         * Gets the value of the endLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelCompId() {
            return endLabelCompId;
        }

        /**
         * Sets the value of the endLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelCompId(String value) {
            this.endLabelCompId = value;
        }

        /**
         * Gets the value of the endLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEndLabelSeqId() {
            return endLabelSeqId;
        }

        /**
         * Sets the value of the endLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEndLabelSeqId(BigInteger value) {
            this.endLabelSeqId = value;
        }

        /**
         * Gets the value of the pdbxBegPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxBegPDBInsCode() {
            return pdbxBegPDBInsCode;
        }

        /**
         * Sets the value of the pdbxBegPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxBegPDBInsCode(JAXBElement<String> value) {
            this.pdbxBegPDBInsCode = value;
        }

        /**
         * Gets the value of the pdbxEndPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxEndPDBInsCode() {
            return pdbxEndPDBInsCode;
        }

        /**
         * Sets the value of the pdbxEndPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxEndPDBInsCode(JAXBElement<String> value) {
            this.pdbxEndPDBInsCode = value;
        }

        /**
         * Gets the value of the symmetry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSymmetry() {
            return symmetry;
        }

        /**
         * Sets the value of the symmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSymmetry(JAXBElement<String> value) {
            this.symmetry = value;
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

        /**
         * Gets the value of the sheetId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSheetId() {
            return sheetId;
        }

        /**
         * Sets the value of the sheetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSheetId(String value) {
            this.sheetId = value;
        }

    }

}