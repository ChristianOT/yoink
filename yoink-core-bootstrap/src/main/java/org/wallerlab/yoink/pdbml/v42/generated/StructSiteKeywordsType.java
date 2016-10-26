//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the STRUCT_SITE_KEYWORDS category record
 * keywords describing the site.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_site_keywordsCategory>
 *    <PDBx:struct_site_keywords site_id="P2 site C" text="binding site"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site C" text="binding pocket"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site C" text="P2 site"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site C" text="P2 pocket"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site D" text="binding site"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site D" text="binding pocket"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site D" text="P2 site"></PDBx:struct_site_keywords>
 *    <PDBx:struct_site_keywords site_id="P2 site D" text="P2 pocket"></PDBx:struct_site_keywords>
 * </PDBx:struct_site_keywordsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_site_keywordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_site_keywordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_site_keywords" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="site_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_site_keywordsType", propOrder = {
    "structSiteKeywords"
})
public class StructSiteKeywordsType {

    @XmlElement(name = "struct_site_keywords")
    protected List<StructSiteKeywordsType.StructSiteKeywords> structSiteKeywords;

    /**
     * Gets the value of the structSiteKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSiteKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSiteKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSiteKeywordsType.StructSiteKeywords }
     * 
     * 
     */
    public List<StructSiteKeywordsType.StructSiteKeywords> getStructSiteKeywords() {
        if (structSiteKeywords == null) {
            structSiteKeywords = new ArrayList<StructSiteKeywordsType.StructSiteKeywords>();
        }
        return this.structSiteKeywords;
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
     *       &lt;attribute name="site_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StructSiteKeywords {

        @XmlAttribute(name = "site_id", required = true)
        protected String siteId;
        @XmlAttribute(name = "text", required = true)
        protected String text;

        /**
         * Gets the value of the siteId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteId() {
            return siteId;
        }

        /**
         * Sets the value of the siteId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteId(String value) {
            this.siteId = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
