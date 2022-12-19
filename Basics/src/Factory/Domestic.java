package Factory;

 class Domestic extends Plan{

	@Override
	void getRate() {
		rate=3.50;
		
	}

}

 class Industrial extends Plan{

	@Override
	void getRate() {
		rate=5.50;
		
	}
	 
 }
 
 class Commercial extends Plan{

	@Override
	void getRate() {
		rate=7.50;
	}
	 
 }
 