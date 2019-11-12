package com.example.handlingformsubmission;

import org.springframework.stereotype.Service;
import java.util.HashMap;
@Service
public class Pservices {
		
		public boolean verificar(String usuario,String pass) {
			if (DummyBase.getRegistro().containsKey(usuario)&& DummyBase.getRegistro().get(usuario).equals(pass)) {
				return true;
			}
			return false;
		}
		public void registrar(usuario usuario) {
			DummyBase.setRegistro(usuario); 
			
		}
}
