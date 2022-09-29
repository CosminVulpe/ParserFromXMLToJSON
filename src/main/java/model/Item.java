package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlAttribute(name = "PartNumber")
    @JsonProperty(value = "PartNumber")
    private String partNumber;
    @XmlElement(name = "ProductName")
    @JsonProperty(value = "ProductName")
    private String productName;
    @XmlElement(name = "Quantity")
    @JsonProperty(value = "Quantity")
    private Integer quantity;
    @XmlElement(name = "USPrice")
    @JsonProperty(value = "USPrice")
    private Double price;

    @XmlElement(name = "Comment")
    @JsonProperty(value = "Comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comment;

    @XmlElement(name = "ShipDate")
    @JsonProperty(value = "ShipDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipDate;

    public Item() {
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }
}
