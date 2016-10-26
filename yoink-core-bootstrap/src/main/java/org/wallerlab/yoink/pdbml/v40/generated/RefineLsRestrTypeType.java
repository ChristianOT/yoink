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
 * Data items in the REFINE_LS_RESTR_TYPE category record details
 * about the restraint types used in the least-squares refinement.
 * 
 *     Example 1 - based on RESTRAIN refinement for the CCP4 test data set
 *                 toxd.
 * <PDBx:refine_ls_restrCategory>
 *    <PDBx:refine_ls_restr type="RESTRAIN_Distances &lt; 2.12">
 *       <PDBx:dev_ideal>0.005</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target>0.022</PDBx:dev_ideal_target>
 *       <PDBx:number>509</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_Distances 2.12 &lt; D &lt; 2.625">
 *       <PDBx:dev_ideal>0.016</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target>0.037</PDBx:dev_ideal_target>
 *       <PDBx:number>671</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_Distances &gt; 2.625">
 *       <PDBx:dev_ideal>0.034</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target>0.043</PDBx:dev_ideal_target>
 *       <PDBx:number>39</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_Peptide Planes">
 *       <PDBx:dev_ideal>0.002</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target>0.010</PDBx:dev_ideal_target>
 *       <PDBx:number>59</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_Ring and other planes">
 *       <PDBx:dev_ideal>0.014</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target>0.010</PDBx:dev_ideal_target>
 *       <PDBx:number>26</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist 1.2-1.4">
 *       <PDBx:dev_ideal>0.106</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>212</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist 1.4-1.6">
 *       <PDBx:dev_ideal>0.101</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>288</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist 1.8-2.0">
 *       <PDBx:dev_ideal>0.077</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>6</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist 2.0-2.2">
 *       <PDBx:dev_ideal>0.114</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>10</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist 2.2-2.4">
 *       <PDBx:dev_ideal>0.119</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>215</PDBx:number>
 *    </PDBx:refine_ls_restr>
 *    <PDBx:refine_ls_restr type="RESTRAIN_rms diffs for Uiso atoms at dist &gt;2.4">
 *       <PDBx:dev_ideal>0.106</PDBx:dev_ideal>
 *       <PDBx:dev_ideal_target xsi:nil="true" />
 *       <PDBx:number>461</PDBx:number>
 *    </PDBx:refine_ls_restr>
 * </PDBx:refine_ls_restrCategory>
 * <PDBx:refine_ls_restr_typeCategory>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_Distances &lt; 2.12">
 *       <PDBx:distance_cutoff_high>2.12</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low xsi:nil="true" />
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_Distances 2.12 &lt; D &lt; 2.625">
 *       <PDBx:distance_cutoff_high>2.625</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>2.12</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_Distances &gt; 2.625">
 *       <PDBx:distance_cutoff_high xsi:nil="true" />
 *       <PDBx:distance_cutoff_low>2.625</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_Peptide Planes">
 *       <PDBx:distance_cutoff_high xsi:nil="true" />
 *       <PDBx:distance_cutoff_low xsi:nil="true" />
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_Ring and other planes">
 *       <PDBx:distance_cutoff_high xsi:nil="true" />
 *       <PDBx:distance_cutoff_low xsi:nil="true" />
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist 1.2-1.4">
 *       <PDBx:distance_cutoff_high>1.4</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>1.2</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist 1.4-1.6">
 *       <PDBx:distance_cutoff_high>1.6</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>1.4</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist 1.8-2.0">
 *       <PDBx:distance_cutoff_high>2.0</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>1.8</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist 2.0-2.2">
 *       <PDBx:distance_cutoff_high>2.2</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>2.0</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist 2.2-2.4">
 *       <PDBx:distance_cutoff_high>2.4</PDBx:distance_cutoff_high>
 *       <PDBx:distance_cutoff_low>2.2</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 *    <PDBx:refine_ls_restr_type type="RESTRAIN_rms diffs for Uiso atoms at dist &gt;2.4">
 *       <PDBx:distance_cutoff_high xsi:nil="true" />
 *       <PDBx:distance_cutoff_low>2.4</PDBx:distance_cutoff_low>
 *    </PDBx:refine_ls_restr_type>
 * </PDBx:refine_ls_restr_typeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refine_ls_restr_typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refine_ls_restr_typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refine_ls_restr_type" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="distance_cutoff_high" minOccurs="0">
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
 *                   &lt;element name="distance_cutoff_low" minOccurs="0">
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
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "refine_ls_restr_typeType", propOrder = {
    "refineLsRestrType"
})
public class RefineLsRestrTypeType {

    @XmlElement(name = "refine_ls_restr_type")
    protected List<RefineLsRestrTypeType.RefineLsRestrType> refineLsRestrType;

    /**
     * Gets the value of the refineLsRestrType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineLsRestrType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineLsRestrType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineLsRestrTypeType.RefineLsRestrType }
     * 
     * 
     */
    public List<RefineLsRestrTypeType.RefineLsRestrType> getRefineLsRestrType() {
        if (refineLsRestrType == null) {
            refineLsRestrType = new ArrayList<RefineLsRestrTypeType.RefineLsRestrType>();
        }
        return this.refineLsRestrType;
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
     *         &lt;element name="distance_cutoff_high" minOccurs="0">
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
     *         &lt;element name="distance_cutoff_low" minOccurs="0">
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
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RefineLsRestrType {

        @XmlElementRef(name = "distance_cutoff_high", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> distanceCutoffHigh;
        @XmlElementRef(name = "distance_cutoff_low", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> distanceCutoffLow;
        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the distanceCutoffHigh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDistanceCutoffHigh() {
            return distanceCutoffHigh;
        }

        /**
         * Sets the value of the distanceCutoffHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDistanceCutoffHigh(JAXBElement<String> value) {
            this.distanceCutoffHigh = value;
        }

        /**
         * Gets the value of the distanceCutoffLow property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDistanceCutoffLow() {
            return distanceCutoffLow;
        }

        /**
         * Sets the value of the distanceCutoffLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDistanceCutoffLow(JAXBElement<String> value) {
            this.distanceCutoffLow = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
