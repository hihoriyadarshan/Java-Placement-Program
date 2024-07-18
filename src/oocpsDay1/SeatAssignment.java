// Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.

package oocpsDay1;

class SeatAssignment {
    private int row;
    private char letter;

    public SeatAssignment(int row, char letter) {
        this.row = row;
        this.letter = letter;
    }

    @Override
    public String toString() {
        return row + "" + letter;
    }
}