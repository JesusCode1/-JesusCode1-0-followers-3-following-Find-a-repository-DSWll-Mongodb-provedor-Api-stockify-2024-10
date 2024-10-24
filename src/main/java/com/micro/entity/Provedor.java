package com.micro.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "provedor")
public class Provedor {
	
	 @Id
	    private String id;  // MongoDB usa _id como String
	    
	    private Integer provedor_id;  // Puede ser tu código original
	    private String provedor_name;
	    private String email;
	    private String phone_number;
	    private String website;
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Integer getProvedor_id() {
			return provedor_id;
		}
		public void setProvedor_id(Integer provedor_id) {
			this.provedor_id = provedor_id;
		}
		public String getProvedor_name() {
			return provedor_name;
		}
		public void setProvedor_name(String provedor_name) {
			this.provedor_name = provedor_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}

	    
	    
}
