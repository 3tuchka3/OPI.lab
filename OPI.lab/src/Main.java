
import domain.MassData;
import domain.TelephoneConversations;


import java.io.FileNotFoundException;

import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("При выполнении задания своего варианта нужно вписать номер и название своего варианта, а также свои имя и фамилию.");
        System.out.println("Laboratory work #8. GIT");
        System.out.println("Variant #9. Telephone conversations");
        System.out.println("Author: Smirnov Vadim");
        List<TelephoneConversations> telephoneConversationsList = MassData.massData();
        if (telephoneConversationsList != null) {
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                System.out.println(telephoneConversations);

            }
            System.out.println();
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                if (telephoneConversations.getRate().equals("мобильный")) {
                    System.out.println(telephoneConversations);
                }
            }
            System.out.println();
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                if (telephoneConversations.getDate().getMonth().getValue() == 11 && telephoneConversations.getDate().getYear() == 2021) {
                    System.out.println(telephoneConversations);
                }

            }
        }
        System.out.println("------------------------------------------------------");
        assert telephoneConversationsList != null;
//      ------------------------------------------------------------------------------------

    }
}
