package com.easy4j.samples.service;

import org.easy4j.framework.annotation.Service;
import org.easy4j.framework.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Transactional
    public List list(){
        List list = new ArrayList();
        Map user = new HashMap();
        user.put("username", "wudi32");
        list.add(user);

        return list;
    }

}
