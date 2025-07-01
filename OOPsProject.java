package Final;
import java.io.*;
import java.util.Scanner;

abstract class bg_method{
    public abstract boolean Aplus();
    public abstract boolean Aminus();
    public abstract boolean ABplus();
    public abstract boolean ABminus();
    public abstract boolean Bplus();
    public abstract boolean Bminus();
    public abstract boolean Oplus();

} class UserData extends bg_method
{
    private String Name;
    public String BloodGroup;
    public String City;

   public String MobileNumber;
    public String Pincode;
    private int Age;
    public String getName() {
        return Name;
    }
    public String getBloodGroup() {
        return BloodGroup;
    }
    public String getCity() {
        return City;
    }
    public String getMobileNumber() {
        return MobileNumber;
    }
    public String getPincode() {
        return Pincode;
    }
    public int getAge() {
        return Age;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }
    public void setCity(String city) {
        City = city;
    }
    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }
    public void setPincode(String pincode) {
        Pincode = pincode;
    }
    public void setAge(int age) {
        Age = age;
    }

    @Override
    public boolean Aplus() {
        return false;
    }

    @Override
    public boolean Aminus() {
        return false;
    }

    @Override
    public boolean ABplus() {
        return false;
    }

    @Override
    public boolean ABminus() {
        return false;
    }

    @Override
    public boolean Bplus() {
        return false;
    }

    @Override
    public boolean Bminus() {
        return false;
    }

    @Override
    public boolean Oplus() {
        return false;
    }
}
class Allmethod extends UserData{
    String src_bg;
    String src_pc;
    public static int count = 0;
    Allmethod(String src_bg, String src_pc ){
        this.src_bg = src_bg;
        this.src_pc = src_pc;
    }
    public boolean Aplus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");

