/**
 * 
 */
package com.darshan.springcloud;

import java.util.function.Function;

/**
 * @author darshan
 *
 */
//@Component
public class FunctionTest implements Function<String, String> {

	@Override
	public String apply(String input) {
		System.out.println("Inside FunctionTest");
		return "FunctionTest:: " + input;
	}

}
