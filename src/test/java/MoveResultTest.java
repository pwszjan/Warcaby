//Test Wyniku Ruchu 
@Test
public void testMoveResult() {
    MoveResult result = new MoveResult(MoveType.NORMAL);
    assertEquals(MoveType.NORMAL, result.getType());
}
