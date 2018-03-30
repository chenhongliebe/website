package com.frico.website.web.front;

import com.frico.website.common.Result;
import com.frico.website.model.articleManagement.Comment;
import com.frico.website.service.articleManagement.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("cCommentController")
@RequestMapping("front/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 用户评论
     * @param comment
     * @return
     */
    @RequestMapping("")
    public Result comment(Comment comment){

        commentService.save(comment);

        return Result.success("评论成功！");
    }


}
