package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1705 {

    @Ignore    private SampleClass1706 sampleClass;

    public SampleClass1705(){
        sampleClass = new SampleClass1706();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}