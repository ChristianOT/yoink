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
 * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record 
 * details of the source from which the entity was obtained.
 * 
 *     Example 1 - Actinomycin
 * <PDBx:pdbx_reference_entity_src_natCategory>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="1" prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:db_code>C06770</PDBx:db_code>
 *       <PDBx:db_name>KEGG</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces parvulus</PDBx:organism_scientific>
 *       <PDBx:source>KEGG</PDBx:source>
 *       <PDBx:taxid>146923</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="2" prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:db_code>NOR00228</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces anulatus</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>1892</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="3" prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:db_code>NOR00228</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces antibioticus</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>1890</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="4" prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:db_code>NOR00228</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces parvulus</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>146923</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="5" prd_id="PRD_000002" ref_entity_id="2">
 *       <PDBx:db_code>NOR00228</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces chrysomallus</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>1892</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="6" prd_id="PRD_000003" ref_entity_id="3">
 *       <PDBx:db_code>NOR00233</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces chrysomallus</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>1892</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 *    <PDBx:pdbx_reference_entity_src_nat ordinal="7" prd_id="PRD_000003" ref_entity_id="3">
 *       <PDBx:db_code>NOR00233</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:organism_scientific>Streptomyces sp.</PDBx:organism_scientific>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:taxid>1931</PDBx:taxid>
 *    </PDBx:pdbx_reference_entity_src_nat>
 * </PDBx:pdbx_reference_entity_src_natCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_src_natType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_src_natType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_src_nat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organism_scientific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="strain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="taxid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_reference_entity_src_natType", propOrder = {
    "pdbxReferenceEntitySrcNat"
})
public class PdbxReferenceEntitySrcNatType {

    @XmlElement(name = "pdbx_reference_entity_src_nat")
    protected List<PdbxReferenceEntitySrcNatType.PdbxReferenceEntitySrcNat> pdbxReferenceEntitySrcNat;

    /**
     * Gets the value of the pdbxReferenceEntitySrcNat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntitySrcNat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntitySrcNat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntitySrcNatType.PdbxReferenceEntitySrcNat }
     * 
     * 
     */
    public List<PdbxReferenceEntitySrcNatType.PdbxReferenceEntitySrcNat> getPdbxReferenceEntitySrcNat() {
        if (pdbxReferenceEntitySrcNat == null) {
            pdbxReferenceEntitySrcNat = new ArrayList<PdbxReferenceEntitySrcNatType.PdbxReferenceEntitySrcNat>();
        }
        return this.pdbxReferenceEntitySrcNat;
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
     *         &lt;element name="atcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organism_scientific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="strain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="taxid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxReferenceEntitySrcNat {

        @XmlElementRef(name = "atcc", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atcc;
        @XmlElementRef(name = "db_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbCode;
        @XmlElementRef(name = "db_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbName;
        @XmlElementRef(name = "organism_scientific", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> organismScientific;
        @XmlElementRef(name = "source", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> source;
        @XmlElementRef(name = "source_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sourceId;
        @XmlElementRef(name = "strain", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> strain;
        @XmlElementRef(name = "taxid", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> taxid;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;
        @XmlAttribute(name = "ref_entity_id", required = true)
        protected String refEntityId;

        /**
         * Gets the value of the atcc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtcc() {
            return atcc;
        }

        /**
         * Sets the value of the atcc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtcc(JAXBElement<String> value) {
            this.atcc = value;
        }

        /**
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbCode(JAXBElement<String> value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbName(JAXBElement<String> value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the organismScientific property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getOrganismScientific() {
            return organismScientific;
        }

        /**
         * Sets the value of the organismScientific property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setOrganismScientific(JAXBElement<String> value) {
            this.organismScientific = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSource(JAXBElement<String> value) {
            this.source = value;
        }

        /**
         * Gets the value of the sourceId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSourceId() {
            return sourceId;
        }

        /**
         * Sets the value of the sourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSourceId(JAXBElement<String> value) {
            this.sourceId = value;
        }

        /**
         * Gets the value of the strain property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStrain() {
            return strain;
        }

        /**
         * Sets the value of the strain property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStrain(JAXBElement<String> value) {
            this.strain = value;
        }

        /**
         * Gets the value of the taxid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTaxid() {
            return taxid;
        }

        /**
         * Sets the value of the taxid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTaxid(JAXBElement<String> value) {
            this.taxid = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
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
