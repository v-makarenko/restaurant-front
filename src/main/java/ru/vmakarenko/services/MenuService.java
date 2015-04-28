package ru.vmakarenko.services;

import ru.vmakarenko.dao.MenuDao;
import ru.vmakarenko.dao.OrderDao;
import ru.vmakarenko.dao.filters.CommonFilter;
import ru.vmakarenko.dto.menuEdit.MenuEditDto;
import ru.vmakarenko.dto.orders.OrderDto;
import ru.vmakarenko.entities.menu.MenuItem;
import ru.vmakarenko.filters.MenuFilter;
import ru.vmakarenko.filters.OrderFilter;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by VMakarenko on 4/28/2015.
 */
@Stateless
public class MenuService {

    @Inject
    private MenuDao menuDao;
    @Inject
    private MapperService mapperService;

    public List<MenuEditDto> getAll(MenuFilter filter){
        return menuDao.findAll(new CommonFilter(filter))
                .parallelStream()
                .map(d -> mapperService.map(d, MenuEditDto.class))
                .collect(Collectors.toList());
    }

    public void insert(MenuEditDto menuEditDto) {
        menuDao.insert(mapperService.map(menuEditDto, MenuItem.class));
    }


    public void update(MenuEditDto menuEditDto) {
        menuDao.update(mapperService.map(menuEditDto, MenuItem.class));
    }
}
