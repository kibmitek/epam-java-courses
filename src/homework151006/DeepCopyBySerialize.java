package homework151006;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class DeepCopyBySerialize<T>{

	public static <T> T deepCopy(T o){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte [] byteArray = new byte[0];
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(o);
			byteArray = baos.toByteArray();
			for (byte b : byteArray) {
				char c = (char) b;
			}
		} catch (IOException e) {
			return null;
		}
		//Deserialization = deep copy
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
			try {
				ObjectInputStream ois = new ObjectInputStream(bais);
				o = (T) ois.readObject();
				return o;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}		
	}
}
