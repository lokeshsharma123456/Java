package com.techmojo.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.techmojo.beans.Student;
import com.techmojo.exception.InAppropriateValuesException;
import com.techmojo.exception.InsufficientNumberOfValuesException;
import com.techmojo.exception.NonParsableContentException;

public class StudentOperations {
	Logger logger = Logger.getLogger(StudentOperations.class);
	public void process(String inputFile, String outputFile) throws FileNotFoundException, IOException, Exception {
		logger.info("Started processing to reading : "+inputFile+" and going to write into + "+outputFile);
		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputFile);
		int size = fis.available();
		byte[] bytes = new byte[size];
		bytes = fis.readAllBytes();
		String content = new String(bytes);
		String[] lines = content.split("\n");
		logger.info("There are "+lines.length+" lines in the input file.");
		for( String line : lines) {
			line = line.trim();
			try {
				logger.info("Processing the line : "+line);
				Student student = Student.parseStudent(line);
				String output = student.toCSV()+", "+student.getTotal()+"\n";
				logger.info("Calculated to total of the student id : "+student.getId());
				fos.write(output.getBytes());
				logger.info("Successfully saved the student with id : "+student.getId()+" into file.");
			} catch (InsufficientNumberOfValuesException e) {
				logger.error(e.toString()+"There are not sufficient number of values for the line : "+line);
			} catch (InAppropriateValuesException e) {
				logger.error(e.toString()+"Few values are missing in the input line : "+line);
			} catch (NonParsableContentException e) {
				logger.error(e.toString()+"Content is not appropriate type in the input line : "+line);
			}
		}
		fos.close();
		fis.close();
	}
}
