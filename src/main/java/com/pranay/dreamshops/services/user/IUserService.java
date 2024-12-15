package com.pranay.dreamshops.services.user;

import com.pranay.dreamshops.dto.UserDto;
import com.pranay.dreamshops.model.User;
import com.pranay.dreamshops.requests.CreateUserRequest;
import com.pranay.dreamshops.requests.UserUpdateRequest;

public interface IUserService {
    User getUserbyId(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
