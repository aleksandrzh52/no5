public class lesson {

    public static void main(String[] args) {
        String str = "Ив@н Кирилл Ан@стасия Матвей Семен В@лерий Людмила Эдуард Филлип Алекс@ндр Петр Вячесл@в Ян";
        str = str.replace('@', 'а');
        String[] strName = str.split(" ");
        String list1 = "", list2 = "", list3 = "";
        strList strlist = new strList();
        strlist.strForList(list1, list2, list3, strName);
    }
}

class strList {
    public void strForList(String list1, String list2, String list3, String[] strName) {
        for (int i = 0; i < strName.length; i++) {
            if (strName[i].length() <= 4) {
                list1 += " " + strName[i];
            } else if (strName[i].length() >= 5 && strName[i].length() <= 7) {
                list2 += " " + strName[i];
            } else if (strName[i].length() >= 8) {
                list3 += " " + strName[i];
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
