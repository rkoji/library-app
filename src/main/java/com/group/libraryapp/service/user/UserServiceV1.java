//package com.group.libraryapp.service.user;
//
//import com.group.libraryapp.controller.dto.user.request.UserCreateRequest;
//import com.group.libraryapp.controller.dto.user.request.UserUpdateRequest;
//import com.group.libraryapp.controller.dto.user.response.UserResponse;
//import com.group.libraryapp.respository.user.UserJdbcRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserserviceV1 {
//
//    private final UserJdbcRepository userJdbcRepository;
//
//    public UserServiceV1(UserJdbcRepository userJdbcRepository) {
//        this.userJdbcRepository = userJdbcRepository;
//    }
//
//    public void updateUser(UserUpdateRequest request) {
//        boolean isUserNotExist = userJdbcRepository.isUserNotExists(request.getId());
//        if (isUserNotExist) {
//            throw new IllegalArgumentException();
//        }
//        userJdbcRepository.updateUserName(request.getName(), request.getId());
//    }
//
//    public void deleteUser(String name) {
//        if (userJdbcRepository.isUserNotExist(name)) {
//            throw new IllegalArgumentException();
//        }
//
//        userJdbcRepository.deleteUser(name);
//    }
//
//    public void saveUser(UserCreateRequest request) {
//        userJdbcRepository.saveUser(request.getName(), request.getAge());
//    }
//
//    public List<UserResponse> getUsers(){
//        return userJdbcRepository.getUsers();
//    }
//}
