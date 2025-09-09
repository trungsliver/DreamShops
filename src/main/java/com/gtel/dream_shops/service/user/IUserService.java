package com.gtel.dream_shops.service.user;

import com.gtel.dream_shops.dto.UserDto;
import com.gtel.dream_shops.model.User;
import com.gtel.dream_shops.request.CreateUserRequest;
import com.gtel.dream_shops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
