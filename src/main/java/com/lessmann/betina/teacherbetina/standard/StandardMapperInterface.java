package com.lessmann.betina.teacherbetina.standard;

import java.util.List;

public interface StandardMapperInterface<ENTITY extends StandardEntityInterface, GET, POST, PUT extends StandardPutInterface> {
    ENTITY toEntity(POST post);
    ENTITY toEntity(PUT put);
    GET toDTO(ENTITY entity);
    List<GET> toDTOList(List<ENTITY> entities);
}
