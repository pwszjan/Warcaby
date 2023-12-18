//Test Ustawiania Figury na Polu
@Test
public void testSetPieceOnTile() {
    Tile tile = new Tile(false, 0, 0);
    Piece piece = new Piece(PieceType.REGULAR, Color.RED);
    tile.setPiece(piece);
    assertEquals(piece, tile.getPiece());
}

//Test Usuwania Figury z Pola 
@Test
public void testRemovePieceFromTile() {
    Tile tile = new Tile(false, 0, 0);
    Piece piece = new Piece(PieceType.REGULAR, Color.RED);
    tile.setPiece(piece);
    tile.removePiece();
    assertNull(tile.getPiece());
}

//Test Tworzenia Pola
@Test
public void testCreateTile() {
    Tile tile = new Tile(false, 1, 1);
    assertFalse(tile.isOccupied());
    assertEquals(1, tile.getX());
    assertEquals(1, tile.getY());
}