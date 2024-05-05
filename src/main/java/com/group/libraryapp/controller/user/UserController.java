package com.group.libraryapp.controller.user;

import com.group.libraryapp.domain.dto.user.request.UserCreateRequest;
import com.group.libraryapp.domain.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.domain.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserServiceV2 userservice;

    public UserController(UserServiceV2 userservice) {
        this.userservice = userservice;
    }

    @PostMapping("/user") // POST /user
    public void saveUser(@RequestBody UserCreateRequest request) {
        userservice.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userservice.getUsers();
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userservice.updateUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
        userservice.deleteUser(name);
    }
}
