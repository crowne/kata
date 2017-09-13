package com.crowlines.kata;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

	public void testEcho() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Test 1",	"1",		fb.echo(1));
		assertEquals("Test 2",	"2",		fb.echo(2));
		assertEquals("Test 3",	"Fizz",		fb.echo(3));
		assertEquals("Test 4",	"4",		fb.echo(4));
		assertEquals("Test 5",	"5",		fb.echo(5));
		assertEquals("Test 6",	"Fizz",		fb.echo(6));
		assertEquals("Test 7",	"Buzz",		fb.echo(7));
		assertEquals("Test 8",	"8",		fb.echo(8));
		assertEquals("Test 9",	"Fizz",		fb.echo(9));
		assertEquals("Test 10",	"10",		fb.echo(10));
		assertEquals("Test 21",	"FizzBuzz",	fb.echo(21));
	}

}
