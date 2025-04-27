package packageMorph;

//student data
public class Student {
	public int NIM;
	public String name;
	public String degree;
	
	//getter methods
		public int getNIM() {
			return NIM;	
		}
	
		public String getname() {
			return name;	
		}
		
		public String getdegree() {
			return degree;	
		}
	
		
	//constructor
		public Student(int NIM, String name, String degree){
			this.NIM = NIM;
			this.name = name;
			this.degree = degree;
		}
		
	//setter
		public void setNIM(int NIM) {
			this.NIM = NIM;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setDegree(String degree) {
			this.degree = degree;
		}
}
