package com.credential;

public class test {
	public static void main(String[] args){
		String username = "Debalin";
		String password = "Chandan@1";
		Credential credential = null;
		try{
			credential = new Credential(username, password);
		}catch(Exception e){
			//System.out.println("error: " +e.getMessage());
			//System.out.println("error: " +e.getStackTrace());
			System.out.println("Credentials are wrong");
		}
		System.out.println(credential.toString());
	}
}
