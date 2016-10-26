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
 * Data items in the PDBX_POINT_SYMMETRY category record details about the
 * point symmetry group associated with this entry.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_point_symmetryCategory>
 *    <PDBx:pdbx_point_symmetry entry_id="1ABC">
 *       <PDBx:H-M_notation>532</PDBx:H-M_notation>
 *       <PDBx:Schoenflies_symbol>I</PDBx:Schoenflies_symbol>
 *    </PDBx:pdbx_point_symmetry>
 * </PDBx:pdbx_point_symmetryCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_point_symmetryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_point_symmetryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_point_symmetry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="H-M_notation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Schoenflies_symbol">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="I"/>
 *                         &lt;enumeration value="O"/>
 *                         &lt;enumeration value="T"/>
 *                         &lt;enumeration value="C"/>
 *                         &lt;enumeration value="D"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="circular_symmetry" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_point_symmetryType", propOrder = {
    "pdbxPointSymmetry"
})
public class PdbxPointSymmetryType {

    @XmlElement(name = "pdbx_point_symmetry")
    protected List<PdbxPointSymmetryType.PdbxPointSymmetry> pdbxPointSymmetry;

    /**
     * Gets the value of the pdbxPointSymmetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPointSymmetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPointSymmetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPointSymmetryType.PdbxPointSymmetry }
     * 
     * 
     */
    public List<PdbxPointSymmetryType.PdbxPointSymmetry> getPdbxPointSymmetry() {
        if (pdbxPointSymmetry == null) {
            pdbxPointSymmetry = new ArrayList<PdbxPointSymmetryType.PdbxPointSymmetry>();
        }
        return this.pdbxPointSymmetry;
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
     *         &lt;element name="H-M_notation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Schoenflies_symbol">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="I"/>
     *               &lt;enumeration value="O"/>
     *               &lt;enumeration value="T"/>
     *               &lt;enumeration value="C"/>
     *               &lt;enumeration value="D"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="circular_symmetry" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxPointSymmetry {

        @XmlElementRef(name = "H-M_notation", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> hmNotation;
        @XmlElement(name = "Schoenflies_symbol", required = true)
        protected String schoenfliesSymbol;
        @XmlElementRef(name = "circular_symmetry", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> circularSymmetry;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the hmNotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHMNotation() {
            return hmNotation;
        }

        /**
         * Sets the value of the hmNotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHMNotation(JAXBElement<String> value) {
            this.hmNotation = value;
        }

        /**
         * Gets the value of the schoenfliesSymbol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoenfliesSymbol() {
            return schoenfliesSymbol;
        }

        /**
         * Sets the value of the schoenfliesSymbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoenfliesSymbol(String value) {
            this.schoenfliesSymbol = value;
        }

        /**
         * Gets the value of the circularSymmetry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCircularSymmetry() {
            return circularSymmetry;
        }

        /**
         * Sets the value of the circularSymmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCircularSymmetry(JAXBElement<String> value) {
            this.circularSymmetry = value;
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

    }

}
