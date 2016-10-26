//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
 * the generation of the minimal asymmetric unit. For instance, this 
 * category can be used to provide this information for helical and point
 * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the 
 * specifications of the components that constitute the asymmetric unit 
 * in terms of cartesian transformations of deposited coordinates.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_struct_msym_genCategory>
 *    <PDBx:pdbx_struct_msym_gen entity_inst_id="A" msym_id="A" oper_expression="3"></PDBx:pdbx_struct_msym_gen>
 *    <PDBx:pdbx_struct_msym_gen entity_inst_id="B" msym_id="B" oper_expression="4"></PDBx:pdbx_struct_msym_gen>
 *    <PDBx:pdbx_struct_msym_gen entity_inst_id="B" msym_id="C" oper_expression="5"></PDBx:pdbx_struct_msym_gen>
 * </PDBx:pdbx_struct_msym_genCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_msym_genType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_msym_genType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_msym_gen" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="entity_inst_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="oper_expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_struct_msym_genType", propOrder = {
    "pdbxStructMsymGen"
})
public class PdbxStructMsymGenType {

    @XmlElement(name = "pdbx_struct_msym_gen")
    protected List<PdbxStructMsymGenType.PdbxStructMsymGen> pdbxStructMsymGen;

    /**
     * Gets the value of the pdbxStructMsymGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructMsymGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructMsymGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructMsymGenType.PdbxStructMsymGen }
     * 
     * 
     */
    public List<PdbxStructMsymGenType.PdbxStructMsymGen> getPdbxStructMsymGen() {
        if (pdbxStructMsymGen == null) {
            pdbxStructMsymGen = new ArrayList<PdbxStructMsymGenType.PdbxStructMsymGen>();
        }
        return this.pdbxStructMsymGen;
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
     *       &lt;attribute name="entity_inst_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="oper_expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxStructMsymGen {

        @XmlAttribute(name = "entity_inst_id", required = true)
        protected String entityInstId;
        @XmlAttribute(name = "msym_id", required = true)
        protected String msymId;
        @XmlAttribute(name = "oper_expression", required = true)
        protected String operExpression;

        /**
         * Gets the value of the entityInstId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityInstId() {
            return entityInstId;
        }

        /**
         * Sets the value of the entityInstId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityInstId(String value) {
            this.entityInstId = value;
        }

        /**
         * Gets the value of the msymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsymId() {
            return msymId;
        }

        /**
         * Sets the value of the msymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsymId(String value) {
            this.msymId = value;
        }

        /**
         * Gets the value of the operExpression property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperExpression() {
            return operExpression;
        }

        /**
         * Sets the value of the operExpression property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperExpression(String value) {
            this.operExpression = value;
        }

    }

}
