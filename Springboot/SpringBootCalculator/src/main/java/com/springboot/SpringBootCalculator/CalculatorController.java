package com.springboot.SpringBootCalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	private int result;

	@RequestMapping("/sum")
	public int add(@RequestParam int x, @RequestParam int y) // http://localhost:9000/sum?x=10&y=20
	{
		result = x + y;
		return result;
	}

	@RequestMapping("/difference")
	public int subtract(@RequestParam int x, @RequestParam int y) // http://localhost:9000/difference?x=10&y=20
	{
		result = x - y;
		return result;
	}

	@RequestMapping("/product")
	public int multiply(@RequestParam int x, @RequestParam int y) // http://localhost:9000/product?x=10&y=20
	{
		result = x * y;
		return result;
	}

	@RequestMapping("/quotient")
	public int divide(@RequestParam int x, @RequestParam int y) // http://localhost:9000/quotient?x=10&y=20
	{
		result = x / y;
		return result;
	}
}
