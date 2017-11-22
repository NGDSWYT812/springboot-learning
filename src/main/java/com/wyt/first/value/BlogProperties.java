package com.wyt.first.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wangyt on 2017/11/15.
 * : description
 */
@Component
public class BlogProperties {

    @Value("${com.wyt.first.blog.name}")
    private String name;

    @Value("${com.wyt.first.blog.title}")
    private String title;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
