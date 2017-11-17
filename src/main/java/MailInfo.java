public class MailInfo {
    private int mailCode;
    private String begining;
    private Client client;

    public MailInfo(Client client){
        if(client.isUniversity()){
            setMailCode(1);//university list
        }
        if(client.getAge()<6){
            setMailCode(2);//list with cartoons for kids
        }
        if(client.getSex().equals("Female")){
            setMailCode(3);//list about feminism
        }
        if(client.getName().equals("Oles")){
            setMailCode(4);//list of talons
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setMailCode(int mailCode){
        this.mailCode += mailCode;
    }
    public int getMailCode(){
        return this.mailCode;
    }


}
