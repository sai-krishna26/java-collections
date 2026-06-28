package com.xworkz.collections.dtos.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class InventoryDto implements Serializable {
    private int itemId;
    private String productName;
    private int quantity;
    private String location;
    private String supplier;
}
