package com.ybh.ybhprj.sbfile;

import com.ybh.ybhprj.commons.dto.SearchAjaxDto;
import com.ybh.ybhprj.commons.inif.IMybatisCRUD;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISbFileMybatisMapper extends IMybatisCRUD<SbFileDto> {
    Integer countAllByTblBoardId(SbFileDto search);
    List<SbFileDto> findAllByTblBoardId(SbFileDto search);

    int countAllByNameContains(SearchAjaxDto dto);
    List<SbFileDto> findAllByNameContains(SearchAjaxDto dto);
}
