package com.vinoth.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer  {

	// configureContentNegotiation with Path Extension [e.g  localhost:8081/employee.json (or) localhost:8081/employee.xml ]
	/*@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

	    //set path extension to true
	    configurer.favorPathExtension(true).
	    //set favor parameter to false
	    favorParameter(false).
	    //ignore the accept headers
	    ignoreAcceptHeader(true).
	    //dont use Java Activation Framework since we are manually specifying the mediatypes required below
	    useJaf(false).
	    defaultContentType(MediaType.APPLICATION_JSON).
	    mediaType("xml", MediaType.APPLICATION_XML).
	    mediaType("json", MediaType.APPLICATION_JSON);
	  }*/
	
	// configureContentNegotiation with Path Parameters [ localhost:8081/employee?mediaType=json (or) localhost:8081/employee?mediaType=xml ]
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

		//set path extension to false
		configurer.favorPathExtension(false).
	    //request parameter ("format" by default) should be used to determine the requested media type
	    favorParameter(true).
	    //the favour parameter is set to "mediaType" instead of default "format"
	    parameterName("mediaType").
	    //ignore the accept headers
	    ignoreAcceptHeader(true).
	    //dont use Java Activation Framework since we are manually specifying the mediatypes required below
	    useJaf(false).
	    defaultContentType(MediaType.APPLICATION_JSON).
	    mediaType("xml", MediaType.APPLICATION_XML).
	    mediaType("json", MediaType.APPLICATION_JSON);
	  }
	
}
