package vamp;

class Asset {
	//Implement your code here
	private String assetId;
	private String assetName;
	private String assetExpiry;
	Asset(String assetId,String assetName,String assetExpiry){
		this.assetId=assetId;
		this.assetName=assetName;
		this.assetExpiry=assetExpiry;
	}
	
	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
		
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetExpiry() {
		return assetExpiry;
	}

	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}

	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
}

class Resources {
	//Implement your code here
	public static int getMonth(String month) {
		
		
		return 0 ; 
	}
}

class InvalidAssetsException {
	//Implement your code here
	InvalidAssetsException(String message){
		
	}
}

class InvalidExperienceException {
	//Implement your code here
	InvalidExperienceException(String message){
		
	}
}

 class Employee {
	//Implement your code here
	private String employeeId;
	private String employeeName;
	private double salary;
	private static int contractIdCounter;
	private static int permenantIdCounter;
	static {
		contractIdCounter=10000;
		permenantIdCounter=10000;
	}
	Employee(String employeeName){
		this.employeeName=employeeName;
		employeeId="C"+ ++contractIdCounter;
		employeeId="E"+ ++contractIdCounter;
	}
	public void calculateSalary(float hoursWorked) {
		// TODO Auto-generated method stub
		
	}
	//public  abstract calculateSalary(float salaryFactor);
		
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		if(salary>0) {
			System.out.println(salary);
		}
		else {
			System.out.println(0);
		}
	}
	public static int getContractIdCounter() {
		return contractIdCounter;
	}
	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}
	public static int getPermenantIdCounter() {
		return permenantIdCounter;
	}
	public static void setPermenantIdCounter(int permenantIdCounter) {
		Employee.permenantIdCounter = permenantIdCounter;
	}
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}
}

class ContractEmployee extends Employee {
	//Implement your code here
	private double wagePerHour;
	ContractEmployee(String employeeName,double wagePerHour){
	super(employeeName);
	this.wagePerHour=wagePerHour;
	}
	@Override
public void calculateSalary(float hoursWorked) {
		double salaryDeducted;
		//double salary=wagePerHour*hoursWorked;
		if(hoursWorked<190) {
			salaryDeducted=(wagePerHour/2*hoursWorked);
		}
		else {
			double salary=wagePerHour*hoursWorked;
		}
		//setSalary(salary)=Math.round(salary);
	}
	
	public double getWagePerHour() {
		return wagePerHour;
	}
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour();
	}
}

class PermanentEmployee extends Employee {
	//Implement your code here
	private double basicPay;
	private String[]salaryComponents;
	private float experience;
	private Asset[]assets;
	PermanentEmployee(String employeeName,double basicPay,String[]salaryComponents,Asset[]assets){
		super(employeeName);
		this.basicPay=basicPay;
		this.salaryComponents=salaryComponents;
		this.assets=assets;
	}
	public double calculateBonus(float experience) {
		double bonus=0;
		if(bonus>=2.5&&bonus<4) {
			 bonus=bonus+2550;
		}
		else if(bonus>=4&&bonus<8) {
			bonus=bonus+5000;
		}
		else if(bonus>=8&&bonus<12) {
			bonus=bonus+8750;
		}
		else if(bonus>=12) {
			bonus=bonus+13000;
		}
		else {
			//throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus");
			System.out.println("A minimum of 2.5 years is required for bonus");
		}
		return bonus;
	}
	@Override
public void calculateSalary(float experience) {
		calculateBonus(experience);
		
	}
   public Asset[]getAssetsByDate(String lastDate){
	return assets;
	   
   }
	
	public double getBasicPay() {
	return basicPay;
}
public void setBasicPay(double basicPay) {
	this.basicPay = basicPay;
}
     
	public String[] getSalaryComponents() {
	return salaryComponents;
}
public void setSalaryComponents(String[] salaryComponents) {
	this.salaryComponents = salaryComponents;
}
    
