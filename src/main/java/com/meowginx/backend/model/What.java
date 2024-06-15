package com.meowginx.backend.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class What implements Serializable {
    @NotNull(message = "不能为null")
    private Integer id;

    @Size(max = 64,message = "最大长度要小于 64")
    private String what;

    @Size(max = 16,message = "最大长度要小于 16")
    private String add;

    @Size(max = 16,message = "最大长度要小于 16")
    private String delete;

    @Size(max = 16,message = "最大长度要小于 16")
    private String query;

    @Size(max = 16,message = "最大长度要小于 16")
    private String edit;

    private static final long serialVersionUID = 1L;
}