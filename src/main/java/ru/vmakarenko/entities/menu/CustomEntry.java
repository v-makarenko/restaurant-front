package ru.vmakarenko.entities.menu;

import ru.vmakarenko.entities.DomainEntity;

import javax.persistence.*;
import javax.ws.rs.core.Variant;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@Table(name = "menu_customs")
@Entity
public class CustomEntry extends DomainEntity {
    @Column(name="name")
    private String name;
    @Column(name="price")
    private BigDecimal price;
    @OneToMany(mappedBy="customEntry", cascade = CascadeType.ALL)
    private List<VariantEntry> variants;
    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;

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

    public List<VariantEntry> getVariants() {
        return variants;
    }

    public void setVariants(List<VariantEntry> variants) {
        this.variants = variants;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
}
