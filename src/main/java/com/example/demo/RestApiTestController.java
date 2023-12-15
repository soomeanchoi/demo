package com.example.demo;


import com.example.demo.common.dto.SearchDto;
import com.example.demo.common.paging.PagingResponse;
import com.example.demo.post.PostResponse;
import com.example.demo.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestApiTestController {

    private final PostService postService;

    @GetMapping("/posts")
    public PagingResponse<PostResponse> findAllPost() {
        return postService.findAllPost(new SearchDto());
    }

}
