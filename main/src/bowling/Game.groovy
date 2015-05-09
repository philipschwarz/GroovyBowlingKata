/*
 * Philip Schwarz 2011.07.12
 */

package bowling

class Game
{
    public Game(rolls)
    {
        frameSequence = new FrameSequence(NUMBER_OF_ROLLS_IN_A_GAME)
        frameSequence.populateWith(rolls)
    }

    public score(){ frameSequence.score() }

    private frameSequence
    private static final NUMBER_OF_ROLLS_IN_A_GAME = 10
}