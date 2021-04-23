class Calculator {
  int add(int a, int b){
	return a+b; }
  int sub(int a, int b){
	return a-b; }
  int mul(int a, int b){ return 0; }
  int div(int a, int b){ return 0; }
  int mod(int a, int b){
		public int mod(int a, int b){
			int cociente = a/b;
			int mod = a-(cociente*b);
			return mod;
		}
}