                if ((s[2].equals("A+")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean Aminus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");

                if ((s[2].equals("A-")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean Oplus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
                if ((s[2].equals("O+")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public Boolean Ominus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
//                if (src_bg.equals("O-"))
//                {
                if ((s[2].equals("O-")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }

                // }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean ABplus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
//                if (src_bg.equals("AB+"))
//                {
                if ((s[2].equals("AB+")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }

                //}
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean ABminus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
                //if (src_bg.equals("AB-"))
                //{
                if ((s[2].equals("AB-")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }

                //}
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean Bplus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
                //  if (src_bg.equals("B+"))
                //{
                if ((s[2].equals("B+")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }

                // }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
    public boolean Bminus(){
        try(BufferedReader read = new BufferedReader(new FileReader("lab123.csv")))
        {

            String line;
            while ((line = read.readLine()) != null)
            {
                String[] s = line.split(",");
                //if (src_bg.equals("B-"))
                //  {
                if ((s[2].equals("B-")) && s[4].equals(src_pc))
                {
                    count = 1;
                    for (String sc : s)
                    {
                        System.out.print(sc + "\t");
                    }
                    System.out.println();
                }

                //}
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return count==1;
    }
}

class Check_BG extends UserData {
    //Scanner sc = new Scanner(System.in);
    String bg;
    Check_BG(String bg){
        this.bg = bg;
    }
    public boolean check(){
        if (bg.equals("A+") || bg.equals("A-") ||bg.equals("B+") || bg.equals("B-") || bg.equals("AB+") || bg.equals("AB-") || bg.equals("O+") || bg.equals("O-"))
        {
            return false;
        }
        else
            System.out.println("Please Enter valid Blood Group");
        return true;
    }
}
public class OOPsProject extends UserData
{
    public static void main(String[] args)
    {
        // here start variable for taking input 1 or 2 or 3 from user
        int Start;
        int Start1 = 0;

        // Scanner class's Object for taking input from user
        Scanner input = new Scanner(System.in);

        System.out.println("****************************************************************" +
                "\n#*#" + "                                                          " + "#*#" +
                "\n#*#" + "                                                          " + "#*#" +
                "\n#*#" + "                     Hello User                           " + "#*#" +
                "\n#*#" + "                Welcome to Blood Bank.                    " + "#*#" +
                "\n#*#" + "                                                          " + "#*#" +
                "\n#*#" + "                                                          " + "#*#");
        System.out.println("****************************************************************");

        while(true)
        {
            System.out.println("Enter 1 For Donate Blood \nEnter 2 For Purchase Blood \nEnter 3 For Exit");
            Start = input.nextInt();
            if(Start==1 || Start==2 || Start==3)
            {
                // if user enter correct value then loop terminate
                break;
            }
            else
            {
                // if user not enter correct value from, 1,2,or 3 then loop will running
                System.out.println("Please Enter Valid Input");
            }
        } // while end

        // make object of UserData class
        UserData details = new UserData();

        // for start=1 taking input from user
        if(Start==1)
        {
            System.out.print("Enter Your Name :- ");
            input.nextLine(); // this line written because it is string input and in upper line use print function not println

            String name = input.nextLine();   // name of user
            details.setName(name);
            details.getName();

            System.out.print("Enter Your Age :- ");
            int age = input.nextInt();
            details.setAge(age);
         //   details.getAge();
           // details.Age = input.nextInt();


            if (details.getAge() < 18)
            {
                // if user's Age is less than 18 then he/she is not allowed to donate blood

                System.out.println("Sorry..! You can not Donate Blood Because Your Age is < 18\n" +
                        "If You Purchase Blood then Press 2\nPress 3 for Exit");
                Start1 = input.nextInt();
            }

            if(Start1==0) //  If user Age is >= 18 then Start1=0 because we initialize Start1=0
            {
                System.out.println("You Donate Blood in last 3 Month ?? If yes then Press Y else N :- ");
                String ch = input.next();

                if(ch.equalsIgnoreCase("Y"))
                {
                    System.out.println("Sorry..! You donated Blood in last 3 month therfore You can not donate blood now" +
                            "After Sometime You Donate Blood\nIf You Purchase Blood then Press 2\nPress 3 for Exit");
                    Start1 = input.nextInt();
                }

                else if(details.getAge() >= 18 && "N".equalsIgnoreCase(ch))
                {
                    int count = 1;
                    while (true)
                    {
                        System.out.print("Enter Your BloodGroup (A+ , A- , B+ , B- , AB+ , AB- , O+, O-) : ");
                        if (count == 1) input.nextLine();  // this line run only once therefore we use count variable

                        details.BloodGroup = input.nextLine(); // taking input blood group

                        if (details.BloodGroup.equals("A+") || details.BloodGroup.equals("A-") ||
                                details.BloodGroup.equals("B+") || details.BloodGroup.equals("B-") ||
                                details.BloodGroup.equals("AB+") || details.BloodGroup.equals("AB-") ||
                                details.BloodGroup.equals("O+") || details.BloodGroup.equals("O-"))
                        {
                            // if user input bllod group in given formet then loop will break
                            break;
                        }
                        else
                        {
                            // if user not entered valid input
                            System.out.println("Enter Valid Blood Group in Given Foremet");
                            count = 0;  // beacause we can not run line 104 again therfore count=0
                        }
                    }

                    while (true)
                    {
                        System.out.print("Enter Your Mobile Number :- ");
                        details.MobileNumber = input.nextLine();
                        if (details.MobileNumber.length() != 10)
                        {
                            // if user not enter valid mobile number
                            System.out.println("Please Enter Valid Mobile Number");
                        }
                        else
                        {  // user enter correct mobile number then loop will break
                            break;
                        }
                    }

                    while (true)
                    {
                        System.out.print("Enter Your PinCode Number :- ");
                        details.Pincode = input.nextLine();

                        if (details.Pincode.length() != 6)
                        {  // pincode's digit  is always 6
                            System.out.println("Please Enter Valid PinCode Number");
                        }
                        else
                        {
                            break;
                        }
                    }

                    System.out.print("Enter Your City :- ");
                    details.City = input.nextLine();
// ------------------------------------------------------------
                    File file_name = new File("lab123.csv");
                    boolean isempty =  file_name.length()==0;
                    try (FileWriter n = new FileWriter(file_name, true))  // make csv file in given path
                    {
                        if(isempty)
                        {
                            n.append("Name,Age,BloodGroup,MobileNumber,Pincode,City").append("\n");
                        }
                        n.append(details.getName()).append(",").append(String.valueOf(details.getAge())).append(",")
                                .append(details.BloodGroup).append(",").append(details.MobileNumber).append(",")
                                .append(details.Pincode).append(",").append(details.City).append("\n");
                        // csv file done and store all user data
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally {
                        System.out.println("Thank You..! For Donating Blood\nDonate Blood and Save life ");
                    }

                }
            }

        }

        if((Start == 2) || (Start1 == 2))
        {
            boolean count = true;
            int c = 1;
            while(count){
                System.out.print("Enter Your BloodGroup (A+ , A- , B+ , B- , AB+ , AB- , O+, O-) :");
                if(c==1){
                    input.nextLine();
                    c=0;
                }
                details.BloodGroup = input.nextLine();
                //2System.out.println(details.BloodGroup);
                Check_BG ckbg = new Check_BG(details.BloodGroup);
                count = ckbg.check();
            }
            while (true) {
                System.out.print("Enter Your PinCode Number :- ");
//
                details.Pincode = input.nextLine();
                if (details.Pincode.length() != 6) {
                    System.out.println("Please Enter Valid PinCode Number");
                } else {

                    break;
                }
            }
            Allmethod src = new Allmethod(details.BloodGroup , details.Pincode);
            if(details.BloodGroup.equals("A+"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is A+ , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (A+), (A-) ,(AB+), (AB-) So We Provide You all Person details\n" +
                        "Which All are leaves in your Near-by Area");
                System.out.println("-------------------------------------------------------------------");

                boolean Ap =  src.Aplus();
                boolean Ap2 = src.Aminus();
                boolean Ap3 = src.ABplus();
                boolean Ap4 =  src.ABminus();
                if(Ap==Ap2 && Ap2==Ap3 && Ap3==Ap4 && Ap4==Ap && Ap==false)
                {
                    System.out.println("We Can try to find Person in nearBy Area..\nBut Sorry..!No Doner Available.");
                }
            }
            else if(details.BloodGroup.equals("A-"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is A- , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (A-), (O-) \n So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");
                System.out.println();

                src.Aminus();
                src.Ominus();
            }
            else if(details.BloodGroup.equals("B+"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is B+ , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (B+), (B-) ,(O+), (O-) So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");

                src.Bplus();
                src.Bminus();
                src.Oplus();
                src.Ominus();
            }
            else if(details.BloodGroup.equals("B-"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is B- , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (B-), (O-) So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");

                src.Bminus();
                src.Ominus();
            }
            else if(details.BloodGroup.equals("AB+"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is A+ , So that You can Receive Blood from any Person " +
                        "with any blood Group" + "So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");
                src.Aplus();
                src.Aminus();
                src.Bplus();
                src.Bminus();
                src.ABplus();
                src.ABminus();
                src.Oplus();
                src.Ominus();
            }
            else if(details.BloodGroup.equals("AB-"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is AB- , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (A-), (B-) ,(O-), (AB-) So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");

                src.Aminus();
                src.Bminus();
                src.Ominus();
                src.ABminus();
            }
            else if(details.BloodGroup.equals("O+"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is O+ , So that You can Receive Blood from Person" +
                        "\nwhose Blood is (O+), (O-) So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");

                src.Oplus();
                src.Ominus();
            }
            else if(details.BloodGroup.equals("O-"))
            {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your Blood Group is O- , So that You can Receive Blood from only Person" +
                        "\nwhose Blood is (O-)\n So We Provide You all Person details\n" +
                        "Which All are leavs in your Nearby Area");
                System.out.println("-------------------------------------------------------------------");
                src.Ominus();
            }
        }
        if(Start==3 || Start1==3)
        {
            System.out.println("Thank You..!\nFor Visiting Blood Bank\nHave a Nice Day");
        }
    }
}

