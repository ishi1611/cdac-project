package com.crs.service;

import com.crs.Exception.ResourceNotFoundException;
import com.crs.dto.ApiResponse;
import com.crs.dto.user.AuthRequestDto;
import com.crs.dto.user.AuthRespDto;
import com.crs.dto.user.DocumentDto;
import com.crs.dto.user.RegisterUserDto;
import com.crs.dto.user.UpdateUserDto;
import com.crs.entities.Documents;
import com.crs.entities.User;
import com.crs.repo.DocumentRepo;
import com.crs.repo.UserRepo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
@Transactional
// @Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private DocumentRepo documentRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper mapper;

    // -----------------All User Functionalities----------------
    @Override
    public List<AuthRespDto> getAllUser() {
        List<User> user = userRepo.findAll();
        return user.stream().map(i -> mapper.map(i, AuthRespDto.class)).collect(Collectors.toList());
    }

    // ------user login-------------
    @Override
    public AuthRespDto logInUser(AuthRequestDto req) {
        AuthRespDto respUser = null;
        User user = userRepo.findByEmail(req.getEmail())
                .orElseThrow(() -> new ResourceNotFoundException("user/email not found"));

        if (user != null) {
            boolean flag = passwordEncoder.matches(req.getPassword(), user.getPassword());
            if (flag) {
                respUser = mapper.map(user, AuthRespDto.class);
            }
        }
        return respUser;
    }

    // -------user register---------
    @Override
    public RegisterUserDto registerUser(RegisterUserDto request) {
        User user = mapper.map(request, User.class);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        User user1 = userRepo.save(user);
        return mapper.map(user1, RegisterUserDto.class);
    }

    // -------update user------------
    public ApiResponse updateUser(UpdateUserDto updateReq) {
        User user = userRepo.findById(updateReq.getId()).orElse(null);

        if (user != null) {
            user.setFirstName(updateReq.getFirstName());
            user.setLastName(updateReq.getLastName());
            user.setPassword(passwordEncoder.encode(updateReq.getPassword()));
            user.setMobile(updateReq.getMobile());
            user.setGender(updateReq.getGender());
            user.setModifiedAt(LocalDateTime.now());
            userRepo.save(user);
            return new ApiResponse(true, "User Updated Successfully");
        }
        return new ApiResponse(false, "User Not Updated");
    }

    // --------Add User Documents-----------------
    public Documents addUserDocuments(DocumentDto docRequest) {

        Documents document = mapper.map(docRequest, Documents.class);

        User user = userRepo.findById(docRequest.getId()).orElseThrow(null);

        document.setUserId(user);

        document.setId(null);

        return documentRepo.save(document);

    }
}
