public String seeColor(String str) {
    if (str.length() < 3) return "";
    if (str.substring(0, 3).equals("red")) return "red";
    if (str.length() < 4) return "";
    if (str.substring(0, 4).equals("blue")) return "blue";
    return "";
  }
  