package com.ybh.ybhprj.member;

import com.ybh.ybhprj.commons.dto.SearchAjaxDto;
import com.ybh.ybhprj.commons.inif.IMybatisCRUD;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMemberMybatisMapper extends IMybatisCRUD<MemberDto> {
    MemberDto findByLoginId(String loginId);
    MemberDto findByNickname(String nickname);
    void changePassword(MemberDto dto);

    Integer countAllByNameContains(SearchAjaxDto search);
    List<MemberDto> findAllByNameContains(SearchAjaxDto search);
}
