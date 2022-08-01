package com.ll.exam.article;

public class ArticleService {
    private ArticleRepository articleRepository;
    ArticleService(){
        articleRepository = new ArticleRepository();
    }

    public long write(String title, String body) {
        return articleRepository.write(title, body);
    }
}
