package ru.vmakarenko.dto.menuEdit;

import ru.vmakarenko.dto.common.CommonDto;

import java.math.BigDecimal;

/**
 * Created by VMakarenko on 4/25/2015.
 */
public class VariantDto extends CommonDto{
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
