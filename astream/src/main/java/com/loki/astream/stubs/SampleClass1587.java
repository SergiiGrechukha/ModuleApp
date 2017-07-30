package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1587 {

    @Ignore    private SampleClass1588 sampleClass;

    public SampleClass1587(){
        sampleClass = new SampleClass1588();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}