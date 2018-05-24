package com.logiccache.jsonviewexample.web.dto.view;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractMappingJacksonResponseBodyAdvice;

@ControllerAdvice
public class JsonViewConfiguration extends AbstractMappingJacksonResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return super.supports(returnType, converterType);
    }

    @Override
    protected void beforeBodyWriteInternal(MappingJacksonValue bodyContainer, MediaType contentType,
                                           MethodParameter returnType, ServerHttpRequest request, ServerHttpResponse response) {

        Class<?> viewClass = View.Anonymous.class;

        if (request.getHeaders().containsKey("role")) {
            Role role = Role.valueOf(request.getHeaders().get("role").get(0));
            switch (role) {
                case ADMIN:
                    viewClass = View.Admin.class;
                    break;
                case PUBLIC:
                    viewClass = View.Public.class;
                    break;
                case PAYROLL:
                    viewClass = View.Payroll.class;
                    break;
                case PRIVATE:
                    viewClass = View.Private.class;
                    break;
            }
        }
        bodyContainer.setSerializationView(viewClass);
    }
}
