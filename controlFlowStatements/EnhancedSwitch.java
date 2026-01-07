package controlFlowStatements;

public class EnhancedSwitch {
  // Enhanced Switch Expression -> Enhanced Switch is an Expression
  // meaning it the expression resolves to a single value

  static void main() {
    System.out.println("MONTH APRIL FIT INTO " +
        getQuarter("APRIL") + " QUARTER");
    System.out.println(getQuarter("MONTH MARCH FIT INTO " +
        getQuarter("MARCH", 3) + " QUARTER"));
    System.out.println("MONTH AUGUST FIT INTO " +
        getQuarter("AUGUST", 8, "Name or Number is invalid.") + " QUARTER");
    System.out.println("INVALID MONTH NUMBER TEST: " +
        getQuarter("MARCH", 13, "INVALID MONTH NUMBER PROVIDED")
        );
    System.out.println("INVALID MONTH NAME TEST: " +
        getQuarter("XYZ", 8, "INVALID MONTH NAME PROVIDED")
    );
  }

  // Traditional Switch Statement
  static String getQuarter(String month) {
    switch (month) {
      case "JANUARY":
      case "FEBRUARY":
      case "MARCH":
        return "1st";
      case "APRIL":
      case "MAY":
      case "JUNE":
        return "2nd";
      case "JULY":
      case "AUGUST":
      case "SEPTEMBER":
        return "3rd";
      case "OCTOBER":
      case "NOVEMBER":
      case "DECEMBER":
        return "4th";
    }
    return "error";
  }

  // Enhanced Switch Expression
  static String getQuarter (String month, int number) {
    if (!(number >= 1 && number <= 12)) {
      System.out.println("Not a valid month number");
      return "error";
    }
    return switch (month) {
      case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
      case "APRIL", "MAY", "JUNE" -> "2nd";
      case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
      case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
      default -> "error";
    };
  }

  // Enhanced Switch with YIELD given explicitly in default section
  static String getQuarter (String month, int number, String errMsg) {
    if ((errMsg.isEmpty())) {
      System.out.println("Provide valid error message");
      return "error";
    }
    if (!(number >= 1 && number <= 12)) {
      System.out.println("Not a valid month number");
      return "error";
    }

    return switch(month) {
      case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
      case "APRIL", "MAY", "JUNE" -> "2nd";
      case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
      case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
      default -> {
        System.out.println("Not a valid month name");
        yield "Provided error message: " + errMsg;
      }
    };
  }
}
