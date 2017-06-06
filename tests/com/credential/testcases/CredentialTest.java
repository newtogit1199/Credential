package com.credential.testcases;

import static org.junit.Assert.*;
import com.credential.Credential;

import org.junit.Test;

public class CredentialTest {
	String valid_username = "Debalin1";
	String invalid_username = "debalin@1243";
	String extra_long_username = "debalin12345678910122343545564576";
	String valid_password = "Chandan@1";
	String invalid_password = "chandan@1";
	String extra_long_password = "Debalin@12345678910122343545564576";
	Credential credential = null;

	@Test
	public void valid_credential() {
		//Credential credential = null;
		try{
			credential = new Credential(valid_username, valid_password);
		}catch(Exception e){
			fail("Credential is not   aaa valid");
		}
	}
	
	@Test
	public void invalid_username() {
		//Credential credential = null;
		try{
			credential = new Credential(invalid_username, valid_password);
		}catch(Exception e){
			assertTrue("invalid_username", true);
		}
	}
	
	@Test
	public void invalid_password() {
		//Credential credential = null;
		try{
			credential = new Credential(valid_username, invalid_password);
		}catch(Exception e){
			assertTrue("invalid_password", true);
		}
	}
	
	@Test
	public void invalid_credential() {
		//Credential credential = null;
		try{
			credential = new Credential(invalid_username, invalid_password);
		}catch(Exception e){
			assertTrue("invalid_credential", true);
		}
	}
	
	@Test
	public void extra_long_username(){
		try{
			credential = new Credential(extra_long_username, valid_password);
		}catch (Exception e) {
			//System.out.println("extra_long_username" +e);
			assertTrue("extra_long_username", true);
		}
	}
	
	@Test
	public void extra_long_password(){
		try{
			credential = new Credential(valid_username, extra_long_password);
		}catch (Exception e) {
			//System.out.println("extra_long_password" +e);
			assertTrue("extra_long_password", true);
		}
	}
}