	public Asset[] getAssets() {
	return assets;
}
public void setAssets(Asset[] assets) {
	this.assets = assets;
}
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
	public String getExperience() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Admin {
	//Implement your code here
	public void generateSalarySlip(Employee[]employyees,float[]salaryFactor) {
		
	}
	public int generateAssetsReport(Employee[]employyees,String lastDate) {
		
		return 0;
	}
	public String[]generateAssetsReport(Employee[]employyees,char assetCategory){
		return null;
		
	}
}

class Tes{
    public static void main(String[] args) {
    	Admin admin = new Admin();
    	
    	Asset asset1 = null;
    	Asset asset2 = null;
    	Asset asset3 = null;
    	Asset asset4 = null;
    	Asset asset5 = null;
    	Asset asset6 = null;
    	Asset asset7 = null;
    	Asset asset8 = null;
    	Asset asset9 = null;
    	Asset asset10 = null;
    	
    	PermanentEmployee permanentEmployee1 = null;
    	PermanentEmployee permanentEmployee2 = null;
    	PermanentEmployee permanentEmployee3 = null;
    	PermanentEmployee permanentEmployee4 = null;
    	PermanentEmployee permanentEmployee5 = null;
		
		ContractEmployee contractEmployee1 = null;
		ContractEmployee contractEmployee2 = null;
		
		Employee[] employees = null;
		float[] salaryFactor = null;
		
		try {
			asset1 = new Asset("DSK-876761L", "Dell-Desktop", "2020-Dec-01");
	    	asset2 = new Asset("DSK-876762L", "Acer-Desktop", "2021-Mar-31");
	    	asset3 = new Asset("DSK-876763L", "Dell-Desktop", "2022-Jun-12");
	    	asset4 = new Asset("LTP-987123H", "Dell-Laptop", "2021-Dec-31");
	    	asset5 = new Asset("LTP-987124h", "Dell-Laptop", "2021-Sep-20");
	    	asset6 = new Asset("LTP-987125L", "HP-Laptop", "2022-Oct-25");
	    	asset7 = new Asset("LTP-987126l", "HP-Laptop", "2021-Oct-02");
	    	asset8 = new Asset("IPH-110110h", "VoIP", "2021-Dec-12");
	    	asset9 = new Asset("IPH-1101201h", "VoIP", "2020-Dec-31");
	    	asset10 = new Asset("IPH-110130h", "VoIP", "2020-Nov-30");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Details of all available assets");
		System.out.println();
		
		try {
			Asset[] assets = { asset1, asset2, asset3, asset4, asset5, asset6, asset7, asset8, asset9, asset10 };
			int counter = 1;
			for (Asset asset : assets) {
				System.out.println("Details of asset"+counter++);
				System.out.println("\tAsset Id: "+asset.getAssetId());
				System.out.println("\tAsset Name: "+asset.getAssetName());
				System.out.println("\tAsset Valid Till: "+asset.getAssetExpiry());
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Correcting all the invalid assetIds");
		System.out.println();
		
		try {
			asset9.setAssetId("IPH-110120h");
			System.out.println("Details of asset9");
			System.out.println("\tAsset Id: "+asset9.getAssetId());
			System.out.println("\tAsset Name: "+asset9.getAssetName());
			System.out.println("\tAsset Valid Till: "+asset9.getAssetExpiry());
			System.out.println();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			permanentEmployee1 = new PermanentEmployee("Roger Fed", 15500.0, new String[] {"DA-50","HRA-40"}, new Asset[] {asset1, asset10});
			permanentEmployee2 = new PermanentEmployee("Serena W", 14000.0, new String[] {"DA-40","HRA-40"}, new Asset[] {asset6, asset9});
			permanentEmployee3 = new PermanentEmployee("James Peter", 18500.0, new String[] {"DA-50","HRA-45"}, new Asset[] {asset4});
			permanentEmployee4 = new PermanentEmployee("Catherine Maria", 20000.0, new String[] {"DA-50","HRA-45"}, new Asset[] {asset2, asset5});
			permanentEmployee5 = new PermanentEmployee("Jobin Nick", 21000.0, new String[] {"DA-50","HRA-50"}, null);

			contractEmployee1 = new ContractEmployee("Rafael N", 70);			
			contractEmployee2 = new ContractEmployee("Ricky Neol", 72.5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Initiating salary calculation...");
		
		try {
			employees = new Employee[] { permanentEmployee1, permanentEmployee2, permanentEmployee3, permanentEmployee4, permanentEmployee5,
					contractEmployee1, contractEmployee2 };
			salaryFactor = new float[] { 3.9f, 2.3f, 4f, 8.1f, 12.5f, 189, 211 };
			
			admin.generateSalarySlip(employees, salaryFactor);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		permanentEmployee5.setSalary(-1);
		
		System.out.println();
		System.out.println("Details of employees");
		System.out.println();
		
		try {
			int pCounter = 1, cCounter = 1;
			for (Employee employee : employees) {
				if (employee instanceof PermanentEmployee) {
					PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
					System.out.println("Details of permanentEmployee"+pCounter++);
					System.out.println("\tEmployee Id: "+permanentEmployee.getEmployeeId());
					System.out.println("\tEmployee Name: "+permanentEmployee.getEmployeeName());
					System.out.println("\tSalary: "+permanentEmployee.getSalary());	
					System.out.println("\tExperience: "+permanentEmployee.getExperience());	
					System.out.print("\tAssets Allocated: ");
					if (permanentEmployee.getAssets() != null) {
						for (Asset asset : permanentEmployee.getAssets()) {
							System.out.print(asset.getAssetId()+" ");
						}
						System.out.println();
					}
					else
						System.out.println("No assets allocated!");
				}
				else {
					System.out.println("Details of contractEmployee"+cCounter++);
					System.out.println("\tEmployee Id: "+employee.getEmployeeId());
					System.out.println("\tEmployee Name: "+employee.getEmployeeName());
					System.out.println("\tSalary: "+employee.getSalary());
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();	
		System.out.println("Reports");
		System.out.println();
		
		try {
			
			employees = new Employee[] { permanentEmployee1, permanentEmployee2, permanentEmployee3, permanentEmployee4,
					contractEmployee1, contractEmployee2 };
			
			int assetCount = admin.generateAssetsReport(employees, "2021-Dec-31");
			if (assetCount >= 0)
				System.out.println("Number of allocated assets expiring on or before 2021-Dec-31: "+assetCount);
			else
				System.out.println("Sorry, report cannot be generated!");
			
			System.out.println();
			
			assetCount = admin.generateAssetsReport(employees, "2020-Sep-30");
			if (assetCount >= 0)
				System.out.println("Number of allocated assets expiring on or before 2020-Sep-30: "+assetCount);
			else
				System.out.println("Sorry, report cannot be generated!");
						
			System.out.println();
			
			
			String[] desktopAssetIds = admin.generateAssetsReport(employees, 'D');

			System.out.println("All the allocated desktop assets");
			for (String assetId : desktopAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
			
			String[] laptopAssetIds = admin.generateAssetsReport(employees, 'L');
			
			System.out.println("All the allocated laptop assets");
			for (String assetId : laptopAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
			
		
			String[] voipAssetIds = admin.generateAssetsReport(employees, 'i');
			
			System.out.println("All the allocated VoIP assets");
			for (String assetId : voipAssetIds) {
				if (assetId != null)
					System.out.println("\t"+assetId);
			}
			
			System.out.println();
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
}

