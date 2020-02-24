package com.eurofins.eesb.demo;


import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;


@RestController
public class InternalErrorsController implements ErrorController {
	
    private static final String ERROR_PATH = "/error";

    public String getErrorPath() {
		return ERROR_PATH;
	}

    /**
     * Intercepts internal Spring errors after the Exception Handler.
     * This means that no handler has been found (so 404).
     * This controller transforms everything to an internal error with a 404 http status code.
     *
     * @param request the original request
     * @return the error
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String noHandlerFoundHandler(HttpServletRequest request) {
    	System.out.println("In error controller");
        NoHandlerFoundException noHandlerFoundException = new NoHandlerFoundException(request.getMethod(), request.getRequestURI(), null);

    	String invalidURL="Please check the application URL";
		return invalidURL;
    }



	
    

}