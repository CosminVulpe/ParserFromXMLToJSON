package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrder {

    @XmlAttribute(name = "PurchaseOrderNumber")
    private String purchaseOrderNumber;
    @XmlAttribute(name = "OrderDate")
    @JsonProperty(value = "OrderDate")
    private String orderDate;
    @XmlElement(name = "Address")
    @JsonProperty(value = "Address")
    private List<Address> addressList;
    @XmlElement(name = "DeliveryNotes")
    @JsonProperty(value = "DeliveryNotes")
    private String deliveryNote;
    @XmlElement(name = "Items")
    @JsonProperty(value = "Items")
    private PurchaseItem purchaseItem;


    public PurchaseOrder() {
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(String deliveryNote) {
        this.deliveryNote = deliveryNote;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }


    public List<Item> getPurchaseItem() {
        return purchaseItem.getListItems();
    }

    public void setPurchaseItem(PurchaseItem purchaseItem) {
        this.purchaseItem = purchaseItem;
    }
}
