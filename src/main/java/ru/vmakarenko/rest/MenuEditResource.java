package ru.vmakarenko.rest;

import ru.vmakarenko.dto.CommonResponse;
import ru.vmakarenko.dto.menuEdit.CustomDto;
import ru.vmakarenko.dto.menuEdit.MenuEditDto;
import ru.vmakarenko.dto.menuEdit.VariantDto;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by VMakarenko on 4/25/2015.
 */
@Path("menuEdit")
public class MenuEditResource {
    @Path("menuEdit")
    public Response getAll(){
        CommonResponse response = new CommonResponse("OK");
        response.setResult("OK");
        response.setData(new ArrayList<>());
        MenuEditDto menuEditDto1 = new MenuEditDto();
        MenuEditDto menuEditDto2 = new MenuEditDto();
        menuEditDto1.setName("Китайский бизнес-ланч");
        menuEditDto1.setPrice(new BigDecimal("1000"));
        menuEditDto2.setName("Итальянский бизнес-ланч");
        menuEditDto2.setPrice(new BigDecimal("800"));
        menuEditDto2.setCustoms(new ArrayList<>());
        CustomDto customDto = new CustomDto();
        customDto.setName("Чай");
        customDto.setVariants(new ArrayList<>());
        VariantDto variantDto1 = new VariantDto();
        variantDto1.setName("Зеленый чай");
        variantDto1.setPrice(new BigDecimal(50));
        VariantDto variantDto2 = new VariantDto();
        variantDto2.setName("Черный чай");
        variantDto2.setPrice(new BigDecimal(50));
        customDto.getVariants().add(variantDto1);
        customDto.getVariants().add(variantDto2);

        menuEditDto2.getCustoms().add(customDto);


        response.getData().add(menuEditDto1);
        response.getData().add(menuEditDto2);


        return Response.ok().build();
    }
}
