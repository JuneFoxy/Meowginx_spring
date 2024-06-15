package com.meowginx.backend.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Howcan implements Serializable {
    @NotNull(message = "不能为null")
    private Integer id;

    @NotNull(message = "不能为null")
    private Integer userId;

    @NotNull(message = "不能为null")
    private Integer whatId;

    private static final long serialVersionUID = 1L;
}