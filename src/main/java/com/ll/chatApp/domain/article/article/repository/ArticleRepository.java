package com.ll.chatApp.domain.article.article.repository;

import com.ll.chatApp.domain.article.article.entity.Article;
import com.ll.chatApp.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
