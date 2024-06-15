//package com.meowginx.backend.controller;
//
//import com.google.code.kaptcha.Producer;
//import com.google.code.kaptcha.impl.DefaultKaptcha;
//import com.meowginx.backend.utils.IP_Utils;
//import com.meowginx.backend.utils.MD5_Utils;
//import jakarta.servlet.ServletOutputStream;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.apache.tomcat.util.codec.binary.Base64;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//import java.util.concurrent.TimeUnit;
//
//@RestController
//@RequestMapping("/verification")
//@CrossOrigin
//public class Kaptcha_Controller {
//
//    @Autowired
//    RedisTemplate<String, Object> redisTemplate;
//
//    @Autowired
//    Producer producer;
//
////    @Autowired
////    private Producer captchaProducer;
//
////    @Autowired
////    private StringRedisTemplate redisTemplate;
//
//    private static final long CAPTCHA_CODE_EXPIRED=60*1000*10;
//
//    private String getCaptchaKey(HttpServletRequest request) {
//        //获取ip
//        String ip = IP_Utils.get_ip_address(request);
//        //浏览器识别
//        String userAgent = request.getHeader("User-Agent");
//        String key = "user-service:captcha:" + MD5_Utils.get_string_md5(ip + userAgent);
////        log.info("key:{},ip:{},userAgent:{}", key, ip, userAgent);
//        return key;
//    }
//
//    @GetMapping("/captcha")
//    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) {
//        String captcha = producer.createText();
////        log.info("图形验证码:{}", captcha);
//        //redis存储
//        redisTemplate.opsForValue().set(getCaptchaKey(request), captcha,CAPTCHA_CODE_EXPIRED,TimeUnit.MILLISECONDS);
//        BufferedImage bufferedImage = producer.createImage(captcha);
//        ServletOutputStream outputStream = null;
//        try {
//            outputStream = response.getOutputStream();
//            ImageIO.write(bufferedImage, "jpg", outputStream);
//            outputStream.flush();
//            outputStream.close();
//        } catch (IOException e) {
////            log.error("获取图形验证码异常！！！");
//        }
//    }
//
//}
