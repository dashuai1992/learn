package org.docker.demo.demo.config;

import org.docker.demo.demo.Mark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class TokenConfiguration implements WebMvcConfigurer {
    private static Logger logger = LoggerFactory.getLogger(TokenConfiguration.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }

    class TokenInterceptor implements HandlerInterceptor {
        private static final String SEND_TIME = "send_time";
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            request.setAttribute(SEND_TIME, System.nanoTime());
            logger.info("当前服务：{}", Mark.APP_MARK);
            return true;
        }

        /**
         * 请求完成,
         * 2020-06-15 18:56
         * yds
         **/
        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
            Long requestTime = Long.valueOf(request.getAttribute(SEND_TIME).toString());
            logger.info("请求耗时：{}纳秒", Long.valueOf(System.nanoTime() - requestTime).toString());
        }

    }
}
