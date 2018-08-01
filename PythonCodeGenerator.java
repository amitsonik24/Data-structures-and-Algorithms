package com.algorithms.main;

import java.util.ArrayList;

public class PythonCodeGenerator {

	public static void main(String[] args) {
		ArrayList<String> stringList= new ArrayList<String>();
		stringList.add("hostname");
		stringList.add("store_url");
		stringList.add("customer_id");
		stringList.add("date_added");
		stringList.add("date_modified");
		stringList.add("email");
		stringList.add("firstname");
		stringList.add("import_order_id");
		stringList.add("invoice_number");
		stringList.add("lastname "); 
		stringList.add("mobile");
		stringList.add("order_id");
		stringList.add("order_status_id");
		stringList.add("payment_firstname");
		stringList.add("payment_lastname");
		stringList.add("payment_mobile");
		stringList.add("payment_company");
		stringList.add("payment_address_1");
		stringList.add("payment_address_2");
		stringList.add("payment_city");
		stringList.add("payment_zone");
		stringList.add("payment_postcode");
		stringList.add("payment_country");
		stringList.add("payment_method");
		stringList.add("shipping_address_1");
		stringList.add("shipping_address_2");
		stringList.add("shipping_city");
		stringList.add("shipping_company");
		stringList.add("shipping_country");
		stringList.add("shipping_firstname");
		stringList.add("shipping_lastname");
		stringList.add("shipping_method");
		stringList.add("shipping_postcode");
		stringList.add("status");
		stringList.add("store_name");
		stringList.add("telephone");
		stringList.add("total");
		stringList.add("comment");
		stringList.add("order_product");
		stringList.add("order_total");
		stringList.add("order_history");
		stringList.add("order_rewards");
		stringList.add("weight");
		stringList.add("currency_code");
		stringList.add("created_at");
      for(String element:stringList) {
    	  System.out.println("list_"+element+".append(orders[\'"+element+"\'])");
      }

	}

}
