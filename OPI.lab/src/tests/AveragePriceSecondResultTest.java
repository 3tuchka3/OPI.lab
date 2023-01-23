package tests;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import domain.TelephoneConversations;
import domain.Utility;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AveragePriceSecondResultTest {
    List<TelephoneConversations> telephoneConversationsListTest;

    public AveragePriceSecondResultTest() {
    }

    @BeforeEach
    public void init() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.telephoneConversationsListTest = new ArrayList();
        Arrays.stream(Utility.conversationStrings).map((conversationStrings) -> {
            return conversationStrings.split("\\s+");
        }).forEach((conversationStringsData) -> {
            TelephoneConversations telephoneConversations = new TelephoneConversations();
            telephoneConversations.setNumber(conversationStringsData[0]);
            telephoneConversations.setDate(LocalDate.from(timeFormatter.parse(conversationStringsData[1])));
            telephoneConversations.setTime(LocalTime.parse(conversationStringsData[2]));
            telephoneConversations.setDuration(LocalTime.parse(conversationStringsData[3]));
            telephoneConversations.setRate(conversationStringsData[4]);
            telephoneConversations.setPrice(Double.parseDouble(conversationStringsData[5]));
            this.telephoneConversationsListTest.add(telephoneConversations);
        });
    }

    @AfterEach
    public void clear() {
        this.telephoneConversationsListTest.clear();
    }

    @Test
    public void averagePriceSecondTest() {
        Assertions.assertEquals(0.0014068147415896945, Utility.averagePriceSecond(this.telephoneConversationsListTest));
    }

    @Test
    public void averagePriceSecondTestNotAveragePriceSecondTest() {
        Assertions.assertNotEquals(0.0, Utility.averagePriceSecond(this.telephoneConversationsListTest));
    }

    @Test
    public void bestTimeNull() {
        Assertions.assertEquals("+375332341234", AveragePriceSecondResultTest.this.telephoneConversationsListTest.get(0).getNumber());
    }
}
