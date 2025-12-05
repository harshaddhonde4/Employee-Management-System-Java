import java.util.*;

class Employee
{
    public int ENo; //Primary key
    public String EName;
    public int EAge;
    public String EAddress;
    public int ESalary;
    
    public static int Counter;

    static 
    {
        Counter = 1;
    }

    public Employee(String B, int C, String D, int E)
    {   
        ENo = Counter++;
        EName = B;
        EAge = C;
        EAddress = D;
        ESalary = E;
    }

    public void Displayinfo()
    {
        System.out.println(ENo + "\t" + EName + "\t" + EAddress + "\t\t" + EAge + "\t" + ESalary);
    }
}

class MarvellousDBMS
{
    public LinkedList <Employee>lobj;

    public MarvellousDBMS() 
    {
        System.out.println("Marvellous DBMS Started SuccessFully..");
        lobj = new LinkedList<Employee>();
    }

    protected void finalize()
    {
        System.out.println("Deallocating All the Resources of Marvellous DBMS");
        lobj.clear();
        lobj = null;
    }

    // insert into employee values(1, "Piyush", 34, "Pune", 11000);
    public void InsertIntoTable(String name, int age, String Address, int salary)
    {
        Employee eobj = new Employee(name, age, Address, salary);
        lobj.addLast(eobj);
        System.out.println("Record Inserted SuccessFully");
    }

    //select * from Employee
    public void SelectStarFrom()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("No\t Name \t Address \t Age \t Salary");
        System.out.println("---------------------------------------------------------");

        for(Employee eref : lobj)
        {
            eref.Displayinfo();
        }
        System.out.println("---------------------------------------------------------");
    }

    //select * from employee where Eno = 3
    public void SelectSpecific(int id)
    {
        for(Employee eref : lobj)
        {
            if(eref.ENo == id)
            {
                eref.Displayinfo();
                break;
            }
        }
    }

    //select 8 from Employee where Employee EName = "Amit"
    public void SelectSpecific(String str)
    {
        for(Employee eref : lobj)
        {
            if(str.equals(eref.EName))
            {
                eref.Displayinfo();
                break;
            }
        }
    }

    //delete from Employee where Eno = 2
    public void DeleteData(int iNo)
    {   
        boolean bFlag = false;
        int index = 0;

        for(Employee eref : lobj)
        {
            if(eref.ENo == iNo)
            {
                bFlag = true;
                break;
            }
            index++;
        }

        if(bFlag == true)
        {
            lobj.remove(index);
            System.out.println("Record Deleted Successfully");
        }
        else
        {
            System.out.println("Unable to Remove Element as there is no such element in the Database");
        }
    }

    //delete from employee where EName = "Sagar"
    public void DeleteData(String str)
    {   
        boolean bFlag = false;
        int index = 0;

        for(Employee eref : lobj)
        {
            if(str.equals(eref.EName))
            {   
                bFlag = true;
                break;
            }
            index++;
        }

        if(bFlag == true)
        {
            lobj.remove(index);
            System.out.println("Record Deleted Successfully");
        }
        else
        {
            System.out.println("Unable to Remove Element as there is no such element in the Database");
        }
    }

    //select Count(ENo) from Employee
    public void AggregateCount()
    {
        System.out.println("The Number of Records in the Employee Table : " + lobj.size());
    }

    //select Count(ESalary) from Employee
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Summation of Records in the Employee Table : " + iSum);
    }

    //select Avg(ESalary) from Employee
    public void AggregateAvg()
    {
        int iSum = 0;
        int iSize = lobj.size();

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Average Summation of Records in the Employee Table : " + (iSum/iSize));
    }

    //select max(ESalary) from Employee
    public void AggregateMax()
    {
        int iMax = lobj.get(0).ESalary;
        for(Employee eref : lobj)
        {
            if(iMax < eref.ESalary)
            {
                iMax = eref.ESalary;
            }
        }

        System.out.println("The Maximum Salary is : " + iMax);
    }

    //select min(ESalary) from Employee
    public void AggregateMin()
    {
        int iMin = lobj.get(0).ESalary;
        for(Employee eref : lobj)
        {
            if(iMin > eref.ESalary)
            {
                iMin = eref.ESalary;
            }
        }

        System.out.println("The Minimum Salary is : " + iMin);
    }

    //update employee set Address = "sangli" where Eno = 3
    public void UpdateRecord(int iNo, String address)
    {       
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.ENo == iNo)
            {       
                eref.EAddress = address;
                bFlag = true;
                break;
            }
        }
        if(bFlag == true)
        {
             System.out.println("Record Updated Successfully");
        }
        else
        {
             System.out.println("Record Not Found");
        }
    }
}

