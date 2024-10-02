public class EmailContactInfo implements ContactInfo {
    private String email;
    public EmailContactInfo(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending email to " + email);
    }
}
