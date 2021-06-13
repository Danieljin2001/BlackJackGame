package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codes.Deck;
import codes.HumanPlayer;

public class PlayerTest {
	private Deck deck;

	@Before
	public void setup() throws Exception{
		this.deck = new Deck(1);
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test_Constructor_Name() {
		String expected = "Test Player";
		HumanPlayer player = new HumanPlayer(deck, expected, 1000);
		String actual = player.getName();
		//(expected, actual)
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Constructor_Money() {
		double expected = 1000;
		HumanPlayer player = new HumanPlayer(deck, "Test name", expected);
		double actual = player.getMoney();
		//(expected, actual, delta)
		assertEquals(expected, actual, 0);
	}
	
	@Test
	//add more to this
	public void test_Setup() {
		HumanPlayer player = new HumanPlayer(deck, "Test name", 1000);
		player.setup();
		int actual = player.getHands().size();
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_clearHands() {
		HumanPlayer player = new HumanPlayer(deck, "Test name", 1000);
		player.setup();
		player.clearHands();
		int actual = player.getHands().size();
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_playOrNo() {
		HumanPlayer player = new HumanPlayer(deck, "Test name", 1000);
		boolean expected1 = false;
		boolean expected2 = true;
		player.playOrNo(expected1);
		boolean actual = player.getPlay();
		assertEquals(expected1, actual);
		player.playOrNo(expected2);
		actual = player.getPlay();
		assertEquals(expected2, actual);		
	}
	
	
}
