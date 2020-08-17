package com.zhijie.demo.service;

import com.zhijie.demo.entiry.Blog;
import com.zhijie.demo.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: zhijie
 * @Date: 2020/08/16/1:07
 * @Description:
 */
//博客
public interface BlogService {

    //id查询
    Blog getBlog(Long id);


    Blog getAndConvert(Long id);

    //分页，搜索的查询
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    //分页
    Page<Blog> listBlog(Pageable pageable);

    //根据id查询，分页
    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);
}
