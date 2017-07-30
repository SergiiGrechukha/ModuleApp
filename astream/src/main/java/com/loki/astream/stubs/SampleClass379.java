package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass379 {

    @Ignore    private SampleClass380 sampleClass;

    public SampleClass379(){
        sampleClass = new SampleClass380();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}