package main.java.com.springapp.mvc;/*
package com.springapp.mvc;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.Client;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

*/
/**
 * Created by komal.kochar on 1/21/2016.
 *//*

public class EmailServiceImpl {

    public static void main(String args[]) throws Exception {
      sendMail();
    }

    public static ClientResponse sendMail() {
      Client client = Client.create();
      client.addFilter(new HTTPBasicAuthFilter("api",
          "key-95bab381bb2baeedefc93c62fb7b4166"));
      WebResource webResource =
          client.resource("https://api.mailgun.net/v3/sandbox4c3caafded024b7684941dfe09ea98e7.mailgun.org/messages");
      MultivaluedMapImpl formData = new MultivaluedMapImpl();
      formData.add("from", "Mailgun Sandbox <postmaster@sandbox4c3caafded024b7684941dfe09ea98e7.mailgun.org>");
      formData.add("to", "komal <komal.kochar23@gmail.com>");
      formData.add("subject", "Hello komal");
      formData.add("text", "Congratulations komal, you just sent an email with Mailgun!  You are truly awesome!  " +
          "You can see a record of this email in your logs: https://mailgun.com/cp/log .  " +
          "You can send up to 300 emails/day from this sandbox server.  " +
          "Next, you should add your own domain so you can send 10,000 emails/month for free.");//formData.add("text", "Testing some Mailgun awesomness!");
      //formData.add("html","<html><a href=\"http://stackoverflow.com\">HTML version of the body</a>" +
      //  "<p>Testing Mailgun awesomeness.</p></html>");

      return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
          post(ClientResponse.class, formData);
    }
  }*/
