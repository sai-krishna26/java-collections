package com.xworkz.collections.dtos.supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SupplierDto implements Serializable {
    private int supplierId;
    private String name;
    private String address;
    private String contactPerson;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierDto that = (SupplierDto) o;
        return supplierId == that.supplierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId);
    }
}
