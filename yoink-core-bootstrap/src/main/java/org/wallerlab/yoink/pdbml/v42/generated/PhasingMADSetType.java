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
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PHASING_MAD_SET category record
 * details about the individual data sets used in a MAD phasing
 * experiment.
 * 
 *     Example 1 - based on a paper by Shapiro et al. [Nature (London)
 *                 (1995), 374, 327-337].
 * <PDBx:phasing_MAD_setCategory>
 *    <PDBx:phasing_MAD_set clust_id="4 wavelength" expt_id="1" set_id="aa" wavelength="1.4013">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>3.80</PDBx:f_double_prime>
 *       <PDBx:f_prime>-12.48</PDBx:f_prime>
 *       <PDBx:wavelength_details>pre-edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="4 wavelength" expt_id="1" set_id="bb" wavelength="1.3857">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>17.20</PDBx:f_double_prime>
 *       <PDBx:f_prime>-31.22</PDBx:f_prime>
 *       <PDBx:wavelength_details>peak</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="4 wavelength" expt_id="1" set_id="cc" wavelength="1.3852">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>29.17</PDBx:f_double_prime>
 *       <PDBx:f_prime>-13.97</PDBx:f_prime>
 *       <PDBx:wavelength_details>edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="4 wavelength" expt_id="1" set_id="dd" wavelength="1.3847">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>17.34</PDBx:f_double_prime>
 *       <PDBx:f_prime>-6.67</PDBx:f_prime>
 *       <PDBx:wavelength_details>remote</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="1" set_id="ee" wavelength="1.3857">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>14.84</PDBx:f_double_prime>
 *       <PDBx:f_prime>-28.33</PDBx:f_prime>
 *       <PDBx:wavelength_details>ascending edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="1" set_id="ff" wavelength="1.3852">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>30.23</PDBx:f_double_prime>
 *       <PDBx:f_prime>-21.50</PDBx:f_prime>
 *       <PDBx:wavelength_details>peak</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="1" set_id="gg" wavelength="1.3847">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>20.35</PDBx:f_double_prime>
 *       <PDBx:f_prime>-10.71</PDBx:f_prime>
 *       <PDBx:wavelength_details>descending edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="1" set_id="hh" wavelength="1.3784">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>11.84</PDBx:f_double_prime>
 *       <PDBx:f_prime>-14.45</PDBx:f_prime>
 *       <PDBx:wavelength_details>remote 1</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="1" set_id="ii" wavelength="1.2862">
 *       <PDBx:d_res_high>3.00</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>9.01</PDBx:f_double_prime>
 *       <PDBx:f_prime>-9.03</PDBx:f_prime>
 *       <PDBx:wavelength_details>remote 2</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="2" set_id="jj" wavelength="0.7263">
 *       <PDBx:d_res_high>1.90</PDBx:d_res_high>
 *       <PDBx:d_res_low>15.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>4.08</PDBx:f_double_prime>
 *       <PDBx:f_prime>-21.10</PDBx:f_prime>
 *       <PDBx:wavelength_details>pre-edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="2" set_id="kk" wavelength="0.7251">
 *       <PDBx:d_res_high>1.90</PDBx:d_res_high>
 *       <PDBx:d_res_low>15.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>7.92</PDBx:f_double_prime>
 *       <PDBx:f_prime>-34.72</PDBx:f_prime>
 *       <PDBx:wavelength_details>edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="2" set_id="ll" wavelength="0.7248">
 *       <PDBx:d_res_high>1.90</PDBx:d_res_high>
 *       <PDBx:d_res_low>15.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>10.30</PDBx:f_double_prime>
 *       <PDBx:f_prime>-24.87</PDBx:f_prime>
 *       <PDBx:wavelength_details>peak</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="2" set_id="mm" wavelength="0.7246">
 *       <PDBx:d_res_high>1.90</PDBx:d_res_high>
 *       <PDBx:d_res_low>15.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>9.62</PDBx:f_double_prime>
 *       <PDBx:f_prime>-17.43</PDBx:f_prime>
 *       <PDBx:wavelength_details>descending edge</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 *    <PDBx:phasing_MAD_set clust_id="5 wavelength" expt_id="2" set_id="nn" wavelength="0.7217">
 *       <PDBx:d_res_high>1.90</PDBx:d_res_high>
 *       <PDBx:d_res_low>15.00</PDBx:d_res_low>
 *       <PDBx:f_double_prime>8.40</PDBx:f_double_prime>
 *       <PDBx:f_prime>-13.26</PDBx:f_prime>
 *       <PDBx:wavelength_details>remote</PDBx:wavelength_details>
 *    </PDBx:phasing_MAD_set>
 * </PDBx:phasing_MAD_setCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_MAD_setType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_MAD_setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_MAD_set" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="d_res_high" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="d_res_low" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="f_double_prime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="f_prime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_atom_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_f_double_prime_refined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_f_prime_refined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="wavelength_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="clust_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="expt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="set_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="wavelength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
