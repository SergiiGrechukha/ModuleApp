package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1665 {

    @Ignore    private SampleClass1666 sampleClass;

    public SampleClass1665(){
        sampleClass = new SampleClass1666();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}