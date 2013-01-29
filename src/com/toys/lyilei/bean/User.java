package com.toys.lyilei.bean;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: lyilei
 * Email: lyilei@gmail.com
 * Date: 1/29/13 11:53 PM
 */

@XmlRootElement(name = "Account")
public class User {
    private Long id;

    @JsonProperty("userName")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
