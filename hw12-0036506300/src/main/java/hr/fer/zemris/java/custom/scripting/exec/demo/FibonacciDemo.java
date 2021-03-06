package hr.fer.zemris.java.custom.scripting.exec.demo;

import java.io.IOException;

import hr.fer.zemris.java.custom.scripting.exec.SmartScriptEngine;
import hr.fer.zemris.java.custom.scripting.parser.SmartScriptParser;
import hr.fer.zemris.java.webserver.RequestContext;
/**
 * Demo of the SmartScriptEngine with the file fibonacci.smscr
 * 
 * @author Vedran Kolka
 *
 */
public class FibonacciDemo {

	public static void main(String[] args) throws IOException {
		
		String documentBody = OsnovniDemo.readFromDisk("src/main/resources/fibonacci.smscr");
		// create engine and execute it
		new SmartScriptEngine(
		new SmartScriptParser(documentBody).getDocumentNode(),
		new RequestContext(System.out, null, null, null, null)).execute();

	}
	
}
