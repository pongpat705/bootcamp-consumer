package com.example.consumer.model;


import lombok.Data;


@Data
public class InventoryModel extends BaseModel{
    private Integer inventoryId;
    private String itemName;
    private Integer itemQty;

}
