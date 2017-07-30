package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1569 {

    @Ignore    private SampleClass1570 sampleClass;

    public SampleClass1569(){
        sampleClass = new SampleClass1570();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}