//testy integracyjne
//Test Ruchu Z Biciem
@Test
public void testCaptureMove() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    // Ustawienie stanu gry umożliwiającego bicie
    MoveResult result = app.tryMove(/* parametry ruchu z biciem */);
    assertEquals(MoveType.KILL, result.getType());
}

//Test Sprawdzania Stanu Po Ruchu
@Test
public void testBoardStateAfterMove() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    app.tryMove(/* parametry ruchu */);
    // Sprawdzenie stanu planszy po wykonaniu ruchu
}

//Test Wygranej Partii 
@Test
public void testWinningGame() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    // Symulacja gry prowadzącej do wygranej jednego z graczy
    assertEquals(/* oczekiwany zwycięzca */, app.getWinner());
}

//Test Przegranej Partii
@Test
public void testLosingGame() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    // Symulacja gry prowadzącej do przegranej jednego z graczy
    assertEquals(/* oczekiwany przegr

//Test Zmiany Tury Gracza
@Test
public void testPlayerTurnChange() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    Color currentPlayer = app.getCurrentPlayer();
    app.tryMove(/* parametry ruchu */);
    assertNotEquals(currentPlayer, app.getCurrentPlayer());
}

//Test Niepoprawnego Ruchu
@Test
public void testInvalidMove() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    MoveResult result = app.tryMove(/* parametry niepoprawnego ruchu */);
    assertEquals(MoveType.NONE, result.getType());
    // Sprawdzenie, czy stan gry pozostał niezmieniony
}

//Test Reakcji na Sytuację Bez Możliwych Ruchów
@Test
public void testNoPossibleMoves() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    // Ustawienie planszy w stanie bez możliwych ruchów
    assertTrue(app.isNoPossibleMoves());
}

//Test Zapisu i Wczytania Stanu Gry
@Test
public void testSaveAndLoadGame() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    // Przeprowadzenie kilku ruchów
    app.saveGame("gameSave.dat");

    CheckersApp loadedApp = new CheckersApp();
    loadedApp.loadGame("gameSave.dat");
    // Sprawdzenie, czy stan gry został poprawnie wczytany
}