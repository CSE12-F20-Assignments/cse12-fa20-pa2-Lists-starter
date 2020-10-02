package cse12pa2student;
public interface StringList {
	  String[] toArray();
	  void transformAll(StringTransformer st);
	  void chooseAll(StringChooser sc);
	  boolean isEmpty();
}
