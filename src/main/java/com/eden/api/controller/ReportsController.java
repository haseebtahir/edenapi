package com.eden.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.api.util.Constants;

@RestController
@RequestMapping(Constants.BASE_PATH + Constants.PATH_REPORT)
public class ReportsController extends BaseController{

}
