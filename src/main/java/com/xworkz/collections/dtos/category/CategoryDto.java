package com.xworkz.collections.dtos.category;

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
public class CategoryDto implements Serializable, Comparable<CategoryDto> {
    private int categoryId;
    private String name;
    private String description;
    private int parentId;
    private String status;

    @Override
    public int compareTo(CategoryDto other) {
        return Integer.compare(this.categoryId, other.categoryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto that = (CategoryDto) o;
        return categoryId == that.categoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId);
    }
}
