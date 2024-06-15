//package com.meowginx.backend.config;
//
//import com.google.code.kaptcha.Constants;
//import com.google.code.kaptcha.impl.DefaultKaptcha;
//import com.google.code.kaptcha.util.Config;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
//@Configuration
//public class KaptchaConfig {
//
//    @Bean
//    @Qualifier("captchaProducer")
//    public DefaultKaptcha defaultKaptcha() {
//
//        DefaultKaptcha kaptcha = new DefaultKaptcha();
//        Properties properties = new Properties();
//        //默认是否有边框
//        properties.setProperty(Constants.KAPTCHA_BORDER, "yes");
//        //验证码边框颜色
//        properties.setProperty(Constants.KAPTCHA_BORDER_COLOR, "220,220,220");
//        //验证码文本字符颜色
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, "38,29,12");
//        //验证码图片宽度
//        properties.setProperty(Constants.KAPTCHA_IMAGE_WIDTH, "147");
//        //验证码图片高度
//        properties.setProperty(Constants.KAPTCHA_IMAGE_HEIGHT, "34");
//        //验证码文本字符大小
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, "25");
//        //KAPTCHA_SESSION_KEY
//        properties.setProperty(Constants.KAPTCHA_SESSION_KEY, "code");
//        //验证码个数
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, "4");
//        //验证码文本样式
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_NAMES, "Courier");
//        //字体间隔
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, "8");
//        //干扰线颜色
//        properties.setProperty(Constants.KAPTCHA_NOISE_COLOR, "white");
//        //干扰实现类
//        properties.setProperty(Constants.KAPTCHA_NOISE_IMPL, "com.google.code.kaptcha.impl.NoNoise");
//        //图片样式：鱼眼-FishEyeGimpy，水纹-WaterRipple，阴影-ShadowGimpy
//        properties.setProperty(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, "com.google.code.kaptcha.impl.FishEyeGimpy");
//        //文字来源
//        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, "0123456789");
//        Config config = new Config(properties);
//        kaptcha.setConfig(config);
//        return kaptcha;
//    }
//
//}
