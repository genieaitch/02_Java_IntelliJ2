import java.util.Scanner;


public class ID찾기1124 {

    static String[][] accounts = {
            {"user1", "한정일", "19800101"},
            {"user2", "차주식", "19900215"},
            {"user3", "오정희", "20001231"}};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("생년월일을 입력하세요(YYYYMMDD) : ");
        String year = sc.next();

        System.out.print("id 값 확인 : ");
        String id = sc.nextLine();

        String foundId = null;
        int index = 0;

        for(String[] account : accounts){
            id = account[0];
            name = account[1];
            year = account[2];

            if(name.equals(name) && year.equals(year) && id.equals(id)){
                foundId = id;
                break;
            }
            index++;
        }
        if(foundId != null){
            System.out.println(foundId);

        }
        sc.close();
    }
}