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
 * Data items in the STRUCT_CONF_TYPE category record details
 * about the criteria used to identify backbone conformations of a
 * segment of polymer.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_conf_typeCategory>
 *    <PDBx:struct_conf_type id="HELX_RH_AL_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 *    <PDBx:struct_conf_type id="STRN_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 *    <PDBx:struct_conf_type id="TURN_TY1_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 *    <PDBx:struct_conf_type id="TURN_TY1P_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 *    <PDBx:struct_conf_type id="TURN_TY2_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 *    <PDBx:struct_conf_type id="TURN_TY2P_P">
 *       <PDBx:criteria>author judgement</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conf_type>
 * </PDBx:struct_conf_typeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_conf_typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_conf_typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_conf_type" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="HELX_P"/>
 *                       &lt;enumeration value="HELX_OT_P"/>
 *                       &lt;enumeration value="HELX_RH_P"/>
 *                       &lt;enumeration value="HELX_RH_OT_P"/>
 *                       &lt;enumeration value="HELX_RH_AL_P"/>
 *                       &lt;enumeration value="HELX_RH_GA_P"/>
 *                       &lt;enumeration value="HELX_RH_OM_P"/>
 *                       &lt;enumeration value="HELX_RH_PI_P"/>
 *                       &lt;enumeration value="HELX_RH_27_P"/>
 *                       &lt;enumeration value="HELX_RH_3T_P"/>
 *                       &lt;enumeration value="HELX_RH_PP_P"/>
 *                       &lt;enumeration value="HELX_LH_P"/>
 *                       &lt;enumeration value="HELX_LH_OT_P"/>
 *                       &lt;enumeration value="HELX_LH_AL_P"/>
 *                       &lt;enumeration value="HELX_LH_GA_P"/>
 *                       &lt;enumeration value="HELX_LH_OM_P"/>
 *                       &lt;enumeration value="HELX_LH_PI_P"/>
 *                       &lt;enumeration value="HELX_LH_27_P"/>
 *                       &lt;enumeration value="HELX_LH_3T_P"/>
 *                       &lt;enumeration value="HELX_LH_PP_P"/>
 *                       &lt;enumeration value="HELX_N"/>
 *                       &lt;enumeration value="HELX_OT_N"/>
 *                       &lt;enumeration value="HELX_RH_N"/>
 *                       &lt;enumeration value="HELX_RH_OT_N"/>
 *                       &lt;enumeration value="HELX_RH_A_N"/>
 *                       &lt;enumeration value="HELX_RH_B_N"/>
 *                       &lt;enumeration value="HELX_RH_Z_N"/>
 *                       &lt;enumeration value="HELX_LH_N"/>
 *                       &lt;enumeration value="HELX_LH_OT_N"/>
 *                       &lt;enumeration value="HELX_LH_A_N"/>
 *                       &lt;enumeration value="HELX_LH_B_N"/>
 *                       &lt;enumeration value="HELX_LH_Z_N"/>
 *                       &lt;enumeration value="TURN_P"/>
 *                       &lt;enumeration value="TURN_OT_P"/>
 *                       &lt;enumeration value="TURN_TY1_P"/>
 *                       &lt;enumeration value="TURN_TY1P_P"/>
 *                       &lt;enumeration value="TURN_TY2_P"/>
 *                       &lt;enumeration value="TURN_TY2P_P"/>
 *                       &lt;enumeration value="TURN_TY3_P"/>
 *                       &lt;enumeration value="TURN_TY3P_P"/>
 *                       &lt;enumeration value="STRN"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "struct_conf_typeType", propOrder = {
    "structConfType"
})
public class StructConfTypeType {

    @XmlElement(name = "struct_conf_type")
    protected List<StructConfTypeType.StructConfType> structConfType;

    /**
     * Gets the value of the structConfType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structConfType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructConfType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructConfTypeType.StructConfType }
     * 
     * 
     */
    public List<StructConfTypeType.StructConfType> getStructConfType() {
        if (structConfType == null) {
            structConfType = new ArrayList<StructConfTypeType.StructConfType>();
        }
        return this.structConfType;
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
     *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="HELX_P"/>
     *             &lt;enumeration value="HELX_OT_P"/>
     *             &lt;enumeration value="HELX_RH_P"/>
     *             &lt;enumeration value="HELX_RH_OT_P"/>
     *             &lt;enumeration value="HELX_RH_AL_P"/>
     *             &lt;enumeration value="HELX_RH_GA_P"/>
     *             &lt;enumeration value="HELX_RH_OM_P"/>
     *             &lt;enumeration value="HELX_RH_PI_P"/>
     *             &lt;enumeration value="HELX_RH_27_P"/>
     *             &lt;enumeration value="HELX_RH_3T_P"/>
     *             &lt;enumeration value="HELX_RH_PP_P"/>
     *             &lt;enumeration value="HELX_LH_P"/>
     *             &lt;enumeration value="HELX_LH_OT_P"/>
     *             &lt;enumeration value="HELX_LH_AL_P"/>
     *             &lt;enumeration value="HELX_LH_GA_P"/>
     *             &lt;enumeration value="HELX_LH_OM_P"/>
     *             &lt;enumeration value="HELX_LH_PI_P"/>
     *             &lt;enumeration value="HELX_LH_27_P"/>
     *             &lt;enumeration value="HELX_LH_3T_P"/>
     *             &lt;enumeration value="HELX_LH_PP_P"/>
     *             &lt;enumeration value="HELX_N"/>
     *             &lt;enumeration value="HELX_OT_N"/>
     *             &lt;enumeration value="HELX_RH_N"/>
     *             &lt;enumeration value="HELX_RH_OT_N"/>
     *             &lt;enumeration value="HELX_RH_A_N"/>
     *             &lt;enumeration value="HELX_RH_B_N"/>
     *             &lt;enumeration value="HELX_RH_Z_N"/>
     *             &lt;enumeration value="HELX_LH_N"/>
     *             &lt;enumeration value="HELX_LH_OT_N"/>
     *             &lt;enumeration value="HELX_LH_A_N"/>
     *             &lt;enumeration value="HELX_LH_B_N"/>
     *             &lt;enumeration value="HELX_LH_Z_N"/>
     *             &lt;enumeration value="TURN_P"/>
     *             &lt;enumeration value="TURN_OT_P"/>
     *             &lt;enumeration value="TURN_TY1_P"/>
     *             &lt;enumeration value="TURN_TY1P_P"/>
     *             &lt;enumeration value="TURN_TY2_P"/>
     *             &lt;enumeration value="TURN_TY2P_P"/>
     *             &lt;enumeration value="TURN_TY3_P"/>
     *             &lt;enumeration value="TURN_TY3P_P"/>
     *             &lt;enumeration value="STRN"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class StructConfType {

        @XmlElementRef(name = "criteria", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> criteria;
        @XmlElementRef(name = "reference", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reference;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the criteria property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCriteria() {
            return criteria;
        }

        /**
         * Sets the value of the criteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCriteria(JAXBElement<String> value) {
            this.criteria = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReference(JAXBElement<String> value) {
            this.reference = value;
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