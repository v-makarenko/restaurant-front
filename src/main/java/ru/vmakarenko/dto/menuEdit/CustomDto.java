package ru.vmakarenko.dto.menuEdit;

import ru.vmakarenko.dto.common.CommonDto;

import java.util.List;

/**
 * Created by VMakarenko on 4/25/2015.
 */
public class CustomDto extends CommonDto{
    private String name;
    private List<VariantDto> variants;

    public List<VariantDto> getVariants() {
        return variants;
    }

    public void setVariants(List<VariantDto> variants) {
        this.variants = variants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
