package com.easy4j.samples.controller;

import com.easy4j.samples.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.easy4j.framework.annotation.Controller;
import org.easy4j.framework.annotation.Inject;
import org.easy4j.framework.annotation.RequestMapping;
import org.easy4j.framework.annotation.ResponseBody;
import org.easy4j.framework.bean.Param;
import org.easy4j.framework.bean.RequestMethod;
import org.easy4j.framework.helper.ConfigHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Inject
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Param param){

        List list = userService.list();
        LOGGER.info(list);

        return "list.jsp";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Object test(Param param){

        LOGGER.info("test");

        Map<String, Object> result = new HashMap();
        result.put("username", "wudi32");

        return result;

    }




    public static void main(String[] args) {
        System.out.println(ConfigHelper.getAppBasePackage());
    }
}
