public class UCUlist implements ListExample{
    private Client cliend;
    String s1 = "";
    public void begining(String s1) {
    if(cliend.isUniversity()){
        s1 += "SLAVA ISUSY KRISTY!";
    }
    s1 +="Mr." + cliend.getName() + ".";

    System.out.println(s1);
    }
}
