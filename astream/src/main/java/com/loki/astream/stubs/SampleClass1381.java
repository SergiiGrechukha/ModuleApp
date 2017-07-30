package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1381 {

    @Ignore    private SampleClass1382 sampleClass;

    public SampleClass1381(){
        sampleClass = new SampleClass1382();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}