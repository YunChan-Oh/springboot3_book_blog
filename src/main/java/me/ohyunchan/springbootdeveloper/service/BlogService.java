package me.ohyunchan.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.ohyunchan.springbootdeveloper.domain.Article;
import me.ohyunchan.springbootdeveloper.dto.AddArticleRequest;
import me.ohyunchan.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service //빈 등록
public class BlogService {
    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
}
