package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MpCinfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/12 - 22:17
 * Version:
 */

@Configuration
public class MpConfig {

    @Bean
    public MybatisPlusInterceptor myInterceptor(){
        // 1.MPインターセプターを定義する
        MybatisPlusInterceptor mpInterceptor = new MybatisPlusInterceptor();
        // 2.具代的なインターセプターを追加する
        mpInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mpInterceptor;
    }
}
