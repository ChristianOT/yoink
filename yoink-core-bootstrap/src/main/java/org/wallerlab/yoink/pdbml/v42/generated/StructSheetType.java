//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the STRUCT_SHEET category record details about
 * the beta-sheets.
 * 
 *     Example 1 - simple beta-barrel.
 * 
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  10--11--12--13--14--15--16--17--18--19--20  strand_a
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  30--31--32--33--34--35--36--37--38--39--40  strand_b
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  50--51--52--53--54--55--56--57--58--59--60  strand_c
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  70--71--72--73--74--75--76--77--78--79--80  strand_d
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  90--91--92--93--94--95--96--97--98--99-100  strand_e
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  110-111-112-113-114-115-116-117-118-119-120  strand_f
 *     N  O    N  O    N  O    N  O    N  O
 *     /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  130-131-132-133-134-135-136-137-138-139-140  strand_g
 *      N  O    N  O    N  O    N  O    N  O
 *    /  \    /  \    /  \    /  \    /  \
 * N  O    N  O    N  O    N  O    N  O    N  O
 *  150-151-152-153-154-155-156-157-158-159-160  strand_h
 *      N  O    N  O    N  O    N  O    N  O
 *    /  \    /  \    /  \    /  \    /  \
 * <PDBx:struct_sheetCategory>
 *    <PDBx:struct_sheet id="sheet_1">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:number_strands>8</PDBx:number_strands>
 *       <PDBx:type>beta-barrel</PDBx:type>
 *    </PDBx:struct_sheet>
 * </PDBx:struct_sheetCategory>
 * 
 * 
 *     Example 2 - five stranded mixed-sense sheet with one two-piece strand.
 * 
 *       N  O    N  O    N  O    N  O
 *   -10--11--12--13--14--15--16--17--18->  strand_a
 *   N  O    N  O    N  O    N  O    N  O
 *   |  |    |  |    |  |    |  |    |  |
 *   O  N    O  N    O  N    O  N    O  N
 * <-119-118-117-116-115-114-113-112-111-110-  strand_b
 *       O  N    O  N    O  N    O  N    O  N
 *           \  /   \   /   \   /   \   /   \
 *           O  N    O  N    O  N    O  N    O  N    O  N
 *          <-41--40--39--38--37--36--35--34--33--32--31--30-  strand_c
 *               O  N    O  N    O  N    O  N    O  N    O  N
 *               |  |    |  |    |  |    |  |    |  |    |  |
 *               N  O    N  O    N  O    N  O    N  O    N  O
 *    strand_d1  -50--51--52->   -90--91--92--93--95--95--96--97->  strand_d2
 *                   N  O            N  O    N  O    N  O    N  O
 *                   |  |    |  |    |  |    |  |    |  |    |  |
 *                   O  N    O  N    O  N    O  N    O  N    O  N
 *                  <-80--79--78--77--76--75--74--73--72--71--70-   strand_e
 *                       O  N    O  N    O  N    O  N    O  N
 * <PDBx:struct_sheetCategory>
 *    <PDBx:struct_sheet id="sheet_2">
 *       <PDBx:details>strand_d is in two pieces</PDBx:details>
 *       <PDBx:number_strands>5</PDBx:number_strands>
 *       <PDBx:type>five stranded, mixed-sense</PDBx:type>
 *    </PDBx:struct_sheet>
 * </PDBx:struct_sheetCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_sheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_sheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_sheet" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="number_strands" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "struct_sheetType", propOrder = {
    "structSheet"
})
public class StructSheetType {

    @XmlElement(name = "struct_sheet")
    protected List<StructSheetType.StructSheet> structSheet;

    /**
     * Gets the value of the structSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSheetType.StructSheet }
     * 
     * 
     */
    public List<StructSheetType.StructSheet> getStructSheet() {
        if (structSheet == null) {
            structSheet = new ArrayList<StructSheetType.StructSheet>();
        }
        return this.structSheet;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="number_strands" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class StructSheet {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "number_strands", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberStrands;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the numberStrands property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberStrands() {
            return numberStrands;
        }

        /**
         * Sets the value of the numberStrands property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberStrands(JAXBElement<BigInteger> value) {
            this.numberStrands = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
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
