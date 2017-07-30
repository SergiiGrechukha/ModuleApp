package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1673 {

    @Ignore    private SampleClass1674 sampleClass;

    public SampleClass1673(){
        sampleClass = new SampleClass1674();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}