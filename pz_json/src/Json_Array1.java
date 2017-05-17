import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;


public class Json_Array1 {
	public static void main(String[] ar) {
	
	ModelAndView view = new ModelAndView("{\"jsontest\":[{\"name\":\"Mr.Cho\",\"location\":\"Seoul\"}]}");
	  String s = "{\"jsontest\":[{\"name\":\"Mr.Cho\",\"location\":\"Seoul\"}]}";
	  String jos = "{\"jsonView\":[{\"addr\":\"NamDong start\"}]}";
	  JSONObject jo = JSONObject.fromObject(s);
	  JSONArray ja = jo.getJSONArray("jsontest");
	  JSONObject jo1 = JSONObject.fromObject(jos);
	  JSONArray ja1 = jo1.getJSONArray("jsonView");
	  for (Iterator i = ja.iterator(); i.hasNext();) {
	   JSONObject ob = (JSONObject) i.next();
	   String a = ob.getString("name");
	   String b = ob.getString("location");
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(view);
	 }	
	  for (Iterator i = ja1.iterator(); i.hasNext();) {
		   JSONObject ob = (JSONObject) i.next();
		   String a = ob.getString("addr");
		   System.out.println(a);
		   System.out.println(view);
		 }		  
	
   }
}