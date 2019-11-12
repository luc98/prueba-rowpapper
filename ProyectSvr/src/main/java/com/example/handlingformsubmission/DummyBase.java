package com.example.handlingformsubmission;
import java.util.HashMap;
import java.util.Map;
public class DummyBase {
		private static HashMap<String,String>Miregistro;
		private static HashMap<String,usuario>registroU;
			
		  static{
			Miregistro = new HashMap<String,String>();
			Miregistro.put("Lucas", "123");
			Miregistro.put("Junior", "456");
			Miregistro.put("Chile", "789");
			Miregistro.put("Agus", "100");
		}
		  static String traerContent(String key) {
			  return Miregistro.get(key);
		  }
		  
		  static HashMap<String,String> getRegistro(){
			  return Miregistro;
		  }
		  static void setRegistro(usuario usuario){
			  Miregistro.put(usuario.getUsuario(), usuario.getPass());
		  }
		  static {
			  usuario l= new usuario();
			  l.setApellido("nan");
			  l.setEmail("l@gmail.com");
			  l.setNombre("Lucas");
			  l.setPass("123");
			  l.setUsuario("lucas");
			  usuario a= new usuario();
			  a.setApellido("apellido");
			  a.setEmail("a@gmail.com");
			  a.setNombre("agustin");
			  a.setPass("321");
			  a.setUsuario("agustin");
			  
			  registroU=new HashMap<String,usuario>();
			  registroU.put("nan",l );
			  registroU.put("agustin", a);
			  }
		
		
}
