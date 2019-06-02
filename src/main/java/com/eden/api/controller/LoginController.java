package com.eden.api.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eden.api.service.UserService;
import com.eden.api.util.APIUtils;
import com.eden.api.util.Constants;
import com.eden.api.util.Response;
import com.eden.api.util.ResponseEnum;


@RestController
@RequestMapping(Constants.BASE_PATH + Constants.PATH_LOGIN)
public class LoginController extends BaseController{
	
	
	private static Logger log = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response login(@RequestBody String userName, String password){
		
		Response response = new Response();
		try {

			if (StringUtils.isBlank(userName)) {
				response = APIUtils.missingParamResponse(
						Constants.INPUT_PARAM_USERNAME,
						Constants.PATH_LOGIN);
				log.debug("[POST] Login - RESPONSE: " + response.getResponse().getCode() + ", DATA: "+ response.getData());
				return response;
			} 
			
			if (StringUtils.isBlank(password)) {
					response = APIUtils.missingParamResponse(
							Constants.INPUT_PARAM_PASSWORD,
							Constants.PATH_LOGIN);
					log.debug("[POST] Login - RESPONSE: " + response.getResponse().getCode() + ", DATA: "+ response.getData());					
					return response;
			}			
			
			Object result = userService.login(userName, password);
			
			response = Response.build(ResponseEnum.OK.getStatus(), Constants.SUCCESS,
					ResponseEnum.OK.getMessage(), true);
			response.setData(result);
			
					
//		} catch (IOException ee) {
//			response = APIUtils.badRequest(Constants.INTERNAL_SYSTEM_ERROR, Constants.INTERNAL_SYSTEM_ERROR);
//			ee.printStackTrace();
		} 
		catch (Exception e) {
			response = Response.build(ResponseEnum.INTERNAL_SERVER_ERROR.getStatus(), Constants.INTERNAL_SYSTEM_ERROR,
					ResponseEnum.INTERNAL_SERVER_ERROR.getMessage(), false);
			e.printStackTrace();
		}
		
		log.debug("[POST] Login - RESPONSE: " + response.getResponse().getCode() + ", DATA: "+ response.getData());
		
		return response;
	}

}
