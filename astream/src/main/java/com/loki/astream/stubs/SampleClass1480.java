package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1480 {

    @Ignore    private SampleClass1481 sampleClass;

    public SampleClass1480(){
        sampleClass = new SampleClass1481();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}