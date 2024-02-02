package StringClassAndPrinting;
//Find if the email id is on gmail
//Find username and domain name form email
public class GmailProgram {
    public static void main(String[] args) {
        String str ="programmer@gmail.com";

        int i=str.indexOf("@");
        String userName=str.substring(0,i);
        String domainName=str.substring(i+1,str.length());

        System.out.println("UserName : "+userName);
        System.out.println("DomainName : "+domainName);
        System.out.println(domainName.startsWith("gmail"));
        
        int j=domainName.indexOf(".");
        String name = domainName.substring(0,j);
        System.out.println(name.equals("gmail"));
    }  
}
