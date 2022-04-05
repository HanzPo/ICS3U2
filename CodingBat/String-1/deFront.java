public String deFront(String str) {    
    if (str.length() > 0) {
      if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
        return str;
      }
      else if (str.charAt(0) == 'a') {
        return str.substring(0, 1) + str.substring(2, str.length());
      }
      else if (str.charAt(1) == 'b') {
        return str.substring (1, str.length());
      }
      else {
        return str.substring(2, str.length());
      }
    }
    return str;
  }
  