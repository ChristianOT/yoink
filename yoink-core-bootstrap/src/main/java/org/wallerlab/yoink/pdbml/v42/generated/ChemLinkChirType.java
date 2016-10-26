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
 * Data items in the CHEM_LINK_CHIR category provide details about
 * the chiral centres in a link between two chemical components.
 * The atoms bonded to the chiral atom are specified in the
 * CHEM_LINK_CHIR_ATOM category.
 * 
 *          
 * 
 * <p>Java class for chem_link_chirType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_link_chirType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_link_chir" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_comp_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="atom_config" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="R"/>
 *                         &lt;enumeration value="S"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="number_atoms_all" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="number_atoms_nh" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="volume_flag" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="sign"/>
 *                         &lt;enumeration value="nosign"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="volume_three" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="volume_three_esd" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_link_chirType", propOrder = {
    "chemLinkChir"
})
public class ChemLinkChirType {

    @XmlElement(name = "chem_link_chir")
    protected List<ChemLinkChirType.ChemLinkChir> chemLinkChir;

    /**
     * Gets the value of the chemLinkChir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemLinkChir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemLinkChir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemLinkChirType.ChemLinkChir }
     * 
     * 
     */
    public List<ChemLinkChirType.ChemLinkChir> getChemLinkChir() {
        if (chemLinkChir == null) {
            chemLinkChir = new ArrayList<ChemLinkChirType.ChemLinkChir>();
        }
        return this.chemLinkChir;
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
     *         &lt;element name="atom_comp_id" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="atom_config" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="R"/>
     *               &lt;enumeration value="S"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="number_atoms_all" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="number_atoms_nh" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="volume_flag" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="sign"/>
     *               &lt;enumeration value="nosign"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="volume_three" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="volume_three_esd" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemLinkChir {

        @XmlElementRef(name = "atom_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atomCompId;
        @XmlElementRef(name = "atom_config", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atomConfig;
        @XmlElement(name = "atom_id", required = true)
        protected String atomId;
        @XmlElementRef(name = "number_atoms_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberAtomsAll;
        @XmlElementRef(name = "number_atoms_nh", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberAtomsNh;
        @XmlElementRef(name = "volume_flag", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> volumeFlag;
        @XmlElementRef(name = "volume_three", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThree> volumeThree;
        @XmlElementRef(name = "volume_three_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThreeEsd> volumeThreeEsd;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "link_id", required = true)
        protected String linkId;

        /**
         * Gets the value of the atomCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtomCompId() {
            return atomCompId;
        }

        /**
         * Sets the value of the atomCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtomCompId(JAXBElement<String> value) {
            this.atomCompId = value;
        }

        /**
         * Gets the value of the atomConfig property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtomConfig() {
            return atomConfig;
        }

        /**
         * Sets the value of the atomConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtomConfig(JAXBElement<String> value) {
            this.atomConfig = value;
        }

        /**
         * Gets the value of the atomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId() {
            return atomId;
        }

        /**
         * Sets the value of the atomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId(String value) {
            this.atomId = value;
        }

        /**
         * Gets the value of the numberAtomsAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberAtomsAll() {
            return numberAtomsAll;
        }

        /**
         * Sets the value of the numberAtomsAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberAtomsAll(JAXBElement<BigInteger> value) {
            this.numberAtomsAll = value;
        }

        /**
         * Gets the value of the numberAtomsNh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberAtomsNh() {
            return numberAtomsNh;
        }

        /**
         * Sets the value of the numberAtomsNh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberAtomsNh(JAXBElement<BigInteger> value) {
            this.numberAtomsNh = value;
        }

        /**
         * Gets the value of the volumeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVolumeFlag() {
            return volumeFlag;
        }

        /**
         * Sets the value of the volumeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVolumeFlag(JAXBElement<String> value) {
            this.volumeFlag = value;
        }

        /**
         * Gets the value of the volumeThree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ChemLinkChirType.ChemLinkChir.VolumeThree }{@code >}
         *     
         */
        public JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThree> getVolumeThree() {
            return volumeThree;
        }

        /**
         * Sets the value of the volumeThree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ChemLinkChirType.ChemLinkChir.VolumeThree }{@code >}
         *     
         */
        public void setVolumeThree(JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThree> value) {
            this.volumeThree = value;
        }

        /**
         * Gets the value of the volumeThreeEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ChemLinkChirType.ChemLinkChir.VolumeThreeEsd }{@code >}
         *     
         */
        public JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThreeEsd> getVolumeThreeEsd() {
            return volumeThreeEsd;
        }

        /**
         * Sets the value of the volumeThreeEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ChemLinkChirType.ChemLinkChir.VolumeThreeEsd }{@code >}
         *     
         */
        public void setVolumeThreeEsd(JAXBElement<ChemLinkChirType.ChemLinkChir.VolumeThreeEsd> value) {
            this.volumeThreeEsd = value;
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
         * Gets the value of the linkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkId() {
            return linkId;
        }

        /**
         * Sets the value of the linkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkId(String value) {
            this.linkId = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
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
        public static class VolumeThree {

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
                    return "angstroms_cubed";
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_cubed" />
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
        public static class VolumeThreeEsd {

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
                    return "angstroms_cubed";
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
