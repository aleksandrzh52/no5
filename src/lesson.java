public class lesson {
//    имеется предложение состоящее из имен, в некоторых из них случайно указанна ошибка
//    вместо буквы А написанно @ требуется это исправить
//    если имя меньше либо равно 4 символам то перенести его в массив list1
//    если имя больше или равно 5 и меньше или равно 7 топеренести его в массив list2,
//    оставшиеся длинные имена перенести в массив list3

    public static void main(String[] args) {
        String str = "Ив@н Кирилл Ан@стасия Матвей Семен В@лерий Людмила Эдуард Филлип Алекс@ндр Петр Вячесл@в Ян";
        str = str.replace('@', 'а');
        String[] strName = str.split(" ");
        String list1 = "", list2 = "", list3 = "";
        strList strlist = new strList();
        strlist.strForList(list1, list1, list1, strName);
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