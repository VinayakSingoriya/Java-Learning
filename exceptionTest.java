class exceptionTest{
	public static int j;
	public static void main(String args []){
		for(int i=0; i<4; i++){
			try{
				switch(i){
					case 0:
						int zero = 0;
						j = 999/zero;
						break;
					case 1:
						int b[] = null;
						j = b[0];
						break;
					case 2:
						int c [] = new int[2];
						j = c[10];
						break;
					case 3:
						char ch = "JAVA".charAt(9);
						break;
						
				}
			}
			catch(Exception e){
				System.out.print("In test case -"+i+": ");
				System.out.println(e.getMessage());
			}
		}
	}
}