# Testowanie i Jakość Oprogramowania

## Autor
Jan Abramowicz

## Temat Projektu
Aplikacja do Gry w Warcaby

## Opis Projektu
Projekt polega na stworzeniu aplikacji do gry w warcaby. Aplikacja umożliwia dwóm graczom rywalizację w klasyczną grę w warcaby na wirtualnej planszy. Zawiera funkcje takie jak różne scenariusze gry, prosty interfejs użytkownika oraz algorytmy odpowiedzialne za przestrzeganie zasad gry.

## Uruchomienie Projektu
Aby uruchomić projekt, należy wykonać następujące kroki:
1. Sklonuj repozytorium projektu na lokalny komputer.
2. Otwórz projekt w środowisku programistycznym wspierającym język Java.
3. Uruchom główną klasę aplikacji.

## Uruchomienie Testów Jednostkowych i Integracyjnych
Testy jednostkowe i integracyjne można uruchomić poprzez:
1. Otwarcie projektu w środowisku programistycznym.
2. Uruchomienie testów za pomocą wbudowanych narzędzi do testowania.

## Scenariusze Testowe dla Testera Manualnego
| Test Case ID | Opis                                  | Kroki testowe                                                                 | Oczekiwany wynik                                               |
|--------------|---------------------------------------|------------------------------------------------------------------------------|----------------------------------------------------------------|
| TC_01        | Test Inicjalizacji Gry                | 1. Uruchom grę.<br>2. Sprawdź czy wszystkie elementy są na swoich miejscach. | Gra się rozpoczyna, wszystkie pionki są ustawione poprawnie.    |
| TC_02        | Test Prostego Ruchu Pionka            | 1. Przesuń pionka o jedno pole do przodu.                                   | Pionek przemieszcza się zgodnie z zasadami gry.                |
| TC_03        | Test Bicia Pionka                     | 1. Ustaw pionki na pozycjach umożliwiających bicie.<br>2. Przesuń pionek, aby wykonać bicie. | Pionek bijący przemieszcza się na odpowiednie pole, pionek zbity jest usuwany z planszy. |
| TC_04        | Test Promocji na Damkę                | 1. Przenieś pionka na ostatni rząd przeciwnika.                             | Pionek zostaje zamieniony na damkę.                           |
| TC_05        | Test Ruchu Damką                      | 1. Wykonaj ruch damką na skos o kilka pól.                                  | Damka przemieszcza się zgodnie z zasadami.                    |
| TC_06        | Test Bicia Wielokrotnego              | 1. Ustaw pionki umożliwiające wielokrotne bicie.<br>2. Przesuń pionek/damkę, aby wykonać serię bić. | Pionek/damka wykonuje bicie wielokrotne, zbijając kilka pionków przeciwnika. |
| TC_07        | Test Zakończenia Gry                  | 1. Doprowadź do sytuacji końcowej na planszy.                               | Gra wykrywa zwycięzcę lub remis i kończy rozgrywkę.            |
| TC_08        | Test Reakcji na Niepoprawne Ruchy     | 1. Próba wykonania niedozwolonego ruchu pionkiem.                           | Gra nie pozwala na wykonanie niedozwolonego ruchu.             |
| TC_09        | Test Interfejsu Użytkownika           | 1. Przetestuj wszystkie przyciski i menu w grze.                            | Wszystkie elementy interfejsu reagują poprawnie.               |
| TC_10        | Test Odporności na Błędy              | 1. Spróbuj wykonać serię nieprawidłowych operacji.                          | Gra pozostaje stabilna i nie zamyka się nieoczekiwanie.        |


## Technologie Użyte w Projekcie
- Język programowania: Java
- Środowisko programistyczne: IntelliJ
- Narzędzia do testowania: IntelliJ

