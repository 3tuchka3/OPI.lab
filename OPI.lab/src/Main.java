import domain.HeapSort;
import domain.MassData;
import domain.TelephoneConversations;
import domain.Utility;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import static domain.QuickSort.quickSort;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("При выполнении задания своего варианта нужно вписать номер и название своего варианта, а также свои имя и фамилию.");
        System.out.println("Laboratory work #8. GIT");
        System.out.println("Variant #9. Telephone conversations");
        System.out.println("Author: Smirnov Vadim");
        List<TelephoneConversations> telephoneConversationsList = MassData.massData();
        System.out.println();
        System.out.println("Телефонные разговоры");
        if (telephoneConversationsList != null) {
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                System.out.println(telephoneConversations);

            }
            System.out.println();
            System.out.println("телефонные разговоры на мобильные телефоны");
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                if (telephoneConversations.getRate().equals("мобильный")) {
                    System.out.println(telephoneConversations);
                }
            }
            System.out.println();
            System.out.println("телефонные разговоры в ноябре 2021 года");
            for (TelephoneConversations telephoneConversations : telephoneConversationsList
            ) {
                if (telephoneConversations.getDate().getMonth().getValue() == 11 && telephoneConversations.getDate().getYear() == 2021) {
                    System.out.println(telephoneConversations);
                }

            }
        }
        System.out.println("------------------------------------------------------");
        assert telephoneConversationsList != null;
        quickSort(telephoneConversationsList, telephoneConversationsList.indexOf(telephoneConversationsList.get(0)), telephoneConversationsList.size() - 1);
        System.out.println();
        System.out.println("Быстрая сортировка по возрастанию номера телефона");
        for (TelephoneConversations telephoneConversations : telephoneConversationsList
        ) {
            System.out.println(telephoneConversations);

        }
        System.out.println();
        System.out.println("------------------------------------------------------");


        HeapSort.heapSort(telephoneConversationsList);
        System.out.println();
        System.out.println("Пирамидальная сортировка по убыванию продолжительности разговора");
        Collections.reverse(telephoneConversationsList);
        for (TelephoneConversations telephoneConversations : telephoneConversationsList
        ) {
            System.out.println(telephoneConversations);

        }


        Utility.averagePriceSecond(telephoneConversationsList);

    }
}
