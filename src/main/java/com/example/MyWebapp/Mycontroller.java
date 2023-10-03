package com.example.MyWebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@GetMapping(value = "/get this")
	public String get() {
		return "hello";
	}

	@GetMapping(value = "/myname/{a}")
	public String get(@PathVariable String a) {
		return "hello " + a;
	}

	@GetMapping(value = "/evenodd/{a}")
	public String get(@PathVariable int a) {
		if (a % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

	@GetMapping(value = "/char/{b}")
	public char gets(@PathVariable String b) {
		return b.charAt(b.length() - 1);
	}

	@GetMapping(value = "/accessThis")
	public String getLogin(@RequestParam String username, @RequestParam String password) {
		if (username.equals("nisha") && password.equals("n")) {
			return "login suceessfully";
		} else {
			return "Access denied";
		}
	}

	@GetMapping(value = "/primenumber/{a}")
	public String prime(@PathVariable int a) {
		boolean r = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				r = false;
			}
		}
		if (r == true) {
			return "prime";

		} else {
			return "Not prime";
		}

	}

	@GetMapping(value = "/consonants/{a}")
	public String consonants(@PathVariable String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				b = b + ch;

			}
		}
		return b;

	}
}
