package ru.vmakarenko.entities.menu;

import ru.vmakarenko.dto.menuEdit.CustomDto;
import ru.vmakarenko.entities.DomainEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @OneToMany(mappedBy = "menuItem")
    private List<CustomEntry> customs;

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
}
