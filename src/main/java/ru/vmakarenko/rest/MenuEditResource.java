package ru.vmakarenko.rest;

import ru.vmakarenko.dto.common.CommonListResponse;
import ru.vmakarenko.dto.common.CommonResponse;
import ru.vmakarenko.dto.menuEdit.CustomDto;
import ru.vmakarenko.dto.menuEdit.MenuEditDto;
import ru.vmakarenko.dto.menuEdit.VariantDto;
import ru.vmakarenko.filters.MenuFilter;
import ru.vmakarenko.services.MenuService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@Path("menuEdit")
public class MenuEditResource {
    @Inject
    MenuService menuService;

    @Path("getAll")
    @POST
    public Response getAll(MenuFilter filter){
        return Response.ok(new CommonResponse("OK").data(menuService.getAll(filter))).build();
    }

    @POST
    public Response insert(MenuEditDto menuEditDto){
        menuService.insert(menuEditDto);
        return Response.ok().build();
    }

}

