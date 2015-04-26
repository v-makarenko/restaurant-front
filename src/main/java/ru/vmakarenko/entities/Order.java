package ru.vmakarenko.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@Entity
@Table(name="orders")
public class Order extends DomainEntity{
}
