public String conCat(String a, String b) {
    if (a.equals("")) return b;
    if (b.equals("")) return a;
    if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) return a.substring(0, a.length()) + b.substring(1, b.length());
    return a + b;
  }
  