class EmployeeManagementSystem
{
    public static void main(String Arg[])
    {   
        String Name = "", Address = "";
        System.out.println("Welcome to Marvellous DBMS");
        Scanner sobj = new Scanner(System.in);
        MarvellousDBMS mobj = new MarvellousDBMS();
        int iOption = 0, iAge = 0, iSalary = 0, iId = 0;

        while(true) 
        {   
            System.out.println("--------------------------------------------------------");
            System.out.println("Please, Select Your Option Based on Your Requirement");

            System.out.println("1 : Insert New Record into the Table");
            System.out.println("2 : Display All Recors from the Table");
            System.out.println("3 : Display Specific Record from the Table with ID");
            System.out.println("4 : Display Specific Record from the Table with Name");
            System.out.println("5 : Delete Record from the Table with Name");
            System.out.println("6 : Count Number of Records from the Table");
            System.out.println("7 : Summation of All Records Salary");
            System.out.println("8 : Average of All Records Salary");
            System.out.println("9 : Maximum of All Records Salary");
            System.out.println("10 : Minimum of All Records Salary");
            System.out.println("11 : Update the Existing Record");
            System.out.println("12 : Delete the Table");
            System.out.println("13 : Terminate the Marvellous DBMS");

            System.out.println("--------------------------------------------------------");
            iOption = sobj.nextInt();

            if (iOption == 1) 
            {
                System.out.println("Enter the Name of the Employee :"); 
                Name = sobj.next();
                
                System.out.println("Enter the Age of the Employee :");
                iAge = sobj.nextInt();

                System.out.println("Enter the Salary of the Employee :");
                iSalary = sobj.nextInt();

                System.out.println("Enter the Address of the Employee :");
                Address = sobj.next();

                mobj.InsertIntoTable(Name, iAge, Address, iSalary);
            }
            else if (iOption == 2) 
            {
                mobj.SelectStarFrom();
            }
            else if (iOption == 3) 
            {
                System.out.println("Enter the Employee ID :");
                iId = sobj.nextInt();

                mobj.SelectSpecific(iId);
            }
            else if (iOption == 4) 
            {
                System.out.println("Enter the Employee Name :");
                Name = sobj.next();

                mobj.SelectSpecific(Name);
            }
            else if (iOption == 5) 
            {
                System.out.println("Enter the Name of the Employee that You Want to Delete :");
                Name = sobj.next();

                mobj.DeleteData(Name);
            }
            else if (iOption == 6) 
            {
                mobj.AggregateCount();
            }
            else if (iOption == 7) 
            {
                mobj.AggregateSum();
            }
            else if (iOption == 8) 
            {
                mobj.AggregateAvg();    
            }
            else if (iOption == 9) 
            {
                mobj.AggregateMax();   
            }
            else if (iOption == 10) 
            {
                mobj.AggregateMin();
            }
            else if (iOption == 11) 
            {
                System.out.println("Enter the Employee ID :");
                iId = sobj.nextInt();

                System.out.println("Enter the Updated Address :");
                Address = sobj.next();

                mobj.UpdateRecord(iId, Address);
            }
            else if (iOption == 12) 
            {
                mobj = null;
                System.gc();
                System.out.println("DataBase Deleted SuccesFully");
            }
            else if (iOption == 13) 
            {
                System.out.println("Thank You For Using Marvellous DBMS:)");
                break;
            }
            else
            {
                System.out.println("Please, Enter a Valid Option:(");
            }
        }
    }
}