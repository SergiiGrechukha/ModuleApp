package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1568 {

    @Ignore    private SampleClass1569 sampleClass;

    public SampleClass1568(){
        sampleClass = new SampleClass1569();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}