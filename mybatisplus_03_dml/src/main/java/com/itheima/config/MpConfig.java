package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor mpInterceptor() {
        //1.Mpインターセプターの定義
        MybatisPlusInterceptor mpInterceptor = new MybatisPlusInterceptor();
        //2.具体なインターセプターを追加する
        mpInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        //3.楽観的なロックインターセプターを追加する
        mpInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return mpInterceptor;
    }
}
