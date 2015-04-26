package ru.vmakarenko.services;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ru.vmakarenko.dto.users.RestaurantUserSignUpDto;
import ru.vmakarenko.dto.users.UserSignUpDto;
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

        mapperFactory.classMap(UserSignUpDto.class, AbstractUser.class)
                .byDefault();


        //AuthUserDto -> User

        //UserDto -> User
    }

    public MapperFactory getMapperFactory() {
        return mapperFactory;
    }

    public<E,D> D map(E from, Class<D> toClass){
        return mapperFactory.getMapperFacade().map(from, toClass);
    }
}
