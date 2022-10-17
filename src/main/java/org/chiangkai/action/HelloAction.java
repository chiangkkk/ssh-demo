package org.chiangkai.action;

import com.opensymphony.xwork2.Action;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author ChiangKai
 * @date 2022/10/17
 */
@Controller
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloAction implements Action {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
