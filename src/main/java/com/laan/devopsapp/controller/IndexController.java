package com.laan.devopsapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class IndexController {

    @GetMapping
    public ResponseEntity<Object> init() {
        log.info("initializing app");
        Map<String, Object> map = Collections.singletonMap("message", "Success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
