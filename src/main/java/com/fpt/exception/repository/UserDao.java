package com.fpt.exception.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.ResourceUtils;

import com.fpt.exception.entities.User;



public class UserDao {
	
	public List<User> readFile(){
		List<User> users = null;
		StringBuffer response = new StringBuffer();
		File file = null;
		try {
			file = ResourceUtils.getFile("classpath:data.json");
			InputStream input = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			 String strLine = null;
	          while ((strLine = br.readLine()) != null)
	          {
	              response.append(strLine);
	          }
	          br.close();
	          users = getAllData(response.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public  List<User> getAllData(String input){
		List<User> users = new ArrayList<>();
		User user = null;
		try {
			JSONArray arr = new JSONArray(input);
			for(int i = 0 ; i < arr.length() ; i ++){
				JSONObject index = (JSONObject) arr.get(i);
				user = new User();
				user.setId(index.getLong("id"));
				user.setUserName(index.getString("userName"));
				user.setPassWord(index.getString("passWord"));
				user.setAge(index.getInt("age"));
				user.setSalary(index.getLong("salary"));
				users.add(user);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return users;
	}
}
