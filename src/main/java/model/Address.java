package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    @XmlAttribute(name = "Type")
    @JsonProperty(value = "Type")
    private String type;

    @XmlElement(name = "Name")
    @JsonProperty(value = "Name")
    private String name;

    @XmlElement(name = "Street")
    @JsonProperty(value = "Street")
    private String street;

    @XmlElement(name = "City")
    @JsonProperty(value = "City")
    private String city;

    @XmlElement(name = "State")
    @JsonProperty(value = "State")
    private String state;

    @XmlElement(name = "Zip")
    @JsonProperty(value = "Zip")
    private String zipCode;

    @XmlElement(name = "Country")
    @JsonProperty(value = "Country")
    private String country;

    public Address() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
