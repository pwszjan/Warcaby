//Test Sprawdzania Typu Ruchu
@Test
public void testCheckMoveType() {
    assertEquals(MoveType.NONE, MoveType.valueOf("NONE"));
    assertEquals(MoveType.NORMAL, MoveType.valueOf("NORMAL"));
    assertEquals(MoveType.KILL, MoveType.valueOf("KILL"));
}
