public String comboString(String a, String b) {
    String longString = "";
    String shortString = "";
    if (a.length() > b.length()) {
      longString = a;
      shortString = b;
    }
    else {
      shortString = a;
      longString = b;
    }
    return shortString + longString + shortString;
  }
  