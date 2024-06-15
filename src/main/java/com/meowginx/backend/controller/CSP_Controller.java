package com.meowginx.backend.controller;

import cn.hutool.core.io.IoUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class CSP_Controller {

    @RequestMapping("/ZdUFKe9_DrhP4ZYghp7t")
    public String csp_report(HttpServletRequest request) throws IOException {
        String report = IoUtil.read(request.getInputStream(), StandardCharsets.UTF_8);
//        if (log.isInfoEnabled()) {
//            log.info("Report: {}", report);
//        }
        return report;
    }
}
