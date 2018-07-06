package singleton.example4;

public class Main {

	public static void main(String[] args) {
		
		/* 1ª versión
		SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
		SoyUnico ramon = SoyUnico.getSingletonInstance("Ramón Invarato");
		
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
		System.out.println(ramon.getNombre());
		System.out.println(ricardo.getNombre());
		*/
		
		//2ª versión (clone)
		SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
		
		try{
			SoyUnico richard = (SoyUnico) ricardo.clone();
			System.out.println(richard.getNombre());
		} catch(NullPointerException ex){
			ex.printStackTrace();
		}
		
	}

}
