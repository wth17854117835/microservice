package com.ritian.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: wangth_oup
 * @date: 2020-04-16 14:38
 * @description: 需求：通过编写过滤器实现用户是否登录的检查。
 *               实现：通过判断请求中是否有token，如果有认为就是已经登录的，如果没有就认为是非法请求，响应401.
 **/
@Component
public class UserLoginZuulFilter extends ZuulFilter {

    /**
     * 返回一个Boolean值，判断该过滤器是否需要执行。返回true执行，返回false不执行。
     */
    @Override
    public boolean shouldFilter() {
        return true; // 该过滤器需要执行
    }

    /**
     * 过滤器的具体业务逻辑。
     */
    @Override
    public Object run() throws ZuulException { //编写业务逻辑
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            requestContext.setSendZuulResponse(false); // 过滤该请求，不对其进行路由
            requestContext.setResponseStatusCode(401); // 设置响应状态码
            requestContext.setResponseBody(" token is empty!!"); // 设置响应状态码
            return null;
        }
        return null;
    }

    /**
     * filterType：返回字符串代表过滤器的类型<br>
     * a)pre：请求在被路由之前执行<br>
     * b)routing：在路由请求时调用<br>
     * c)post：在routing和errror过滤器之后调用<br>
     * d)error：处理请求时发生错误调用
     */
    @Override
    public String filterType() {
        return "pre"; //设置过滤器类型为：pre
    }

    /**
     * 通过返回的int值来定义过滤器的执行顺序，数字越小优先级越高
     */
    @Override
    public int filterOrder() {
        return 0; //设置执行顺序为0
    }

}
