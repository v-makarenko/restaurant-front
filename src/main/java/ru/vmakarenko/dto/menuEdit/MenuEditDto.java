package ru.vmakarenko.dto.menuEdit;

import ru.vmakarenko.dto.common.CommonDto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by VMakarenko on 4/25/2015.
 */
public class MenuEditDto extends CommonDto{
    private BigDecimal price;
    private String name;
    private List<CustomDto> customs;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomDto> getCustoms() {
        return customs;
    }

    public void setCustoms(List<CustomDto> customs) {
        this.customs = customs;
    }
}
