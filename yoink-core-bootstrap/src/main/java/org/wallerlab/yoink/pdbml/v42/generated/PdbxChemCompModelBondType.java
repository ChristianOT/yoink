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
 * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
 * the bonds between atoms in a chemical component model instance. 
 * 
 *     Example 1 - 
 *                 
 * <PDBx:pdbx_chem_comp_model_bondCategory>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAA" atom_id_2="NBA" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>1</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAA" atom_id_2="HAA" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>2</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAA" atom_id_2="HAAA" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>3</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAA" atom_id_2="HAAB" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>4</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAB" atom_id_2="SBC" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>5</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAB" atom_id_2="HAB" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>6</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAB" atom_id_2="HABA" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>7</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAB" atom_id_2="HABB" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>8</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="OAC" atom_id_2="CAR" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>9</PDBx:ordinal_id>
 *       <PDBx:value_order>DOUB</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="OAD" atom_id_2="SBC" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>10</PDBx:ordinal_id>
 *       <PDBx:value_order>DOUB</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="OAE" atom_id_2="SBC" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>11</PDBx:ordinal_id>
 *       <PDBx:value_order>DOUB</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="OAF" atom_id_2="CAU" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>12</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="OAF" atom_id_2="HOAF" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>13</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="FAG" atom_id_2="CAS" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>14</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAH" atom_id_2="CAI" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>15</PDBx:ordinal_id>
 *       <PDBx:value_order>DOUB</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAH" atom_id_2="CAN" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>16</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAH" atom_id_2="HAH" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>17</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAI" atom_id_2="NAQ" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>18</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 *    <PDBx:pdbx_chem_comp_model_bond atom_id_1="CAI" atom_id_2="HAI" model_id="M_ZZV_00001">
 *       <PDBx:ordinal_id>19</PDBx:ordinal_id>
 *       <PDBx:value_order>SING</PDBx:value_order>
 *    </PDBx:pdbx_chem_comp_model_bond>
 * </PDBx:pdbx_chem_comp_model_bondCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_model_bondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_model_bondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_model_bond" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ordinal_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="value_order" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="SING"/>
 *                         &lt;enumeration value="DOUB"/>
 *                         &lt;enumeration value="TRIP"/>
 *                         &lt;enumeration value="QUAD"/>
 *                         &lt;enumeration value="AROM"/>
 *                         &lt;enumeration value="POLY"/>
 *                         &lt;enumeration value="DELO"/>
 *                         &lt;enumeration value="PI"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_chem_comp_model_bondType", propOrder = {
    "pdbxChemCompModelBond"
})
public class PdbxChemCompModelBondType {

    @XmlElement(name = "pdbx_chem_comp_model_bond")
    protected List<PdbxChemCompModelBondType.PdbxChemCompModelBond> pdbxChemCompModelBond;

    /**
     * Gets the value of the pdbxChemCompModelBond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompModelBond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompModelBond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompModelBondType.PdbxChemCompModelBond }
     * 
     * 
     */
    public List<PdbxChemCompModelBondType.PdbxChemCompModelBond> getPdbxChemCompModelBond() {
        if (pdbxChemCompModelBond == null) {
            pdbxChemCompModelBond = new ArrayList<PdbxChemCompModelBondType.PdbxChemCompModelBond>();
        }
        return this.pdbxChemCompModelBond;
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
     *         &lt;element name="ordinal_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="value_order" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="SING"/>
     *               &lt;enumeration value="DOUB"/>
     *               &lt;enumeration value="TRIP"/>
     *               &lt;enumeration value="QUAD"/>
     *               &lt;enumeration value="AROM"/>
     *               &lt;enumeration value="POLY"/>
     *               &lt;enumeration value="DELO"/>
     *               &lt;enumeration value="PI"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxChemCompModelBond {

        @XmlElement(name = "ordinal_id", required = true)
        protected BigInteger ordinalId;
        @XmlElementRef(name = "value_order", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueOrder;
        @XmlAttribute(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlAttribute(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlAttribute(name = "model_id", required = true)
        protected String modelId;

        /**
         * Gets the value of the ordinalId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinalId() {
            return ordinalId;
        }

        /**
         * Sets the value of the ordinalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinalId(BigInteger value) {
            this.ordinalId = value;
        }

        /**
         * Gets the value of the valueOrder property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueOrder() {
            return valueOrder;
        }

        /**
         * Sets the value of the valueOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueOrder(JAXBElement<String> value) {
            this.valueOrder = value;
        }

        /**
         * Gets the value of the atomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId1() {
            return atomId1;
        }

        /**
         * Sets the value of the atomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId1(String value) {
            this.atomId1 = value;
        }

        /**
         * Gets the value of the atomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId2() {
            return atomId2;
        }

        /**
         * Sets the value of the atomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId2(String value) {
            this.atomId2 = value;
        }

        /**
         * Gets the value of the modelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelId() {
            return modelId;
        }

        /**
         * Sets the value of the modelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelId(String value) {
            this.modelId = value;
        }

    }

}
