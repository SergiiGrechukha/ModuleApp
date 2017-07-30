package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass634 {

    @Ignore    private SampleClass635 sampleClass;

    public SampleClass634(){
        sampleClass = new SampleClass635();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}