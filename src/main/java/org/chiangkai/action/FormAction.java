package org.chiangkai.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.chiangkai.model.FormModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author ChiangKai
 * @date 2022/10/17
 */
@Controller
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Getter
@Setter
@Slf4j
public class FormAction implements Action {
    private String name;
    private String password;

    private FormModel model;

    @Override
    public String execute() throws Exception {
        log.info("name={},password={},model={}", name, password, model);
        return SUCCESS;
    }
}
