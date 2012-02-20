	package org.arz.interpreter;

import java.util.HashMap;

public class MyEnvironment {
   private MyEnvironment(){};

   private static MyEnvironment nullEnvironment = new MyEnvironment();
   private MyEnvironment parent;
   private HashMap<String,Object> map = new HashMap<String, Object>();
   
   public static MyEnvironment getRootEnvironment()
   {
	   return nullEnvironment;
   }
   
   private MyEnvironment(MyEnvironment env)
   {
	   this.parent = env;
   }
   
   public MyEnvironment createChildEnv()
   {
	   return new MyEnvironment(this);
   }
   
   
   public Object get(String name)
   {
	   Object result = map.get(name);
	   if ((result == null) && (parent != nullEnvironment))
	   {
		   return parent.get(name);
	   }else{
		   return null;
	   }
   }
   
   public void set(String name,Object obj)
   {
	   if (map.containsKey(name))
	   {
		   map.remove(name);
	   }
	   map.put(name, obj);
   }
   
}
