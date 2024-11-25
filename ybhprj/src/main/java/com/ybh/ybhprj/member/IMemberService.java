package com.ybh.ybhprj.member;

import com.ybh.ybhprj.commons.dto.SearchAjaxDto;
import com.ybh.ybhprj.commons.inif.IServiceCRUD;
import com.ybh.ybhprj.security.dto.LoginRequest;

import java.util.List;

public interface IMemberService extends IServiceCRUD<IMember> {
    IMember login(LoginRequest loginRequest);
    Boolean changePassword(IMember dto) throws Exception;
    IMember findByLoginId(String loginId);
    IMember findByNickname(String nickname);
    Integer countAllByNameContains(SearchAjaxDto dto);
    List<IMember> findAllByNameContains(SearchAjaxDto dto);
}
