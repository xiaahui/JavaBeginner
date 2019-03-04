package forward.CountPerf.count;
//ref:https://yq.aliyun.com/articles/341539

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
public class CountPerf {
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void count(){
        for(int i=0;i<1_000_000;i++){

        }
    }
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void count(){
//        for(int i=1_000_000;i>0;i--){
//
//        }
//    }
}
