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
 * Data items in the REFINE_LS_SHELL category record details about
 * the results of the least-squares refinement broken down into
 * shells of resolution.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:refine_ls_shellCategory>
 *    <PDBx:refine_ls_shell d_res_high="4.51" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.196</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>8.00</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>1226</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="3.48" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.146</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>4.51</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>1679</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="2.94" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.160</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>3.48</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>2014</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="2.59" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.182</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>2.94</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>2147</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="2.34" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.193</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>2.59</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>2127</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="2.15" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.203</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>2.34</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>2061</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 *    <PDBx:refine_ls_shell d_res_high="2.00" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_obs>0.188</PDBx:R_factor_obs>
 *       <PDBx:d_res_low>2.15</PDBx:d_res_low>
 *       <PDBx:number_reflns_obs>1647</PDBx:number_reflns_obs>
 *    </PDBx:refine_ls_shell>
 * </PDBx:refine_ls_shellCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refine_ls_shellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refine_ls_shellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refine_ls_shell" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_factor_R_free" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_R_free_error" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_factor_R_work" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_all" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_obs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="d_res_low" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_R_free" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_R_work" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_all" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_obs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_fsc_free" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_fsc_work" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_phase_error" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_total_number_of_bins_used" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="percent_reflns_R_free" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="percent_reflns_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="redundancy_reflns_all" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="redundancy_reflns_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="wR_factor_R_free" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wR_factor_R_work" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wR_factor_all" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wR_factor_obs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="d_res_high" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minInclusive value="0.0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "refine_ls_shellType", propOrder = {
    "refineLsShell"
})
public class RefineLsShellType {

    @XmlElement(name = "refine_ls_shell")
    protected List<RefineLsShellType.RefineLsShell> refineLsShell;

