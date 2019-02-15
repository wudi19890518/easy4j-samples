package com.easy4j.samples.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.easy4j.framework.annotation.Aspect;
import org.easy4j.framework.annotation.Controller;
import org.easy4j.framework.proxy.AbstractProxy;

import java.lang.reflect.Method;

@Aspect(Controller.class)
public class ControllerAspect extends AbstractProxy {

    private static final Logger LOGGER = LogManager.getLogger(ControllerAspect.class);

    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) {
        LOGGER.info("-----------------begin-------------------");
        begin = System.currentTimeMillis();
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params) {
        LOGGER.info("time:{}ms", System.currentTimeMillis() - begin);
        LOGGER.info("------------------end---------------------");
    }

}
