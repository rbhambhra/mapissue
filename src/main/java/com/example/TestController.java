package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller
public class TestController
{
  @Post("/test")
  public Map<String, String> test(@Body
  Map<String, String> map)
  {
    return map;
  }

  @Post("/testlinkedhashmap")
  public LinkedHashMap<String, String> testLinkedHashMap(@Body
  LinkedHashMap<String, String> map)
  {
    return map;
  }
}
