package ru.vmakarenko.entities.menu;

import ru.vmakarenko.dto.menuEdit.CustomDto;
import ru.vmakarenko.entities.DomainEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@Table(name = "menu_items")
@Entity
public class MenuItem extends DomainEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL)
    private List<CustomEntry> customs;
    @Column(name="description")
    private String description;

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

    public List<CustomEntry> getCustoms() {
        return customs;
    }

    public void setCustoms(List<CustomEntry> customs) {
        this.customs = customs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
