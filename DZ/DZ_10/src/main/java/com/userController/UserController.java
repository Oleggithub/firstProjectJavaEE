package com.userController;

import com.dao.MockUserDao;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by b_nop on 15.12.2016.
 */
@Controller
public class UserController {
    private MockUserDao userDao = new MockUserDao();

    @RequestMapping("/users.html")
    public ModelAndView listUsers() {
        return new ModelAndView("WEB-INF/jsp/users.jsp", "users", userDao.getAllUsers());
    }

    @RequestMapping(value = "/addUser.html", method = RequestMethod.GET)
    public String showCreateUser(Model model) {
        User user = new User();
        user.setActive(true);
        model.addAttribute("user", user);
        return "WEB-INF/jsp/addEditUser.jsp";
    }
    @RequestMapping(value = "/editUser.html", method = RequestMethod.GET)
    public String showEditUser(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", userDao.findUserById(id));
        return "WEB-INF/jsp/addEditUser.jsp";
    }
}