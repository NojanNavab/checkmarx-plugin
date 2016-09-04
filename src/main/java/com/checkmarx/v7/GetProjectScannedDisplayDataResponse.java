
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
 *         &lt;element name="GetProjectScannedDisplayDataResult" type="{http://Checkmarx.com/v7}CxWSResponseProjectScannedDisplayData" minOccurs="0"/&gt;
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
    "getProjectScannedDisplayDataResult"
})
@XmlRootElement(name = "GetProjectScannedDisplayDataResponse")
public class GetProjectScannedDisplayDataResponse {

    @XmlElement(name = "GetProjectScannedDisplayDataResult")
    protected CxWSResponseProjectScannedDisplayData getProjectScannedDisplayDataResult;

    /**
     * Gets the value of the getProjectScannedDisplayDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectScannedDisplayData }
     *     
     */
    public CxWSResponseProjectScannedDisplayData getGetProjectScannedDisplayDataResult() {
        return getProjectScannedDisplayDataResult;
    }

    /**
     * Sets the value of the getProjectScannedDisplayDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectScannedDisplayData }
     *     
     */
    public void setGetProjectScannedDisplayDataResult(CxWSResponseProjectScannedDisplayData value) {
        this.getProjectScannedDisplayDataResult = value;
    }

}
