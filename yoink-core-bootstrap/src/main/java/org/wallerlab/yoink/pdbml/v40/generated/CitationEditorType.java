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
 * Data items in the CITATION_EDITOR category record details
 * about the editors associated with the books or book chapters
 * cited in the CITATION list.
 * 
 *     Example 1 - hypothetical example.
 * <PDBx:citation_editorCategory>
 *    <PDBx:citation_editor citation_id="5" name="McKeever, B.M."></PDBx:citation_editor>
 *    <PDBx:citation_editor citation_id="5" name="Navia, M.A."></PDBx:citation_editor>
 *    <PDBx:citation_editor citation_id="5" name="Fitzgerald, P.M.D."></PDBx:citation_editor>
 *    <PDBx:citation_editor citation_id="5" name="Springer, J.P."></PDBx:citation_editor>
 * </PDBx:citation_editorCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for citation_editorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citation_editorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citation_editor" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="citation_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "citation_editorType", propOrder = {
    "citationEditor"
})
public class CitationEditorType {

    @XmlElement(name = "citation_editor")
    protected List<CitationEditorType.CitationEditor> citationEditor;

    /**
     * Gets the value of the citationEditor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citationEditor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitationEditor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationEditorType.CitationEditor }
     * 
     * 
     */
    public List<CitationEditorType.CitationEditor> getCitationEditor() {
        if (citationEditor == null) {
            citationEditor = new ArrayList<CitationEditorType.CitationEditor>();
        }
        return this.citationEditor;
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
     *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="citation_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class CitationEditor {

        @XmlElementRef(name = "ordinal", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> ordinal;
        @XmlAttribute(name = "citation_id", required = true)
        protected String citationId;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setOrdinal(JAXBElement<BigInteger> value) {
            this.ordinal = value;
        }

        /**
         * Gets the value of the citationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitationId() {
            return citationId;
        }

        /**
         * Sets the value of the citationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitationId(String value) {
            this.citationId = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
