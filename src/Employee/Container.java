package Employee;

public class Container {
	Employee[] objArr;
	int len = 0;
	int size;
	Container(){
		objArr = new Employee[4];
		size = 4;
	}
	public void expandMem() {
		int ns = this.size *2;
		Employee[] na = new Employee[ns];
		for(int i = 0; i < this.size; i++) {
			na[i] = this.objArr[i];
		}
		this.objArr = na;
		this.size = ns;
	}
	
	public void addElm(Employee elm) {
		if(len >= size-1) {
			this.expandMem();
		}
		this.objArr[len] = elm;
		this.len++;
	}
	public void getEmployee(int reqID) {
		for(int i = 0;i<len; i++) {
			Employee cur = objArr[i];
			if(cur.id == reqID) {
				cur.view();
				return;
			}
		}
		System.out.println("id not found");
	}
	public void viewContainer() {
		for(int i = 0; i < this.len; i++) {
			Employee cur = this.objArr[i];
			cur.view();
		}
	}
	
	//public static void main(String[] args) {
	//	Container test = new Container();
	//	System.out.println("made container");
	//	for(int i =0; i < 20; i++) {
	//		Employee ne = new Employee(i,100+i,"Mr. Smith");
	//		test.addElm(ne);
	//	}
	//	test.viewContainer();
	//}
}
