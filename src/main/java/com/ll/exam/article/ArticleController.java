package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    public void showList(Rq rq) {
        List<ArticleDto> articleDtos = new ArrayList<>();

        articleDtos.add(new ArticleDto(1, "제목 3","내용 3"));
        articleDtos.add(new ArticleDto(1, "제목 2","내용 2"));
        articleDtos.add(new ArticleDto(1, "제목 1","내용 1"));

        rq.setAttr("articles", articleDtos);
        rq.view("usr/article/list");
    }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }
}