    /**
     * Gets the value of the refineLsShell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineLsShell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineLsShell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineLsShellType.RefineLsShell }
     * 
     * 
     */
    public List<RefineLsShellType.RefineLsShell> getRefineLsShell() {
        if (refineLsShell == null) {
            refineLsShell = new ArrayList<RefineLsShellType.RefineLsShell>();
        }
        return this.refineLsShell;
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
     *         &lt;element name="R_factor_R_free" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_R_free_error" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_factor_R_work" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_all" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_obs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="d_res_low" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_R_free" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_R_work" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_all" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_obs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_fsc_free" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_fsc_work" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_phase_error" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_total_number_of_bins_used" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="percent_reflns_R_free" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="percent_reflns_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="redundancy_reflns_all" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="redundancy_reflns_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="wR_factor_R_free" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wR_factor_R_work" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wR_factor_all" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wR_factor_obs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="d_res_high" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minInclusive value="0.0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RefineLsShell {

        @XmlElementRef(name = "R_factor_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorRFree;
        @XmlElementRef(name = "R_factor_R_free_error", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorRFreeError;
        @XmlElementRef(name = "R_factor_R_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorRWork;
        @XmlElementRef(name = "R_factor_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorAll;
        @XmlElementRef(name = "R_factor_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorObs;
        @XmlElementRef(name = "d_res_low", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResLow;
        @XmlElementRef(name = "number_reflns_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsRFree;
        @XmlElementRef(name = "number_reflns_R_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsRWork;
        @XmlElementRef(name = "number_reflns_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsAll;
        @XmlElementRef(name = "number_reflns_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsObs;
        @XmlElementRef(name = "pdbx_fsc_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFscFree;
        @XmlElementRef(name = "pdbx_fsc_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFscWork;
        @XmlElementRef(name = "pdbx_phase_error", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxPhaseError;
        @XmlElementRef(name = "pdbx_total_number_of_bins_used", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxTotalNumberOfBinsUsed;
        @XmlElementRef(name = "percent_reflns_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> percentReflnsRFree;
        @XmlElementRef(name = "percent_reflns_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> percentReflnsObs;
        @XmlElementRef(name = "redundancy_reflns_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> redundancyReflnsAll;
        @XmlElementRef(name = "redundancy_reflns_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> redundancyReflnsObs;
        @XmlElementRef(name = "wR_factor_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> wrFactorRFree;
        @XmlElementRef(name = "wR_factor_R_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> wrFactorRWork;
        @XmlElementRef(name = "wR_factor_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> wrFactorAll;
        @XmlElementRef(name = "wR_factor_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> wrFactorObs;
        @XmlAttribute(name = "d_res_high", required = true)
        protected BigDecimal dResHigh;
        @XmlAttribute(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;

        /**
         * Gets the value of the rFactorRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorRFree() {
            return rFactorRFree;
        }

        /**
         * Sets the value of the rFactorRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorRFree(JAXBElement<BigDecimal> value) {
            this.rFactorRFree = value;
        }

        /**
         * Gets the value of the rFactorRFreeError property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorRFreeError() {
            return rFactorRFreeError;
        }

        /**
         * Sets the value of the rFactorRFreeError property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorRFreeError(JAXBElement<BigDecimal> value) {
            this.rFactorRFreeError = value;
        }

        /**
         * Gets the value of the rFactorRWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorRWork() {
            return rFactorRWork;
        }

        /**
         * Sets the value of the rFactorRWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorRWork(JAXBElement<BigDecimal> value) {
            this.rFactorRWork = value;
        }

        /**
         * Gets the value of the rFactorAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorAll() {
            return rFactorAll;
        }

        /**
         * Sets the value of the rFactorAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorAll(JAXBElement<BigDecimal> value) {
            this.rFactorAll = value;
        }

        /**
         * Gets the value of the rFactorObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorObs() {
            return rFactorObs;
        }

        /**
         * Sets the value of the rFactorObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorObs(JAXBElement<BigDecimal> value) {
            this.rFactorObs = value;
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
         * Gets the value of the numberReflnsRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsRFree() {
            return numberReflnsRFree;
        }

        /**
         * Sets the value of the numberReflnsRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsRFree(JAXBElement<BigInteger> value) {
            this.numberReflnsRFree = value;
        }

        /**
         * Gets the value of the numberReflnsRWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsRWork() {
            return numberReflnsRWork;
        }

        /**
         * Sets the value of the numberReflnsRWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsRWork(JAXBElement<BigInteger> value) {
            this.numberReflnsRWork = value;
        }

        /**
         * Gets the value of the numberReflnsAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsAll() {
            return numberReflnsAll;
        }

        /**
         * Sets the value of the numberReflnsAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsAll(JAXBElement<BigInteger> value) {
            this.numberReflnsAll = value;
        }

        /**
         * Gets the value of the numberReflnsObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsObs() {
            return numberReflnsObs;
        }

        /**
         * Sets the value of the numberReflnsObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsObs(JAXBElement<BigInteger> value) {
            this.numberReflnsObs = value;
        }

        /**
         * Gets the value of the pdbxFscFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFscFree() {
            return pdbxFscFree;
        }

        /**
         * Sets the value of the pdbxFscFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFscFree(JAXBElement<BigDecimal> value) {
            this.pdbxFscFree = value;
        }

        /**
         * Gets the value of the pdbxFscWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFscWork() {
            return pdbxFscWork;
        }

        /**
         * Sets the value of the pdbxFscWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFscWork(JAXBElement<BigDecimal> value) {
            this.pdbxFscWork = value;
        }

        /**
         * Gets the value of the pdbxPhaseError property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxPhaseError() {
            return pdbxPhaseError;
        }

        /**
         * Sets the value of the pdbxPhaseError property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxPhaseError(JAXBElement<BigDecimal> value) {
            this.pdbxPhaseError = value;
        }

        /**
         * Gets the value of the pdbxTotalNumberOfBinsUsed property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxTotalNumberOfBinsUsed() {
            return pdbxTotalNumberOfBinsUsed;
        }

        /**
         * Sets the value of the pdbxTotalNumberOfBinsUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxTotalNumberOfBinsUsed(JAXBElement<BigInteger> value) {
            this.pdbxTotalNumberOfBinsUsed = value;
        }

        /**
         * Gets the value of the percentReflnsRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPercentReflnsRFree() {
            return percentReflnsRFree;
        }

        /**
         * Sets the value of the percentReflnsRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPercentReflnsRFree(JAXBElement<BigDecimal> value) {
            this.percentReflnsRFree = value;
        }

        /**
         * Gets the value of the percentReflnsObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPercentReflnsObs() {
            return percentReflnsObs;
        }

        /**
         * Sets the value of the percentReflnsObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPercentReflnsObs(JAXBElement<BigDecimal> value) {
            this.percentReflnsObs = value;
        }

        /**
         * Gets the value of the redundancyReflnsAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRedundancyReflnsAll() {
            return redundancyReflnsAll;
        }

        /**
         * Sets the value of the redundancyReflnsAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRedundancyReflnsAll(JAXBElement<BigDecimal> value) {
            this.redundancyReflnsAll = value;
        }

        /**
         * Gets the value of the redundancyReflnsObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRedundancyReflnsObs() {
            return redundancyReflnsObs;
        }

        /**
         * Sets the value of the redundancyReflnsObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRedundancyReflnsObs(JAXBElement<BigDecimal> value) {
            this.redundancyReflnsObs = value;
        }

        /**
         * Gets the value of the wrFactorRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWRFactorRFree() {
            return wrFactorRFree;
        }

        /**
         * Sets the value of the wrFactorRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWRFactorRFree(JAXBElement<BigDecimal> value) {
            this.wrFactorRFree = value;
        }

        /**
         * Gets the value of the wrFactorRWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWRFactorRWork() {
            return wrFactorRWork;
        }

        /**
         * Sets the value of the wrFactorRWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWRFactorRWork(JAXBElement<BigDecimal> value) {
            this.wrFactorRWork = value;
        }

        /**
         * Gets the value of the wrFactorAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWRFactorAll() {
            return wrFactorAll;
        }

        /**
         * Sets the value of the wrFactorAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWRFactorAll(JAXBElement<BigDecimal> value) {
            this.wrFactorAll = value;
        }

        /**
         * Gets the value of the wrFactorObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWRFactorObs() {
            return wrFactorObs;
        }

        /**
         * Sets the value of the wrFactorObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWRFactorObs(JAXBElement<BigDecimal> value) {
            this.wrFactorObs = value;
        }

        /**
         * Gets the value of the dResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDResHigh() {
            return dResHigh;
        }

        /**
         * Sets the value of the dResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDResHigh(BigDecimal value) {
            this.dResHigh = value;
        }

        /**
         * Gets the value of the pdbxRefineId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxRefineId() {
            return pdbxRefineId;
        }

        /**
         * Sets the value of the pdbxRefineId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxRefineId(String value) {
            this.pdbxRefineId = value;
        }

    }

}
