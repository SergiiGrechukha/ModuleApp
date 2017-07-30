package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass575 {

    @Ignore    private SampleClass576 sampleClass;

    public SampleClass575(){
        sampleClass = new SampleClass576();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}