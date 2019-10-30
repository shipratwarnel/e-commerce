package org.infotech.onlineshopping_UI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
	}
	/**For Demonstration Purpose **/
	/*--------------------------------------------------------------------------------------------*/
	
	/*We get an error i.e. HTTP Status 400-Required String parameter 'greeting' is not present
	 * if we enter below URI
	 * http://localhost:8080/onlineshopping_UI/test
	 * bcz in @RequestParam we hardcoded greeting word. So it is mandatory to 
	 * write greeting in URI i.e. after test we have to give "?" mark sign.
	 * http://localhost:8080/onlineshopping_UI/test?greeting
	 * */
	
/*	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam("greeting") String greeting){
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Greeting Demo with hardcoded String");
		return mv;
	} */
	
	/*------------------------------------------------------------------------------------------------*/
	
	/* By using required argument in @RequestParam i.e. false its not required to 
	 * write greeting in URL and it will work for below metion URL
	 * http://localhost:8080/onlineshopping_UI/test
	 * */
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting){
		if(greeting==null){
			greeting="Hello I m working as a String";
		}
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Greeting Demo without hardcoded String");
		return mv;
	}*/
	
	/*--------------------------------------------------------------------------------------------------*/
	
	/* To use @PathVariable we need to use{} braces which indicates that 
	 * the value for that particular will be dynamic in nature here, it is for "greeting" 
	 * */
	
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if(greeting==null){
			greeting="Hello I m working as a String";
		}
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Greeting Demo without hardcoded String");
		return mv;
	}*/
	/*--------------------------------------------------------------------------------------------------*/
}
