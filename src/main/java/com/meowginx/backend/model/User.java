package com.meowginx.backend.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable {
    @NotNull(message = "不能为null")
    private Integer id;

    @Size(max = 64,message = "最大长度要小于 64")
    private String username;

    @Size(max = 1024,message = "最大长度要小于 1024")
    private String encd;

    @Size(max = 64,message = "最大长度要小于 64")
    private String email;

    @Size(max = 32,message = "最大长度要小于 32")
    private String lastLogin;

    @Size(max = 32,message = "最大长度要小于 32")
    private String status;

    private static final long serialVersionUID = 1L;
}