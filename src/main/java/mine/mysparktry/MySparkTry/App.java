package mine.mysparktry.MySparkTry;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("main: Hello World!");

        SparkConf conf = new SparkConf().setAppName("mySparkApp").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        // SparkTryMain sparkTryMain = new SparkTryMain(new JavaSparkContext(conf));
        // sparkTryMain.sparkTryTest();

        // Spark Start
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        JavaRDD<Integer> distData = sc.parallelize(data);
        int sum = distData.reduce((a, b) -> a + b).intValue();
        // distData.saveAsTextFile("MySparkTry.txt");

        JavaRDD<String> textFile = sc.textFile("hs_err_pid2280.log");
        String str = textFile.first();
        int sumLen = textFile.map(s -> s.length()).reduce((a, b) -> a + b);
    }
}