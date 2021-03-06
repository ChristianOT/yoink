//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the CHEM_COMP_ANGLE category record details about
 * angles in a chemical component. Angles are designated by three
 * atoms, with the second atom forming the vertex of the angle.
 * Target values may be specified as angles in degrees, as a
 * distance between the first and third atoms, or both.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:chem_comp_angleCategory>
 *    <PDBx:chem_comp_angle atom_id_1="N" atom_id_2="CA" atom_id_3="C" comp_id="PHE">
 *       <PDBx:value_angle>110.8</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="N" atom_id_2="CA" atom_id_3="CB" comp_id="PHE">
 *       <PDBx:value_angle>110.1</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="C" atom_id_2="CA" atom_id_3="CB" comp_id="PHE">
 *       <PDBx:value_angle>110.3</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="C" atom_id_2="CA" atom_id_3="HA" comp_id="PHE">
 *       <PDBx:value_angle>108.3</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="CA" atom_id_2="C" atom_id_3="O" comp_id="PHE">
 *       <PDBx:value_angle>118.4</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="CA" atom_id_2="C" atom_id_3="OXT" comp_id="PHE">
 *       <PDBx:value_angle>117.8</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="CA" atom_id_2="CB" atom_id_3="CG" comp_id="PHE">
 *       <PDBx:value_angle>114.0</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="O" atom_id_2="C" atom_id_3="OXT" comp_id="PHE">
 *       <PDBx:value_angle>123.8</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="CB" atom_id_2="CG" atom_id_3="CD1" comp_id="PHE">
 *       <PDBx:value_angle>120.8</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 *    <PDBx:chem_comp_angle atom_id_1="CB" atom_id_2="CG" atom_id_3="CD2" comp_id="PHE">
 *       <PDBx:value_angle>120.5</PDBx:value_angle>
 *    </PDBx:chem_comp_angle>
 * </PDBx:chem_comp_angleCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chem_comp_angleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_comp_angleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_comp_angle" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="value_angle" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="180.0"/>
 *                             &lt;maxInclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_angle_esd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="180.0"/>
 *                             &lt;maxInclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_dist" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_dist_esd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_3" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_comp_angleType", propOrder = {
    "chemCompAngle"
})
public class ChemCompAngleType {

    @XmlElement(name = "chem_comp_angle")
    protected List<ChemCompAngleType.ChemCompAngle> chemCompAngle;

    /**
     * Gets the value of the chemCompAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemCompAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemCompAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemCompAngleType.ChemCompAngle }
     * 
     * 
     */
    public List<ChemCompAngleType.ChemCompAngle> getChemCompAngle() {
        if (chemCompAngle == null) {
            chemCompAngle = new ArrayList<ChemCompAngleType.ChemCompAngle>();
        }
        return this.chemCompAngle;
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
     *         &lt;element name="value_angle" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="180.0"/>
     *                   &lt;maxInclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_angle_esd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="180.0"/>
     *                   &lt;maxInclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_dist" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_dist_esd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_3" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemCompAngle {

        @XmlElementRef(name = "value_angle", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueAngle;
        @XmlElementRef(name = "value_angle_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueAngleEsd;
        @XmlElementRef(name = "value_dist", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueDist;
        @XmlElementRef(name = "value_dist_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueDistEsd;
        @XmlAttribute(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlAttribute(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlAttribute(name = "atom_id_3", required = true)
        protected String atomId3;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;

        /**
         * Gets the value of the valueAngle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueAngle() {
            return valueAngle;
        }

        /**
         * Sets the value of the valueAngle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueAngle(JAXBElement<String> value) {
            this.valueAngle = value;
        }

        /**
         * Gets the value of the valueAngleEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueAngleEsd() {
            return valueAngleEsd;
        }

        /**
         * Sets the value of the valueAngleEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueAngleEsd(JAXBElement<String> value) {
            this.valueAngleEsd = value;
        }

        /**
         * Gets the value of the valueDist property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueDist() {
            return valueDist;
        }

        /**
         * Sets the value of the valueDist property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueDist(JAXBElement<String> value) {
            this.valueDist = value;
        }

        /**
         * Gets the value of the valueDistEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueDistEsd() {
            return valueDistEsd;
        }

        /**
         * Sets the value of the valueDistEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueDistEsd(JAXBElement<String> value) {
            this.valueDistEsd = value;
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
         * Gets the value of the atomId3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId3() {
            return atomId3;
        }

        /**
         * Sets the value of the atomId3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId3(String value) {
            this.atomId3 = value;
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

    }

}
