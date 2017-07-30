package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass665 {

    @Ignore    private SampleClass666 sampleClass;

    public SampleClass665(){
        sampleClass = new SampleClass666();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}