//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.03 at 01:21:42 PM BRT  
//


package org.picketlink.identity.federation.core.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     			Source of the Signing and Validating Key
 *     		
 * 
 * <p>Java class for KeyProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{urn:picketlink:identity-federation:config:1.0}AuthPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValidatingAlias" type="{urn:picketlink:identity-federation:config:1.0}KeyValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SigningAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyProviderType", propOrder = {
    "auth",
    "validatingAlias",
    "signingAlias"
})
public class KeyProviderType {

    @XmlElement(name = "Auth")
    protected List<AuthPropertyType> auth;
    @XmlElement(name = "ValidatingAlias")
    protected List<KeyValueType> validatingAlias;
    @XmlElement(name = "SigningAlias")
    protected String signingAlias;
    @XmlAttribute(name = "ClassName")
    protected String className;

    /**
     * Gets the value of the auth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthPropertyType }
     * 
     * 
     */
    public List<AuthPropertyType> getAuth() {
        if (auth == null) {
            auth = new ArrayList<AuthPropertyType>();
        }
        return this.auth;
    }

    /**
     * Gets the value of the validatingAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validatingAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidatingAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueType }
     * 
     * 
     */
    public List<KeyValueType> getValidatingAlias() {
        if (validatingAlias == null) {
            validatingAlias = new ArrayList<KeyValueType>();
        }
        return this.validatingAlias;
    }

    /**
     * Gets the value of the signingAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningAlias() {
        return signingAlias;
    }

    /**
     * Sets the value of the signingAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningAlias(String value) {
        this.signingAlias = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

}
