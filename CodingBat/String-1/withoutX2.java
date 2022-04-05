public String withoutX2(String str) {
    if (str.length() < 1) return "";
    if (str.length() >= 2 && str.substring(0, 2).equals("xx")) {
      return str.substring(2, str.length());
    }
    else if (str.charAt(0) == 'x') {
      return str.substring(1, str.length());
    }
    else if (str.charAt(1) == 'x') {
      return str.substring(0, 1) + str.substring(2, str.length());
    }
    else {
      return str;
    }
  }
  