package com.ybh.ybhprj.board.comment;

import com.ybh.ybhprj.commons.dto.CUDInfoDto;
import com.ybh.ybhprj.commons.dto.SearchAjaxDto;
import com.ybh.ybhprj.commons.inif.IServiceCRUD;
import com.ybh.ybhprj.member.IMember;

import java.util.List;

public interface IBoardCommentService extends IServiceCRUD<BoardCommentDto> {
    void addLikeQty(CUDInfoDto cudInfoDto, Long id);
    void subLikeQty(CUDInfoDto cudInfoDto, Long id);

    Integer countAllByBoardId(SearchAjaxDto search);
    List<BoardCommentDto> findAllByBoardId(IMember loginUser, SearchBoardCommentDto dto);
}
