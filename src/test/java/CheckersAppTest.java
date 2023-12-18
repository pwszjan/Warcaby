//Test Sprawdzania Stanu Gry
@Test
public void testCheckGameState() {
    CheckersApp app = new CheckersApp();
    app.startGame();
    assertNotNull(app.getBoard());
    // Dodatkowe asercje kiedyś tam
}
