
import jop.Parser;
//Download JOParser2.0 from here https://goo.gl/4SFCpR
//
/**
 *
 * @author Ishan
 */
public class CreateXMLForObject {

    public static void main(String[] args) {
        try {
            String xml = "<object class=\"Customer\"><param><name>idCustomer</name><object class=\"java.lang.Integer\">100</object></param><param><name>firstname</name><object class=\"java.lang.String\">ABCD</object></param><param><name>lastname</name><object class=\"java.lang.String\">QWER</object></param></object>";
            Customer cust = (Customer) Parser.getParser().createObjectForXML(xml);
            System.out.println(cust.getIdCustomer() + " " + cust.getFirstname() + " " + cust.getLastname());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
