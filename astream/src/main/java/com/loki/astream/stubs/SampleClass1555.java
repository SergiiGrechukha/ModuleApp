package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1555 {

    @Ignore    private SampleClass1556 sampleClass;

    public SampleClass1555(){
        sampleClass = new SampleClass1556();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}