# 2. 연관관계 매핑 시작
## 기존 문제점
- 앞의 예제에서는 외래 키를 엔티티에 그대로 가져오는 문제가 있었다.
- 따라서 이번 예제에서는 엔티티에서 외래 키로 사용한 필드는 제거하고 참조를 사용하도록 변경하자.

## 수정된 점
- 읻대다, 다대일 연관관계 매핑을 진행했다.
- 연관관계의 주인은 필드 중에 외래 키가 있는 곳이 담당했다.
- 주인의 반대편은 mappedBy로 주인을 지정했다.
- 양방향 연관관계인 두 엔티티의 경우에는 서로 연결하는 메소드가 필요하다.
- 데이터베이스 뿐만 아니라 객체에도 신경쓰기 위함이다.

## 객체 그래프 탐색
- 이제 객체에서 참조를 사용할 수 있다. 
- 객체 그래프를 탐색할 수 있고 JPQL에서도 사용할 수 있다.
- 먼저 주문한 회원을 객체 그래프로 탐색하는 코드다.  
```java
Order order = em.find(Order.class, orderId);
Member member = order.getMember();  // 주문한 회원, 참조 사용
```
- 그 다음 주문한 상품 하나를 객체 그래프로 탐색하는 코드다.  
```java
Order order = em.find(Order.class, orderId);
OrderItem orderItem = order.getOrderItems().get(0);
Item Item = orderItem.getItem();
```

