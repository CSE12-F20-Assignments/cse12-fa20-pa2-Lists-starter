package cse12pa2student;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class TestLists {

	public static Collection<Object[]> LISTNUMS =
			Arrays.asList(new Object[][] { {"Linked"}, {"Array"} });
	private String listType;

	public TestLists(String listType) {
		super();
		this.listType = listType;
	}

	@Parameterized.Parameters(name = "{0}List")
	public static Collection<Object[]> bags() {
		return LISTNUMS;
	}

	private StringList makeList(String[] contents) {
		switch(this.listType) {
		case "Linked": return new LinkedSL(contents);
		case "Array": return new ArraySL(contents);
		}
		return null;
	}

  // Don't change code above this line, it ensures the autograder works as
  // expected


  // This is a sample test; you can keep it, change it, or remove it as you like.
  // Note that it uses the method `assertArrayEquals`, which you should use to
  // test equality of arrays in this PA.
	@Test
	public void testSimpleToArray() {
		String[] input = {"a", "b", "c"};
		StringList s = makeList(input);
		assertArrayEquals(input, s.toArray());
	}

}
