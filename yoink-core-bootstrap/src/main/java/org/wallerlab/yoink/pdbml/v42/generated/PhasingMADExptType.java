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
 * Data items in the PHASING_MAD_EXPT category record details about
 * a MAD phasing experiment, such as the number of experiments that
 * were clustered together to produce a set of phases or the
 * statistics for those phases.
 * 
 *     Example 1 - based on a paper by Shapiro et al. [Nature (London)
 *                 (1995), 374, 327-337].
 * <PDBx:phasing_MAD_exptCategory>
 *    <PDBx:phasing_MAD_expt id="1">
 *       <PDBx:R_normal_all>0.063</PDBx:R_normal_all>
 *       <PDBx:R_normal_anom_scat>0.451</PDBx:R_normal_anom_scat>
 *       <PDBx:delta_delta_phi>58.5</PDBx:delta_delta_phi>
 *       <PDBx:delta_phi_sigma>20.3</PDBx:delta_phi_sigma>
 *       <PDBx:mean_fom>0.88</PDBx:mean_fom>
 *       <PDBx:number_clust>2</PDBx:number_clust>
 *    </PDBx:phasing_MAD_expt>
 *    <PDBx:phasing_MAD_expt id="2">
 *       <PDBx:R_normal_all>0.051</PDBx:R_normal_all>
 *       <PDBx:R_normal_anom_scat>0.419</PDBx:R_normal_anom_scat>
 *       <PDBx:delta_delta_phi>36.8</PDBx:delta_delta_phi>
 *       <PDBx:delta_phi_sigma>18.2</PDBx:delta_phi_sigma>
 *       <PDBx:mean_fom>0.93</PDBx:mean_fom>
 *       <PDBx:number_clust>1</PDBx:number_clust>
 *    </PDBx:phasing_MAD_expt>
 * </PDBx:phasing_MAD_exptCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_MAD_exptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_MAD_exptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_MAD_expt" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_normal_all" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_normal_anom_scat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="delta_delta_phi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="delta_phi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="delta_phi_sigma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mean_fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="number_clust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "phasing_MAD_exptType", propOrder = {
    "phasingMADExpt"
})
public class PhasingMADExptType {

    @XmlElement(name = "phasing_MAD_expt")
    protected List<PhasingMADExptType.PhasingMADExpt> phasingMADExpt;

    /**
     * Gets the value of the phasingMADExpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingMADExpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingMADExpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingMADExptType.PhasingMADExpt }
     * 
     * 
     */
    public List<PhasingMADExptType.PhasingMADExpt> getPhasingMADExpt() {
        if (phasingMADExpt == null) {
            phasingMADExpt = new ArrayList<PhasingMADExptType.PhasingMADExpt>();
        }
        return this.phasingMADExpt;
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
     *         &lt;element name="R_normal_all" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_normal_anom_scat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="delta_delta_phi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="delta_phi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="delta_phi_sigma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mean_fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="number_clust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
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
    public static class PhasingMADExpt {

        @XmlElementRef(name = "R_normal_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rNormalAll;
        @XmlElementRef(name = "R_normal_anom_scat", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rNormalAnomScat;
        @XmlElementRef(name = "delta_delta_phi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> deltaDeltaPhi;
        @XmlElementRef(name = "delta_phi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> deltaPhi;
        @XmlElementRef(name = "delta_phi_sigma", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> deltaPhiSigma;
        @XmlElementRef(name = "mean_fom", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> meanFom;
        @XmlElementRef(name = "number_clust", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberClust;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the rNormalAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRNormalAll() {
            return rNormalAll;
        }

        /**
         * Sets the value of the rNormalAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRNormalAll(JAXBElement<BigDecimal> value) {
            this.rNormalAll = value;
        }

        /**
         * Gets the value of the rNormalAnomScat property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRNormalAnomScat() {
            return rNormalAnomScat;
        }

        /**
         * Sets the value of the rNormalAnomScat property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRNormalAnomScat(JAXBElement<BigDecimal> value) {
            this.rNormalAnomScat = value;
        }

        /**
         * Gets the value of the deltaDeltaPhi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDeltaDeltaPhi() {
            return deltaDeltaPhi;
        }

        /**
         * Sets the value of the deltaDeltaPhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDeltaDeltaPhi(JAXBElement<BigDecimal> value) {
            this.deltaDeltaPhi = value;
        }

        /**
         * Gets the value of the deltaPhi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDeltaPhi() {
            return deltaPhi;
        }

        /**
         * Sets the value of the deltaPhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDeltaPhi(JAXBElement<BigDecimal> value) {
            this.deltaPhi = value;
        }

        /**
         * Gets the value of the deltaPhiSigma property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDeltaPhiSigma() {
            return deltaPhiSigma;
        }

        /**
         * Sets the value of the deltaPhiSigma property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDeltaPhiSigma(JAXBElement<BigDecimal> value) {
            this.deltaPhiSigma = value;
        }

        /**
         * Gets the value of the meanFom property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMeanFom() {
            return meanFom;
        }

        /**
         * Sets the value of the meanFom property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMeanFom(JAXBElement<BigDecimal> value) {
            this.meanFom = value;
        }

        /**
         * Gets the value of the numberClust property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberClust() {
            return numberClust;
        }

        /**
         * Sets the value of the numberClust property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberClust(JAXBElement<BigInteger> value) {
            this.numberClust = value;
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