package lesson150922.inheritance.vs.composition;

public class Composition {

	static class A{
		
		void doIt(){
			System.out.println(this.getClass().getSimpleName()+ " is working");
		}
	}
	
	static class B extends A{
		
	}
	
	static class C{
		A a = new A();
		void doIt(){
			a.doIt();
		}
	}
	
	static class D{
		A a;
		D(A a){
			this.a = a;
		}
		void doIt(){
			a.doIt();
		}	
	}
	
	static class E{
		A a;
		
		void setA(A a){
			this.a = a;
		}
		void doIt(){
			a.doIt();
		}
	}
	static class F{
		void doIt(A a){
			a.doIt();
		}
	}
	
	public static void main(String[] args) {
		A a = new A(); a.doIt();
		B b = new B(); b.doIt();//жесткая связь
		//использование композиции
		C c = new C(); c.doIt();//при создании класса проинициализировали а и не можем его менять дальше
		D d = new D(new B()); d.doIt();//поле инициализируется через конструктор - откладывается связывание до вызова конструктора
		E e = new E(); e.setA(new A()); e.doIt();//гибкий вариант - определяем кто это будет делать
		F f = new F(); f.doIt(new B());//самый гибкий вариант - передаем сразу кто это будет делать
	}
}
