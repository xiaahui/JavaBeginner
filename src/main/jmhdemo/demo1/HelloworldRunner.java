package demo1;

import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.Runner;
public class HelloworldRunner {
    public static void  main(String[] args) throws RunnerException{
        Options opt = new OptionsBuilder()
                .include("Perf")
                .exclude("Helloworld")
                .warmupIterations(10)
                .measurementIterations(10)
                .forks(3)
                .build();
        new Runner(opt).run();
    }
}
