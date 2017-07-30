package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1458 {

    @Ignore    private SampleClass1459 sampleClass;

    public SampleClass1458(){
        sampleClass = new SampleClass1459();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}