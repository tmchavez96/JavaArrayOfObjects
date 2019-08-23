package Employee;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Container con = new Container();
		while(true) {
			String helpLine = "Enter 'N' to add a new employee, 'L' to lookup";
			System.out.println(helpLine);
			String cmd = scan.nextLine();
			System.out.println(cmd);
			int ncmd = cmd.compareTo("N");
			int lcmd = cmd.compareTo("L");
			if(ncmd == 0) {
				System.out.println("New Employee, enter <id> <salary> <name>");
				String newemp = scan.nextLine();
				int ws1 = -1; int ws2 = -1;
				for(int i = 0; i< newemp.length(); i++) {
					char cur = newemp.charAt(i);
					if(cur == ' ') {
						if(ws1<0) {
							ws1 = i; 
						}else {
							ws2 = i;
						}
					}
				}
				System.out.println(ws1 + " " + ws2);
				String id = newemp.substring(0,ws1);
				String salary = newemp.substring(ws1+1,ws2);
				String name = newemp.substring(ws2+1);
				System.out.println(id);
				System.out.println(salary);
				System.out.println(name);
				int rid = Integer.parseInt(id);
				int rsalary = Integer.parseInt(id);
				Employee ne = new Employee(rid,rsalary,name);
				con.addElm(ne);
			}else if(lcmd == 0) {
				System.out.println("enter Employee ID to view");
				String rID = scan.nextLine();
				int reqID = Integer.parseInt(rID);
				con.getEmployee(reqID);
				
			}else {
				System.out.println("command not recognized");
			}
		}
		//scan.close();
	}
}
