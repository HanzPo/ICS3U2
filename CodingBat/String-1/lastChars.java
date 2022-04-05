public String lastChars(String a, String b) {
    String a_new = a;
    String b_new = b;
    if (a_new == "") {
      a_new = "@";
    }
    if (b_new == "") {
      b_new = "@";
    }
    
    return a_new.substring(0, 1) + b_new.substring(b_new.length() - 1, b_new.length());
  }
  