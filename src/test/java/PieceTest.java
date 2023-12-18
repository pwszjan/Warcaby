//Test Tworzenia Figury
@Test
public void testPieceCreation() {
    Piece piece = new Piece(PieceType.REGULAR, Color.RED);
    assertNotNull(piece);
    assertEquals(PieceType.REGULAR, piece.getType());
    assertEquals(Color.RED, piece.getColor());
}

//Test Ruchu Figury
@Test
public void testPieceMove() {
    Piece piece = new Piece(PieceType.REGULAR, Color.RED);
    Tile startTile = new Tile(false, 0, 0);
    Tile endTile = new Tile(false, 1, 1);
    startTile.setPiece(piece);

    piece.move(endTile);
    assertNull(startTile.getPiece());
    assertEquals(piece, endTile.getPiece());
}

//Test Promocji Pionka na Damkę
@Test
public void testPromoteToKing() {
    Piece piece = new Piece(PieceType.REGULAR, Color.RED);
    piece.promoteToKing();
    assertEquals(PieceType.KING, piece.getType());
}

//Test Sprawdzania Koloru Pionka
@Test
public void testCheckPieceColor() {
    Piece piece = new Piece(PieceType.REGULAR, Color.WHITE);
    assertEquals(Color.WHITE, piece.getColor());
}