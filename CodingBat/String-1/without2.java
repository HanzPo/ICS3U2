public String without2(String str) {
    return (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())) ? str.substring(2, str.length()) : str);
  }
  