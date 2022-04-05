public String atFirst(String str) {
    if (str.length() == 0) {
      return "@@";
    }
    if (str.length() == 1) {
      return str.substring(0, 1) + "@";
    }
    return str.substring(0, 2);
  }
  