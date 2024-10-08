public class SmsContactInfo implements ContactInfo {
    private String phoneNumber;
    public SmsContactInfo(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending SMS to " + phoneNumber);
    }
}
