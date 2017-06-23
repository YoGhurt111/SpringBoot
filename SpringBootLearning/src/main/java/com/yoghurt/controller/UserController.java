package com.yoghurt.controller;

import com.yoghurt.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import java.util.*;

/**
 * Created by admin on 2017/6/22.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value="/listUser", method=RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="/postUser", method=RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "query")
    @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public User getUser(@RequestParam Long id) {
        return users.get(id);
    }

    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value="updateUser", method=RequestMethod.PUT)
    public String putUser(@RequestParam Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "query")
    @RequestMapping(value="deleteUser", method=RequestMethod.DELETE)
    public String deleteUser(@RequestParam Long id) {
        users.remove(id);
        return "success";
    }
}
