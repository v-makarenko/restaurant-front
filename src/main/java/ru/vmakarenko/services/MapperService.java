package ru.vmakarenko.services;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ru.vmakarenko.dto.menuEdit.CustomDto;
import ru.vmakarenko.dto.menuEdit.MenuEditDto;
import ru.vmakarenko.dto.menuEdit.VariantDto;
import ru.vmakarenko.dto.orders.OrderDto;
import ru.vmakarenko.dto.users.RestaurantUserSignUpDto;
import ru.vmakarenko.dto.users.UserDto;
import ru.vmakarenko.dto.users.UserSignUpDto;
import ru.vmakarenko.entities.Order;
import ru.vmakarenko.entities.menu.CustomEntry;
import ru.vmakarenko.entities.menu.MenuItem;
import ru.vmakarenko.entities.menu.VariantEntry;
import ru.vmakarenko.entities.users.AbstractUser;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@ApplicationScoped
public class MapperService {

    private MapperFactory mapperFactory;

    @PostConstruct
    public void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();


        // users stuff
        mapperFactory.classMap(UserSignUpDto.class, AbstractUser.class)
                .byDefault();

        mapperFactory.classMap(AbstractUser.class, UserDto.class)
                .byDefault();


        // orders stuff

        mapperFactory.classMap(Order.class , OrderDto.class)
                .byDefault();

        // menu stuff
        mapperFactory.classMap(MenuItem.class , MenuEditDto.class)
                .byDefault();
        mapperFactory.classMap(CustomEntry.class , CustomDto.class)
                .byDefault();
        mapperFactory.classMap(VariantEntry.class , VariantDto.class)
                .byDefault();


    }

    public MapperFactory getMapperFactory() {
        return mapperFactory;
    }

    public<E,D> D map(E from, Class<D> toClass){
        return mapperFactory.getMapperFacade().map(from, toClass);
    }
}
