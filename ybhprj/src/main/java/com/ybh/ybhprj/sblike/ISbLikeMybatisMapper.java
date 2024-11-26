package com.ybh.ybhprj.sblike;

import com.ybh.ybhprj.commons.inif.IMybatisCRUD;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISbLikeMybatisMapper extends IMybatisCRUD<SbLikeDto> {
    void deleteByTableUserBoard(SbLikeDto dto);
    Integer countByTableUserBoard(SbLikeDto searchDto);
}
