package com.ybh.ybhprj.board.comment;

import com.ybh.ybhprj.commons.dto.SearchAjaxDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SearchBoardCommentDto extends SearchAjaxDto {
    private String boardId;
    private String commentTbl;
    private Long createId;
    private Long commentId;
}
