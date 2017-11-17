public class UCUlist implements ListExample{
    private Client cliend;
    private MailInfo info;
    String s1 = "";
    public void begining(String s1, String s2) {
    if(cliend.isUniversity()){
        s1 += "SLAVA ISUSY KRISTY!";
    }
    s1 +="Mr." + cliend.getName() + ".";
    if(info.getMailCode() == 1){
        s2 += "Rozsilka UCU.";
    }
    if(info.getMailCode() == 2){
        s2 += "TOM I DZHERII, KOLOBOK.";
    }
    if(info.getMailCode() == 3){
        s2 += "Women = Idols";
    }
    if(info.getMailCode() == 4){
        s2 += "OLES PLZ DON`T GIVE ME TALON";
    }
    System.out.println(s1);
    System.out.println(s2);
    }
}
