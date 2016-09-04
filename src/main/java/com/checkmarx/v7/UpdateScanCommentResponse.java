
package com.checkmarx.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateScanCommentResult" type="{http://Checkmarx.com/v7}CxWSBasicRepsonse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateScanCommentResult"
})
@XmlRootElement(name = "UpdateScanCommentResponse")
public class UpdateScanCommentResponse {

    @XmlElement(name = "UpdateScanCommentResult")
    protected CxWSBasicRepsonse updateScanCommentResult;

    /**
     * Gets the value of the updateScanCommentResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getUpdateScanCommentResult() {
        return updateScanCommentResult;
    }

    /**
     * Sets the value of the updateScanCommentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setUpdateScanCommentResult(CxWSBasicRepsonse value) {
        this.updateScanCommentResult = value;
    }

}
