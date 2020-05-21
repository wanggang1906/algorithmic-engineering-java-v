package controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

import me.zhengjie.annotation.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Api(tags = "CV：微笑检测")
@RestController
@RequestMapping("/api/cv")
@RequiredArgsConstructor
public class ImageController {

    @Log("导出用户数据") // 作者自定义的注解
    @ApiOperation("导出用户数据")
    @GetMapping(value = "/down")
    @PreAuthorize("@el.check('user:list')")
    public ResponseEntity<Object> downImage(){

        String result = "后台返回的数据";

        // spring ResponseEntity 处理http响应的类
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

}
