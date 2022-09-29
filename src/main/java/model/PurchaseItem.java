package model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class PurchaseItem {
    @XmlElement(name="Item")
    private List<Item> itemList;


    public PurchaseItem() {
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
