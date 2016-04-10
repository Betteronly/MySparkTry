package mine.mysparktry.MySparkTry;

import org.apache.spark.api.java.JavaSparkContext;

public class SparkTryMain {

    private JavaSparkContext sc;

    public SparkTryMain() {
        System.out.println("My SparkTryMain start !");
    }

    public SparkTryMain(JavaSparkContext javaSparkContext) {
        System.out.println("My SparkTryMain start !");

        sc = javaSparkContext;
    }

    public void sparkTryTest() {
        System.out.println("My SparkTryMain -> sparkTryTest()  start !");

        // List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        // JavaRDD<Integer> distData = sc.parallelize(data);
        // int sum = distData.reduce((a, b) -> a + b).intValue();
        // distData.saveAsTextFile("MySparkTry.txt");
        //
        // JavaRDD<String> textFile = sc.textFile("license.txt");
        // String str = textFile.first();

    }
}
