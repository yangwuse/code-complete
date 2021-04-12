package ch11;

import java.util.Date;

public class VarNameTest {
  public static void main(String[] args) {
    flagVarName();
  }

  //变量名命名原则：完整、准确描述变量代表的事物 容易理解 长度适中 不超过3个单词
  public static void varNameExamples() {
    // 金融相关
    float balance, lastPayment, monthlyTotal, salesTax, newPurchases;
    // 当前日期
    Date currentDate, todaysDate;
    // 把限定词Total Sum Average Max Min...放在最后 前面放最重要的词 提高一致性
    float revenueTotal, expenseTotal, revenueAverage, expenseAverage;
    // 用Count Total替代Num表示总数 用Index替代Num表示具体某个事物
    int customerCount, customerTotal, customerIndex;
    // 使用对仗词
    int first, last;
    int next, previous;
    int source, destination;
    boolean found, notFound;
  }

  // 循环变量命名
  public static void loopVarName() {
    // i, j, k一般用于循环体内 如果变量在循环体外 不使用i, j, k
    int recordCount = 0;
    while (recordCount < 10) {
      recordCount++;
    }

    // 嵌套循环变量命名替换 i, j, k
    int teamCount = 3;
    int[] eventCount = {2, 4, 6};
    int[][] score = new int[teamCount][];

    for (int teamIndex = 0; teamIndex < teamCount; teamIndex++) {
      for (int eventIndex = 0; eventIndex < eventCount[teamIndex]; eventIndex++) {
        score[teamIndex][eventIndex] = 0;
      }
    }

  }



  // 状态变量命名
  public static void flagVarName() {
    // 不用flag 用枚举类型 具名常量
    // 不好的命名
    int flag , statusFlag, printFlag; // 不完整不清楚
    flag = 0x1; // 0x1不清楚
    statusFlag = 0x80; // 0x80不清楚
    printFlag = 16; // 16不清楚
    if ( flag != 0 ) {} // flag不清楚
    if ( (statusFlag & 0x0F) != 0) {} // 0x0F不清楚 表达式不清楚
    if ( printFlag == 16 ) {} // 16不清楚

    // 好的命名
    // 全局变零替代数字
    final int LETTER = 0x01;
    final int DIGIT = 0x02;
    final int PUNTCTUATION = 0x04;
    final int CONTROL_CHAR = 0x80;


    boolean dataReady = true;
    int charType = CONTROL_CHAR; // 使用全局变量
    ReportTypeEnum reportType = ReportTypeEnum.ANNUAL; // 使用枚举
    ReportTypeEnum r1 = ReportTypeEnum.DAILY;
    System.out.println(r1);
  }

  // 枚举类型替代没有含义的数字
  enum ReportTypeEnum {
    DAILY,
    MONTHLY,
    QUARTERLY,
    ANNUAL,
    ALL
  }

  // 临时变零命名
  public static void tempVarName() {
    // 禁用temp temp一般不能清楚表达到底是什么样的临时变量
    double temp = Math.sqrt(5*5);
    // 用真正的变量名替代temp
    double sideLen = Math.sqrt(5*5);
  }

  // 布尔变量命名
  public static void booleanVarName() {
    // 布尔变量最佳示例
    boolean done;
    boolean error;
    boolean success;
    boolean ok;
    // 用更具体的名字替代success 表达到底什么算是成功
    boolean processingComplete; // 替代success 表示完成代表成功
    boolean found; // 替代success 表示找到代表成功

    // 不用status 替换成error statusOk statusComplete
  }

  // 为枚举类型命名
  // 枚举类名加Enum后缀 成员全部大写
  enum ColorEnum {
    RED,
    GREEN,
    BLUE
  }

  enum MonthEnum {
    JANUARY,
    //...
    DECEMBER
  }

  enum WeekdayEnum {
    MONDAY,
    // ...
    SUNDAY
  }


}
