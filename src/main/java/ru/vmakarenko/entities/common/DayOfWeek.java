package ru.vmakarenko.entities.common;

import ru.vmakarenko.entities.DomainEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by VMakarenko on 5/9/2015.
 */
@Entity
@Table(name = "week_day")
public class DayOfWeek extends DomainEntity{
    @Column(name="name")
    private String name;
    @Column(name="value")
    private String value;
    @Column(name="short_value")
    private String shortValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getShortValue() {
        return shortValue;
    }

    public void setShortValue(String shortValue) {
        this.shortValue = shortValue;
    }
}
