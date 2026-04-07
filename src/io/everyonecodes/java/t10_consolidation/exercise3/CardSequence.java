package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class CardSequence {
    private final List<Card> listOfCards;


    public boolean isValid() {
        return IntStream.range(0, listOfCards.size() - 1)
                .allMatch(i -> {
                    return listOfCards.get(i).getColor() == listOfCards.get(i + 1).getColor() || listOfCards.get(i).getNumber() == listOfCards.get(i + 1).getNumber();
                });
    }

    public int countCardOccurences(Card card) {
        return (int) listOfCards.stream()
                .filter(e -> e.equals(card))
                .count();
    }

    public CardSequence(List<Card> listOfCards) {
        this.listOfCards = listOfCards;
    }

    public List<Card> getListOfCards() {
        return listOfCards;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CardSequence that = (CardSequence) o;
        return Objects.equals(listOfCards, that.listOfCards);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listOfCards);
    }

    @Override
    public String toString() {
        return "CardSequence{" +
                "listOfCards=" + listOfCards +
                '}';
    }
}