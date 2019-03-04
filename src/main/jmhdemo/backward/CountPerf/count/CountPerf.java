package backward.CountPerf.count;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class CountPerf {
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void count(){
        for(int i=1_000_000;i>0;i--){

        }
    }
}