@XmlType(name = "phasing_MAD_setType", propOrder = {
    "phasingMADSet"
})
public class PhasingMADSetType {

    @XmlElement(name = "phasing_MAD_set")
    protected List<PhasingMADSetType.PhasingMADSet> phasingMADSet;

    /**
     * Gets the value of the phasingMADSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingMADSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingMADSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingMADSetType.PhasingMADSet }
     * 
     * 
     */
    public List<PhasingMADSetType.PhasingMADSet> getPhasingMADSet() {
        if (phasingMADSet == null) {
            phasingMADSet = new ArrayList<PhasingMADSetType.PhasingMADSet>();
        }
        return this.phasingMADSet;
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
     *         &lt;element name="d_res_high" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="d_res_low" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="f_double_prime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="f_prime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_atom_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_f_double_prime_refined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_f_prime_refined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="wavelength_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="clust_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="expt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="set_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="wavelength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
    public static class PhasingMADSet {

        @XmlElementRef(name = "d_res_high", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResHigh;
        @XmlElementRef(name = "d_res_low", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResLow;
        @XmlElementRef(name = "f_double_prime", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fDoublePrime;
        @XmlElementRef(name = "f_prime", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fPrime;
        @XmlElementRef(name = "pdbx_atom_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAtomType;
        @XmlElementRef(name = "pdbx_f_double_prime_refined", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFDoublePrimeRefined;
        @XmlElementRef(name = "pdbx_f_prime_refined", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFPrimeRefined;
        @XmlElementRef(name = "wavelength_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> wavelengthDetails;
        @XmlAttribute(name = "clust_id", required = true)
        protected String clustId;
        @XmlAttribute(name = "expt_id", required = true)
        protected String exptId;
        @XmlAttribute(name = "set_id", required = true)
        protected String setId;
        @XmlAttribute(name = "wavelength", required = true)
        protected BigDecimal wavelength;

        /**
         * Gets the value of the dResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResHigh() {
            return dResHigh;
        }

        /**
         * Sets the value of the dResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResHigh(JAXBElement<BigDecimal> value) {
            this.dResHigh = value;
        }

        /**
         * Gets the value of the dResLow property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResLow() {
            return dResLow;
        }

        /**
         * Sets the value of the dResLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResLow(JAXBElement<BigDecimal> value) {
            this.dResLow = value;
        }

        /**
         * Gets the value of the fDoublePrime property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFDoublePrime() {
            return fDoublePrime;
        }

        /**
         * Sets the value of the fDoublePrime property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFDoublePrime(JAXBElement<BigDecimal> value) {
            this.fDoublePrime = value;
        }

        /**
         * Gets the value of the fPrime property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFPrime() {
            return fPrime;
        }

        /**
         * Sets the value of the fPrime property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFPrime(JAXBElement<BigDecimal> value) {
            this.fPrime = value;
        }

        /**
         * Gets the value of the pdbxAtomType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAtomType() {
            return pdbxAtomType;
        }

        /**
         * Sets the value of the pdbxAtomType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAtomType(JAXBElement<String> value) {
            this.pdbxAtomType = value;
        }

        /**
         * Gets the value of the pdbxFDoublePrimeRefined property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFDoublePrimeRefined() {
            return pdbxFDoublePrimeRefined;
        }

        /**
         * Sets the value of the pdbxFDoublePrimeRefined property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFDoublePrimeRefined(JAXBElement<BigDecimal> value) {
            this.pdbxFDoublePrimeRefined = value;
        }

        /**
         * Gets the value of the pdbxFPrimeRefined property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFPrimeRefined() {
            return pdbxFPrimeRefined;
        }

        /**
         * Sets the value of the pdbxFPrimeRefined property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFPrimeRefined(JAXBElement<BigDecimal> value) {
            this.pdbxFPrimeRefined = value;
        }

        /**
         * Gets the value of the wavelengthDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWavelengthDetails() {
            return wavelengthDetails;
        }

        /**
         * Sets the value of the wavelengthDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWavelengthDetails(JAXBElement<String> value) {
            this.wavelengthDetails = value;
        }

        /**
         * Gets the value of the clustId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClustId() {
            return clustId;
        }

        /**
         * Sets the value of the clustId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClustId(String value) {
            this.clustId = value;
        }

        /**
         * Gets the value of the exptId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExptId() {
            return exptId;
        }

        /**
         * Sets the value of the exptId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExptId(String value) {
            this.exptId = value;
        }

        /**
         * Gets the value of the setId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSetId() {
            return setId;
        }

        /**
         * Sets the value of the setId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSetId(String value) {
            this.setId = value;
        }

        /**
         * Gets the value of the wavelength property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWavelength() {
            return wavelength;
        }

        /**
         * Sets the value of the wavelength property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWavelength(BigDecimal value) {
            this.wavelength = value;
        }

    }

}
