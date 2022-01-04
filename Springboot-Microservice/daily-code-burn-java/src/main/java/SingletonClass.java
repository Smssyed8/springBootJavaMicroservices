
public class SingletonClass {

		private final SingletonClass singletonField = null;
		
		SingletonClass(){
			//Synchronized() {
				if(null == singletonField) {
					Synchronized {
						if(null == singletonField) {
							singletonField = new SingletonClass();
						}
					}
				}
			
			//}
		}
		
		getter(){
			this.singletonField;
		}
		
}
