package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1530 {

    @Ignore    private SampleClass1531 sampleClass;

    public SampleClass1530(){
        sampleClass = new SampleClass1531();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}