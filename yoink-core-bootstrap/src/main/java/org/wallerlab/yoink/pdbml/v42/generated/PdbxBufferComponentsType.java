//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Constituents of buffer in sample 
 *    Example 1 - based on PDB entry 1DYL and laboratory records for the
 *                 structure corresponding to PDB entry 1DYL
 * <PDBx:pdbx_buffer_componentsCategory>
 *    <PDBx:pdbx_buffer_components buffer_id="1" id="1">
 *       <PDBx:conc>4 </PDBx:conc>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:name>NaCl</PDBx:name>
 *       <PDBx:volume>0.200 </PDBx:volume>
 *    </PDBx:pdbx_buffer_components>
 *    <PDBx:pdbx_buffer_components buffer_id="1" id="2">
 *       <PDBx:conc>100</PDBx:conc>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:name>Acetic Acid</PDBx:name>
 *       <PDBx:volume>0.047 </PDBx:volume>
 *    </PDBx:pdbx_buffer_components>
 *    <PDBx:pdbx_buffer_components buffer_id="1" id="3">
 *       <PDBx:conc>neat</PDBx:conc>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:name>water</PDBx:name>
 *       <PDBx:volume>0.700 </PDBx:volume>
 *    </PDBx:pdbx_buffer_components>
 * </PDBx:pdbx_buffer_componentsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_buffer_componentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_buffer_componentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_buffer_components" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="conc_units" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="%"/>
 *                         &lt;enumeration value="mM"/>
 *                         &lt;enumeration value="mg/mL"/>
 *                         &lt;enumeration value="M"/>
 *                         &lt;enumeration value="g/L"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isotopic_labeling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="buffer_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_buffer_componentsType", propOrder = {
    "pdbxBufferComponents"
})
public class PdbxBufferComponentsType {

    @XmlElement(name = "pdbx_buffer_components")
    protected List<PdbxBufferComponentsType.PdbxBufferComponents> pdbxBufferComponents;

    /**
     * Gets the value of the pdbxBufferComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxBufferComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxBufferComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxBufferComponentsType.PdbxBufferComponents }
     * 
     * 
     */
    public List<PdbxBufferComponentsType.PdbxBufferComponents> getPdbxBufferComponents() {
        if (pdbxBufferComponents == null) {
            pdbxBufferComponents = new ArrayList<PdbxBufferComponentsType.PdbxBufferComponents>();
        }
        return this.pdbxBufferComponents;
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
     *         &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="conc_units" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="%"/>
     *               &lt;enumeration value="mM"/>
     *               &lt;enumeration value="mg/mL"/>
     *               &lt;enumeration value="M"/>
     *               &lt;enumeration value="g/L"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isotopic_labeling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="buffer_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxBufferComponents {

        @XmlElementRef(name = "conc", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> conc;
        @XmlElementRef(name = "conc_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> concUnits;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "isotopic_labeling", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isotopicLabeling;
        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlElementRef(name = "volume", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> volume;
        @XmlAttribute(name = "buffer_id", required = true)
        protected String bufferId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the conc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConc() {
            return conc;
        }

        /**
         * Sets the value of the conc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConc(JAXBElement<String> value) {
            this.conc = value;
        }

        /**
         * Gets the value of the concUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConcUnits() {
            return concUnits;
        }

        /**
         * Sets the value of the concUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConcUnits(JAXBElement<String> value) {
            this.concUnits = value;
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
         * Gets the value of the isotopicLabeling property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsotopicLabeling() {
            return isotopicLabeling;
        }

        /**
         * Sets the value of the isotopicLabeling property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsotopicLabeling(JAXBElement<String> value) {
            this.isotopicLabeling = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setName(JAXBElement<String> value) {
            this.name = value;
        }

        /**
         * Gets the value of the volume property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVolume(JAXBElement<String> value) {
            this.volume = value;
        }

        /**
         * Gets the value of the bufferId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBufferId() {
            return bufferId;
        }

        /**
         * Sets the value of the bufferId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBufferId(String value) {
            this.bufferId = value;
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
