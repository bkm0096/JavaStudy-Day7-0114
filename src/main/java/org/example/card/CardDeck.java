package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

// CardDeck은 싱글톤 패턴을 적용한 열거형(enum) 클래스
public enum CardDeck {

    // 싱글톤 인스턴스 선언
    INSTANCE;

    // 카드 목록을 저장할 ArrayList 객체 선언
    private ArrayList<Card> cards;

    // CardDeck 생성자
    private CardDeck(){
        // 새 ArrayList 객체 생성
        this.cards = new ArrayList<>();

        // 1부터 48까지의 카드 번호를 생성하여 CardPattern.CLO 패턴을 가진 카드로 추가
        for (int i = 1; i <= 48; i++) {
            // 각 카드 번호에 대해 CLO 패턴을 가진 카드 객체 생성 후 리스트에 추가
            cards.add(new Card(CardPattern.CLO, i));
        }

        // 카드를 랜덤하게 섞음
        Collections.shuffle(cards);
    }

    // 카드를 하나 뽑는 메서드
    public Card getOne(){
        // 카드 목록에서 첫 번째 카드 하나를 꺼내고 리스트에서 제거
        Card card = cards.remove(0);
        // 꺼낸 카드를 반환
        return card;
    }

}