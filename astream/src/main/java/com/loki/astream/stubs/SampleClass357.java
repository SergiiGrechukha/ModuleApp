package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass357 {

    @Ignore    private SampleClass358 sampleClass;

    public SampleClass357(){
        sampleClass = new SampleClass358();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}