//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category 
 * and methods category where descriptions of software applications and methods can be found.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_spectral_peak_softwareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_spectral_peak_softwareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_spectral_peak_software" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="software_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="spectral_peak_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_nmr_spectral_peak_softwareType", propOrder = {
    "pdbxNmrSpectralPeakSoftware"
})
public class PdbxNmrSpectralPeakSoftwareType {

    @XmlElement(name = "pdbx_nmr_spectral_peak_software")
    protected List<PdbxNmrSpectralPeakSoftwareType.PdbxNmrSpectralPeakSoftware> pdbxNmrSpectralPeakSoftware;

    /**
     * Gets the value of the pdbxNmrSpectralPeakSoftware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSpectralPeakSoftware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSpectralPeakSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSpectralPeakSoftwareType.PdbxNmrSpectralPeakSoftware }
     * 
     * 
     */
    public List<PdbxNmrSpectralPeakSoftwareType.PdbxNmrSpectralPeakSoftware> getPdbxNmrSpectralPeakSoftware() {
        if (pdbxNmrSpectralPeakSoftware == null) {
            pdbxNmrSpectralPeakSoftware = new ArrayList<PdbxNmrSpectralPeakSoftwareType.PdbxNmrSpectralPeakSoftware>();
        }
        return this.pdbxNmrSpectralPeakSoftware;
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
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="software_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="spectral_peak_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxNmrSpectralPeakSoftware {

        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "software_id", required = true)
        protected BigInteger softwareId;
        @XmlAttribute(name = "spectral_peak_list_id", required = true)
        protected BigInteger spectralPeakListId;

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

        /**
         * Gets the value of the softwareId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSoftwareId() {
            return softwareId;
        }

        /**
         * Sets the value of the softwareId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSoftwareId(BigInteger value) {
            this.softwareId = value;
        }

        /**
         * Gets the value of the spectralPeakListId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSpectralPeakListId() {
            return spectralPeakListId;
        }

        /**
         * Sets the value of the spectralPeakListId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSpectralPeakListId(BigInteger value) {
            this.spectralPeakListId = value;
        }

    }

}
