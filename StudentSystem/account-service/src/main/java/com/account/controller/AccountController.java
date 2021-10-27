package com.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.Dto.AccountDto;
import com.account.Dto.BaseResponse;
import com.account.Dto.LoginResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = AccountDto.class),
            @ApiResponse(code = 400, message = "Bad Request", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = BaseResponse.class),
            @ApiResponse(code = 403, message = "Forbidden", response = BaseResponse.class),
            @ApiResponse(code = 500, message = "Failure", response = BaseResponse.class)})
    public AccountDto findAccountById(@PathVariable(value = "id") long id) {
        return new AccountDto();
    }

    @PostMapping("/login")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Login success", response = LoginResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = BaseResponse.class),
            @ApiResponse(code = 500, message = "Failure", response = BaseResponse.class)})
    public LoginResponse login() {
        return new LoginResponse();
    }

    @ResponseBody
    @PostMapping("/logout")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Logout success", response = String.class)})
    public String logout() {
        return "Logout success";
    }

    @PostMapping("")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Add success", response = AccountDto.class),
            @ApiResponse(code = 400, message = "Bad Request", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Unauthorization", response = BaseResponse.class),
            @ApiResponse(code = 403, message = "Forbidden", response = BaseResponse.class),
            @ApiResponse(code = 500, message = "Failure", response = BaseResponse.class)})

    public AccountDto addAccount() {
        return new AccountDto();
    }

    @PutMapping("{id}")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Update success", response = AccountDto.class),
            @ApiResponse(code = 401, message = "Unauthorization", response = BaseResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = BaseResponse.class),
            @ApiResponse(code = 403, message = "Forbidden", response = BaseResponse.class),
            @ApiResponse(code = 500, message = "Failure", response = BaseResponse.class)})
    public AccountDto updateAccount(@PathVariable(value = "id") long id, @RequestBody AccountDto accountDto) {
        return new AccountDto();
    }

}
