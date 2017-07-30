package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass650 {

    @Ignore    private SampleClass651 sampleClass;

    public SampleClass650(){
        sampleClass = new SampleClass651();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}