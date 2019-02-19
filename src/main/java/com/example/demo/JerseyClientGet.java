package com.example.demo;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.model.*;
import com.example.model.Parent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

	public static void main(String[] args) {
		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://192.168.20.222:8983/solr/post-patrol-v4/select?q=*:*&rows=200&sort=date_dt%20desc&start=0");
			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			Parent obj = new Parent();
			ObjectMapper mapper = new ObjectMapper();
			obj = mapper.readValue(output, Parent.class);
			
			String csvFile = "/home/shania/csv/cbaaaa.csv";
	        FileWriter writer = new FileWriter(csvFile);
	        
	        CSVUtils.writeLine(writer, Arrays.asList("date_dt", "id_user", "type", "url", "post", "typeMedia", "id", "ori_post", "stance", "username", "hashtag", "_version_"));
	        for(Docs d : obj.getResponse().getDocs()) {
	        	List<String>list = new ArrayList<String>();
	        	list.add(d.toString());
	        	CSVUtils.writeLine(writer, list);
	        }
	       
	        
	        writer.flush();
	        writer.close();


		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}