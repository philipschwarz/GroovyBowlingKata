/*
 * Philip Schwarz 2011.07.12
 */

package bowling

class GameTest extends GroovyTestCase
{
    public void test_all_ones()
    {
        assertEquals( 20, new Game([1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1        ]).score())
    }

    public void test_all_gutters()
    {
        assertEquals(0,   new Game([0,0,  0,0,  0,0,  0,0,  0,0,  0,0,  0,0,  0,0,  0,0,  0,0        ]).score())
    }

    public void test_strike_in_9th_frame()
    {
        assertEquals(30,  new Game([1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  10,   1,1        ]).score() )
    }

    public void test_strike_in_last_frame()
    {
        assertEquals(30,  new Game([1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  10,1,1    ]).score())
    }

    public void test_spare_in_9th_frame()
    {
        assertEquals(29,  new Game([1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  5,5,  1,1        ]).score())
    }

    public void test_spare_in_last_frame()
    {
        assertEquals(29,  new Game([1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  1,1,  5,5,1        ]).score())
    }

    public void test_spare_in_3rd_frame_and_strike_in_6th_frame()
    {
        assertEquals(39,  new Game([1,1,  1,1,  5,5,  1,1,  1,1,  10,   1,1,  1,1,  1,1,  1,1        ]).score())
    }

    public void test_all_spares()
    {
        assertEquals(150, new Game([5,5,  5,5,  5,5,  5,5,  5,5,  5,5,  5,5,  5,5,  5,5,  5,5,5        ]).score())
    }

    public void test_all_strikes()
    {
        assertEquals(300, new Game([10,   10,   10,   10,   10,   10,   10,   10,   10,   10,10,10    ]).score())
    }
}